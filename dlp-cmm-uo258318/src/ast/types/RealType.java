package ast.types;

import ast.expressions.Expression;
import ast.statements.Statement;
import visitor.Visitor;

public class RealType extends AbstractType {

	// Attributes
	private static RealType type;

	// Private constructor
	private RealType() {

	}

	// Instance
	public static RealType getInstance() {
		if (type == null) {
			type = new RealType();
		}
		return type;
	}

	@Override
	public String getName() {
		return "Real";
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
	public Type arithmetic(Type type, Expression e) {
		return type == this ? RealType.getInstance() : super.arithmetic(type, e);
	}

	@Override
	public Type assign(Type type, Expression e) {
		if (type instanceof RealType) {
			return this;
		} else {
			return cast(type, e);
		}
	}

	@Override
	public Type cast(Type type, Expression e) {
		if (type instanceof IntType) {
			return type;
		} else if (type instanceof RealType) {
			return type;
		} else {
			return super.cast(type, e);
		}
	}

	@Override
	public Type negation(Expression e) {
		return this;
	}

	@Override
	public Type read(Statement e) {
		return this;
	}

	@Override
	public Type ret(Type type, Statement e) {
		if (type instanceof RealType) {
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
		return 4;
	}

	@Override
	public String toString() {
		return "RealType [getName()=" + getName() + ", getLine()=" + getLine() + ", getColumn()=" + getColumn()
				+ ", numberOfBytes()=" + numberOfBytes() + "]";
	}
	
	@Override
	public String getSuffix() {
		return "f";
	}
	
	@Override
	public String[] convertTo(Type castType) {
		if (castType instanceof IntType) {
			return new String[] { "f2i" };
		} else if (castType instanceof CharType) {
			return new String[] { "f2i", "i2b" };
		} else {
			throw new RuntimeException("Unexpected behaviour in RealType's convertTo method");
		}
	}

}
