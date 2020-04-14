package codegen;

public class ValueCGVisitor {
	
	/*
	 * value[[CharLiteral: expression -> CHAR_CONSTANT]] =
	 * 		<pushb> expression.value
	 */
	
	/*
	 * value[[IntLiteral: expression -> INT_CONSTANT]] =
	 * 		<pushi> expression.value
	 */
	
	/*
	 * value[[RealLiteral: expression -> REAL_CONSTANT]] =
	 * 		<pushf> expression.value
	 */
	
	/*
	 * value[[Variable: expression -> ID]] =
	 * 		address[[expression]]
	 * 		<load> expression.type.suffix
	 */
	
	/*
	 * value[[Arithmetic: expression1 -> expression2 (+|-|*|/) expression3]] =
	 * 		value[[expression2]]
	 * 		value[[expression3]]
	 * 		switch (expression1.operator) { // TODO: This approach does not work for chars
	 * 			case "+": <add> expression1.type.suffix break;
	 * 			case "-": <sub> expression1.type.suffix break;
	 * 			case "*": <mul> expression1.type.suffix break;
	 * 			case "/": <div> expression1.type.suffix break;
	 * 		}
	 */
	
	/*
	 * value[[Comparator: expression1 -> expression2 ('>'|'<'|'>='|'<='|'=='|'!=') expression3]] =
	 * 		value[[expression2]]
	 * 		value[[expression3]]
	 * 		switch (expression1.operator) {
	 * 			case ">": <gt> expression1.type.suffix break;
	 * 			case "<": <lt> expression1.type.suffix break;
	 * 			case ">=": <ge> expression1.type.suffix break;
	 * 			case "<=": <le> expression1.type.suffix break;
	 * 			case "==": <eq> expression1.type.suffix break;
	 * 			case "!=": <ne> expression1.type.suffix break;
	 * 		}
	 */
	
	/*
	 * value[[Conditional: expression1 -> expression2 ('&&'|'||') expression3]] =
	 * 		value[[expression2]]
	 * 		value[[expression3]]
	 * 		switch (expression1.operator) {
	 * 			case "&&": <and> break;
	 * 			case "||": <or> break;
	 * 		}
	 */
	
	/*
	 * value[[Cast: expression1 -> type expression2]] =
	 * 		value[[expression2]]
	 * 		expression2.type.convertTo(type) // TODO: Delegate responsibility in the type interface
	 */

}
