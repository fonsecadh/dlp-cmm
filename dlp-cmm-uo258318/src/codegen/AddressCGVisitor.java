package codegen;

import ast.expressions.Variable;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {
	
	// Attributes
	private CodeGenerator cg = new CodeGenerator();

	@Override
	protected String getCodeFunctionName() {
		return "address";
	}
	
	// Expressions
	
	/*
	 * address[[Variable: expression -> ID]] =
	 * 		if (expression.definition.scope == SymbolTable.GLOBAL_SCOPE) {
	 * 			<pusha> expression.definition.offset;
	 * 		} else {
	 * 			<push bp>
	 * 			<pushi > expression.definition.offset;
	 * 			<addi>
	 * 		}
	 */
	@Override
	public Void visit(Variable e, Void param) {
		e.setCode(cg.pushAddress(e.getDefinition()));
		return null;
	}

}
