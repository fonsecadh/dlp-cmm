package ast.expressions;

import visitor.Visitor;

public class FieldAccess extends AbstractExpression {

	// Attributes
	private Expression record;
	private String fieldName;

	public FieldAccess(int line, int column, Expression record, String fieldName) {
		super(line, column);
		this.record = record;
		this.fieldName = fieldName;
	}

	public Expression getRecord() {
		return record;
	}

	public String getFieldName() {
		return fieldName;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

}
