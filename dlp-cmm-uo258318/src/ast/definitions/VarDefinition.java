package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;

public class VarDefinition extends AbstractDefinition implements Statement {

	// Constructor
	public VarDefinition(int line, int column, String name, Type type) {
		super(line, column, name, type);
	}

}
