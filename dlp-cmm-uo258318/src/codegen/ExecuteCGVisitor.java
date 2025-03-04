package codegen;

import ast.Invocation;
import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.statements.Assignment;
import ast.statements.IfStatement;
import ast.statements.ReadStatement;
import ast.statements.ReturnStatement;
import ast.statements.WhileStatement;
import ast.statements.WriteStatement;
import visitor.Visitor;

public class ExecuteCGVisitor extends AbstractCGVisitor<Definition, Void> {
	
	// Attributes
	private CodeGenerator cg;
	private Visitor<Definition, Void> addressCGVisitor;
	private Visitor<Definition, Void> valueCGVisitor;
	private String sourceFile;
	
	// Constructor
	public ExecuteCGVisitor(String sourceFile) {
		this.sourceFile = sourceFile;
	}
	
	public void setAddressCGVisitor(Visitor<Definition, Void> addressCGVisitor) {
		this.addressCGVisitor = addressCGVisitor;
	}
	
	public void setValueCGVisitor(Visitor<Definition, Void> valueCGVisitor) {
		this.valueCGVisitor = valueCGVisitor;
	}

	public void setCodeGenerator(CodeGenerator cg) {
		this.cg = cg;
	}	

	@Override
	protected String getCodeFunctionName() {
		return "execute";
	}
	
	// Program
	
	/*
	 * execute[[Program: program -> definition+ EOF]] = 
	 * 		<call main>
	 * 		<halt>		
	 * 		definition+.stream().filter(d -> d instanceof VarDefinition).foreach(def -> execute[[def]]) 
	 * 		definition+.stream().filter(d -> d instanceof FuncDefinition).foreach(def -> execute[[def]])
	 */
	@Override
	public Void visit(Program e, Definition param) {
		e.setCode(cg.program(e, sourceFile, this, param));
		return null;
	}
	
	// Definition
	
	/*
	 * execute[[FuncDefinition: definition -> type ID statement*]] =
	 * 		ID <:>
	 * 		<Parameters>
	 * 		type.params*.foreach(p -> p.name p.offset);
	 * 		<Local Variables>
	 *		statement*.stream().filter(stmt -> stmt instanceof VarDefinition).foreach(vd -> execute[[vd]]);		
	 *		<enter> definition.type.localVarSize
	 *		statement*.stream().filter(stmt -> !(stmt instanceof VarDefinition)).foreach(s -> execute[[s]]);
	 *		if (definition.type.returnType.numberOfBytes == 0) {
	 *			<ret> definition.type.returnType.numberOfBytes 
	 *				<, > definition.type.localVarSize
	 *				<, > definition.type.paramSize
	 *		}
	 */
	@Override
	public Void visit(FuncDefinition e, Definition param) {
		e.setCode(cg.functionDefinition(e, this, e));
		return null;
	}
	
	/*
	 * execute[[VarDefinition: definition -> type ID]] =
	 * 		ID < (> definition.offset <)>
	 */
	@Override
	public Void visit(VarDefinition e, Definition param) {
		e.setCode(cg.varDefinition(e));
		return null;
	}
	
	// Statement
	
	/*
	 * execute[[Assignment: statement -> expression1 expression2]] =
	 * 		address[[expression1]]
	 * 		value[[expression2]]
	 * 		<store> expression1.type.suffix
	 */
	@Override
	public Void visit(Assignment e, Definition param) {
		e.getLeft().accept(addressCGVisitor, param);
		e.getRight().accept(valueCGVisitor, param);
		e.setCode(cg.assignment(e));
		return null;
	}	
	
	/*
	 * execute[[IfStatement: statement1 -> expression statement2* statement3*]] =
	 * 		int labelNumber = cg.getLabels(2);
	 * 		value[[expression]]	
	 * 		<jz label> labelNumber
	 * 		statement2*.forEach(ifEle -> execute[[ifEle]])
	 * 		<jmp label> labelNumber + 1
	 * 		<label> labelNumber <:> 
	 * 		statement3*.forEach(elseEle -> execute[[elseEle]])
	 * 		<label> labelNumber + 1 <:>
	 */
	@Override
	public Void visit(IfStatement e, Definition param) {
		e.getCondition().accept(valueCGVisitor, param);
		e.setCode(cg.ifStmt(e, this, param));
		return null;
	}
	
	/*
	 * execute[[Invocation: statement -> expression1 expression2*]] =
	 * 		expression2*.foreach(p -> value[[p]])
	 * 		<call > expression1.name
	 * 		if (!(expression1.type.returnType instanceof VoidType)) {
	 * 			<pop> expression1.type.returnType.suffix
	 * 		}
	 */
	@Override
	public Void visit(Invocation e, Definition param) {
		e.setCode(cg.invocationStmt(e, (ValueCGVisitor) valueCGVisitor, param));
		return null;
	}
	
	/*
	 * execute[[ReadStatement: statement -> expression1]] =
	 * 		address[[expression1]]
	 * 		<in> expression1.type.suffix
	 * 		<store> expression1.type.suffix
	 */
	@Override
	public Void visit(ReadStatement e, Definition param) {
		e.getBody().accept(addressCGVisitor, param);
		e.setCode(cg.read(e));
		return null;
	}	
	
	/*
	 * execute[[ReturnStatement: statement -> expression1]] =
	 * 		value[[expression1]]
	 * 		Type funcType = param.type 
	 * 		<ret > funcType.returnType.numberOfBytes 
	 * 			<, > funcType.localVariableSize 
	 * 			<, > funcType.getSizeOfParams()
	 */
	@Override
	public Void visit(ReturnStatement e, Definition param) {
		e.getBody().accept(valueCGVisitor, param);
		e.setCode(cg.retStmt(e, param));
		return null;
	}
	
	/*
	 * execute[[WhileStatement: statement1 -> expression statement2*]] =
	 * 		int labelNumber = cg.getLabels(2);
	 * 		<label> labelNumber <:>
	 * 		value[[expression]]
	 * 		<jz label> labelNumber + 1
	 * 		statement2*.forEach(ele -> execute[[ele]])
	 * 		<jmp label> labelNumber
	 * 		<label> labelNumber + 1 <:> 		
	 */
	@Override
	public Void visit(WhileStatement e, Definition param) {
		e.setCode(cg.whileStmt(e, this, param, (ValueCGVisitor) valueCGVisitor));
		return null;
	}
	
	/*
	 * execute[[WriteStatement: statement -> expression1]] =
	 * 		value[[expression1]]
	 * 		<out> expression1.type.suffix
	 */
	@Override
	public Void visit(WriteStatement e, Definition param) {
		e.getBody().accept(valueCGVisitor, param);
		e.setCode(cg.write(e));
		return null;
	}

}
