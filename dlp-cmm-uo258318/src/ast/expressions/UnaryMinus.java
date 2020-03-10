package ast.expressions;

import visitor.Visitor;

public class UnaryMinus extends AbstractExpression {
	
	// Attributes
	private Expression operand;

	// Constructor
	public UnaryMinus(int line, int column, Expression operand) {
		super(line, column);
		this.operand = operand;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	public Expression getOperand() {
		return operand;
	}
	
}
