// Generated from src/parser/Cmm.g4 by ANTLR 4.8
package parser;

	import ast.*;
	import ast.definitions.*;
	import ast.expressions.*;
	import ast.expressions.Comparator;
	import ast.statements.*;
	import ast.types.*;
	
	import java.util.*;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, ID=36, INT_CONSTANT=37, REAL_CONSTANT=38, 
		CHAR_CONSTANT=39, COMMENT=40, MULTI_LINE_COMMENT=41, WHITE_SPACES=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "DIGIT", "LETTER", "FLOATING_POINT_NUMBER", "ASCII", 
			"ID", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "COMMENT", "MULTI_LINE_COMMENT", 
			"WHITE_SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'('", "','", "')'", "'{'", "'}'", "';'", "'='", "'if'", 
			"'else'", "'while'", "'return'", "'read'", "'write'", "'int'", "'double'", 
			"'char'", "'['", "']'", "'-'", "'.'", "'*'", "'/'", "'%'", "'+'", "'>'", 
			"'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "COMMENT", "MULTI_LINE_COMMENT", 
			"WHITE_SPACES"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0155\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\5\'\u00d7\n\'\3\'"+
		"\3\'\6\'\u00db\n\'\r\'\16\'\u00dc\3\'\3\'\3\'\7\'\u00e2\n\'\f\'\16\'\u00e5"+
		"\13\'\5\'\u00e7\n\'\3(\3(\3(\3)\3)\5)\u00ee\n)\3)\3)\3)\7)\u00f3\n)\f"+
		")\16)\u00f6\13)\3*\3*\7*\u00fa\n*\f*\16*\u00fd\13*\3*\5*\u0100\n*\3+\3"+
		"+\3+\3+\3+\5+\u0107\n+\3+\6+\u010a\n+\r+\16+\u010b\3+\3+\3+\3+\5+\u0112"+
		"\n+\3+\6+\u0115\n+\r+\16+\u0116\5+\u0119\n+\3,\3,\3,\3,\3,\3,\3,\3,\6"+
		",\u0123\n,\r,\16,\u0124\3,\3,\3,\3,\3,\3,\3,\5,\u012e\n,\3-\3-\3-\3-\7"+
		"-\u0134\n-\f-\16-\u0137\13-\3-\5-\u013a\n-\3-\5-\u013d\n-\3-\3-\3.\3."+
		"\3.\3.\7.\u0145\n.\f.\16.\u0148\13.\3.\3.\3.\3.\3.\3/\6/\u0150\n/\r/\16"+
		"/\u0151\3/\3/\4\u0135\u0146\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M\2O\2Q&S\'U(W)Y*["+
		"+],\3\2\7\3\2\62;\4\2C\\c|\3\2\63;\3\3\f\f\5\2\13\f\17\17\"\"\2\u0168"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\3_\3\2\2\2\5d\3\2\2\2\7f\3\2\2\2\th\3\2\2\2\13j\3\2\2\2\rl\3"+
		"\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25u\3\2\2\2\27z\3\2\2\2\31"+
		"\u0080\3\2\2\2\33\u0087\3\2\2\2\35\u008c\3\2\2\2\37\u0092\3\2\2\2!\u0096"+
		"\3\2\2\2#\u009d\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2"+
		"+\u00a8\3\2\2\2-\u00aa\3\2\2\2/\u00ac\3\2\2\2\61\u00ae\3\2\2\2\63\u00b0"+
		"\3\2\2\2\65\u00b2\3\2\2\2\67\u00b4\3\2\2\29\u00b6\3\2\2\2;\u00b9\3\2\2"+
		"\2=\u00bc\3\2\2\2?\u00bf\3\2\2\2A\u00c2\3\2\2\2C\u00c5\3\2\2\2E\u00c8"+
		"\3\2\2\2G\u00ca\3\2\2\2I\u00d1\3\2\2\2K\u00d3\3\2\2\2M\u00e6\3\2\2\2O"+
		"\u00e8\3\2\2\2Q\u00ed\3\2\2\2S\u00ff\3\2\2\2U\u0118\3\2\2\2W\u012d\3\2"+
		"\2\2Y\u012f\3\2\2\2[\u0140\3\2\2\2]\u014f\3\2\2\2_`\7x\2\2`a\7q\2\2ab"+
		"\7k\2\2bc\7f\2\2c\4\3\2\2\2de\7*\2\2e\6\3\2\2\2fg\7.\2\2g\b\3\2\2\2hi"+
		"\7+\2\2i\n\3\2\2\2jk\7}\2\2k\f\3\2\2\2lm\7\177\2\2m\16\3\2\2\2no\7=\2"+
		"\2o\20\3\2\2\2pq\7?\2\2q\22\3\2\2\2rs\7k\2\2st\7h\2\2t\24\3\2\2\2uv\7"+
		"g\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y\26\3\2\2\2z{\7y\2\2{|\7j\2\2|}\7k\2"+
		"\2}~\7n\2\2~\177\7g\2\2\177\30\3\2\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7v\2\2\u0083\u0084\7w\2\2\u0084\u0085\7t\2\2\u0085"+
		"\u0086\7p\2\2\u0086\32\3\2\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7f\2\2\u008b\34\3\2\2\2\u008c\u008d\7y\2\2\u008d"+
		"\u008e\7t\2\2\u008e\u008f\7k\2\2\u008f\u0090\7v\2\2\u0090\u0091\7g\2\2"+
		"\u0091\36\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7"+
		"v\2\2\u0095 \3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098\7q\2\2\u0098\u0099"+
		"\7w\2\2\u0099\u009a\7d\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c"+
		"\"\3\2\2\2\u009d\u009e\7e\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\u00a1\7t\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7]\2\2\u00a3&\3\2\2\2\u00a4\u00a5"+
		"\7_\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7"+
		"\60\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7"+
		"\61\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7\'\2\2\u00af\62\3\2\2\2\u00b0\u00b1"+
		"\7-\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\66\3\2\2\2\u00b4\u00b5"+
		"\7>\2\2\u00b58\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7\u00b8\7?\2\2\u00b8:\3"+
		"\2\2\2\u00b9\u00ba\7>\2\2\u00ba\u00bb\7?\2\2\u00bb<\3\2\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd\u00be\7?\2\2\u00be>\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1"+
		"\7?\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c4\7(\2\2\u00c4B\3"+
		"\2\2\2\u00c5\u00c6\7~\2\2\u00c6\u00c7\7~\2\2\u00c7D\3\2\2\2\u00c8\u00c9"+
		"\7#\2\2\u00c9F\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd"+
		"\7t\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"H\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2J\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4"+
		"L\3\2\2\2\u00d5\u00d7\5S*\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00da\7\60\2\2\u00d9\u00db\5I%\2\u00da\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00e7\3\2\2\2\u00de\u00df\5S*\2\u00df\u00e3\7\60\2\2\u00e0\u00e2\5I%"+
		"\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00d6\3\2\2\2\u00e6"+
		"\u00de\3\2\2\2\u00e7N\3\2\2\2\u00e8\u00e9\7^\2\2\u00e9\u00ea\5S*\2\u00ea"+
		"P\3\2\2\2\u00eb\u00ee\5K&\2\u00ec\u00ee\7a\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00f4\3\2\2\2\u00ef\u00f3\5K&\2\u00f0\u00f3\7a\2"+
		"\2\u00f1\u00f3\5I%\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"R\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fb\t\4\2\2\u00f8\u00fa\5I%\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u0100\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\7\62\2\2\u00ff"+
		"\u00f7\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100T\3\2\2\2\u0101\u0119\5M\'\2\u0102"+
		"\u0106\5M\'\2\u0103\u0107\7g\2\2\u0104\u0105\7G\2\2\u0105\u0107\7/\2\2"+
		"\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u010a"+
		"\5I%\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u0119\3\2\2\2\u010d\u0111\5S*\2\u010e\u0112\7g\2"+
		"\2\u010f\u0110\7G\2\2\u0110\u0112\7/\2\2\u0111\u010e\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0115\5I%\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u0101\3\2\2\2\u0118\u0102\3\2\2\2\u0118\u010d\3\2\2\2\u0119"+
		"V\3\2\2\2\u011a\u011b\7)\2\2\u011b\u011c\7^\2\2\u011c\u011d\7p\2\2\u011d"+
		"\u0123\7)\2\2\u011e\u011f\7)\2\2\u011f\u0120\7^\2\2\u0120\u0121\7v\2\2"+
		"\u0121\u0123\7)\2\2\u0122\u011a\3\2\2\2\u0122\u011e\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012e\3\2\2\2\u0126"+
		"\u0127\7)\2\2\u0127\u0128\5O(\2\u0128\u0129\7)\2\2\u0129\u012e\3\2\2\2"+
		"\u012a\u012b\7)\2\2\u012b\u012c\13\2\2\2\u012c\u012e\7)\2\2\u012d\u0122"+
		"\3\2\2\2\u012d\u0126\3\2\2\2\u012d\u012a\3\2\2\2\u012eX\3\2\2\2\u012f"+
		"\u0130\7\61\2\2\u0130\u0131\7\61\2\2\u0131\u0135\3\2\2\2\u0132\u0134\13"+
		"\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0136\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\7\17"+
		"\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b"+
		"\u013d\t\5\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b-"+
		"\2\2\u013fZ\3\2\2\2\u0140\u0141\7\61\2\2\u0141\u0142\7,\2\2\u0142\u0146"+
		"\3\2\2\2\u0143\u0145\13\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0149\u014a\7,\2\2\u014a\u014b\7\61\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\b.\2\2\u014d\\\3\2\2\2\u014e\u0150\t\6\2\2\u014f\u014e\3\2\2\2"+
		"\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0154\b/\2\2\u0154^\3\2\2\2\31\2\u00d6\u00dc\u00e3\u00e6"+
		"\u00ed\u00f2\u00f4\u00fb\u00ff\u0106\u010b\u0111\u0116\u0118\u0122\u0124"+
		"\u012d\u0135\u0139\u013c\u0146\u0151\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}