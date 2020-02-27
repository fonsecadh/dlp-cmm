package ast.expressions;

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

}
