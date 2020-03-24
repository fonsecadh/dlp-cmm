package ast.types;

import ast.ASTNode;
import ast.expressions.Expression;

public interface Type extends ASTNode {
	
	String getName();
	
	// Type Checking
	Type arithmetic(Type type, Expression e);
	Type assign(Type type, Expression e);	
	Type cast(Type type, Expression e);	
	Type comparator(Type type, Expression e);
	Type conditional(Type type, Expression e);	
	Type dot(Type type, Expression e);		
	Type negation(Expression e);
	Type not(Expression e);		
	Type parenthesis(Type[] types, Expression e);	
	Type read(Type type, Expression e);	
	Type ret(Type type, Expression e);	
	Type squareBrackets(Type type, Expression e);	
	Type write(Type type, Expression e);
	
	boolean isBoolean();
	boolean equivalent(Type type);

}
