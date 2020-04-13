package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

public class Assignment extends AbstractStatement {

	// Attribute
	private Expression left;
	private Expression right;

	public Assignment(int line, int column, Expression left, Expression right) {
		super(line, column);
		this.left = left;
		this.right = right;
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
		return "Assignment [left=" + left + ", right=" + right + ", getLine()=" + getLine() + ", getColumn()="
				+ getColumn() + "]";
	}

}
