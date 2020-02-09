package ast.expressions;

public class Comparator extends AbstractExpression {

	// Attributes
	private String operator;
	private Expression left;
	private Expression right;

	// Constructor
	public Comparator(int line, int column, Expression left, Expression right) {
		super(line, column);
		this.left = left;
		this.right = right;
	}

	public String getOperator() {
		return operator;
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}

}
