package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;
import visitor.Visitor;

public class VarDefinition extends AbstractDefinition implements Statement {

	// Constructor
	public VarDefinition(int line, int column, String name, Type type) {
		super(line, column, name, type);
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public String toString() {
		return "VarDefinition [getLine()=" + getLine() + ", getColumn()=" + getColumn() + ", getName()=" + getName()
				+ ", getType()=" + getType() + ", getScope()=" + getScope() + ", getOffset()=" + getOffset() + "]";
	}

}
