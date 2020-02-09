package ast.expressions;

public class CharLiteral extends AbstractExpression {

	// Attributes
	private char value;

	public CharLiteral(int line, int column, char value) {
		super(line, column);
		this.value = value;
	}

	public char getValue() {
		return value;
	}

}
