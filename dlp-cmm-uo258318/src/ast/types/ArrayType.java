package ast.types;

import ast.expressions.Expression;
import visitor.Visitor;

public class ArrayType extends AbstractType {

	// Attributes
	private int line;
	private int column;
	private Type of;
	private int size;

	// Constructor
	public ArrayType(int line, int column, Type of, int size) {
		this.line = line;
		this.column = column;
		this.of = of;
		this.size = size;
	}

	public Type getOf() {
		return of;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String getName() {
		return "Array";
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}
	
	public void setTypeOfElements(Type of) {
		if (this.of instanceof ArrayType) {
			((ArrayType) this.of).setTypeOfElements(of);
		} else {
			this.of = of;
		}
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}
	
	@Override
	public Type squareBrackets(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		return of;
	}

	@Override
	public String toString() {
		return "ArrayType [line=" + line + ", column=" + column + ", of=" + of + ", size=" + size + ", getOf()="
				+ getOf() + ", getSize()=" + getSize() + ", getName()=" + getName() + "]";
	}

}
