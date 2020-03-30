package semantic;

import ast.Invocation;
import ast.Program;
import ast.definitions.FuncDefinition;
import ast.expressions.Arithmetic;
import ast.expressions.ArrayAccess;
import ast.expressions.Cast;
import ast.expressions.CharLiteral;
import ast.expressions.Comparator;
import ast.expressions.Conditional;
import ast.expressions.Expression;
import ast.expressions.FieldAccess;
import ast.expressions.IntLiteral;
import ast.expressions.RealLiteral;
import ast.expressions.UnaryMinus;
import ast.expressions.UnaryNot;
import ast.expressions.Variable;
import ast.statements.Assignment;
import ast.statements.IfStatement;
import ast.statements.ReadStatement;
import ast.statements.ReturnStatement;
import ast.statements.WhileStatement;
import ast.statements.WriteStatement;
import ast.types.ErrorType;
import ast.types.FunctionType;
import ast.types.IntType;
import ast.types.RealType;
import ast.types.Type;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void> {

	// Expressions
	public Void visit(Arithmetic e, Type param) {
		super.visit(e, param);
		e.setLValue(false);
		Type leftType = e.getLeft().getType();
		Type rightType = e.getRight().getType();
		e.setType(leftType.arithmetic(rightType, e));
		return null;
	}

	public Void visit(ArrayAccess e, Type param) {
		super.visit(e, param);
		e.setLValue(true);
		e.setType(e.getArray().getType().squareBrackets(e.getPosition().getType(), e));
		return null;
	}

	public Void visit(Cast e, Type param) {
		super.visit(e, param);
		e.setLValue(false);
		Type fromType = e.getOperand().getType();
		Type toType = e.getCastType();
		e.setType(fromType.cast(toType, e));
		return null;
	}

	public Void visit(CharLiteral e, Type param) {
		super.visit(e, param);
		e.setLValue(false);
		return null;
	}

	public Void visit(Comparator e, Type param) {
		super.visit(e, param);
		e.setLValue(false);
		Type leftType = e.getLeft().getType();
		Type rightType = e.getRight().getType();
		e.setType(leftType.comparator(rightType, e));
		return null;
	}

	public Void visit(Conditional e, Type param) {
		super.visit(e, param);
		e.setLValue(false);
		Type leftType = e.getLeft().getType();
		Type rightType = e.getRight().getType();
		e.setType(leftType.conditional(rightType, e));
		return null;
	}

	public Void visit(FieldAccess e, Type param) {
		super.visit(e, param);
		e.setLValue(true);
		e.setType(e.getRecord().getType().dot(e.getType(), e.getFieldName(), e));
		return null;
	}

	public Void visit(Invocation e, Type param) {
		super.visit(e, param);
		e.setLValue(false);
		Type type = e.getVariable().getDefinition().getType()
				.parenthesis(e.getParams().stream().map(arg -> arg.getType()).toArray(Type[]::new), e);
		e.setType(type);
		return null;
	}

	public Void visit(IntLiteral e, Type param) {
		super.visit(e, param);
		e.setLValue(false);
		e.setType(IntType.getInstance());
		return null;
	}

	public Void visit(RealLiteral e, Type param) {
		super.visit(e, param);
		e.setLValue(false);
		e.setType(RealType.getInstance());
		return null;
	}

	public Void visit(UnaryMinus e, Type param) {
		super.visit(e, param);
		e.setLValue(false);
		e.setType(e.getOperand().getType().negation(e));
		return null;
	}

	public Void visit(UnaryNot e, Type param) {
		super.visit(e, param);
		e.setLValue(false);
		e.setType(e.getOperand().getType().not(e));
		return null;
	}

	public Void visit(Variable e, Type param) {
		super.visit(e, param);
		e.setLValue(true);
		e.setType(e.getDefinition().getType());
		return null;
	}

	// Statements
	@Override
	public Void visit(Assignment e, Type param) {
		super.visit(e, param);
		if (e.getLeft().getLValue() == false) {
			new ErrorType(e.getLine(), e.getColumn(), "the left part of the assignment is not an l-value");
		}
		Expression left = e.getLeft();
		Expression right = e.getRight();
		left.getType().assign(right.getType(), e);
		return null;
	}

	@Override
	public Void visit(IfStatement e, Type param) {
		super.visit(e, param);
		if (!e.getCondition().getType().isBoolean()) {
			new ErrorType(e.getLine(), e.getColumn(),
					"type " + e.getCondition().getType().getName() + " is not boolean.");
		}
		return null;
	}

	@Override
	public Void visit(ReadStatement e, Type param) {
		super.visit(e, param);
		if (e.getBody().getLValue() == false) {
			new ErrorType(e.getLine(), e.getColumn(), "read statement requires an l-value");
		}
		e.getBody().getType().read(e);
		return null;
	}

	@Override
	public Void visit(ReturnStatement e, Type param) {
		super.visit(e, param);
		e.getBody().getType().ret(param, e);
		return null;
	}

	@Override
	public Void visit(WhileStatement e, Type param) {
		super.visit(e, param);
		if (!e.getCondition().getType().isBoolean()) {
			new ErrorType(e.getLine(), e.getColumn(),
					"type " + e.getCondition().getType().getName() + " is not boolean.");
		}
		return null;
	}

	@Override
	public Void visit(WriteStatement e, Type param) {
		super.visit(e, param);
		e.getBody().getType().write(e);
		return null;
	}

	// Definition
	@Override
	public Void visit(FuncDefinition e, Type param) {
		return super.visit(e, ((FunctionType) e.getType()).getReturnType());
	}

	// Program
	@Override
	public Void visit(Program e, Type param) {
		super.visit(e, param);
		boolean mainExists = e.getDefinitions().stream().filter(def -> def.getType() instanceof FunctionType)
				.anyMatch(def -> def.getName().equals("main"));
		if (!mainExists) {
			new ErrorType(e.getLine(), e.getColumn(), "main function does not exist");
		}
		return null;
	}

}
