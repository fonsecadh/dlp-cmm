package ast.expressions;

import ast.types.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression {

	// Attributes
	private Type castType;
	private Expression operand;
	
	// Constructor
	public Cast(int line, int column, Type castType, Expression operand) {
		super(line, column);
		this.castType = castType;
		this.operand = operand;
	}

	public Type getCastType() {
		return castType;
	}

	public Expression getOperand() {
		return operand;
	}	
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

}
