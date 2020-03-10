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

public interface Visitor<TP, TR> {
	
	// Program
	TR visit(Program e, TP param);
	
	// Definitions
	TR visit(FuncDefinition e, TP param);
	TR visit(VarDefinition e, TP param);
	
	// Statements
	TR visit(Assignment e, TP param);
	TR visit(IfStatement e, TP param);
	TR visit(ReadStatement e, TP param);
	TR visit(ReturnStatement e, TP param);
	TR visit(WhileStatement e, TP param);
	TR visit(WriteStatement e, TP param);
	
	// Expressions
	TR visit(Arithmetic e, TP param);
	TR visit(ArrayAccess e, TP param);
	TR visit(Cast e, TP param);
	TR visit(CharLiteral e, TP param);
	TR visit(Comparator e, TP param);
	TR visit(Conditional e, TP param);
	TR visit(FieldAccess e, TP param);
	TR visit(Invocation e, TP param);	
	TR visit(IntLiteral e, TP param);
	TR visit(RealLiteral e, TP param);
	TR visit(UnaryMinus e, TP param);
	TR visit(UnaryNot e, TP param);
	TR visit(Variable e, TP param);
	
	// Types
	TR visit(ArrayType e, TP param);
	TR visit(CharType e, TP param);
	TR visit(ErrorType e, TP p);
	TR visit(FunctionType e, TP param);
	TR visit(IntType e, TP param);
	TR visit(RealType e, TP param);
	TR visit(RecordType e, TP param);
	TR visit(VoidType e, TP param);
	
}
