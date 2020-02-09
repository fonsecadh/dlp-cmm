package ast.types;

import java.util.ArrayList;
import java.util.List;

import ast.definitions.VarDefinition;

public class FunctionType extends AbstractType {

	// Attributes
	private int line;
	private int column;
	private Type returnType;
	private List<VarDefinition> params;

	// Constructor
	public FunctionType(int line, int column, Type returnType, List<VarDefinition> params) {
		this.line = line;
		this.column = column;
		this.returnType = returnType;
		this.params = new ArrayList<VarDefinition>(params);
	}

	@Override
	public String getName() {
		return "Function";
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	public Type getReturnType() {
		return returnType;
	}

	public List<VarDefinition> getParams() {
		return new ArrayList<VarDefinition>(params);
	}

}
