package visitor;

import ast.Invocation;
import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Arithmetic;
import ast.expressions.ArrayAccess;
import ast.expressions.Cast;
import ast.expressions.CharLiteral;
import ast.expressions.Comparator;
import ast.expressions.Conditional;
import ast.expressions.FieldAccess;
import ast.expressions.IntLiteral;
import ast.expressions.RealLiteral;
import ast.expressions.UnaryMinus;
import ast.expressions.UnaryNot;
import ast.expressions.Variable;
import ast.statements.Assignment;
import ast.statements.IfStatement;
import ast.statements.ReadStatement;
import ast.statements.ReturnStatement;
import ast.statements.WhileStatement;
import ast.statements.WriteStatement;
import ast.types.ArrayType;
import ast.types.CharType;
import ast.types.ErrorType;
import ast.types.FunctionType;
import ast.types.IntType;
import ast.types.RealType;
import ast.types.RecordType;
import ast.types.VoidType;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {
	
	// Program
	public TR visit(Program e, TP param) {
		e.getDefinitions().forEach(d -> d.accept(this, param));
		return null;
	}
	
	// Definitions
	public TR visit(FuncDefinition e, TP param) {
		e.getType().accept(this, param);
		e.getBody().forEach(s -> s.accept(this, param));
		return null;
	}
	
	public TR visit(VarDefinition e, TP param) {
		e.getType().accept(this, param);
		return null;
	}
	
	// Statements
	public TR visit(Assignment e, TP param) {
		e.getLeft().accept(this, param);
		e.getRight().accept(this, param);
		return null;
	}
	
	public TR visit(IfStatement e, TP param) {
		e.getCondition().accept(this, param);
		e.getIfPart().forEach(s -> s.accept(this, param));
		if (e.getElsePart() != null) {
			e.getElsePart().forEach(s -> s.accept(this, param));
		}
		return null;
	}
	
	public TR visit(ReadStatement e, TP param) {
		e.getBody().accept(this, param);
		return null;
	}
	
	public TR visit(ReturnStatement e, TP param) {
		e.getBody().accept(this, param);
		return null;
	}
	
	public TR visit(WhileStatement e, TP param) {
		e.getCondition().accept(this, param);
		e.getBody().forEach(s -> s.accept(this, param));
		return null;
	}
	
	public TR visit(WriteStatement e, TP param) {
		e.getBody().accept(this, param);
		return null;
	}
	
	// Expressions
	public TR visit(Arithmetic e, TP param) {
		e.getLeft().accept(this, param);
		e.getRight().accept(this, param);
		return null;
	}
	
	public TR visit(ArrayAccess e, TP param) {
		e.getArray().accept(this, param);
		e.getPosition().accept(this, param);
		return null;
	}
	
	public TR visit(Cast e, TP param) {
		e.getCastType().accept(this, param);
		e.getOperand().accept(this, param);
		return null;
	}
	
	public TR visit(CharLiteral e, TP param) {
		return null;
	}
	
	public TR visit(Comparator e, TP param) {
		e.getLeft().accept(this, param);
		e.getRight().accept(this, param);
		return null;
	}
	
	public TR visit(Conditional e, TP param) {
		e.getLeft().accept(this, param);
		e.getRight().accept(this, param);
		return null;
	}
	
	public TR visit(FieldAccess e, TP param) {
		e.getRecord().accept(this, param);
		return null;
	}
	
	public TR visit(Invocation e, TP param) {
		e.getParams().forEach(p -> p.accept(this, param));
		return null;
	}
	
	public TR visit(IntLiteral e, TP param) {
		return null;
	}
	
	public TR visit(RealLiteral e, TP param) {
		return null;
	}
	
	public TR visit(UnaryMinus e, TP param) {
		e.getOperand().accept(this, param);
		return null;
	}
	
	public TR visit(UnaryNot e, TP param) {
		e.getOperand().accept(this, param);
		return null;
	}
	
	public TR visit(Variable e, TP param) {
		return null;
	}
	
	// Types
	public TR visit(ArrayType e, TP param) {
		e.getOf().accept(this, param);
		return null;
	}
	
	public TR visit(CharType e, TP param) {
		return null;
	}
	
	public TR visit(ErrorType e, TP p) {
		return null;
	}
	
	public TR visit(FunctionType e, TP param) {
		e.getParams().forEach(p -> p.accept(this, param));
		e.getReturnType().accept(this, param);
		return null;
	}
	
	public TR visit(IntType e, TP param) {
		return null;
	}
	
	public TR visit(RealType e, TP param) {
		return null;
	}
	
	public TR visit(RecordType e, TP param) {
		return null;
	}
	
	public TR visit(VoidType e, TP param) {
		return null;
	}

}
