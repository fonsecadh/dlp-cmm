package ast.expressions;

import ast.ASTNode;

public interface Expression extends ASTNode {
	
	boolean getLValue();
	void setLValue(boolean lvalue);

}
