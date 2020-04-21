package ast.types;

import ast.ASTNode;
import ast.expressions.Expression;
import ast.statements.Statement;

public interface Type extends ASTNode {
	
	String getName();
	
	// Type Checking
	Type arithmetic(Type type, Expression e);
	Type assign(Type type, Statement e);	
	Type cast(Type type, Expression e);	
	Type comparator(Type type, Expression e);
	Type conditional(Type type, Expression e);	
	Type dot(Type type, String fieldName, Expression e);		
	Type negation(Expression e);
	Type not(Expression e);		
	Type parenthesis(Type[] types, Expression e);	
	Type read(Statement e);	
	Type ret(Type type, Statement e);	
	Type squareBrackets(Type type, Expression e);	
	Type write(Statement e);
	
	boolean isBoolean();
	boolean equivalent(Type type);
	
	// Code Generation
	int numberOfBytes();
	String getSuffix();

	String[] convertTo(Type castType);

}
