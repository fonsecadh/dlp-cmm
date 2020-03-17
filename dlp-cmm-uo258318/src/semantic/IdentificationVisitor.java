package semantic;

import ast.Invocation;
import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

	// Attributes
	private SymbolTable symbolTable = new SymbolTable();

	// Expressions
	@Override
	public Void visit(Invocation e, Void param) {
		Definition def = symbolTable.find(e.getVariable().getName());
		if (def == null) {
			new ErrorType(e.getLine(), e.getColumn(), "Variable " + e.getVariable().getName() + " is not declared.");
		}
		e.getVariable().setDefinition(def);
		super.visit(e, param);
		return null;
	}

	@Override
	public Void visit(Variable e, Void param) {
		Definition def = symbolTable.find(e.getName());
		if (def == null) {
			new ErrorType(e.getLine(), e.getColumn(), "Variable " + e.getName() + " is not declared.");
		}
		e.setDefinition(def);
		super.visit(e, param);
		return null;
	}

	// Definitions
	@Override
	public Void visit(FuncDefinition e, Void param) {
		boolean result = symbolTable.insert(e);
		if (result == false) {
			new ErrorType(e.getLine(), e.getColumn(),
					"Variable " + e.getName() + " already declared in current scope.");
		}
		symbolTable.set();
		super.visit(e, param);
		symbolTable.reset();
		return null;
	}

	@Override
	public Void visit(VarDefinition e, Void param) {
		boolean result = symbolTable.insert(e);
		if (result == false) {
			new ErrorType(e.getLine(), e.getColumn(),
					"Variable " + e.getName() + " already declared in current scope.");
		}
		super.visit(e, param);
		return null;
	}
}
