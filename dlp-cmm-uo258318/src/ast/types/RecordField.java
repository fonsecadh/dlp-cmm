package ast.types;

public class RecordField {

	// Attributes
	private String fieldName;
	private Type fieldType;

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

}
