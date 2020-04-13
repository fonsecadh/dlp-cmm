package ast.expressions;

import visitor.Visitor;

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
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public String toString() {
		return "ArrayAccess [position=" + position + ", array=" + array + ", getLine()=" + getLine() + ", getColumn()="
				+ getColumn() + ", getLValue()=" + getLValue() + ", getType()=" + getType() + "]";
	}

}
