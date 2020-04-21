package ast.types;

import ast.expressions.Expression;
import ast.statements.Statement;
import visitor.Visitor;

public class CharType extends AbstractType {

	// Attributes
	private static CharType type;

	// Private constructor
	private CharType() {

	}

	// Instance
	public static CharType getInstance() {
		if (type == null) {
			type = new CharType();
		}
		return type;
	}

	@Override
	public String getName() {
		return "Char";
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
		return type == this ? IntType.getInstance() : super.arithmetic(type, e);
	}

	@Override
	public Type assign(Type type, Statement e) {
		if (type instanceof CharType) {
			return this;
		}
		return super.assign(type, e);
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
	public Type read(Statement e) {
		return this;
	}

	@Override
	public Type ret(Type type, Statement e) {
		if (type instanceof CharType) {
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
		return 1;
	}

	@Override
	public String toString() {
		return "CharType [getName()=" + getName() + ", getLine()=" + getLine() + ", getColumn()=" + getColumn()
				+ ", numberOfBytes()=" + numberOfBytes() + "]";
	}
	
	@Override
	public String getSuffix() {
		return "b";
	}
	
	@Override
	public String[] convertTo(Type castType) {
		if (castType instanceof IntType) {
			return new String[] { "b2i" };
		} else if (castType instanceof RealType) {
			return new String[] { "b2i", "i2f" };
		} else {
			throw new RuntimeException("Unexpected behaviour in CharType's convertTo method");
		}
	}

}
