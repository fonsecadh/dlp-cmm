package ast;

import java.util.ArrayList;
import java.util.List;

import ast.definitions.Definition;
import visitor.Visitor;

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
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

}
