package codegen;

public class AddressCGVisitor {
	
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

}
