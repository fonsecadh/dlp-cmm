package ast.expressions;

import ast.types.Type;

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

}
