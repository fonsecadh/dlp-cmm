package ast.types;

import ast.ASTNode;
import visitor.Visitor;

public class RecordField implements ASTNode {

	// Attributes
	private String fieldName;
	private Type fieldType;
	private int offset;
	private int line;
	private int column;

	// Constructor
	public RecordField(int line, int column, String fieldName, Type fieldType) {
		this.line = line;
		this.column = column;
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

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public String toString() {
		return "RecordField [fieldName=" + fieldName + ", fieldType=" + fieldType + ", offset=" + offset + ", line="
				+ line + ", column=" + column + "]";
	}

}
