// Generated from src/parser/Cmm.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, INT_CONSTANT=2, REAL_CONSTANT=3, CHAR_CONSTANT=4, COMMENT=5, MULTI_LINE_COMMENT=6, 
		WHITE_SPACES=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "LETTER", "FLOATING_POINT_NUMBER", "ASCII", "ID", "INT_CONSTANT", 
			"REAL_CONSTANT", "CHAR_CONSTANT", "COMMENT", "MULTI_LINE_COMMENT", "WHITE_SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "COMMENT", 
			"MULTI_LINE_COMMENT", "WHITE_SPACES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u009d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\5\4\37\n\4\3\4\3\4\6\4#\n\4\r\4\16\4"+
		"$\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\5\4/\n\4\3\5\3\5\3\5\3\6\3\6\5\6"+
		"\66\n\6\3\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\7\3\7\7\7B\n\7\f\7\16\7"+
		"E\13\7\3\7\5\7H\n\7\3\b\3\b\3\b\3\b\3\b\5\bO\n\b\3\b\6\bR\n\b\r\b\16\b"+
		"S\3\b\3\b\3\b\3\b\5\bZ\n\b\3\b\6\b]\n\b\r\b\16\b^\5\ba\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\6\tk\n\t\r\t\16\tl\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tv\n\t\3\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\n\5\n\u0082\n\n\3"+
		"\n\5\n\u0085\n\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u008d\n\13\f\13\16\13"+
		"\u0090\13\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u0098\n\f\r\f\16\f\u0099"+
		"\3\f\3\f\4}\u008e\2\r\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27"+
		"\t\3\2\7\3\2\62;\4\2C\\c|\3\2\63;\3\3\f\f\5\2\13\f\17\17\"\"\2\u00b0\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2"+
		"\13\65\3\2\2\2\rG\3\2\2\2\17`\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25\u0088"+
		"\3\2\2\2\27\u0097\3\2\2\2\31\32\t\2\2\2\32\4\3\2\2\2\33\34\t\3\2\2\34"+
		"\6\3\2\2\2\35\37\5\r\7\2\36\35\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 \"\7"+
		"\60\2\2!#\5\3\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%/\3\2\2\2"+
		"&\'\5\r\7\2\'+\7\60\2\2(*\5\3\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2"+
		"\2\2,/\3\2\2\2-+\3\2\2\2.\36\3\2\2\2.&\3\2\2\2/\b\3\2\2\2\60\61\7^\2\2"+
		"\61\62\5\r\7\2\62\n\3\2\2\2\63\66\5\5\3\2\64\66\7a\2\2\65\63\3\2\2\2\65"+
		"\64\3\2\2\2\66<\3\2\2\2\67;\5\5\3\28;\7a\2\29;\5\3\2\2:\67\3\2\2\2:8\3"+
		"\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\f\3\2\2\2><\3\2\2\2?C"+
		"\t\4\2\2@B\5\3\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DH\3\2\2\2E"+
		"C\3\2\2\2FH\7\62\2\2G?\3\2\2\2GF\3\2\2\2H\16\3\2\2\2Ia\5\7\4\2JN\5\7\4"+
		"\2KO\7g\2\2LM\7G\2\2MO\7/\2\2NK\3\2\2\2NL\3\2\2\2OQ\3\2\2\2PR\5\3\2\2"+
		"QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2Ta\3\2\2\2UY\5\r\7\2VZ\7g\2\2"+
		"WX\7G\2\2XZ\7/\2\2YV\3\2\2\2YW\3\2\2\2Z\\\3\2\2\2[]\5\3\2\2\\[\3\2\2\2"+
		"]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`I\3\2\2\2`J\3\2\2\2`U\3\2\2"+
		"\2a\20\3\2\2\2bc\7)\2\2cd\7^\2\2de\7p\2\2ek\7)\2\2fg\7)\2\2gh\7^\2\2h"+
		"i\7v\2\2ik\7)\2\2jb\3\2\2\2jf\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mv"+
		"\3\2\2\2no\7)\2\2op\5\t\5\2pq\7)\2\2qv\3\2\2\2rs\7)\2\2st\13\2\2\2tv\7"+
		")\2\2uj\3\2\2\2un\3\2\2\2ur\3\2\2\2v\22\3\2\2\2wx\7\61\2\2xy\7\61\2\2"+
		"y}\3\2\2\2z|\13\2\2\2{z\3\2\2\2|\177\3\2\2\2}~\3\2\2\2}{\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0082\7\17\2\2\u0081\u0080\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\t\5\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\b\n\2\2\u0087\24\3\2\2\2\u0088\u0089\7\61\2"+
		"\2\u0089\u008a\7,\2\2\u008a\u008e\3\2\2\2\u008b\u008d\13\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7,\2\2\u0092\u0093\7\61"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\13\2\2\u0095\26\3\2\2\2\u0096\u0098"+
		"\t\6\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\f\2\2\u009c\30\3\2\2"+
		"\2\31\2\36$+.\65:<CGNSY^`jlu}\u0081\u0084\u008e\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}