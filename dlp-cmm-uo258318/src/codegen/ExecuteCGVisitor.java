package codegen;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.statements.Assignment;
import ast.statements.ReadStatement;
import ast.statements.WriteStatement;
import visitor.Visitor;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {
	
	// Attributes
	private CodeGenerator cg = new CodeGenerator();
	private Visitor<Void, Void> addressCGVisitor;
	private Visitor<Void, Void> valueCGVisitor;
	private String sourceFile;
	
	// Constructor
	public ExecuteCGVisitor(String sourceFile) {
		this.sourceFile = sourceFile;
	}
	
	public void setAddressCGVisitor(Visitor<Void, Void> addressCGVisitor) {
		this.addressCGVisitor = addressCGVisitor;
	}
	
	public void setValueCGVisitor(Visitor<Void, Void> valueCGVisitor) {
		this.valueCGVisitor = valueCGVisitor;
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
	public Void visit(Program e, Void param) {
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
	public Void visit(FuncDefinition e, Void param) {
		e.setCode(cg.functionDefinition(e, this, param));
		return null;
	}
	
	/*
	 * execute[[VarDefinition: definition -> type ID]] =
	 * 		ID < (> definition.offset <)>
	 */
	@Override
	public Void visit(VarDefinition e, Void param) {
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
	public Void visit(Assignment e, Void param) {
		e.getLeft().accept(addressCGVisitor, param);
		e.getRight().accept(valueCGVisitor, param);
		e.setCode(cg.assignment(e));
		return null;
	}	
	
	/*
	 * execute[[ReadStatement: statement -> expression1]] =
	 * 		address[[expression1]]
	 * 		<in> expression1.type.suffix
	 * 		<store> expression1.type.suffix
	 */
	@Override
	public Void visit(ReadStatement e, Void param) {
		e.accept(addressCGVisitor, param);
		e.setCode(cg.read(e));
		return null;
	}	
	
	/*
	 * execute[[WriteStatement: statement -> expression1]] =
	 * 		value[[expression1]]
	 * 		<out> expression1.type.suffix
	 */
	@Override
	public Void visit(WriteStatement e, Void param) {
		e.accept(valueCGVisitor, param);
		e.setCode(cg.write(e));
		return null;
	}	

}
