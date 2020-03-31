package ast.types;

public class RecordField {

	// Attributes
	private String fieldName;
	private Type fieldType;
	private int offset;

	// Constructor
	public RecordField(String fieldName, Type fieldType) {
		this.fieldName = fieldName;
		this.fieldType = fieldType;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Type getFieldType() {
		return fieldType;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

}
