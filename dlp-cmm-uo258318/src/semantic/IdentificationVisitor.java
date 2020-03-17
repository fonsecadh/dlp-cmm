package semantic;

import ast.Invocation;
import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<SymbolTable, Void> {

	// Expressions
	@Override
	public Void visit(Invocation e, SymbolTable symbolTable) {
		Definition def = symbolTable.find(e.getVariable().getName());
		if (def == null) {
			new ErrorType(e.getLine(), e.getColumn(), "Variable " + e.getVariable().getName() + " is not declared.");
		}
		e.getVariable().setDefinition(def);
		super.visit(e, symbolTable);
		return null;
	}

	@Override
	public Void visit(Variable e, SymbolTable symbolTable) {
		Definition def = symbolTable.find(e.getName());
		if (def == null) {
			new ErrorType(e.getLine(), e.getColumn(), "Variable " + e.getName() + " is not declared.");
		}
		e.setDefinition(def);
		super.visit(e, symbolTable);
		return null;
	}

	// Definitions
	@Override
	public Void visit(FuncDefinition e, SymbolTable symbolTable) {
		boolean result = symbolTable.insert(e);
		if (result == false) {
			new ErrorType(e.getLine(), e.getColumn(),
					"Variable " + e.getName() + " already declared in current scope.");
		}
		symbolTable.set();
		super.visit(e, symbolTable);
		symbolTable.reset();
		return null;
	}

	@Override
	public Void visit(VarDefinition e, SymbolTable symbolTable) {
		boolean result = symbolTable.insert(e);
		if (result == false) {
			new ErrorType(e.getLine(), e.getColumn(),
					"Variable " + e.getName() + " already declared in current scope.");
		}
		super.visit(e, symbolTable);
		return null;
	}
}
