package ast.types;

public class ArrayType extends AbstractType {

	// Attributes
	private int line;
	private int column;
	private Type of;
	private int size;

	// Constructor
	public ArrayType(int line, int column, Type of, int size) {
		this.line = line;
		this.column = column;
		this.of = of;
		this.size = size;
	}

	public Type getOf() {
		return of;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String getName() {
		return "Array";
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}
	
	@Override
	public boolean isArrayType() {
		return true;
	}
	
	public void setTypeOfElements(Type of) {
		if (this.of.isArrayType()) {
			((ArrayType) this.of).setTypeOfElements(of);
		} else {
			this.of = of;
		}
	}

}
