package codegen;

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
import ast.types.RecordField;
import ast.types.RecordType;
import ast.types.VoidType;
import visitor.Visitor;

public abstract class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {

	// Program
	public TR visit(Program e, TP param) {
		throw new RuntimeException(getExceptionMessage("Program"));
	}

	// Definitions
	public TR visit(FuncDefinition e, TP param) {
		throw new RuntimeException(getExceptionMessage("FuncDefinition"));
	}

	public TR visit(VarDefinition e, TP param) {
		throw new RuntimeException(getExceptionMessage("VarDefinition"));
	}

	// Statements
	public TR visit(Assignment e, TP param) {
		throw new RuntimeException(getExceptionMessage("Assignment"));
	}

	public TR visit(IfStatement e, TP param) {
		throw new RuntimeException(getExceptionMessage("IfStatement"));
	}

	public TR visit(ReadStatement e, TP param) {
		throw new RuntimeException(getExceptionMessage("ReadStatement"));
	}

	public TR visit(ReturnStatement e, TP param) {
		throw new RuntimeException(getExceptionMessage("ReturnStatement"));
	}

	public TR visit(WhileStatement e, TP param) {
		throw new RuntimeException(getExceptionMessage("WhileStatement"));
	}

	public TR visit(WriteStatement e, TP param) {
		throw new RuntimeException(getExceptionMessage("WriteStatement"));
	}

	// Expressions
	public TR visit(Arithmetic e, TP param) {
		throw new RuntimeException(getExceptionMessage("Arithmetic"));
	}

	public TR visit(ArrayAccess e, TP param) {
		throw new RuntimeException(getExceptionMessage("ArrayAccess"));
	}

	public TR visit(Cast e, TP param) {
		throw new RuntimeException(getExceptionMessage("Cast"));
	}

	public TR visit(CharLiteral e, TP param) {
		throw new RuntimeException(getExceptionMessage("CharLiteral"));
	}

	public TR visit(Comparator e, TP param) {
		throw new RuntimeException(getExceptionMessage("Comparator"));
	}

	public TR visit(Conditional e, TP param) {
		throw new RuntimeException(getExceptionMessage("Conditional"));
	}

	public TR visit(FieldAccess e, TP param) {
		throw new RuntimeException(getExceptionMessage("FieldAccess"));
	}

	public TR visit(Invocation e, TP param) {
		throw new RuntimeException(getExceptionMessage("Invocation"));
	}

	public TR visit(IntLiteral e, TP param) {
		throw new RuntimeException(getExceptionMessage("IntLiteral"));
	}

	public TR visit(RealLiteral e, TP param) {
		throw new RuntimeException(getExceptionMessage("RealLiteral"));
	}

	public TR visit(UnaryMinus e, TP param) {
		throw new RuntimeException(getExceptionMessage("UnaryMinus"));
	}

	public TR visit(UnaryNot e, TP param) {
		throw new RuntimeException(getExceptionMessage("UnaryNot"));
	}

	public TR visit(Variable e, TP param) {
		throw new RuntimeException(getExceptionMessage("Variable"));
	}

	// Types
	public TR visit(ArrayType e, TP param) {
		throw new RuntimeException(getExceptionMessage("ArrayType"));
	}

	public TR visit(CharType e, TP param) {
		throw new RuntimeException(getExceptionMessage("CharType"));
	}

	public TR visit(ErrorType e, TP p) {
		throw new RuntimeException(getExceptionMessage("ErrorType"));
	}

	public TR visit(FunctionType e, TP param) {
		throw new RuntimeException(getExceptionMessage("FunctionType"));
	}

	public TR visit(IntType e, TP param) {
		throw new RuntimeException(getExceptionMessage("IntType"));
	}

	public TR visit(RealType e, TP param) {
		throw new RuntimeException(getExceptionMessage("RealType"));
	}

	public TR visit(RecordType e, TP param) {
		throw new RuntimeException(getExceptionMessage("RecordType"));
	}

	public TR visit(VoidType e, TP param) {
		throw new RuntimeException(getExceptionMessage("VoidType"));
	}

	@Override
	public TR visit(RecordField e, TP param) {
		throw new RuntimeException(getExceptionMessage("RecordField"));
	}

	protected abstract String getCodeFunctionName();

	private String getExceptionMessage(String nodeName) {
		return "Cannot call code function " + getCodeFunctionName() + " for node " + nodeName;
	}

}
