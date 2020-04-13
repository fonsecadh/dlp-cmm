package ast.statements;

import java.util.ArrayList;
import java.util.List;

import ast.expressions.Expression;
import visitor.Visitor;

public class IfStatement extends AbstractStatement {

	// Attributes
	private Expression condition;
	private List<Statement> ifPart;
	private List<Statement> elsePart;
	
	public IfStatement(int line, int column, Expression condition, List<Statement> ifPart) {
		super(line, column);
		this.condition = condition;
		this.ifPart = new ArrayList<Statement>(ifPart);
	}

	public IfStatement(int line, int column, Expression condition, List<Statement> ifPart, List<Statement> elsePart) {
		this(line, column, condition, ifPart);
		this.elsePart = new ArrayList<Statement>(elsePart);
	}

	public Expression getCondition() {
		return condition;
	}

	public List<Statement> getIfPart() {
		return new ArrayList<Statement>(ifPart);
	}

	public List<Statement> getElsePart() {
		if (elsePart == null) {
			return new ArrayList<Statement>();
		}
		return new ArrayList<Statement>(elsePart);
	}
	
	public void setElsePart(List<Statement> elsePart) {
		this.elsePart = new ArrayList<Statement>(elsePart);
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public String toString() {
		return "IfStatement [condition=" + condition + ", ifPart=" + ifPart + ", elsePart=" + elsePart + ", getLine()="
				+ getLine() + ", getColumn()=" + getColumn() + "]";
	}

}
