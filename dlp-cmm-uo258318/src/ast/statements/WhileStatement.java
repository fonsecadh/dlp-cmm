package ast.statements;

import java.util.ArrayList;
import java.util.List;

import ast.expressions.Expression;

public class WhileStatement extends AbstractStatement {

	// Attributes
	private Expression condition;
	private List<Statement> body;

	public WhileStatement(int line, int column, Expression condition, List<Statement> body) {
		super(line, column);
		this.condition = condition;
		this.body = new ArrayList<Statement>(body);
	}

	public Expression getCondition() {
		return condition;
	}

	public List<Statement> getBody() {
		return new ArrayList<Statement>(body);
	}

}
