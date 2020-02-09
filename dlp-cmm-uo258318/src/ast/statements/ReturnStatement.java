package ast.statements;

import ast.expressions.Expression;

public class ReturnStatement extends AbstractStatement {

	// Attribute
	private Expression body;

	// Constructor
	public ReturnStatement(int line, int column, Expression body) {
		super(line, column);
		this.body = body;
	}

	public Expression getBody() {
		return body;
	}

}
