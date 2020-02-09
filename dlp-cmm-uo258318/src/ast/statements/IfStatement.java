package ast.statements;

import java.util.ArrayList;
import java.util.List;

import ast.expressions.Expression;

public class IfStatement extends AbstractStatement {

	// Attributes
	private Expression condition;
	private List<Statement> ifPart;
	private List<Statement> elsePart;

	public IfStatement(int line, int column, Expression condition, List<Statement> ifPart, List<Statement> elsePart) {
		super(line, column);
		this.condition = condition;
		this.ifPart = new ArrayList<Statement>(ifPart);
		this.elsePart = new ArrayList<Statement>(elsePart);
	}

	public Expression getCondition() {
		return condition;
	}

	public List<Statement> getIfPart() {
		return new ArrayList<Statement>(ifPart);
	}

	public List<Statement> getElsePart() {
		return new ArrayList<Statement>(elsePart);
	}

}
