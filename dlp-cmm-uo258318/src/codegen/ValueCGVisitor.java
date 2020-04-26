package codegen;

import ast.Invocation;
import ast.definitions.Definition;
import ast.expressions.Arithmetic;
import ast.expressions.ArrayAccess;
import ast.expressions.Cast;
import ast.expressions.CharLiteral;
import ast.expressions.Comparator;
import ast.expressions.Conditional;
import ast.expressions.FieldAccess;
import ast.expressions.IntLiteral;
import ast.expressions.RealLiteral;
import ast.expressions.Variable;
import visitor.Visitor;

public class ValueCGVisitor extends AbstractCGVisitor<Definition, Void> {
	
	// Attributes
	private CodeGenerator cg;
	private Visitor<Definition, Void> addressCGVisitor;
	
	public void setAddressCGVisitor(Visitor<Definition, Void> addressCGVisitor) {
		this.addressCGVisitor = addressCGVisitor;
	}
	
	public void setCodeGenerator(CodeGenerator cg) {
		this.cg = cg;
	}	

	@Override
	protected String getCodeFunctionName() {
		return "value";
	}
	
	
	// Expressions
	
	/*
	 * value[[ArrayAccess: expression1 -> expression2 expression3]] =
	 * 		address[[exp1]]
	 * 		<load> exp1.type.suffix
	 */
	@Override
	public Void visit(ArrayAccess e, Definition param) {
		e.accept(addressCGVisitor, param);
		e.setCode(cg.arrayAccessValue(e));
		return null;
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
	public Void visit(Arithmetic e, Definition param) {
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
	public Void visit(CharLiteral e, Definition param) {
		e.setCode(cg.constant(e));
		return null;
	}
	
	/*
	 * value[[Cast: expression1 -> type expression2]] =
	 * 		value[[expression2]]
	 * 		expression2.type.convertTo(type)
	 */
	@Override
	public Void visit(Cast e, Definition param) {
		e.getOperand().accept(this, param);
		e.setCode(cg.cast(e));		
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
	public Void visit(Comparator e, Definition param) {
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
	public Void visit(Conditional e, Definition param) {
		// We obtain the value of the left expression
		e.getLeft().accept(this, param);			
		// We obtain the value of the right expression
		e.getRight().accept(this, param);			
		// We apply the operation over both expressions
		e.setCode(cg.conditional(e, e.getType()));
		return null;
	}
	
	/*
	 * value[[FieldAccess: expression1 -> expression2 ID]] =
	 * 		address[[exp1]]
	 * 		<load> exp1.type.suffix
	 */
	@Override
	public Void visit(FieldAccess e, Definition param) {
		e.accept(addressCGVisitor, param);
		e.setCode(cg.fieldAccessValue(e));
		return null;
	}
	
	/*
	 * value[[Invocation: statement -> expression1 expression2*]] =
	 * 		expression2*.foreach(p -> value[[p]])
	 * 		<call > expression1.name
	 */
	@Override
	public Void visit(Invocation e, Definition param) {
		e.setCode(cg.invocationExp(e, this, param));
		return null;
	}
	
	/*
	 * value[[IntLiteral: expression -> INT_CONSTANT]] =
	 * 		<pushi> expression.value
	 */
	@Override
	public Void visit(IntLiteral e, Definition param) {
		e.setCode(cg.constant(e));
		return null;
	}
	
	/*
	 * value[[RealLiteral: expression -> REAL_CONSTANT]] =
	 * 		<pushf> expression.value
	 */
	@Override
	public Void visit(RealLiteral e, Definition param) {
		e.setCode(cg.constant(e));
		return null;
	}
	
	/*
	 * value[[Variable: expression -> ID]] =
	 * 		address[[expression]]
	 * 		<load> expression.type.suffix
	 */	
	@Override
	public Void visit(Variable e, Definition param) {
		e.accept(addressCGVisitor, param);
		e.setCode(cg.variableValue(e));
		return null;
	}	

}
