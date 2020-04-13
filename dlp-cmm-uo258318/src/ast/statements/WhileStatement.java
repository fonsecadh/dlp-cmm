package ast.statements;

import java.util.ArrayList;
import java.util.List;

import ast.expressions.Expression;
import visitor.Visitor;

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
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public String toString() {
		return "WhileStatement [condition=" + condition + ", body=" + body + ", getLine()=" + getLine()
				+ ", getColumn()=" + getColumn() + "]";
	}

}
