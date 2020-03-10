package ast.types;

import visitor.Visitor;

public class CharType extends AbstractType {

	// Attributes
	private static CharType type;

	// Private constructor
	private CharType() {

	}

	// Instance
	public static CharType getInstance() {
		if (type == null) {
			type = new CharType();
		}
		return type;
	}

	@Override
	public String getName() {
		return "Char";
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
