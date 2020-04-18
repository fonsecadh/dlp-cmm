package codegen;

import ast.expressions.Arithmetic;
import ast.expressions.Cast;
import ast.expressions.CharLiteral;
import ast.expressions.Comparator;
import ast.expressions.Conditional;
import ast.expressions.IntLiteral;
import ast.expressions.RealLiteral;
import ast.expressions.Variable;
import visitor.Visitor;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {
	
	// Attributes
	private CodeGenerator cg = new CodeGenerator();
	private Visitor<Void, Void> addressCGVisitor;
	
	public void setAddressCGVisitor(Visitor<Void, Void> addressCGVisitor) {
		this.addressCGVisitor = addressCGVisitor;
	}

	@Override
	protected String getCodeFunctionName() {
		return "value";
	}
	
	/*
	 * value[[Arithmetic: expression1 -> expression2 (+|-|*|/) expression3]] =
	 * 		value[[expression2]]
	 * 		value[[expression3]]
	 * 		switch (expression1.operator) { 
	 * 			// TODO: This approach does not work for chars
	 * 			case "+": <add> expression1.type.suffix break;
	 * 			case "-": <sub> expression1.type.suffix break;
	 * 			case "*": <mul> expression1.type.suffix break;
	 * 			case "/": <div> expression1.type.suffix break;
	 * 		}
	 */
	@Override
	public Void visit(Arithmetic e, Void param) {
		// We obtain the value of the left expression
		e.getLeft().accept(this, param);			
		// We obtain the value of the right expression
		e.getRight().accept(this, param);			
		// We apply the operation over both expressions
		e.setCode(cg.arithmetic(e, e.getType()));		
		return null;
	}
	
	/*
	 * value[[CharLiteral: expression -> CHAR_CONSTANT]] =
	 * 		<pushb> expression.value
	 */
	@Override
	public Void visit(CharLiteral e, Void param) {
		e.setCode(cg.constant(e));
		return null;
	}
	
	/*
	 * value[[Cast: expression1 -> type expression2]] =
	 * 		value[[expression2]]
	 * 		expression2.type.convertTo(type)
	 */
	@Override
	public Void visit(Cast e, Void param) {
		e.getOperand().accept(this, param);
		// TODO: Finish
		e.getOperand().getType().convertTo(e.getCastType());
		return null;
	}
	
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
	@Override
	public Void visit(Comparator e, Void param) {
		// We obtain the value of the left expression
		e.getLeft().accept(this, param);			
		// We obtain the value of the right expression
		e.getRight().accept(this, param);			
		// We apply the operation over both expressions
		e.setCode(cg.comparator(e, e.getType()));
		return null;
	}
	
	/*
	 * value[[Conditional: expression1 -> expression2 ('&&'|'||') expression3]] =
	 * 		value[[expression2]]
	 * 		value[[expression3]]
	 * 		switch (expression1.operator) {
	 * 			case "&&": <and> break;
	 * 			case "||": <or> break;
	 * 		}
	 */
	@Override
	public Void visit(Conditional e, Void param) {
		// We obtain the value of the left expression
		e.getLeft().accept(this, param);			
		// We obtain the value of the right expression
		e.getRight().accept(this, param);			
		// We apply the operation over both expressions
		e.setCode(cg.conditional(e, e.getType()));
		return null;
	}
	
	/*
	 * value[[IntLiteral: expression -> INT_CONSTANT]] =
	 * 		<pushi> expression.value
	 */
	@Override
	public Void visit(IntLiteral e, Void param) {
		e.setCode(cg.constant(e));
		return null;
	}
	
	/*
	 * value[[RealLiteral: expression -> REAL_CONSTANT]] =
	 * 		<pushf> expression.value
	 */
	@Override
	public Void visit(RealLiteral e, Void param) {
		e.setCode(cg.constant(e));
		return null;
	}
	
	/*
	 * value[[Variable: expression -> ID]] =
	 * 		address[[expression]]
	 * 		<load> expression.type.suffix
	 */	
	@Override
	public Void visit(Variable e, Void param) {
		e.accept(addressCGVisitor, param);
		e.setCode(cg.variableValue(e));
		return null;
	}	

}
