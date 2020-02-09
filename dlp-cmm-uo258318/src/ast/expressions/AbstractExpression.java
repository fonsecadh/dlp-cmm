package ast.expressions;

public abstract class AbstractExpression implements Expression {
	
	// Attributes
	private int line;
	private int column;
	
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

}
