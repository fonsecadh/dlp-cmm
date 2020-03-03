package ast.types;

import ast.errorhandler.ErrorHandler;

public class ErrorType extends AbstractType {

	// Attributes
	private String message;
	private int line;
	private int column;

	// Constructors
	public ErrorType(String message) {
		this.message = message;
		this.line = -1;
		this.column = -1;
		ErrorHandler.getInstance().addError(this);
	}

	public ErrorType(int line, int column, String message) {
		this.message = message;
		this.line = line;
		this.column = column;
		ErrorHandler.getInstance().addError(this);
	}

	@Override
	public String getName() {
		return "Error";
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return getMessage();
	}

}
