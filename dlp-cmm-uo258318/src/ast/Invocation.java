package ast;

import java.util.ArrayList;
import java.util.List;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.statements.Statement;

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

	public Variable getName() {
		return name;
	}

	public List<Expression> getParams() {
		return new ArrayList<Expression>(params);
	}

}
