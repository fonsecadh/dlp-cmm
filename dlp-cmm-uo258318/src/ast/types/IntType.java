package ast.types;

import visitor.Visitor;

public class IntType extends AbstractType {

	// Attributes
	private static IntType type;

	// Private constructor
	private IntType() {

	}

	// Instance
	public static IntType getInstance() {
		if (type == null) {
			type = new IntType();
		}
		return type;
	}

	@Override
	public String getName() {
		return "Int";
	}

	@Override
	public int getLine() {
		return -1;
	}

	@Override
	public int getColumn() {
		return -1;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

}
