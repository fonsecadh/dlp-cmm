package ast.types;

public class VoidType extends AbstractType {

	// Attributes
	private static VoidType type;

	// Private constructor
	private VoidType() {

	}

	// Instance
	public static VoidType getInstance() {
		if (type == null) {
			type = new VoidType();
		}
		return type;
	}

	@Override
	public String getName() {
		return "Void";
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
