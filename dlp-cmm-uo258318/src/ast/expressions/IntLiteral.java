package ast.expressions;

import visitor.Visitor;

public class IntLiteral extends AbstractExpression {
	
	// Attributes
	private int value;

	public IntLiteral(int line, int column, String value) {
		super(line, column);
		this.value = Integer.valueOf(value);
	}

	public int getValue() {
		return value;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

}
