package codegen;

import java.util.HashMap;
import java.util.Map;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Arithmetic;
import ast.expressions.Cast;
import ast.expressions.CharLiteral;
import ast.expressions.Comparator;
import ast.expressions.Conditional;
import ast.expressions.Expression;
import ast.expressions.IntLiteral;
import ast.expressions.RealLiteral;
import ast.expressions.Variable;
import ast.statements.Assignment;
import ast.statements.ReadStatement;
import ast.statements.WhileStatement;
import ast.statements.WriteStatement;
import ast.types.FunctionType;
import ast.types.Type;
import symboltable.SymbolTable;
import visitor.Visitor;

public class CodeGenerator {
	
	// Attributes
	private Map<String, String> operators = new HashMap<String, String>();
	private Map<String, String> unaryOperators = new HashMap<String, String>();
	
	public CodeGenerator() {
		loadOperators();
	}
	
	private void loadOperators() {
		operators.put("+", "add");
		operators.put("-", "sub");
		operators.put("*", "mul");
		operators.put("/", "div");
		operators.put("%", "mod");
		operators.put("&&", "and");
		operators.put("||", "or");
		operators.put("==", "eq");
		operators.put("!=", "ne");
		operators.put(">", "gt");
		operators.put("<", "lt");
		operators.put(">=", "ge");
		operators.put("<=", "le");
		unaryOperators.put("!", "not");
		unaryOperators.put("-", "not"); // TODO: Wrong, change this. Example (-a: it should be 0 - a)
	}

	public String pushAddress(Definition d) {
		StringBuilder code = new StringBuilder();
		if (d.getScope() == SymbolTable.GLOBAL_SCOPE) {
			// We push the address of the variable (offset)
			String pushaOffset = "pusha " + d.getOffset();
			appendMAPLInstruction(pushaOffset, code);
		} else {
			// We push the BP and the 
			// offset of the variable and we add them
			appendMAPLInstruction("push bp", code);
			String pushiOffset = "pushi " + d.getOffset();
			appendMAPLInstruction(pushiOffset, code);
			appendMAPLInstruction("addi", code);
		}
		return code.toString();
	}	
	
	public String arithmetic(Arithmetic e, Type type) {
		StringBuilder code = new StringBuilder();
		code.append(e.getLeft().getCode());
		code.append(e.getRight().getCode());
		String operator = getMAPLOperator(e.getOperator()) + type.getSuffix();
		appendMAPLInstruction(operator, code);
		return code.toString();
	}

	public String constant(Expression e) {
		StringBuilder code = new StringBuilder();
		if (e instanceof CharLiteral) {
			CharLiteral cl = (CharLiteral) e;
			String pushbValue = "pushb " + (int) cl.getValue();
			appendMAPLInstruction(pushbValue, code);
		} else if (e instanceof IntLiteral) {
			IntLiteral il = (IntLiteral) e;
			String pushiValue = "pushi " + il.getValue();
			appendMAPLInstruction(pushiValue, code);
		} else {
			RealLiteral rl = (RealLiteral) e;
			String pushfValue = "pushf " + rl.getValue();
			appendMAPLInstruction(pushfValue, code);
		}
		return code.toString();
	}	

	public String cast(Cast e) {
		StringBuilder code = new StringBuilder();
		String[] castInstructions = e.getOperand().getType().convertTo(e.getCastType());
		for (String instr : castInstructions) {
			appendMAPLInstruction(instr, code);
		}
		return code.toString();
	}

	public String comparator(Comparator e, Type type) {
		StringBuilder code = new StringBuilder();
		code.append(e.getLeft().getCode());
		code.append(e.getRight().getCode());
		String operator = getMAPLOperator(e.getOperator()) + type.getSuffix();
		appendMAPLInstruction(operator, code);
		return code.toString();
	}
	
	public String conditional(Conditional e, Type type) {
		StringBuilder code = new StringBuilder();
		code.append(e.getLeft().getCode());
		code.append(e.getRight().getCode());
		String operator = getMAPLOperator(e.getOperator()) + type.getSuffix();
		appendMAPLInstruction(operator, code);
		return code.toString();
	}
	
	public String variableValue(Variable e) {
		StringBuilder code = new StringBuilder();
		code.append(e.getCode());
		// We perform a loading operation in MAPL
		String loadSuffix = "load" + e.getType().getSuffix();
		appendMAPLInstruction(loadSuffix, code);
		return code.toString();
	}
	
	public String assignment(Assignment e) {
		StringBuilder code = new StringBuilder();
		// We write the line in MAPL
		writeMAPLLine(e.getLeft().getLine(), code);
		code.append(e.getLeft().getCode());
		code.append(e.getRight().getCode());
		String storeSuffix = "store" + e.getLeft().getType().getSuffix();
		appendMAPLInstruction(storeSuffix, code);
		return code.toString();
	}	

	public String functionDefinition(FuncDefinition e, ExecuteCGVisitor executeCGVisitor, Void param) {
		StringBuilder code = new StringBuilder();
		// We get the function type
		FunctionType funcType = (FunctionType) e.getType();
		// We set the name of the function
		String funcName = e.getName() + ":";
		appendMAPLInstruction(funcName, code);
		// We process the parameters.
		writeMAPLComment("Parameters", code);
		funcType.getParams().forEach(p -> {
			String paramComment = p.getType().getName() + " " + e.getName() + "(offset " + e.getOffset() + ")";
			writeMAPLComment(paramComment, code);
		});
		// We process the local variables
		writeMAPLComment("Local Variables", code);
		e.getBody().stream().filter(stmt -> stmt instanceof VarDefinition).forEach(vd -> {
			vd.accept(executeCGVisitor, param);
			code.append(vd.getCode());
		});
		// We allocate memory for the local variables
		String enterSize = "enter " + funcType.getLocalVariableSize();
		appendMAPLInstruction(enterSize, code);
		// We process the body
		e.getBody().stream().filter(stmt -> !(stmt instanceof VarDefinition)).forEach(ele -> {
			ele.accept(executeCGVisitor, param);
			code.append(ele.getCode());
		});
		// If there is no explicit return statement
		if (funcType.getReturnType().numberOfBytes() == 0) {
			String retOperator = "ret " + funcType.getReturnType().numberOfBytes() + ", "
					+ funcType.getLocalVariableSize() + ", " + funcType.getSizeOfParams();
			appendMAPLInstruction(retOperator, code);
		}
		return code.toString();
	}

	public String varDefinition(VarDefinition e) {
		StringBuilder code = new StringBuilder();
		String comment = e.getType().getName() + " " + e.getName() + " (offset " + e.getOffset() + ")";
		writeMAPLComment(comment, code);
		return code.toString();
	}

	public String read(ReadStatement e) {
		StringBuilder code = new StringBuilder();
		// We write the line in MAPL
		writeMAPLLine(e.getBody().getLine(), code);
		code.append(e.getBody().getCode());
		// We perform an input operation in MAPL
		String inSuffix = "in" + e.getBody().getType().getSuffix();
		appendMAPLInstruction(inSuffix, code);
		// We perform a storing operation in MAPL
		String storeSuffix = "store" + e.getBody().getType().getSuffix();
		appendMAPLInstruction(storeSuffix, code);
		return code.toString();
	}

	public String write(WriteStatement e) {
		StringBuilder code = new StringBuilder();
		// We write the line in MAPL
		writeMAPLLine(e.getBody().getLine(), code);
		code.append(e.getBody().getCode());
		// We perform an output operation in MAPL
		String outSuffix = "out" + e.getBody().getType().getSuffix();
		appendMAPLInstruction(outSuffix, code);	
		return code.toString();
	}

	public String program(Program e, String sourceFile, ExecuteCGVisitor executeCGVisitor, Void param) {
		StringBuilder code = new StringBuilder();
		// We specify the source file
		String srcSpecification = "#source \"" + sourceFile + "\"\n";
		code.append(srcSpecification);
		// We call the main function
		appendMAPLInstruction("call main", code);
		// We stop the execution
		appendMAPLInstruction("halt", code);
		// We traverse the global variables to generate their code
		e.getDefinitions().stream().filter(d -> d instanceof VarDefinition).forEach(def -> {
			def.accept(executeCGVisitor, param);
			code.append(def.getCode());
		});
		// We traverse the function definitions to generate their code
		e.getDefinitions().stream().filter(d -> d instanceof FuncDefinition).forEach(def -> {
			def.accept(executeCGVisitor, param);
			code.append(def.getCode());
		});
		return code.toString();
	}

	public String whileStmt(WhileStatement e, ExecuteCGVisitor executeCGVisitor, Void param,
			ValueCGVisitor valueCGVisitor) {
		StringBuilder code = new StringBuilder();
		// We write the line in MAPL
		writeMAPLLine(e.getCondition().getLine(), code);
		// TODO: Finish this method
		return code.toString();
	}
	
	/**
	 * Appends a MAPL instruction to a given StringBuilder.
	 * 
	 * @param instruct
	 * 			The instruction to append.
	 * @param sb
	 * 			The StringBuilder.
	 */
	private void appendMAPLInstruction(String instruct, StringBuilder sb) {
		String toAppend = "\t" + instruct + "\n";
		sb.append(toAppend);
	}
	
	/**
	 * Writes a line in MAPL to a given StringBuilder.
	 * 
	 * @param line
	 * 			The line number.
	 * @param sb
	 * 			The StringBuilder.
	 * 			
	 */
	private void writeMAPLLine(int line, StringBuilder sb) {
		String toAppend = "#line " + line + "\n";
		sb.append(toAppend);
	}
	
	/**
	 * Writes a comment in MAPL to a given StringBuilder.
	 * 
	 * @param comment
	 * 			The comment.
	 * @param sb
	 * 			The StringBuilder.
	 */
	private void writeMAPLComment(String comment, StringBuilder sb) {
		String toAppend = "\t\' * " + comment + "\n";
		sb.append(toAppend);
	}
	
	/**
	 * Returns the MAPL equivalent of a C-- operator.
	 * 
	 * @param operator
	 * 			The C-- operator.
	 * @return
	 * 			The equivalent operator in MAPL.
	 */
	private String getMAPLOperator(String operator) {
		if (!operators.containsKey(operator)) {
			throw new IllegalArgumentException("Operator " + operator + " not supported in MAPL.");
		}
		return operators.get(operator);
	}	
	
	/**
	 * Returns the MAPL equivalent of a C-- unary operator.
	 * 
	 * @param uniOperator
	 * 			The C-- unary operator.
	 * @return
	 * 			The equivalent unary operator in MAPL.
	 */
	private String getMAPLUnaryOperator(String uniOperator) {
		if (!unaryOperators.containsKey(uniOperator)) {
			throw new IllegalArgumentException("Unary operator " + uniOperator + " not supported in MAPL.");
		}
		return unaryOperators.get(uniOperator);
	}
	
}
