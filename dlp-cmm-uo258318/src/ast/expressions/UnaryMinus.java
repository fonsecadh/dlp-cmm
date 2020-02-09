package ast.expressions;

public class UnaryMinus extends AbstractExpression {
	
	// Attributes
	private Expression operand;

	// Constructor
	public UnaryMinus(int line, int column, Expression operand) {
		super(line, column);
		this.operand = operand;
	}

	public Expression getOperand() {
		return operand;
	}
	
}
