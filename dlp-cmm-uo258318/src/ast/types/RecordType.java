package ast.types;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ast.expressions.Expression;
import visitor.Visitor;

public class RecordType extends AbstractType {

	// Attributes
	private int line;
	private int column;
	private List<RecordField> fields;

	// Constructor
	public RecordType(int line, int column, List<RecordField> fields) {
		this.line = line;
		this.column = column;
		checkRepeatedFields(new ArrayList<RecordField>(fields));
		this.fields = new ArrayList<RecordField>(fields);
	}

	public List<RecordField> getFields() {
		return new ArrayList<RecordField>(fields);
	}

	@Override
	public String getName() {
		return "Record";
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	private void checkRepeatedFields(List<RecordField> fields) {
		List<String> sortedFieldNames = fields.parallelStream().map(f -> f.getFieldName()).sorted()
				.collect(Collectors.toList());
		String s = "";
		for (String str : sortedFieldNames) {
			if (str.equals(s)) {
				new ErrorType(line, column, "repeated field name: " + str + " in record field");
			}
			s = str;
		}
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public Type dot(Type type, String fieldName, Expression e) {
		for (RecordField recField : this.getFields()) {
			if (recField.getFieldName().equals(fieldName)) {
				return recField.getFieldType();
			}
		}
		return new ErrorType("type " + this.getName() + " does not have a field called " + fieldName);
	}

	@Override
	public int numberOfBytes() {
		return this.fields.stream().mapToInt(recField -> recField.getFieldType().numberOfBytes()).sum();
	}
	
}
