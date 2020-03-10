package ast.expressions;

import visitor.Visitor;

public class CharLiteral extends AbstractExpression {

	// Attributes
	private char value;

	public CharLiteral(int line, int column, String value) {
		super(line, column);
		this.value = lexToChar(value);
	}	

	public char getValue() {
		return value;
	}
	
	private char lexToChar(String str) {
		if (str.length() == 3) {
			return str.charAt(1);
		} else if (str.length() == 4) {
			return isTabOrNewLine(str);
		} else if (str.length() > 0) {
			String resultingString = "";
			for (int i = 2; i < str.length() - 1; i++) {
				if (Character.isDigit(str.charAt(i))) {
					resultingString += str.charAt(i);
				} else {
					return 0;
				}
			}
			int asciiCode = Integer.parseInt(resultingString);
			return (char) asciiCode;
		}
		return 0;
	}
	
	private static char isTabOrNewLine(String s) {
		if (s.charAt(2) == 'n') {
			return '\n';
		} else if (s.charAt(2) == 't') {
			return '\t';
		}
		return 0;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
		return v.visit(this, p);
	}

}
