package ast.definitions;

import ast.types.Type;

public abstract class AbstractDefinition implements Definition {
	
	// Attributes
	private int line;
	private int column;
	private int scope;
	private String name;
	private Type type;
	private int offset;

	// Constructor
	public AbstractDefinition(int line, int column, String name, Type type) {
		this.line = line;
		this.column = column;
		this.name = name;
		this.type = type;
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
	public String getName() {
		return name;
	}

	@Override
	public Type getType() {
		return type;
	}
	
	@Override
	public int getScope() {
		return scope;
	}
	
	@Override
	public void setScope(int scope) {
		this.scope = scope;	
	}
	
	@Override
	public int getOffset() {
		return offset;
	}
	
	@Override
	public void setOffset(int offset) {
		this.offset = offset;
	}

}
