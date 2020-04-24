package codegen;

import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import visitor.Visitor;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {
	
	// Attributes
	private CodeGenerator cg;
	private Visitor<Void, Void> valueCGVisitor;
	
	public void setValueCGVisitor(Visitor<Void, Void> valueCGVisitor) {
		this.valueCGVisitor = valueCGVisitor;
	}
	
	public void setCodeGenerator(CodeGenerator cg) {
		this.cg = cg;
	}	

	@Override
	protected String getCodeFunctionName() {
		return "address";
	}
	
	// Expressions
	
	/*
	 * address[[ArrayAccess: expression1 -> expression2 expression3]] =
	 * 		address[[exp2]] 	// Array
	 * 		value[[exp3]] 		// Position
	 * 		<pushi > exp1.type.numberOfBytes
	 * 		<muli> 		
	 * 		<addi>
	 */
	@Override
	public Void visit(ArrayAccess e, Void param) {
		e.getArray().accept(this, param);
		e.getPosition().accept(valueCGVisitor, param);
		e.setCode(cg.arrayAccess(e));
		return null;
	}
	
	/*
	 * address[[FieldAccess: expression1 -> expression2 ID]] =
	 * 		address[[exp2]]
	 * 		<pushi > exp2.type.getField(ID).offset
	 * 		<addi>
	 */
	@Override
	public Void visit(FieldAccess e, Void param) {
		e.getRecord().accept(this, param);
		e.setCode(cg.fieldAccess(e));
		return null;
	}
	
	/*
	 * address[[Variable: expression -> ID]] =
	 * 		if (expression.definition.scope == SymbolTable.GLOBAL_SCOPE) {
	 * 			<pusha> expression.definition.offset;
	 * 		} else {
	 * 			<push bp>
	 * 			<pushi > expression.definition.offset;
	 * 			<addi>
	 * 		}
	 */
	@Override
	public Void visit(Variable e, Void param) {
		e.setCode(cg.pushAddress(e.getDefinition()));
		return null;
	}

}
