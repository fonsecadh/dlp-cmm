package ast.statements;

import ast.expressions.Expression;

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

}
