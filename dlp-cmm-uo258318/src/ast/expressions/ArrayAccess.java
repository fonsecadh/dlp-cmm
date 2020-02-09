package ast.expressions;

public class ArrayAccess extends AbstractExpression {

	// Attribute
	private Expression position;
	private Expression array;

	// Constructor
	public ArrayAccess(int line, int column, Expression position, Expression array) {
		super(line, column);
		this.position = position;
		this.array = array;
	}

	public Expression getPosition() {
		return position;
	}

	public Expression getArray() {
		return array;
	}

}
