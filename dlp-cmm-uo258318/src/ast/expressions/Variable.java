package ast.expressions;

import visitor.Visitor;

public class Variable extends AbstractExpression {
	
	// Attributes
	private String name;

	// Constructor
	public Variable(int line, int column, String name) {
		super(line, column);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

}
