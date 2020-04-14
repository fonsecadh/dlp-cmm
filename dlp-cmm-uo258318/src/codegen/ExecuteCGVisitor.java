package codegen;

public class ExecuteCGVisitor {
	
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
	 * execute[[ReadStatement: statement -> expression1]] =
	 * 		value[[expression1]]
	 * 		<in> statement.type.suffix // Wrong
	 */
	
	/*
	 * execute[[Assignment: statement -> expression1 expression2]] =
	 * 		address[[expression1]]
	 * 		value[[expression2]]
	 * 		<store> expression1.type.suffix
	 */
	
	/*
	 * execute[[FuncDefinition: definition -> type ID statement*]] =
	 * 		ID <:>
	 * 		<Parameters>
	 * 		type.params*.foreach(p -> p.name p.offset);
	 * 		<Local Variables>
	 *		for (Statement stmt : statement*) { 
	 *			// TODO: Check if this new approach is correct
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
	
	/*
	 * execute[[VarDefinition: definition -> type ID]] =
	 * 		ID < (> definition.offset <)>
	 */

}
