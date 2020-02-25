package ast.types;

import ast.ASTNode;

public interface Type extends ASTNode {
	
	String getName();

	boolean isArrayType();

}
