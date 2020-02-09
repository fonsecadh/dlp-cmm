package ast.statements;

import ast.expressions.Expression;

public class ReadStatement extends AbstractStatement {

	// Attribute
	private Expression body;

	// Constructor
	public ReadStatement(int line, int column, Expression body) {
		super(line, column);
		this.body = body;
	}

	public Expression getBody() {
		return body;
	}

}
