package semantic;

import ast.Invocation;
import ast.expressions.Arithmetic;
import ast.expressions.ArrayAccess;
import ast.expressions.Cast;
import ast.expressions.CharLiteral;
import ast.expressions.Comparator;
import ast.expressions.Conditional;
import ast.expressions.FieldAccess;
import ast.expressions.IntLiteral;
import ast.expressions.RealLiteral;
import ast.expressions.UnaryMinus;
import ast.expressions.UnaryNot;
import ast.expressions.Variable;
import ast.statements.Assignment;
import ast.statements.ReadStatement;
import ast.types.ErrorType;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

	// Expressions
	public Void visit(Arithmetic e, Void param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(ArrayAccess e, Void param) {
		super.visit(e, param);
		e.setLValue(true);
		return null;
	}

	public Void visit(Cast e, Void param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(CharLiteral e, Void param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(Comparator e, Void param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(Conditional e, Void param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(FieldAccess e, Void param) {
		super.visit(e, param);
		e.setLValue(true);
		return null;
	}

	public Void visit(Invocation e, Void param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(IntLiteral e, Void param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(RealLiteral e, Void param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(UnaryMinus e, Void param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(UnaryNot e, Void param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(Variable e, Void param) {
		super.visit(e, param);
		e.setLValue(true);
		return null;
	}

	// Statements
	@Override
	public Void visit(Assignment e, Void param) {
		super.visit(e, param);
		if (e.getLeft().getLValue() == false) {
			new ErrorType(e.getLine(), e.getColumn(), 
					"The left part of the assignment is not an l-value");
		}
		return null;
	}

	@Override
	public Void visit(ReadStatement e, Void param) {
		super.visit(e, param);
		if (e.getBody().getLValue() == false) {
			new ErrorType(e.getLine(), e.getColumn(),
					"Read statement requires an l-value");
		}
		return null;
	}
}
