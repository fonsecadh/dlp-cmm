package ast.definitions;

import ast.types.Type;

public class AbstractDefinition implements Definition {
	
	// Attributes
	private int line;
	private int column;
	private String name;
	private Type type;

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

}
