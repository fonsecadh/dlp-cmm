package ast.expressions;

import visitor.Visitor;

public class Comparator extends AbstractExpression {

	// Attributes
	private String operator;
	private Expression left;
	private Expression right;

	// Constructor
	public Comparator(int line, int column, String operator, Expression left, Expression right) {
		super(line, column);
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	public String getOperator() {
		return operator;
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public String toString() {
		return "Comparator [operator=" + operator + ", left=" + left + ", right=" + right + ", getLine()=" + getLine()
				+ ", getColumn()=" + getColumn() + ", getLValue()=" + getLValue() + ", getType()=" + getType() + "]";
	}

}
