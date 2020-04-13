package ast;

import java.util.ArrayList;
import java.util.List;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.statements.Statement;
import visitor.Visitor;

public class Invocation extends AbstractExpression implements Statement {

	// Attributes
	private Variable name;
	private List<Expression> params;

	// Constructor
	public Invocation(int line, int column, Variable name, List<Expression> params) {
		super(line, column);
		this.name = name;
		this.params = new ArrayList<Expression>(params);
	}

	public Variable getVariable() {
		return name;
	}

	public List<Expression> getParams() {
		return new ArrayList<Expression>(params);
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public String toString() {
		return "Invocation [name=" + name + ", params=" + params + ", getLine()=" + getLine() + ", getColumn()="
				+ getColumn() + ", getLValue()=" + getLValue() + ", getType()=" + getType() + "]";
	}

}
