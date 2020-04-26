package codegen;

import ast.definitions.Definition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import visitor.Visitor;

public class AddressCGVisitor extends AbstractCGVisitor<Definition, Void> {
	
	// Attributes
	private CodeGenerator cg;
	private Visitor<Definition, Void> valueCGVisitor;
	
	public void setValueCGVisitor(Visitor<Definition, Void> valueCGVisitor) {
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
	public Void visit(ArrayAccess e, Definition param) {
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
	public Void visit(FieldAccess e, Definition param) {
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
	public Void visit(Variable e, Definition param) {
		e.setCode(cg.pushAddress(e.getDefinition()));
		return null;
	}

}
