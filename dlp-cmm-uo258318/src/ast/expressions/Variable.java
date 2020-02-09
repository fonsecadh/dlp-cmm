package ast.expressions;

public class Variable extends AbstractExpression {
	
	// Attributes
	private String name;

	// Constructor
	public Variable(int line, int column, String name) {
		super(line, column);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
