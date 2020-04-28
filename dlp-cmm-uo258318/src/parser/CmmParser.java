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
		public ExpressionContext e3;
		public ExpressionContext e4;
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
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
				 
				 		 		List<Expression> lValues = new ArrayList<Expression>();
				 		 	
				setState(99);
				((StatementContext)_localctx).e1 = expression(0);
				 lValues.add(((StatementContext)_localctx).e1.ast); 
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(101);
					match(T__2);
					setState(102);
					((StatementContext)_localctx).e2 = expression(0);
					 lValues.add(((StatementContext)_localctx).e2.ast); 
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(T__7);
				setState(111);
				((StatementContext)_localctx).e3 = expression(0);
				setState(112);
				match(T__6);
				 		 		
						 		for (int i = 0; i < lValues.size(); i++) {
						 			_localctx.ast.add(new Assignment(
									 	(((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(),	
								 		(((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine() + 1,
							 			lValues.get(i), ((StatementContext)_localctx).e3.ast	 		
					 				));
						 		}
						 		
					 		
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 
				 		 		List<Expression> lValues = new ArrayList<Expression>(); 
				 		 		List<Expression> theValues = new ArrayList<Expression>(); 
				 		 	
				setState(116);
				((StatementContext)_localctx).e1 = expression(0);
				 lValues.add(((StatementContext)_localctx).e1.ast); 
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(118);
					match(T__2);
					setState(119);
					((StatementContext)_localctx).e2 = expression(0);
					 lValues.add(((StatementContext)_localctx).e2.ast); 
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__7);
				setState(128);
				((StatementContext)_localctx).e3 = expression(0);
				 theValues.add(((StatementContext)_localctx).e3.ast); 
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(130);
					match(T__2);
					setState(131);
					((StatementContext)_localctx).e4 = expression(0);
					 theValues.add(((StatementContext)_localctx).e4.ast); 
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(T__6);
				 
						 		if (lValues.size() != theValues.size()) { 
						 			new ErrorType((((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(), (((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine() + 1, 
						 			"there are not as many left values in the assignment as new values to be assigned");
						 		} else {
							 		for (int i = 0; i < lValues.size(); i++) {
							 			_localctx.ast.add(new Assignment(
										 	(((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(),	
									 		(((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine() + 1,
								 			lValues.get(i), theValues.get(i)	 		
						 				));
							 		}
						 		}
					 		
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				((StatementContext)_localctx).iftkn = match(T__8);
				setState(143);
				match(T__1);
				setState(144);
				((StatementContext)_localctx).expression = expression(0);
				setState(145);
				match(T__3);
				setState(146);
				((StatementContext)_localctx).b1 = block();
				 _localctx.ast.add(new IfStatement(
						 			((StatementContext)_localctx).iftkn.getLine(),
						   			((StatementContext)_localctx).iftkn.getCharPositionInLine() + 1,
						   			((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).b1.ast
						 	)); 
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(148);
					match(T__9);
					setState(149);
					((StatementContext)_localctx).b2 = block();
					 ((IfStatement) _localctx.ast.get(0)).setElsePart(((StatementContext)_localctx).b2.ast); 
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				((StatementContext)_localctx).wh = match(T__10);
				setState(155);
				match(T__1);
				setState(156);
				((StatementContext)_localctx).expression = expression(0);
				setState(157);
				match(T__3);
				setState(158);
				((StatementContext)_localctx).block = block();
				 _localctx.ast.add(new WhileStatement(
						 			((StatementContext)_localctx).wh.getLine(),
						   			((StatementContext)_localctx).wh.getCharPositionInLine() + 1,
						   			((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).block.ast
						 	)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				((StatementContext)_localctx).ret = match(T__11);
				setState(162);
				((StatementContext)_localctx).expression = expression(0);
				setState(163);
				match(T__6);
				 _localctx.ast.add(new ReturnStatement(
								 	((StatementContext)_localctx).ret.getLine(),
						   			((StatementContext)_localctx).ret.getCharPositionInLine() + 1,
								 	((StatementContext)_localctx).expression.ast 
				   			)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				((StatementContext)_localctx).rd = match(T__12);
				setState(167);
				((StatementContext)_localctx).e1 = expression(0);
				 _localctx.ast.add(new ReadStatement(
								 	((StatementContext)_localctx).rd.getLine(),
						   			((StatementContext)_localctx).rd.getCharPositionInLine() + 1,
								 	((StatementContext)_localctx).e1.ast 
				   			)); 
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(169);
					match(T__2);
					setState(170);
					((StatementContext)_localctx).e2 = expression(0);
					 _localctx.ast.add(new ReadStatement(
									 	((StatementContext)_localctx).rd.getLine(),
							   			((StatementContext)_localctx).rd.getCharPositionInLine() + 1,
									 	((StatementContext)_localctx).e2.ast 
					   				)); 
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				((StatementContext)_localctx).wrt = match(T__13);
				setState(181);
				((StatementContext)_localctx).e1 = expression(0);
				 _localctx.ast.add(new WriteStatement(
								 	((StatementContext)_localctx).wrt.getLine(),
						   			((StatementContext)_localctx).wrt.getCharPositionInLine() + 1,
								 	((StatementContext)_localctx).e1.ast 
				   			)); 
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(183);
					match(T__2);
					setState(184);
					((StatementContext)_localctx).e2 = expression(0);
					 _localctx.ast.add(new WriteStatement(
									 	((StatementContext)_localctx).wrt.getLine(),
							   			((StatementContext)_localctx).wrt.getCharPositionInLine() + 1,
									 	((StatementContext)_localctx).e2.ast 
					   				)); 
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(194);
				((StatementContext)_localctx).ID = match(ID);
				setState(195);
				match(T__1);
				setState(196);
				((StatementContext)_localctx).arguments = arguments();
				setState(197);
				match(T__3);
				setState(198);
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
			setState(216);
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
				setState(203);
				((BlockContext)_localctx).statement = statement();
				 _localctx.ast.addAll(((BlockContext)_localctx).statement.ast); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__4);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(207);
					((BlockContext)_localctx).statement = statement();
					 _localctx.ast.addAll(((BlockContext)_localctx).statement.ast); 
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(219);
				match(T__1);
				setState(220);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(221);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast; 
				}
				break;
			case 2:
				{
				 Type type; 
				setState(225);
				match(T__1);
				setState(232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(226);
					match(T__14);
					 type = IntType.getInstance(); 
					}
					break;
				case T__15:
					{
					setState(228);
					match(T__15);
					 type = RealType.getInstance(); 
					}
					break;
				case T__16:
					{
					setState(230);
					match(T__16);
					 type = CharType.getInstance(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234);
				match(T__3);
				setState(235);
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
				setState(238);
				((ExpressionContext)_localctx).op = match(T__19);
				setState(239);
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
				setState(242);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(243);
				match(T__1);
				setState(244);
				((ExpressionContext)_localctx).arguments = arguments();
				setState(245);
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
				setState(248);
				((ExpressionContext)_localctx).op = match(T__33);
				setState(249);
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
				setState(252);
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
				setState(254);
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
				setState(256);
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
				setState(258);
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
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(263);
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
						setState(264);
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
						setState(267);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(268);
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
						setState(269);
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
						setState(272);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(273);
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
						setState(274);
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
						setState(277);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(278);
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
						setState(279);
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
						setState(282);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(283);
						match(T__17);
						setState(284);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(285);
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
						setState(288);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(289);
						match(T__20);
						setState(290);
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
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << T__33) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(297);
				((ArgumentsContext)_localctx).e1 = expression(0);
				 _localctx.ast.add(((ArgumentsContext)_localctx).e1.ast); 
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(299);
					match(T__2);
					setState(300);
					((ArgumentsContext)_localctx).e2 = expression(0);
					 _localctx.ast.add(((ArgumentsContext)_localctx).e2.ast); 
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				{
				setState(311);
				((TypeContext)_localctx).strct = match(T__34);
				 List<RecordField> fields = new ArrayList<RecordField>(); 
				setState(313);
				match(T__4);
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(314);
					((TypeContext)_localctx).type = type(0);
					setState(315);
					((TypeContext)_localctx).id1 = match(ID);
					 fields.add(new RecordField(((TypeContext)_localctx).id1.getLine(), ((TypeContext)_localctx).id1.getCharPositionInLine() + 1, 
													(((TypeContext)_localctx).id1!=null?((TypeContext)_localctx).id1.getText():null), ((TypeContext)_localctx).type.ast)); 
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(317);
						match(T__2);
						setState(318);
						((TypeContext)_localctx).id2 = match(ID);
						 fields.add(new RecordField(((TypeContext)_localctx).id2.getLine(), ((TypeContext)_localctx).id2.getCharPositionInLine() + 1, 
									 			(((TypeContext)_localctx).id2!=null?((TypeContext)_localctx).id2.getText():null), ((TypeContext)_localctx).type.ast)); 
						}
						}
						setState(324);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(325);
					match(T__6);
					}
					}
					setState(329); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__34))) != 0) );
				setState(331);
				match(T__5);
				 ((TypeContext)_localctx).ast =  new RecordType(((TypeContext)_localctx).strct.getLine(), ((TypeContext)_localctx).strct.getCharPositionInLine() + 1, fields); 
				}
				break;
			case T__16:
				{
				setState(334);
				match(T__16);
				 ((TypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__14:
				{
				setState(336);
				match(T__14);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__15:
				{
				setState(338);
				match(T__15);
				 ((TypeContext)_localctx).ast =  RealType.getInstance(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
					setState(342);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(343);
					match(T__17);
					setState(344);
					((TypeContext)_localctx).i1 = match(INT_CONSTANT);
					 ArrayType arrayType = new ArrayType(
					          					(((TypeContext)_localctx).ty!=null?(((TypeContext)_localctx).ty.start):null).getLine(), 
					          	 				(((TypeContext)_localctx).ty!=null?(((TypeContext)_localctx).ty.start):null).getCharPositionInLine() + 1,
					          	 				((TypeContext)_localctx).ty.ast, Integer.valueOf((((TypeContext)_localctx).i1!=null?((TypeContext)_localctx).i1.getText():null))
					          	 		); 
					setState(346);
					match(T__18);
					setState(353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(347);
							match(T__17);
							setState(348);
							((TypeContext)_localctx).i2 = match(INT_CONSTANT);
							 arrayType.setTypeOfElements(new ArrayType(
							          						(((TypeContext)_localctx).ty!=null?(((TypeContext)_localctx).ty.start):null).getLine(), 
							          	 					(((TypeContext)_localctx).ty!=null?(((TypeContext)_localctx).ty.start):null).getCharPositionInLine() + 1,
							          	 					((TypeContext)_localctx).ty.ast, Integer.valueOf((((TypeContext)_localctx).i2!=null?((TypeContext)_localctx).i2.getText():null))
							          	 		)); 
							setState(350);
							match(T__18);
							}
							} 
						}
						setState(355);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					}
					 ((TypeContext)_localctx).ast =  arrayType; 
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u016d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64\13\3"+
		"\5\3\66\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3\3\3\3\3"+
		"\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009b\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b0\n\5\f\5\16"+
		"\5\u00b3\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00be\n\5\f\5\16"+
		"\5\u00c1\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00cc\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u00d5\n\6\f\6\16\6\u00d8\13\6\3\6\5\6\u00db"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00eb"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0107\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0127\n\7\f\7\16\7\u012a\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u0132\n\b\f\b\16\b\u0135\13\b\5\b\u0137\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0143\n\t\f\t\16\t\u0146\13"+
		"\t\3\t\3\t\6\t\u014a\n\t\r\t\16\t\u014b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0157\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0162\n\t"+
		"\f\t\16\t\u0165\13\t\3\t\7\t\u0168\n\t\f\t\16\t\u016b\13\t\3\t\2\4\f\20"+
		"\n\2\4\6\b\n\f\16\20\2\6\3\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\2\u0195"+
		"\2\22\3\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\b\u00cb\3\2\2\2\n\u00da\3\2\2\2\f"+
		"\u0106\3\2\2\2\16\u0136\3\2\2\2\20\u0156\3\2\2\2\22\26\b\2\1\2\23\24\5"+
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
		"\t\2\2]\7\3\2\2\2^_\5\f\7\2_`\7\n\2\2`a\5\f\7\2ab\7\t\2\2bc\b\5\1\2c\u00cc"+
		"\3\2\2\2de\b\5\1\2ef\5\f\7\2fm\b\5\1\2gh\7\5\2\2hi\5\f\7\2ij\b\5\1\2j"+
		"l\3\2\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2"+
		"pq\7\n\2\2qr\5\f\7\2rs\7\t\2\2st\b\5\1\2t\u00cc\3\2\2\2uv\b\5\1\2vw\5"+
		"\f\7\2w~\b\5\1\2xy\7\5\2\2yz\5\f\7\2z{\b\5\1\2{}\3\2\2\2|x\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0082\7\n\2\2\u0082\u0083\5\f\7\2\u0083\u008a\b\5\1\2\u0084\u0085\7\5"+
		"\2\2\u0085\u0086\5\f\7\2\u0086\u0087\b\5\1\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0084\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\t\2\2\u008e"+
		"\u008f\b\5\1\2\u008f\u00cc\3\2\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7"+
		"\4\2\2\u0092\u0093\5\f\7\2\u0093\u0094\7\6\2\2\u0094\u0095\5\n\6\2\u0095"+
		"\u009a\b\5\1\2\u0096\u0097\7\f\2\2\u0097\u0098\5\n\6\2\u0098\u0099\b\5"+
		"\1\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u00cc\3\2\2\2\u009c\u009d\7\r\2\2\u009d\u009e\7\4\2\2\u009e\u009f\5\f"+
		"\7\2\u009f\u00a0\7\6\2\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\b\5\1\2\u00a2"+
		"\u00cc\3\2\2\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\5\f\7\2\u00a5\u00a6\7"+
		"\t\2\2\u00a6\u00a7\b\5\1\2\u00a7\u00cc\3\2\2\2\u00a8\u00a9\7\17\2\2\u00a9"+
		"\u00aa\5\f\7\2\u00aa\u00b1\b\5\1\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\5\f"+
		"\7\2\u00ad\u00ae\b\5\1\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\t\2\2\u00b5\u00cc\3\2\2\2\u00b6"+
		"\u00b7\7\20\2\2\u00b7\u00b8\5\f\7\2\u00b8\u00bf\b\5\1\2\u00b9\u00ba\7"+
		"\5\2\2\u00ba\u00bb\5\f\7\2\u00bb\u00bc\b\5\1\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b9\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\t\2\2\u00c3"+
		"\u00cc\3\2\2\2\u00c4\u00c5\7&\2\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\5\16"+
		"\b\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\7\t\2\2\u00c9\u00ca\b\5\1\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb^\3\2\2\2\u00cbd\3\2\2\2\u00cbu\3\2\2\2\u00cb\u0090"+
		"\3\2\2\2\u00cb\u009c\3\2\2\2\u00cb\u00a3\3\2\2\2\u00cb\u00a8\3\2\2\2\u00cb"+
		"\u00b6\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cc\t\3\2\2\2\u00cd\u00ce\5\b\5\2"+
		"\u00ce\u00cf\b\6\1\2\u00cf\u00db\3\2\2\2\u00d0\u00d6\7\7\2\2\u00d1\u00d2"+
		"\5\b\5\2\u00d2\u00d3\b\6\1\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\b\2\2\u00da\u00cd\3\2\2\2\u00da"+
		"\u00d0\3\2\2\2\u00db\13\3\2\2\2\u00dc\u00dd\b\7\1\2\u00dd\u00de\7\4\2"+
		"\2\u00de\u00df\5\f\7\2\u00df\u00e0\7\6\2\2\u00e0\u00e1\b\7\1\2\u00e1\u0107"+
		"\3\2\2\2\u00e2\u00e3\b\7\1\2\u00e3\u00ea\7\4\2\2\u00e4\u00e5\7\21\2\2"+
		"\u00e5\u00eb\b\7\1\2\u00e6\u00e7\7\22\2\2\u00e7\u00eb\b\7\1\2\u00e8\u00e9"+
		"\7\23\2\2\u00e9\u00eb\b\7\1\2\u00ea\u00e4\3\2\2\2\u00ea\u00e6\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\6\2\2\u00ed\u00ee"+
		"\5\f\7\20\u00ee\u00ef\b\7\1\2\u00ef\u0107\3\2\2\2\u00f0\u00f1\7\26\2\2"+
		"\u00f1\u00f2\5\f\7\16\u00f2\u00f3\b\7\1\2\u00f3\u0107\3\2\2\2\u00f4\u00f5"+
		"\7&\2\2\u00f5\u00f6\7\4\2\2\u00f6\u00f7\5\16\b\2\u00f7\u00f8\7\6\2\2\u00f8"+
		"\u00f9\b\7\1\2\u00f9\u0107\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb\u00fc\5\f"+
		"\7\7\u00fc\u00fd\b\7\1\2\u00fd\u0107\3\2\2\2\u00fe\u00ff\7&\2\2\u00ff"+
		"\u0107\b\7\1\2\u0100\u0101\7\'\2\2\u0101\u0107\b\7\1\2\u0102\u0103\7("+
		"\2\2\u0103\u0107\b\7\1\2\u0104\u0105\7)\2\2\u0105\u0107\b\7\1\2\u0106"+
		"\u00dc\3\2\2\2\u0106\u00e2\3\2\2\2\u0106\u00f0\3\2\2\2\u0106\u00f4\3\2"+
		"\2\2\u0106\u00fa\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u0100\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0128\3\2\2\2\u0108\u0109\f\13"+
		"\2\2\u0109\u010a\t\2\2\2\u010a\u010b\5\f\7\f\u010b\u010c\b\7\1\2\u010c"+
		"\u0127\3\2\2\2\u010d\u010e\f\n\2\2\u010e\u010f\t\3\2\2\u010f\u0110\5\f"+
		"\7\13\u0110\u0111\b\7\1\2\u0111\u0127\3\2\2\2\u0112\u0113\f\t\2\2\u0113"+
		"\u0114\t\4\2\2\u0114\u0115\5\f\7\n\u0115\u0116\b\7\1\2\u0116\u0127\3\2"+
		"\2\2\u0117\u0118\f\b\2\2\u0118\u0119\t\5\2\2\u0119\u011a\5\f\7\t\u011a"+
		"\u011b\b\7\1\2\u011b\u0127\3\2\2\2\u011c\u011d\f\17\2\2\u011d\u011e\7"+
		"\24\2\2\u011e\u011f\5\f\7\2\u011f\u0120\7\25\2\2\u0120\u0121\b\7\1\2\u0121"+
		"\u0127\3\2\2\2\u0122\u0123\f\r\2\2\u0123\u0124\7\27\2\2\u0124\u0125\7"+
		"&\2\2\u0125\u0127\b\7\1\2\u0126\u0108\3\2\2\2\u0126\u010d\3\2\2\2\u0126"+
		"\u0112\3\2\2\2\u0126\u0117\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u0122\3\2"+
		"\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\r\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\5\f\7\2\u012c\u0133\b\b\1\2"+
		"\u012d\u012e\7\5\2\2\u012e\u012f\5\f\7\2\u012f\u0130\b\b\1\2\u0130\u0132"+
		"\3\2\2\2\u0131\u012d\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u012b\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\17\3\2\2\2\u0138\u0139\b\t\1\2\u0139\u013a"+
		"\7%\2\2\u013a\u013b\b\t\1\2\u013b\u0149\7\7\2\2\u013c\u013d\5\20\t\2\u013d"+
		"\u013e\7&\2\2\u013e\u0144\b\t\1\2\u013f\u0140\7\5\2\2\u0140\u0141\7&\2"+
		"\2\u0141\u0143\b\t\1\2\u0142\u013f\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0148\7\t\2\2\u0148\u014a\3\2\2\2\u0149\u013c\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\7\b\2\2\u014e\u014f\b\t\1\2\u014f\u0157\3\2\2\2\u0150\u0151\7\23"+
		"\2\2\u0151\u0157\b\t\1\2\u0152\u0153\7\21\2\2\u0153\u0157\b\t\1\2\u0154"+
		"\u0155\7\22\2\2\u0155\u0157\b\t\1\2\u0156\u0138\3\2\2\2\u0156\u0150\3"+
		"\2\2\2\u0156\u0152\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0169\3\2\2\2\u0158"+
		"\u0159\f\6\2\2\u0159\u015a\7\24\2\2\u015a\u015b\7\'\2\2\u015b\u015c\b"+
		"\t\1\2\u015c\u0163\7\25\2\2\u015d\u015e\7\24\2\2\u015e\u015f\7\'\2\2\u015f"+
		"\u0160\b\t\1\2\u0160\u0162\7\25\2\2\u0161\u015d\3\2\2\2\u0162\u0165\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0168\b\t\1\2\u0167\u0158\3\2\2\2\u0168\u016b\3\2"+
		"\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\21\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\36\30#\62\65?GOYm~\u008a\u009a\u00b1\u00bf\u00cb\u00d6\u00da"+
		"\u00ea\u0106\u0126\u0128\u0133\u0136\u0144\u014b\u0156\u0163\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}