package ast.definitions;

import java.util.ArrayList;
import java.util.List;

import ast.statements.Statement;
import ast.types.Type;
import visitor.Visitor;

public class FuncDefinition extends AbstractDefinition {

	// Attributes
	private List<Statement> body;

	// Constructor
	public FuncDefinition(int line, int column, String name, Type type, List<Statement> body) {
		super(line, column, name, type);
		this.body = new ArrayList<Statement>(body);
	}

	public List<Statement> getBody() {
		return body;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public String toString() {
		return "FuncDefinition [getLine()=" + getLine() + ", getColumn()=" + getColumn() + ", getName()=" + getName()
				+ ", getType()=" + getType() + ", getScope()=" + getScope() + ", getOffset()=" + getOffset() + "]";
	}

}
