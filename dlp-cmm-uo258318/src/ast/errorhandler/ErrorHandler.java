package ast.errorhandler;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import ast.types.ErrorType;

public class ErrorHandler {
	
	// Attributes
	private static ErrorHandler errorHandler;
	private List<ErrorType> errors = new ArrayList<ErrorType>();
	
	// Private constructor
	private ErrorHandler() {
		
	}
	
	// Instance
	public static ErrorHandler getInstance() {
		if (errorHandler == null) {
			errorHandler = new ErrorHandler();
		}
		return errorHandler;
	}
	
	// Methods
	public boolean anyErrors() {
		return !errors.isEmpty();		
	}
	
	public void addError(ErrorType error) {
		errors.add(error);
	}
	
	public void showErrors(PrintStream printStream) {
		errors.forEach(e -> printStream.println(e.toString()));
	}

}
