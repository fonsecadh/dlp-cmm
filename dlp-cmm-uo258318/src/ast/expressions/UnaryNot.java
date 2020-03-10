package ast.expressions;

import visitor.Visitor;

public class UnaryNot extends AbstractExpression {

	// Attributes
	private Expression operand;

	// Constructor
	public UnaryNot(int line, int column, Expression operand) {
		super(line, column);
		this.operand = operand;
	}

	public Expression getOperand() {
		return operand;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

}
