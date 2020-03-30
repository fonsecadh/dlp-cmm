package ast.expressions;

import ast.types.Type;

public abstract class AbstractExpression implements Expression {
	
	// Attributes
	private int line;
	private int column;
	private boolean lvalue;
	private Type type;
	
	// Constructor
	public AbstractExpression(int line, int column) {
		this.line = line;
		this.column = column;
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}
	
	@Override
	public boolean getLValue() {
		return lvalue;
	}
	
	@Override
	public void setLValue(boolean lvalue) {
		this.lvalue = lvalue;	
	}
	
	@Override
	public Type getType() {
		return type;
	}
	
	@Override
	public void setType(Type type) {
		this.type = type;
	}

}
