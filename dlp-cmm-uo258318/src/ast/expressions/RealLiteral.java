package ast.expressions;

import visitor.Visitor;

public class RealLiteral extends AbstractExpression {

	// Attributes
	private double value;

	public RealLiteral(int line, int column, String value) {
		super(line, column);
		this.value = Double.parseDouble(value);
	}

	public double getValue() {
		return value;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

}
