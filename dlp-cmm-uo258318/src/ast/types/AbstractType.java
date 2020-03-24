package ast.types;

import ast.expressions.Expression;

public abstract class AbstractType implements Type {

	@Override
	public Type arithmetic(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}		
		new ErrorType(e.getLine(), e.getColumn(), "arithmetic operator not supported by type " + type.getName());
		return null;
	}

	@Override
	public Type assign(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		new ErrorType(e.getLine(), e.getColumn(), "assign operator not supported by type " + type.getName());
		return null;
	}

	@Override
	public Type cast(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		new ErrorType(e.getLine(), e.getColumn(), "cast operator not supported by type " + type.getName());
		return null;
	}

	@Override
	public Type comparator(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		new ErrorType(e.getLine(), e.getColumn(), "comparator operator not supported by type " + type.getName());
		return null;
	}

	@Override
	public Type conditional(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		new ErrorType(e.getLine(), e.getColumn(), "conditional operator not supported by type " + type.getName());
		return null;
	}

	@Override
	public Type dot(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		new ErrorType(e.getLine(), e.getColumn(), "dot operator not supported by type " + type.getName());
		return null;
	}

	@Override
	public Type negation(Expression e) {
		new ErrorType(e.getLine(), e.getColumn(), "negation operator not supported by type " + this.getName());
		return null;
	}

	@Override
	public Type not(Expression e) {
		new ErrorType(e.getLine(), e.getColumn(), "not operator not supported by type " + this.getName());
		return null;
	}

	@Override
	public Type parenthesis(Type[] types, Expression e) {
		for (Type type : types) {
			if (type instanceof ErrorType) {
				return type;
			}
		}
		new ErrorType(e.getLine(), e.getColumn(), "parenthesis operator not supported by type " + this.getName());
		return null;
	}

	@Override
	public Type read(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		new ErrorType(e.getLine(), e.getColumn(), "read operator not supported by type " + type.getName());
		return null;
	}

	@Override
	public Type ret(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		new ErrorType(e.getLine(), e.getColumn(), "return operator not supported by type " + type.getName());
		return null;
	}

	@Override
	public Type squareBrackets(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		new ErrorType(e.getLine(), e.getColumn(), "square brackets operator not supported by type " + type.getName());
		return null;
	}

	@Override
	public Type write(Type type, Expression e) {
		if (type instanceof ErrorType) {
			return type;
		}
		new ErrorType(e.getLine(), e.getColumn(), "write operator not supported by type " + type.getName());
		return null;
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
