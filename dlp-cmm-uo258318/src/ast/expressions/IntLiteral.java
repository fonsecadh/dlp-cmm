package ast.expressions;

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

}
