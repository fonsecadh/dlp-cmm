package ast.types;

import visitor.Visitor;

public class RealType extends AbstractType {

	// Attributes
	private static RealType type;

	// Private constructor
	private RealType() {

	}

	// Instance
	public static RealType getInstance() {
		if (type == null) {
			type = new RealType();
		}
		return type;
	}

	@Override
	public String getName() {
		return "Real";
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
