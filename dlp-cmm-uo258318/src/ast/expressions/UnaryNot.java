package ast.expressions;

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

}
