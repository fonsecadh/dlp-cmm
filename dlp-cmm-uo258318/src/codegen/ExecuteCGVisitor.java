package codegen;

import ast.definitions.FuncDefinition;
import ast.statements.Assignment;
import ast.statements.ReadStatement;
import visitor.Visitor;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {
	
	// Attributes
	private CodeGenerator cg = new CodeGenerator();
	private Visitor<Void, Void> addressCGVisitor;
	private Visitor<Void, Void> valueCGVisitor;
	
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
	 * execute[[FuncDefinition: definition -> type ID statement*]] =
	 * 		ID <:>
	 * 		<Parameters>
	 * 		type.params*.foreach(p -> p.name p.offset);
	 * 		<Local Variables>
	 *		for (Statement stmt : statement*) { 
	 *			if (stmt instanceof VarDefinition) {
	 *				execute[[(VarDefinition) stmt]]
	 *			}
	 *		}
	 *		<enter> definition.type.localVarSize
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
	 * execute[[ReadStatement: statement -> expression1]] =
	 * 		value[[expression1]]
	 * 		<in> statement.type.suffix // Wrong
	 */
	@Override
	public Void visit(ReadStatement e, Void param) {
		e.accept(valueCGVisitor, param);
		return null;
	}
	
	/*
	 * execute[[Program: program -> definition+ EOF]] = 
	 * 		<call main>
	 * 		<halt>
	 *		// TODO: Separate - First global variables and then function definitions
	 * 		definition+.foreach(def -> execute[[def]]) 
	 */
	
	/*
	 * execute[[WriteStatement: statement -> expression1]] =
	 * 		value[[expression1]]
	 * 		<out> statement.type.suffix
	 */
	
	
	
	
	
	
	
	/*
	 * execute[[VarDefinition: definition -> type ID]] =
	 * 		ID < (> definition.offset <)>
	 */

}
