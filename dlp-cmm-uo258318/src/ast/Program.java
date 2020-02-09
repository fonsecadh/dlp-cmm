package ast;

import java.util.ArrayList;
import java.util.List;

import ast.definitions.Definition;

public class Program implements ASTNode {

	// Attributes
	private List<Definition> defs;
	
	// Constructor
	public Program(List<Definition> defs) {
		this.defs = new ArrayList<Definition>(defs);
	}

	@Override
	public int getLine() {
		throw new RuntimeException("This method should not be called in the Program object.");
	}

	@Override
	public int getColumn() {
		throw new RuntimeException("This method should not be called in the Program object.");
	}
	
	public List<Definition> getDefinitions() {
		return new ArrayList<Definition>(defs);
	}

}
