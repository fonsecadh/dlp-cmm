package ast.expressions;

public abstract class AbstractExpression implements Expression {
	
	// Attributes
	private int line;
	private int column;
	private boolean lvalue;
	
	// Constructor
	public AbstractExpression(int line, int column) {
		this.line = line;
		this.column = column;
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
	public boolean getLValue() {
		return lvalue;
	}
	
	@Override
	public void setLValue(boolean lvalue) {
		this.lvalue = lvalue;	
	}

}
