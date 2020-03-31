package codegen;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.types.FunctionType;
import ast.types.RecordType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Boolean, Void> {

	// Attributes
	private int globalVarOffset = 0;
	private int localVarOffset = 0;
	private int localParamOffset = 0;
	private int recordFieldOffset = 0;

	// Definitions
	@Override
	public Void visit(FuncDefinition e, Boolean isAParameter) {
		/*
		 * We initialize the offset value for local variables and local parameters.
		 */
		localVarOffset = 0;
		localParamOffset = 4;

		/*
		 * We set the offset for the variable definitions acting as parameters of this
		 * function.
		 * 
		 * For achieving this, we set the second parameter as true, indicating that the
		 * variable definitions are indeed parameters.
		 */
		e.getType().accept(this, true);

		// Now we set the offset of the elements of the body.
		e.getBody().forEach(element -> element.accept(this, false));
		
		/*
		 * Finally, we set the local variable size of the function type.
		 */
		FunctionType funcType = (FunctionType) e.getType();
		funcType.setLocalVariableSize(localVarOffset);

		return null;
	}

	@Override
	public Void visit(VarDefinition e, Boolean isAParameter) {
		super.visit(e, isAParameter);
		// If it is a global variable
		if (e.getScope() == SymbolTable.GLOBAL_SCOPE) {
			// Static data have growing memory addresses.
			e.setOffset(globalVarOffset);
			globalVarOffset += e.getType().numberOfBytes();
		} else {
			// Dynamic stack-based data have decreasing memory addresses.
			if (isAParameter) { // If it is a parameter
				e.setOffset(-localParamOffset);
				localParamOffset += e.getType().numberOfBytes();
			} else { // If it is a local variable
				localVarOffset += e.getType().numberOfBytes();
				e.setOffset(-localVarOffset);
			}
		}
		return null;
	}	
	
	// Types
	@Override
	public Void visit(RecordType e, Boolean isAParameter) {
		super.visit(e, isAParameter);
		// We set the offset of the record fields
		e.getFields().forEach(f -> {
			f.setOffset(recordFieldOffset);
			recordFieldOffset += f.getFieldType().numberOfBytes();
		});
		return null;
	}

}
