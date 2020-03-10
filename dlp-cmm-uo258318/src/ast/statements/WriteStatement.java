package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

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
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

}
