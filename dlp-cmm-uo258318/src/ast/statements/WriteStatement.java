package ast.statements;

import ast.expressions.Expression;

public class WriteStatement extends AbstractStatement {

	// Attribute
	private Expression body;

	// Constructor
	public WriteStatement(int line, int column, Expression body) {
		super(line, column);
		this.body = body;
	}

	public Expression getBody() {
		return body;
	}

}
