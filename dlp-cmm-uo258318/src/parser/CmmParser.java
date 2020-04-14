// Generated from src/parser/Cmm.g4 by ANTLR 4.8
package parser;

	import ast.*;
	import ast.definitions.*;
	import ast.expressions.*;
	import ast.expressions.Comparator;
	import ast.statements.*;
	import ast.types.*;
	
	import java.util.*;

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
		public Program ast;
		public DefinitionContext definition;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
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
			 List<Definition> defs = new ArrayList<Definition>(); 
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				((ProgramContext)_localctx).definition = definition();
				 defs.addAll(((ProgramContext)_localctx).definition.ast); 
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__34))) != 0) );
			setState(24);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program(defs); 
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
		public List<Definition> ast = new ArrayList<Definition>();
		public TypeContext type;
		public Token id;
		public TypeContext t1;
		public Token i1;
		public TypeContext t2;
		public Token i2;
		public Var_definitionContext var_definition;
		public StatementContext statement;
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 Type theType = null; 
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(28);
					match(T__0);
					 theType = VoidType.getInstance(); 
					}
					break;
				case T__14:
				case T__15:
				case T__16:
				case T__34:
					{
					setState(30);
					((DefinitionContext)_localctx).type = type(0);
					 theType = ((DefinitionContext)_localctx).type.ast; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35);
				((DefinitionContext)_localctx).id = match(ID);
				 List<VarDefinition> args = new ArrayList<VarDefinition>(); 
				setState(37);
				match(T__1);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__34))) != 0)) {
					{
					setState(38);
					((DefinitionContext)_localctx).t1 = ((DefinitionContext)_localctx).type = type(0);
					setState(39);
					((DefinitionContext)_localctx).i1 = match(ID);
					 args.add(new VarDefinition(
								  			(((DefinitionContext)_localctx).t1!=null?(((DefinitionContext)_localctx).t1.start):null).getLine(),
							   				(((DefinitionContext)_localctx).t1!=null?(((DefinitionContext)_localctx).t1.start):null).getCharPositionInLine() + 1,
							   				(((DefinitionContext)_localctx).i1!=null?((DefinitionContext)_localctx).i1.getText():null), ((DefinitionContext)_localctx).t1.ast
								  	)); 
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(41);
						match(T__2);
						setState(42);
						((DefinitionContext)_localctx).t2 = ((DefinitionContext)_localctx).type = type(0);
						setState(43);
						((DefinitionContext)_localctx).i2 = match(ID);
						 args.add(new VarDefinition(
									  			(((DefinitionContext)_localctx).t2!=null?(((DefinitionContext)_localctx).t2.start):null).getLine(),
								   				(((DefinitionContext)_localctx).t2!=null?(((DefinitionContext)_localctx).t2.start):null).getCharPositionInLine() + 1,
								   				(((DefinitionContext)_localctx).i2!=null?((DefinitionContext)_localctx).i2.getText():null), ((DefinitionContext)_localctx).t2.ast
									  	)); 
						}
						}
						setState(50);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(53);
				match(T__3);
				 List<Statement> theBody = new ArrayList<Statement>(); 
				setState(55);
				match(T__4);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__34))) != 0)) {
					{
					{
					setState(56);
					((DefinitionContext)_localctx).var_definition = var_definition();
					 theBody.addAll(((DefinitionContext)_localctx).var_definition.ast); 
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(64);
					((DefinitionContext)_localctx).statement = statement();
					 theBody.addAll(((DefinitionContext)_localctx).statement.ast); 
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(T__5);
				 _localctx.ast.add(new FuncDefinition(
						  			((DefinitionContext)_localctx).id.getLine(),
						   			((DefinitionContext)_localctx).id.getCharPositionInLine() + 1,
						   			(((DefinitionContext)_localctx).id!=null?((DefinitionContext)_localctx).id.getText():null),
						   			new FunctionType(
						   				((DefinitionContext)_localctx).id.getLine(),
						   				((DefinitionContext)_localctx).id.getCharPositionInLine() + 1,
						   				theType, args),
						   			theBody
						  	)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((DefinitionContext)_localctx).var_definition = var_definition();
				 _localctx.ast.addAll(((DefinitionContext)_localctx).var_definition.ast);
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
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public TypeContext type;
		public Token i1;
		public Token i2;
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
			setState(79);
			((Var_definitionContext)_localctx).type = type(0);
			setState(80);
			((Var_definitionContext)_localctx).i1 = match(ID);
			 _localctx.ast.add(new VarDefinition(
						  			(((Var_definitionContext)_localctx).type!=null?(((Var_definitionContext)_localctx).type.start):null).getLine(),
					   				(((Var_definitionContext)_localctx).type!=null?(((Var_definitionContext)_localctx).type.start):null).getCharPositionInLine() + 1,
					   				(((Var_definitionContext)_localctx).i1!=null?((Var_definitionContext)_localctx).i1.getText():null), ((Var_definitionContext)_localctx).type.ast
						  	)); 
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(82);
				match(T__2);
				setState(83);
				((Var_definitionContext)_localctx).i2 = match(ID);
				 _localctx.ast.add(new VarDefinition(
							  			(((Var_definitionContext)_localctx).type!=null?(((Var_definitionContext)_localctx).type.start):null).getLine(),
						   				(((Var_definitionContext)_localctx).type!=null?(((Var_definitionContext)_localctx).type.start):null).getCharPositionInLine() + 1,
						   				(((Var_definitionContext)_localctx).i2!=null?((Var_definitionContext)_localctx).i2.getText():null), ((Var_definitionContext)_localctx).type.ast
							  		)); 
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
		public List<Statement> ast = new ArrayList<Statement>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token iftkn;
		public ExpressionContext expression;
		public BlockContext b1;
		public BlockContext b2;
		public Token wh;
		public BlockContext block;
		public Token ret;
		public Token rd;
		public Token wrt;
		public Token ID;
		public ArgumentsContext arguments;
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((StatementContext)_localctx).e1 = expression(0);
				setState(93);
				match(T__7);
				setState(94);
				((StatementContext)_localctx).e2 = expression(0);
				setState(95);
				match(T__6);
				 _localctx.ast.add(new Assignment(
								 	(((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(),	
							 		(((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine() + 1,
						 			((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast	 		
					 		)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				((StatementContext)_localctx).iftkn = match(T__8);
				setState(99);
				match(T__1);
				setState(100);
				((StatementContext)_localctx).expression = expression(0);
				setState(101);
				match(T__3);
				setState(102);
				((StatementContext)_localctx).b1 = block();
				 _localctx.ast.add(new IfStatement(
						 			((StatementContext)_localctx).iftkn.getLine(),
						   			((StatementContext)_localctx).iftkn.getCharPositionInLine() + 1,
						   			((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).b1.ast
						 	)); 
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(104);
					match(T__9);
					setState(105);
					((StatementContext)_localctx).b2 = block();
					 ((IfStatement) _localctx.ast.get(0)).setElsePart(((StatementContext)_localctx).b2.ast); 
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				((StatementContext)_localctx).wh = match(T__10);
				setState(111);
				match(T__1);
				setState(112);
				((StatementContext)_localctx).expression = expression(0);
				setState(113);
				match(T__3);
				setState(114);
				((StatementContext)_localctx).block = block();
				 _localctx.ast.add(new WhileStatement(
						 			((StatementContext)_localctx).wh.getLine(),
						   			((StatementContext)_localctx).wh.getCharPositionInLine() + 1,
						   			((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).block.ast
						 	)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				((StatementContext)_localctx).ret = match(T__11);
				setState(118);
				((StatementContext)_localctx).expression = expression(0);
				setState(119);
				match(T__6);
				 _localctx.ast.add(new ReturnStatement(
								 	((StatementContext)_localctx).ret.getLine(),
						   			((StatementContext)_localctx).ret.getCharPositionInLine() + 1,
								 	((StatementContext)_localctx).expression.ast 
				   			)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				((StatementContext)_localctx).rd = match(T__12);
				setState(123);
				((StatementContext)_localctx).e1 = expression(0);
				 _localctx.ast.add(new ReadStatement(
								 	((StatementContext)_localctx).rd.getLine(),
						   			((StatementContext)_localctx).rd.getCharPositionInLine() + 1,
								 	((StatementContext)_localctx).e1.ast 
				   			)); 
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(125);
					match(T__2);
					setState(126);
					((StatementContext)_localctx).e2 = expression(0);
					 _localctx.ast.add(new ReadStatement(
									 	((StatementContext)_localctx).rd.getLine(),
							   			((StatementContext)_localctx).rd.getCharPositionInLine() + 1,
									 	((StatementContext)_localctx).e2.ast 
					   				)); 
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				((StatementContext)_localctx).wrt = match(T__13);
				setState(137);
				((StatementContext)_localctx).e1 = expression(0);
				 _localctx.ast.add(new WriteStatement(
								 	((StatementContext)_localctx).wrt.getLine(),
						   			((StatementContext)_localctx).wrt.getCharPositionInLine() + 1,
								 	((StatementContext)_localctx).e1.ast 
				   			)); 
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(139);
					match(T__2);
					setState(140);
					((StatementContext)_localctx).e2 = expression(0);
					 _localctx.ast.add(new WriteStatement(
									 	((StatementContext)_localctx).wrt.getLine(),
							   			((StatementContext)_localctx).wrt.getCharPositionInLine() + 1,
									 	((StatementContext)_localctx).e2.ast 
					   				)); 
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				((StatementContext)_localctx).ID = match(ID);
				setState(151);
				match(T__1);
				setState(152);
				((StatementContext)_localctx).arguments = arguments();
				setState(153);
				match(T__3);
				setState(154);
				match(T__6);
				 _localctx.ast.add(new Invocation(
									((StatementContext)_localctx).ID.getLine(),
									((StatementContext)_localctx).ID.getCharPositionInLine() + 1,
									new Variable(
										((StatementContext)_localctx).ID.getLine(), 
										((StatementContext)_localctx).ID.getCharPositionInLine() + 1,
										(((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)), 
									((StatementContext)_localctx).arguments.ast)); 
							
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
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
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
			setState(172);
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
				setState(159);
				((BlockContext)_localctx).statement = statement();
				 _localctx.ast.addAll(((BlockContext)_localctx).statement.ast); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__4);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(163);
					((BlockContext)_localctx).statement = statement();
					 _localctx.ast.addAll(((BlockContext)_localctx).statement.ast); 
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
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
		public Expression ast;
		public ExpressionContext e1;
		public ExpressionContext e;
		public ExpressionContext expression;
		public Token op;
		public Token ID;
		public ArgumentsContext arguments;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public ExpressionContext e2;
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(175);
				match(T__1);
				setState(176);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(177);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast; 
				}
				break;
			case 2:
				{
				 Type type; 
				setState(181);
				match(T__1);
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(182);
					match(T__14);
					 type = IntType.getInstance(); 
					}
					break;
				case T__15:
					{
					setState(184);
					match(T__15);
					 type = RealType.getInstance(); 
					}
					break;
				case T__16:
					{
					setState(186);
					match(T__16);
					 type = CharType.getInstance(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190);
				match(T__3);
				setState(191);
				((ExpressionContext)_localctx).expression = expression(14);
				 ((ExpressionContext)_localctx).ast =  new Cast(
					  				(((ExpressionContext)_localctx).expression!=null?(((ExpressionContext)_localctx).expression.start):null).getLine(),
									(((ExpressionContext)_localctx).expression!=null?(((ExpressionContext)_localctx).expression.start):null).getCharPositionInLine() + 1, 
					  				type, ((ExpressionContext)_localctx).expression.ast
				   			); 
				}
				break;
			case 3:
				{
				setState(194);
				((ExpressionContext)_localctx).op = match(T__19);
				setState(195);
				((ExpressionContext)_localctx).expression = expression(12);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(
							 		((ExpressionContext)_localctx).op.getLine(), 
					  				((ExpressionContext)_localctx).op.getCharPositionInLine() + 1, 
							  		((ExpressionContext)_localctx).expression.ast
					  	  	); 
				}
				break;
			case 4:
				{
				setState(198);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(199);
				match(T__1);
				setState(200);
				((ExpressionContext)_localctx).arguments = arguments();
				setState(201);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  new Invocation(
									((ExpressionContext)_localctx).ID.getLine(),
									((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1,
									new Variable(
										((ExpressionContext)_localctx).ID.getLine(), 
										((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1,
										(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)), 
									((ExpressionContext)_localctx).arguments.ast); 
							
				}
				break;
			case 5:
				{
				setState(204);
				((ExpressionContext)_localctx).op = match(T__33);
				setState(205);
				((ExpressionContext)_localctx).expression = expression(5);
				 ((ExpressionContext)_localctx).ast =  new UnaryNot(
							 		((ExpressionContext)_localctx).op.getLine(), 
					  				((ExpressionContext)_localctx).op.getCharPositionInLine() + 1, 
							  		((ExpressionContext)_localctx).expression.ast
					  	  	); 
				}
				break;
			case 6:
				{
				setState(208);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(
				   					((ExpressionContext)_localctx).ID.getLine(),
				   					((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1,
						  			(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)
						  	); 
				}
				break;
			case 7:
				{
				setState(210);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(		  			
				   					((ExpressionContext)_localctx).INT_CONSTANT.getLine(), 
				   					((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, 
				   					(((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)
				   			); 
				}
				break;
			case 8:
				{
				setState(212);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(
						  			((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
						   			((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1,
						  			(((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)
						   	); 
				}
				break;
			case 9:
				{
				setState(214);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(
						  			((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				   					((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, 
				   					(((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)
				   			); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(219);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(10);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(
						          					(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(),
						          					(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine() + 1,
						          					(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), 
						          					((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						          			
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(224);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(
						          					(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(),
						          					(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine() + 1,
						          					(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), 
						          					((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						          			
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(229);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Comparator(
						          					(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(),
						          					(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine() + 1,
						          					(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), 
						          					((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						          			
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(234);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Conditional(
						          					(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(),
						          					(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine() + 1,
						          					(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), 
						          					((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast); 
						          			
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(239);
						match(T__17);
						setState(240);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(241);
						match(T__18);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(
						          		  			(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(),
						             					(((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine() + 1, 
						             					((ExpressionContext)_localctx).e2.ast, ((ExpressionContext)_localctx).e1.ast 
						             			); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(245);
						match(T__20);
						setState(246);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new FieldAccess(
						          		  			(((ExpressionContext)_localctx).e!=null?(((ExpressionContext)_localctx).e.start):null).getLine(), 
						             					(((ExpressionContext)_localctx).e!=null?(((ExpressionContext)_localctx).e.start):null).getCharPositionInLine() + 1, 
						             					((ExpressionContext)_localctx).e.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)  
						             			); 
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
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
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(253);
				((ArgumentsContext)_localctx).e1 = expression(0);
				 _localctx.ast.add(((ArgumentsContext)_localctx).e1.ast); 
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(255);
					match(T__2);
					setState(256);
					((ArgumentsContext)_localctx).e2 = expression(0);
					 _localctx.ast.add(((ArgumentsContext)_localctx).e2.ast); 
					}
				}

				}
				}
				setState(265);
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
		public Type ast;
		public TypeContext ty;
		public Token strct;
		public TypeContext type;
		public Token id1;
		public Token id2;
		public Token i1;
		public Token i2;
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
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
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
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				{
				setState(267);
				((TypeContext)_localctx).strct = match(T__34);
				 List<RecordField> fields = new ArrayList<RecordField>(); 
				setState(269);
				match(T__4);
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270);
					((TypeContext)_localctx).type = type(0);
					setState(271);
					((TypeContext)_localctx).id1 = match(ID);
					 fields.add(new RecordField(((TypeContext)_localctx).id1.getLine(), ((TypeContext)_localctx).id1.getCharPositionInLine() + 1, 
													(((TypeContext)_localctx).id1!=null?((TypeContext)_localctx).id1.getText():null), ((TypeContext)_localctx).type.ast)); 
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(273);
						match(T__2);
						setState(274);
						((TypeContext)_localctx).id2 = match(ID);
						 fields.add(new RecordField(((TypeContext)_localctx).id2.getLine(), ((TypeContext)_localctx).id2.getCharPositionInLine() + 1, 
									 			(((TypeContext)_localctx).id2!=null?((TypeContext)_localctx).id2.getText():null), ((TypeContext)_localctx).type.ast)); 
						}
						}
						setState(280);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(281);
					match(T__6);
					}
					}
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__34))) != 0) );
				setState(287);
				match(T__5);
				 ((TypeContext)_localctx).ast =  new RecordType(((TypeContext)_localctx).strct.getLine(), ((TypeContext)_localctx).strct.getCharPositionInLine() + 1, fields); 
				}
				break;
			case T__16:
				{
				setState(290);
				match(T__16);
				 ((TypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__14:
				{
				setState(292);
				match(T__14);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__15:
				{
				setState(294);
				match(T__15);
				 ((TypeContext)_localctx).ast =  RealType.getInstance(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.ty = _prevctx;
					_localctx.ty = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(298);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(299);
					match(T__17);
					setState(300);
					((TypeContext)_localctx).i1 = match(INT_CONSTANT);
					 ArrayType arrayType = new ArrayType(
					          					(((TypeContext)_localctx).ty!=null?(((TypeContext)_localctx).ty.start):null).getLine(), 
					          	 				(((TypeContext)_localctx).ty!=null?(((TypeContext)_localctx).ty.start):null).getCharPositionInLine() + 1,
					          	 				((TypeContext)_localctx).ty.ast, Integer.valueOf((((TypeContext)_localctx).i1!=null?((TypeContext)_localctx).i1.getText():null))
					          	 		); 
					setState(302);
					match(T__18);
					setState(309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(303);
							match(T__17);
							setState(304);
							((TypeContext)_localctx).i2 = match(INT_CONSTANT);
							 arrayType.setTypeOfElements(new ArrayType(
							          						(((TypeContext)_localctx).ty!=null?(((TypeContext)_localctx).ty.start):null).getLine(), 
							          	 					(((TypeContext)_localctx).ty!=null?(((TypeContext)_localctx).ty.start):null).getCharPositionInLine() + 1,
							          	 					((TypeContext)_localctx).ty.ast, Integer.valueOf((((TypeContext)_localctx).i2!=null?((TypeContext)_localctx).i2.getText():null))
							          	 		)); 
							setState(306);
							match(T__18);
							}
							} 
						}
						setState(311);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					 ((TypeContext)_localctx).ast =  arrayType; 
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0141\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64\13\3"+
		"\5\3\66\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3\3\3\3\3"+
		"\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0084\n\5\f\5"+
		"\16\5\u0087\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0092\n\5\f\5"+
		"\16\5\u0095\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a0\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a9\n\6\f\6\16\6\u00ac\13\6\3\6\5\6\u00af"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bf"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00db\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00fb\n\7\f\7\16\7\u00fe\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u0106\n\b\7\b\u0108\n\b\f\b\16\b\u010b\13\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0117\n\t\f\t\16\t\u011a\13"+
		"\t\3\t\3\t\6\t\u011e\n\t\r\t\16\t\u011f\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u012b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0136\n\t"+
		"\f\t\16\t\u0139\13\t\3\t\7\t\u013c\n\t\f\t\16\t\u013f\13\t\3\t\2\4\f\20"+
		"\n\2\4\6\b\n\f\16\20\2\6\3\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\2\u0164"+
		"\2\22\3\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\b\u009f\3\2\2\2\n\u00ae\3\2\2\2\f"+
		"\u00da\3\2\2\2\16\u0109\3\2\2\2\20\u012a\3\2\2\2\22\26\b\2\1\2\23\24\5"+
		"\4\3\2\24\25\b\2\1\2\25\27\3\2\2\2\26\23\3\2\2\2\27\30\3\2\2\2\30\26\3"+
		"\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\7\2\2\3\33\34\b\2\1\2\34\3\3"+
		"\2\2\2\35#\b\3\1\2\36\37\7\3\2\2\37$\b\3\1\2 !\5\20\t\2!\"\b\3\1\2\"$"+
		"\3\2\2\2#\36\3\2\2\2# \3\2\2\2$%\3\2\2\2%&\7&\2\2&\'\b\3\1\2\'\65\7\4"+
		"\2\2()\5\20\t\2)*\7&\2\2*\62\b\3\1\2+,\7\5\2\2,-\5\20\t\2-.\7&\2\2./\b"+
		"\3\1\2/\61\3\2\2\2\60+\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2"+
		"\2\63\66\3\2\2\2\64\62\3\2\2\2\65(\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2"+
		"\678\7\6\2\289\b\3\1\29?\7\7\2\2:;\5\6\4\2;<\b\3\1\2<>\3\2\2\2=:\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@G\3\2\2\2A?\3\2\2\2BC\5\b\5\2CD\b\3\1"+
		"\2DF\3\2\2\2EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2"+
		"\2JK\7\b\2\2KP\b\3\1\2LM\5\6\4\2MN\b\3\1\2NP\3\2\2\2O\35\3\2\2\2OL\3\2"+
		"\2\2P\5\3\2\2\2QR\5\20\t\2RS\7&\2\2SY\b\4\1\2TU\7\5\2\2UV\7&\2\2VX\b\4"+
		"\1\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7"+
		"\t\2\2]\7\3\2\2\2^_\5\f\7\2_`\7\n\2\2`a\5\f\7\2ab\7\t\2\2bc\b\5\1\2c\u00a0"+
		"\3\2\2\2de\7\13\2\2ef\7\4\2\2fg\5\f\7\2gh\7\6\2\2hi\5\n\6\2in\b\5\1\2"+
		"jk\7\f\2\2kl\5\n\6\2lm\b\5\1\2mo\3\2\2\2nj\3\2\2\2no\3\2\2\2o\u00a0\3"+
		"\2\2\2pq\7\r\2\2qr\7\4\2\2rs\5\f\7\2st\7\6\2\2tu\5\n\6\2uv\b\5\1\2v\u00a0"+
		"\3\2\2\2wx\7\16\2\2xy\5\f\7\2yz\7\t\2\2z{\b\5\1\2{\u00a0\3\2\2\2|}\7\17"+
		"\2\2}~\5\f\7\2~\u0085\b\5\1\2\177\u0080\7\5\2\2\u0080\u0081\5\f\7\2\u0081"+
		"\u0082\b\5\1\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0084\u0087\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0089\7\t\2\2\u0089\u00a0\3\2\2\2\u008a\u008b\7\20\2\2"+
		"\u008b\u008c\5\f\7\2\u008c\u0093\b\5\1\2\u008d\u008e\7\5\2\2\u008e\u008f"+
		"\5\f\7\2\u008f\u0090\b\5\1\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\t\2\2\u0097\u00a0\3\2\2\2\u0098"+
		"\u0099\7&\2\2\u0099\u009a\7\4\2\2\u009a\u009b\5\16\b\2\u009b\u009c\7\6"+
		"\2\2\u009c\u009d\7\t\2\2\u009d\u009e\b\5\1\2\u009e\u00a0\3\2\2\2\u009f"+
		"^\3\2\2\2\u009fd\3\2\2\2\u009fp\3\2\2\2\u009fw\3\2\2\2\u009f|\3\2\2\2"+
		"\u009f\u008a\3\2\2\2\u009f\u0098\3\2\2\2\u00a0\t\3\2\2\2\u00a1\u00a2\5"+
		"\b\5\2\u00a2\u00a3\b\6\1\2\u00a3\u00af\3\2\2\2\u00a4\u00aa\7\7\2\2\u00a5"+
		"\u00a6\5\b\5\2\u00a6\u00a7\b\6\1\2\u00a7\u00a9\3\2\2\2\u00a8\u00a5\3\2"+
		"\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\7\b\2\2\u00ae\u00a1\3\2"+
		"\2\2\u00ae\u00a4\3\2\2\2\u00af\13\3\2\2\2\u00b0\u00b1\b\7\1\2\u00b1\u00b2"+
		"\7\4\2\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4\7\6\2\2\u00b4\u00b5\b\7\1\2\u00b5"+
		"\u00db\3\2\2\2\u00b6\u00b7\b\7\1\2\u00b7\u00be\7\4\2\2\u00b8\u00b9\7\21"+
		"\2\2\u00b9\u00bf\b\7\1\2\u00ba\u00bb\7\22\2\2\u00bb\u00bf\b\7\1\2\u00bc"+
		"\u00bd\7\23\2\2\u00bd\u00bf\b\7\1\2\u00be\u00b8\3\2\2\2\u00be\u00ba\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\6\2\2\u00c1"+
		"\u00c2\5\f\7\20\u00c2\u00c3\b\7\1\2\u00c3\u00db\3\2\2\2\u00c4\u00c5\7"+
		"\26\2\2\u00c5\u00c6\5\f\7\16\u00c6\u00c7\b\7\1\2\u00c7\u00db\3\2\2\2\u00c8"+
		"\u00c9\7&\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\7\6"+
		"\2\2\u00cc\u00cd\b\7\1\2\u00cd\u00db\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf"+
		"\u00d0\5\f\7\7\u00d0\u00d1\b\7\1\2\u00d1\u00db\3\2\2\2\u00d2\u00d3\7&"+
		"\2\2\u00d3\u00db\b\7\1\2\u00d4\u00d5\7\'\2\2\u00d5\u00db\b\7\1\2\u00d6"+
		"\u00d7\7(\2\2\u00d7\u00db\b\7\1\2\u00d8\u00d9\7)\2\2\u00d9\u00db\b\7\1"+
		"\2\u00da\u00b0\3\2\2\2\u00da\u00b6\3\2\2\2\u00da\u00c4\3\2\2\2\u00da\u00c8"+
		"\3\2\2\2\u00da\u00ce\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d4\3\2\2\2\u00da"+
		"\u00d6\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00fc\3\2\2\2\u00dc\u00dd\f\13"+
		"\2\2\u00dd\u00de\t\2\2\2\u00de\u00df\5\f\7\f\u00df\u00e0\b\7\1\2\u00e0"+
		"\u00fb\3\2\2\2\u00e1\u00e2\f\n\2\2\u00e2\u00e3\t\3\2\2\u00e3\u00e4\5\f"+
		"\7\13\u00e4\u00e5\b\7\1\2\u00e5\u00fb\3\2\2\2\u00e6\u00e7\f\t\2\2\u00e7"+
		"\u00e8\t\4\2\2\u00e8\u00e9\5\f\7\n\u00e9\u00ea\b\7\1\2\u00ea\u00fb\3\2"+
		"\2\2\u00eb\u00ec\f\b\2\2\u00ec\u00ed\t\5\2\2\u00ed\u00ee\5\f\7\t\u00ee"+
		"\u00ef\b\7\1\2\u00ef\u00fb\3\2\2\2\u00f0\u00f1\f\17\2\2\u00f1\u00f2\7"+
		"\24\2\2\u00f2\u00f3\5\f\7\2\u00f3\u00f4\7\25\2\2\u00f4\u00f5\b\7\1\2\u00f5"+
		"\u00fb\3\2\2\2\u00f6\u00f7\f\r\2\2\u00f7\u00f8\7\27\2\2\u00f8\u00f9\7"+
		"&\2\2\u00f9\u00fb\b\7\1\2\u00fa\u00dc\3\2\2\2\u00fa\u00e1\3\2\2\2\u00fa"+
		"\u00e6\3\2\2\2\u00fa\u00eb\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f6\3\2"+
		"\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\r\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5\f\7\2\u0100\u0105\b\b\1\2"+
		"\u0101\u0102\7\5\2\2\u0102\u0103\5\f\7\2\u0103\u0104\b\b\1\2\u0104\u0106"+
		"\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u00ff\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\17\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\b\t\1\2\u010d\u010e"+
		"\7%\2\2\u010e\u010f\b\t\1\2\u010f\u011d\7\7\2\2\u0110\u0111\5\20\t\2\u0111"+
		"\u0112\7&\2\2\u0112\u0118\b\t\1\2\u0113\u0114\7\5\2\2\u0114\u0115\7&\2"+
		"\2\u0115\u0117\b\t\1\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011c\7\t\2\2\u011c\u011e\3\2\2\2\u011d\u0110\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\7\b\2\2\u0122\u0123\b\t\1\2\u0123\u012b\3\2\2\2\u0124\u0125\7\23"+
		"\2\2\u0125\u012b\b\t\1\2\u0126\u0127\7\21\2\2\u0127\u012b\b\t\1\2\u0128"+
		"\u0129\7\22\2\2\u0129\u012b\b\t\1\2\u012a\u010c\3\2\2\2\u012a\u0124\3"+
		"\2\2\2\u012a\u0126\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u013d\3\2\2\2\u012c"+
		"\u012d\f\6\2\2\u012d\u012e\7\24\2\2\u012e\u012f\7\'\2\2\u012f\u0130\b"+
		"\t\1\2\u0130\u0137\7\25\2\2\u0131\u0132\7\24\2\2\u0132\u0133\7\'\2\2\u0133"+
		"\u0134\b\t\1\2\u0134\u0136\7\25\2\2\u0135\u0131\3\2\2\2\u0136\u0139\3"+
		"\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013c\b\t\1\2\u013b\u012c\3\2\2\2\u013c\u013f\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\21\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\33\30#\62\65?GOYn\u0085\u0093\u009f\u00aa\u00ae\u00be\u00da\u00fa"+
		"\u00fc\u0105\u0109\u0118\u011f\u012a\u0137\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}