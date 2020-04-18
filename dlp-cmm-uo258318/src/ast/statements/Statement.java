package ast.statements;

import ast.ASTNode;

public interface Statement extends ASTNode {
	
	String getCode();
	void setCode(String code);

}
