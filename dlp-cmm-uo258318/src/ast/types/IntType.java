package ast.types;

import ast.expressions.Expression;
import ast.statements.Statement;
import visitor.Visitor;

public class IntType extends AbstractType {

	// Attributes
	private static IntType type;

	// Private constructor
	private IntType() {

	}

	// Instance
	public static IntType getInstance() {
		if (type == null) {
			type = new IntType();
		}
		return type;
	}

	@Override
	public String getName() {
		return "Int";
	}

	@Override
	public int getLine() {
		return -1;
	}

	@Override
	public int getColumn() {
		return -1;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public boolean isBoolean() {
		return true;
	}

	@Override
	public Type arithmetic(Type type, Expression e) {
		return type == this ? IntType.getInstance() : super.arithmetic(type, e);
	}

	@Override
	public Type assign(Type type, Expression e) {
		if (type instanceof IntType) {
			return type;
		} else {
			return cast(type, e);
		}
	}

	@Override
	public Type cast(Type type, Expression e) {
		if (type instanceof RealType) {
			return type;
		} else if (type instanceof IntType) {
			return type;
		} else {
			return super.cast(type, e);
		}
	}

	@Override
	public Type comparator(Type type, Expression e) {
		if (type instanceof IntType) {
			return this;
		}
		return super.comparator(type, e);
	}

	@Override
	public Type conditional(Type type, Expression e) {
		if (type instanceof IntType) {
			return this;
		}
		return super.conditional(type, e);
	}

	@Override
	public Type negation(Expression e) {
		return this;
	}

	@Override
	public Type not(Expression e) {
		return this;
	}

	@Override
	public Type read(Statement e) {
		return this;
	}

	@Override
	public Type ret(Type type, Statement e) {
		if (type instanceof IntType) {
			return this;
		}
		return super.ret(type, e);
	}

	@Override
	public Type write(Statement e) {
		return this;
	}
	
	@Override
	public int numberOfBytes() {
		return 2;
	}

	@Override
	public String toString() {
		return "IntType [getName()=" + getName() + ", getLine()=" + getLine() + ", getColumn()=" + getColumn()
				+ ", numberOfBytes()=" + numberOfBytes() + "]";
	}
	
	@Override
	public String getSuffix() {
		return "i";
	}
	
	@Override
	public String[] convertTo(Type castType) {
		if (castType instanceof RealType) {
			return new String[] { "i2f" };
		} else if (castType instanceof CharType) {
			return new String[] { "i2b" };
		} else {
			throw new RuntimeException("Unexpected behaviour in IntType's convertTo method");
		}
	}

}
