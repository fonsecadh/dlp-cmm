// Generated from src/parser/Cmm.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_var_definition = 2, RULE_statement = 3, 
		RULE_block = 4, RULE_expression = 5, RULE_arguments = 6, RULE_type = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "var_definition", "statement", "block", "expression", 
			"arguments", "type"
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

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				definition();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__34))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(21);
					match(T__0);
					}
					break;
				case T__14:
				case T__15:
				case T__16:
				case T__34:
					{
					setState(22);
					type(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(25);
				match(ID);
				setState(26);
				match(T__1);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__34))) != 0)) {
					{
					setState(27);
					type(0);
					setState(28);
					match(ID);
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(29);
						match(T__2);
						setState(30);
						type(0);
						setState(31);
						match(ID);
						}
						}
						setState(37);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(40);
				match(T__3);
				setState(41);
				match(T__4);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__34))) != 0)) {
					{
					{
					setState(42);
					var_definition();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(48);
					statement();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				var_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			type(0);
			setState(59);
			match(ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(60);
				match(T__2);
				setState(61);
				match(ID);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				expression(0);
				setState(70);
				match(T__7);
				setState(71);
				expression(0);
				setState(72);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__8);
				setState(75);
				match(T__1);
				setState(76);
				expression(0);
				setState(77);
				match(T__3);
				setState(78);
				block();
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(79);
					match(T__9);
					setState(80);
					block();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T__10);
				setState(84);
				match(T__1);
				setState(85);
				expression(0);
				setState(86);
				match(T__3);
				setState(87);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(T__11);
				setState(90);
				expression(0);
				setState(91);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(T__12);
				setState(94);
				expression(0);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(95);
					match(T__2);
					setState(96);
					expression(0);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				match(T__13);
				setState(105);
				expression(0);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(106);
					match(T__2);
					setState(107);
					expression(0);
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				match(ID);
				setState(116);
				match(T__1);
				setState(117);
				arguments();
				setState(118);
				match(T__3);
				setState(119);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__19:
			case T__33:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__4);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(125);
					statement();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(135);
				match(T__1);
				setState(136);
				expression(0);
				setState(137);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(139);
				match(T__1);
				setState(140);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
				match(T__3);
				setState(142);
				expression(14);
				}
				break;
			case 3:
				{
				setState(143);
				match(T__19);
				setState(144);
				expression(12);
				}
				break;
			case 4:
				{
				setState(145);
				match(ID);
				setState(146);
				match(T__1);
				setState(147);
				arguments();
				setState(148);
				match(T__3);
				}
				break;
			case 5:
				{
				setState(150);
				match(T__33);
				setState(151);
				expression(5);
				}
				break;
			case 6:
				{
				setState(152);
				match(ID);
				}
				break;
			case 7:
				{
				setState(153);
				match(INT_CONSTANT);
				}
				break;
			case 8:
				{
				setState(154);
				match(REAL_CONSTANT);
				}
				break;
			case 9:
				{
				setState(155);
				match(CHAR_CONSTANT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(159);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(162);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(165);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(168);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(171);
						match(T__17);
						setState(172);
						expression(0);
						setState(173);
						match(T__18);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(176);
						match(T__20);
						setState(177);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(183);
				expression(0);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(184);
					match(T__2);
					setState(185);
					expression(0);
					}
				}

				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				{
				setState(194);
				match(T__34);
				setState(195);
				match(T__4);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(196);
					type(0);
					setState(197);
					match(ID);
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(198);
						match(T__2);
						setState(199);
						match(ID);
						}
						}
						setState(204);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(205);
					match(T__6);
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__34))) != 0) );
				setState(211);
				match(T__5);
				}
				break;
			case T__16:
				{
				setState(213);
				match(T__16);
				}
				break;
			case T__14:
				{
				setState(214);
				match(T__14);
				}
				break;
			case T__15:
				{
				setState(215);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(218);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(219);
					match(T__17);
					setState(220);
					expression(0);
					setState(221);
					match(T__18);
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(222);
							match(T__17);
							setState(223);
							expression(0);
							setState(224);
							match(T__18);
							}
							} 
						}
						setState(230);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					}
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 7:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2"+
		"\r\2\16\2\25\3\3\3\3\5\3\32\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3$\n"+
		"\3\f\3\16\3\'\13\3\5\3)\n\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3"+
		"\7\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\7\4A\n\4"+
		"\f\4\16\4D\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5T\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5d\n\5\f\5\16\5g\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5o\n\5\f\5\16\5r\13\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5|\n\5\3\6\3\6\3\6\7\6\u0081\n\6\f"+
		"\6\16\6\u0084\13\6\3\6\5\6\u0087\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009f\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00b5\n\7\f\7\16\7\u00b8\13\7\3\b\3\b\3\b\5\b\u00bd\n\b\7"+
		"\b\u00bf\n\b\f\b\16\b\u00c2\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00cb"+
		"\n\t\f\t\16\t\u00ce\13\t\3\t\3\t\6\t\u00d2\n\t\r\t\16\t\u00d3\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00db\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00e5\n"+
		"\t\f\t\16\t\u00e8\13\t\7\t\u00ea\n\t\f\t\16\t\u00ed\13\t\3\t\2\4\f\20"+
		"\n\2\4\6\b\n\f\16\20\2\7\3\2\21\23\3\2\30\32\4\2\26\26\33\33\3\2\34!\3"+
		"\2\"#\2\u0110\2\23\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b{\3\2\2\2\n\u0086\3"+
		"\2\2\2\f\u009e\3\2\2\2\16\u00c0\3\2\2\2\20\u00da\3\2\2\2\22\24\5\4\3\2"+
		"\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2"+
		"\27\32\7\3\2\2\30\32\5\20\t\2\31\27\3\2\2\2\31\30\3\2\2\2\32\33\3\2\2"+
		"\2\33\34\7&\2\2\34(\7\4\2\2\35\36\5\20\t\2\36%\7&\2\2\37 \7\5\2\2 !\5"+
		"\20\t\2!\"\7&\2\2\"$\3\2\2\2#\37\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2"+
		"\2&)\3\2\2\2\'%\3\2\2\2(\35\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\6\2\2+/\7"+
		"\7\2\2,.\5\6\4\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\65\3\2"+
		"\2\2\61/\3\2\2\2\62\64\5\b\5\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2"+
		"\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\28;\7\b\2\29;\5\6\4\2:\31\3\2"+
		"\2\2:9\3\2\2\2;\5\3\2\2\2<=\5\20\t\2=B\7&\2\2>?\7\5\2\2?A\7&\2\2@>\3\2"+
		"\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\t\2\2F\7\3"+
		"\2\2\2GH\5\f\7\2HI\7\n\2\2IJ\5\f\7\2JK\7\t\2\2K|\3\2\2\2LM\7\13\2\2MN"+
		"\7\4\2\2NO\5\f\7\2OP\7\6\2\2PS\5\n\6\2QR\7\f\2\2RT\5\n\6\2SQ\3\2\2\2S"+
		"T\3\2\2\2T|\3\2\2\2UV\7\r\2\2VW\7\4\2\2WX\5\f\7\2XY\7\6\2\2YZ\5\n\6\2"+
		"Z|\3\2\2\2[\\\7\16\2\2\\]\5\f\7\2]^\7\t\2\2^|\3\2\2\2_`\7\17\2\2`e\5\f"+
		"\7\2ab\7\5\2\2bd\5\f\7\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2"+
		"\2\2ge\3\2\2\2hi\7\t\2\2i|\3\2\2\2jk\7\20\2\2kp\5\f\7\2lm\7\5\2\2mo\5"+
		"\f\7\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7"+
		"\t\2\2t|\3\2\2\2uv\7&\2\2vw\7\4\2\2wx\5\16\b\2xy\7\6\2\2yz\7\t\2\2z|\3"+
		"\2\2\2{G\3\2\2\2{L\3\2\2\2{U\3\2\2\2{[\3\2\2\2{_\3\2\2\2{j\3\2\2\2{u\3"+
		"\2\2\2|\t\3\2\2\2}\u0087\5\b\5\2~\u0082\7\7\2\2\177\u0081\5\b\5\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\7\b\2\2\u0086}"+
		"\3\2\2\2\u0086~\3\2\2\2\u0087\13\3\2\2\2\u0088\u0089\b\7\1\2\u0089\u008a"+
		"\7\4\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\6\2\2\u008c\u009f\3\2\2\2\u008d"+
		"\u008e\7\4\2\2\u008e\u008f\t\2\2\2\u008f\u0090\7\6\2\2\u0090\u009f\5\f"+
		"\7\20\u0091\u0092\7\26\2\2\u0092\u009f\5\f\7\16\u0093\u0094\7&\2\2\u0094"+
		"\u0095\7\4\2\2\u0095\u0096\5\16\b\2\u0096\u0097\7\6\2\2\u0097\u009f\3"+
		"\2\2\2\u0098\u0099\7$\2\2\u0099\u009f\5\f\7\7\u009a\u009f\7&\2\2\u009b"+
		"\u009f\7\'\2\2\u009c\u009f\7(\2\2\u009d\u009f\7)\2\2\u009e\u0088\3\2\2"+
		"\2\u009e\u008d\3\2\2\2\u009e\u0091\3\2\2\2\u009e\u0093\3\2\2\2\u009e\u0098"+
		"\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00b6\3\2\2\2\u00a0\u00a1\f\13\2\2\u00a1\u00a2\t"+
		"\3\2\2\u00a2\u00b5\5\f\7\f\u00a3\u00a4\f\n\2\2\u00a4\u00a5\t\4\2\2\u00a5"+
		"\u00b5\5\f\7\13\u00a6\u00a7\f\t\2\2\u00a7\u00a8\t\5\2\2\u00a8\u00b5\5"+
		"\f\7\n\u00a9\u00aa\f\b\2\2\u00aa\u00ab\t\6\2\2\u00ab\u00b5\5\f\7\t\u00ac"+
		"\u00ad\f\17\2\2\u00ad\u00ae\7\24\2\2\u00ae\u00af\5\f\7\2\u00af\u00b0\7"+
		"\25\2\2\u00b0\u00b5\3\2\2\2\u00b1\u00b2\f\r\2\2\u00b2\u00b3\7\27\2\2\u00b3"+
		"\u00b5\7&\2\2\u00b4\u00a0\3\2\2\2\u00b4\u00a3\3\2\2\2\u00b4\u00a6\3\2"+
		"\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\r\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b9\u00bc\5\f\7\2\u00ba\u00bb\7\5\2\2\u00bb\u00bd"+
		"\5\f\7\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00b9\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\17\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\b\t\1\2\u00c4\u00c5"+
		"\7%\2\2\u00c5\u00d1\7\7\2\2\u00c6\u00c7\5\20\t\2\u00c7\u00cc\7&\2\2\u00c8"+
		"\u00c9\7\5\2\2\u00c9\u00cb\7&\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7\t\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c6\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\7\b\2\2\u00d6\u00db\3\2\2\2\u00d7\u00db\7\23"+
		"\2\2\u00d8\u00db\7\21\2\2\u00d9\u00db\7\22\2\2\u00da\u00c3\3\2\2\2\u00da"+
		"\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00eb\3\2"+
		"\2\2\u00dc\u00dd\f\6\2\2\u00dd\u00de\7\24\2\2\u00de\u00df\5\f\7\2\u00df"+
		"\u00e6\7\25\2\2\u00e0\u00e1\7\24\2\2\u00e1\u00e2\5\f\7\2\u00e2\u00e3\7"+
		"\25\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00dc\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\21\3\2\2\2\u00ed\u00eb\3\2\2\2\32\25\31%(/\65:BS"+
		"ep{\u0082\u0086\u009e\u00b4\u00b6\u00bc\u00c0\u00cc\u00d3\u00da\u00e6"+
		"\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}