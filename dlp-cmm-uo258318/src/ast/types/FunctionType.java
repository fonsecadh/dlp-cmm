package ast.types;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ast.definitions.VarDefinition;
import ast.expressions.Expression;
import visitor.Visitor;

public class FunctionType extends AbstractType {

	// Attributes
	private int line;
	private int column;
	private Type returnType;
	private List<VarDefinition> params;

	// Constructor
	public FunctionType(int line, int column, Type returnType, List<VarDefinition> params) {
		this.line = line;
		this.column = column;
		this.returnType = returnType;
		checkRepeatedParams(new ArrayList<VarDefinition>(params));
		this.params = new ArrayList<VarDefinition>(params);
	}

	@Override
	public String getName() {
		return "Function";
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	public Type getReturnType() {
		return returnType;
	}

	public List<VarDefinition> getParams() {
		return new ArrayList<VarDefinition>(params);
	}

	private void checkRepeatedParams(ArrayList<VarDefinition> params) {
		List<String> sortedParams = params.parallelStream().map(p -> p.getName()).sorted().collect(Collectors.toList());
		String s = "";
		for (String str : sortedParams) {
			if (str.equals(s)) {
				new ErrorType("Duplicate parameter: " + str + " in function definition");
			}
			s = str;
		}
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

	@Override
	public Type parenthesis(Type[] types, Expression e) {
		if (types.length != this.getParams().size()) {
			return new ErrorType("The number of parameters does not match.");
		}
		for (int i = 0; i < this.getParams().size(); i++) {
			Type type = types[i];
			Type param = this.getParams().get(i).getType();
			if (!type.getClass().equals(param.getClass())) {
				return new ErrorType("Parameter " + i + " is of type " + param.getName() + " and it must be of type "
						+ type.getName());
			}
		}
		return this.getReturnType();
	}

}
