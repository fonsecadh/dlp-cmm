package parser;

public class LexerHelper {

	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {

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
					throw new RuntimeException();
				}
			}

			int asciiCode = Integer.parseInt(resultingString);
			return (char) asciiCode;
		}

		return 0;
	}

	private static char isTabOrNewLine(String s) {
		System.out.println(s);
		if (s.equals("\n")) {
			return '\'' + '\\' + 'n' + '\'';
		} else if (s.equals("\t")) {
			return '\'' + '\\' + 't' + '\'';
		}
		return 0;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

		return -1;
	}

}
