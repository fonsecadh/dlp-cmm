package ast.types;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends AbstractType {

	// Attributes
	private int line;
	private int column;
	private List<RecordField> fields;

	// Constructor
	public RecordType(int line, int column, List<RecordField> fields) {
		this.line = line;
		this.column = column;
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

}
