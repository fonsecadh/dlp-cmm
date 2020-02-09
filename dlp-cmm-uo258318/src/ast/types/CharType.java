package ast.types;

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

}
