package ast.types;

import ast.expressions.Expression;
import ast.statements.Statement;

public abstract class AbstractType implements Type {

	@Override
	public Type arithmetic(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		return new ErrorType(e.getLine(), e.getColumn(), "arithmetic operator not supported by type " + type.getName());
	}

	@Override
	public Type assign(Type type, Statement e) {
		if (type instanceof ErrorType) {
			return type;
		}
		return new ErrorType(e.getLine(), e.getColumn(), "assign operator not supported by type " + type.getName());
	}

	@Override
	public Type cast(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		return new ErrorType(e.getLine(), e.getColumn(), "cast operator not supported by type " + type.getName());
	}

	@Override
	public Type comparator(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		} else if (!type.equivalent(this)) {
			return new ErrorType(e.getLine(), e.getColumn(),
					"cannot compare type " + this.getName() + " with type " + type.getName());
		} else {
			return new ErrorType(e.getLine(), e.getColumn(),
					"comparator operator not supported by type " + this.getName());
		}
	}

	@Override
	public Type conditional(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		return new ErrorType(e.getLine(), e.getColumn(),
				"conditional operator not supported by type " + type.getName());
	}

	@Override
	public Type dot(Type type, String fieldName, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		return new ErrorType(e.getLine(), e.getColumn(), "dot operator not supported by type " + type.getName());
	}

	@Override
	public Type negation(Expression e) {
		return new ErrorType(e.getLine(), e.getColumn(), "negation operator not supported by type " + this.getName());
	}

	@Override
	public Type not(Expression e) {
		return new ErrorType(e.getLine(), e.getColumn(), "not operator not supported by type " + this.getName());
	}

	@Override
	public Type parenthesis(Type[] types, Expression e) {
		for (Type type : types) {
			if (type instanceof ErrorType) {
				return type;
			}
		}
		return new ErrorType(e.getLine(), e.getColumn(),
				"parenthesis operator not supported by type " + this.getName());
	}

	@Override
	public Type read(Statement e) {
		if (this instanceof ErrorType) {
			return this;
		}
		return new ErrorType(e.getLine(), e.getColumn(), "read operator not supported by type " + this.getName());
	}

	@Override
	public Type ret(Type type, Statement e) {
		if (this instanceof ErrorType) {
			return this;
		}
		return new ErrorType(e.getLine(), e.getColumn(),
				"type " + this.getName() + " does not match with return type " + type.getName());
	}

	@Override
	public Type squareBrackets(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		return new ErrorType(e.getLine(), e.getColumn(),
				"square brackets operator not supported by type " + type.getName());
	}

	@Override
	public Type write(Statement e) {
		if (this instanceof ErrorType) {
			return this;
		}
		return new ErrorType(e.getLine(), e.getColumn(), "write operator not supported by type " + this.getName());
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean equivalent(Type type) {
		if (this.getName().equals(type.getName())) {
			return true;
		} else {
			return false;
		}
	}

}
