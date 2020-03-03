package ast.types;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

	private void checkRepeatedFields(List<RecordField> fields) { // TODO: Refactor this code
		List<String> sortedFieldNames = fields.parallelStream().map(f -> f.getFieldName()).sorted()
				.collect(Collectors.toList());
		String s = "";
		for (String str : sortedFieldNames) {
			if (str.equals(s)) {
				new ErrorType("Repeated field name: " + str + " in record field at line: " + line + ", col: " + column);
			}
			s = str;
		}
	}

}
