// Generated from /Users/amin/Documents/UT/semester6/Compiler/ca/1/FunctionCraft 4/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, STR=2, FLOAT=3, TRUE=4, FALSE=5, COMMENT=6, CASE=7, NL=8, SPACE=9, 
		MAIN=10, DEF=11, RETURN=12, END=13, IF=14, ELIF=15, ELSE=16, LOOP_DO=17, 
		FOR=18, IN=19, NEXT=20, NEXTIF=21, BREAK=22, BREAKIF=23, CHOP=24, CHOMP=25, 
		PUSH=26, PUTS=27, METHOD=28, LEN=29, PATTERN=30, MATCH=31, NAME=32, LPAR=33, 
		RPAR=34, LBRACK=35, RBRACK=36, LCBRACK=37, RCBRACK=38, COMMA=39, SEMICOLON=40, 
		COLON=41, ARROW=42, CONCAT=43, DOT=44, EQ=45, DOTDOT=46, PLUS=47, DIV=48, 
		MULT=49, NEG=50, REM=51, UNI_OP=52, ASSIGN_OP=53, NOT=54, BOOL_OP1=55, 
		BOOL_OP2=56, OR=57, AND=58;
	public static final int
		RULE_program = 0, RULE_func_def = 1, RULE_params = 2, RULE_par_inside = 3, 
		RULE_obt_pars = 4, RULE_obts = 5, RULE_return_obj = 6, RULE_ret_exp = 7, 
		RULE_obj = 8, RULE_lambda = 9, RULE_lam_pars = 10, RULE_func_call = 11, 
		RULE_user_def = 12, RULE_call_pars = 13, RULE_built_in = 14, RULE_main = 15, 
		RULE_instructs = 16, RULE_clause = 17, RULE_assign = 18, RULE_value = 19, 
		RULE_pattern = 20, RULE_case = 21, RULE_loop = 22, RULE_loop_do = 23, 
		RULE_control = 24, RULE_conditions = 25, RULE_bool_exp = 26, RULE_arith_exp = 27, 
		RULE_for = 28, RULE_range = 29, RULE_if = 30, RULE_elseif = 31, RULE_else = 32, 
		RULE_list = 33, RULE_list_inside = 34, RULE_list_obj = 35, RULE_const = 36, 
		RULE_identifier = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "func_def", "params", "par_inside", "obt_pars", "obts", "return_obj", 
			"ret_exp", "obj", "lambda", "lam_pars", "func_call", "user_def", "call_pars", 
			"built_in", "main", "instructs", "clause", "assign", "value", "pattern", 
			"case", "loop", "loop_do", "control", "conditions", "bool_exp", "arith_exp", 
			"for", "range", "if", "elseif", "else", "list", "list_inside", "list_obj", 
			"const", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'true'", "'false'", null, "'    |'", null, "' '", 
			"'main'", "'def'", "'return'", "'end'", "'if'", "'elseif'", "'else'", 
			"'loop do'", "'for'", "'in'", "'next'", "'next if'", "'break'", "'break if'", 
			"'chop'", "'chomp'", "'push'", "'puts'", "'method'", "'len'", "'pattern'", 
			"'match'", null, "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", 
			"':'", "'->'", "'<<'", "'.'", "'='", "'..'", "'+'", "'/'", "'*'", "'-'", 
			"'%'", null, null, "'!'", null, null, "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "STR", "FLOAT", "TRUE", "FALSE", "COMMENT", "CASE", "NL", 
			"SPACE", "MAIN", "DEF", "RETURN", "END", "IF", "ELIF", "ELSE", "LOOP_DO", 
			"FOR", "IN", "NEXT", "NEXTIF", "BREAK", "BREAKIF", "CHOP", "CHOMP", "PUSH", 
			"PUTS", "METHOD", "LEN", "PATTERN", "MATCH", "NAME", "LPAR", "RPAR", 
			"LBRACK", "RBRACK", "LCBRACK", "RCBRACK", "COMMA", "SEMICOLON", "COLON", 
			"ARROW", "CONCAT", "DOT", "EQ", "DOTDOT", "PLUS", "DIV", "MULT", "NEG", 
			"REM", "UNI_OP", "ASSIGN_OP", "NOT", "BOOL_OP1", "BOOL_OP2", "OR", "AND"
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
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(FunctionCraftParser.COMMENT, 0); }
		public TerminalNode NL() { return getToken(FunctionCraftParser.NL, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FunctionCraftParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEF:
					{
					setState(76);
					func_def();
					}
					break;
				case COMMENT:
					{
					setState(77);
					match(COMMENT);
					}
					break;
				case NL:
					{
					setState(78);
					match(NL);
					}
					break;
				case PATTERN:
					{
					setState(79);
					pattern();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82);
				program();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				main();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(84);
					match(NL);
					}
				}

				setState(87);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_defContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(FunctionCraftParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FunctionCraftParser.NL, i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode NAME() { return getToken(FunctionCraftParser.NAME, 0); }
		public InstructsContext instructs() {
			return getRuleContext(InstructsContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public Return_objContext return_obj() {
			return getRuleContext(Return_objContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(DEF);
			setState(92);
			((Func_defContext)_localctx).name = match(NAME);
			 System.out.println("FuncDec: " + (((Func_defContext)_localctx).name!=null?((Func_defContext)_localctx).name.getText():null)); 
			setState(94);
			params();
			setState(95);
			match(NL);
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STR:
			case FLOAT:
			case TRUE:
			case FALSE:
			case COMMENT:
			case NL:
			case IF:
			case LOOP_DO:
			case FOR:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case PATTERN:
			case NAME:
			case LPAR:
			case LBRACK:
			case ARROW:
			case NEG:
			case NOT:
				{
				setState(96);
				instructs();
				}
				break;
			case RETURN:
				{
				setState(97);
				match(RETURN);
				 System.out.println("RETURN"); 
				setState(99);
				return_obj();
				setState(100);
				match(SEMICOLON);
				setState(101);
				match(NL);
				}
				break;
			case END:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
			match(END);
			setState(107);
			match(NL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Par_insideContext par_inside() {
			return getRuleContext(Par_insideContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LPAR);
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case LBRACK:
				{
				setState(110);
				par_inside();
				}
				break;
			case RPAR:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Par_insideContext extends ParserRuleContext {
		public Obt_parsContext obt_pars() {
			return getRuleContext(Obt_parsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NAME() { return getToken(FunctionCraftParser.NAME, 0); }
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public Par_insideContext par_inside() {
			return getRuleContext(Par_insideContext.class,0);
		}
		public Par_insideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par_inside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPar_inside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPar_inside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPar_inside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Par_insideContext par_inside() throws RecognitionException {
		Par_insideContext _localctx = new Par_insideContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_par_inside);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(116);
					obt_pars();
					}
					break;
				case NAME:
					{
					setState(117);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(NAME);
				setState(121);
				match(COMMA);
				setState(122);
				par_inside();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Obt_parsContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(FunctionCraftParser.LBRACK, 0); }
		public ObtsContext obts() {
			return getRuleContext(ObtsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(FunctionCraftParser.RBRACK, 0); }
		public Obt_parsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obt_pars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterObt_pars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitObt_pars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitObt_pars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obt_parsContext obt_pars() throws RecognitionException {
		Obt_parsContext _localctx = new Obt_parsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_obt_pars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(LBRACK);
			setState(126);
			obts();
			setState(127);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObtsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FunctionCraftParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(FunctionCraftParser.EQ, 0); }
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public ObtsContext obts() {
			return getRuleContext(ObtsContext.class,0);
		}
		public ObtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterObts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitObts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitObts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObtsContext obts() throws RecognitionException {
		ObtsContext _localctx = new ObtsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_obts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(NAME);
			setState(130);
			match(EQ);
			setState(131);
			const_();
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				{
				setState(132);
				match(COMMA);
				setState(133);
				obts();
				}
				break;
			case RBRACK:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_objContext extends ParserRuleContext {
		public Ret_expContext ret_exp() {
			return getRuleContext(Ret_expContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public Return_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturn_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturn_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturn_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_objContext return_obj() throws RecognitionException {
		Return_objContext _localctx = new Return_objContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_return_obj);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				ret_exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				lambda();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ret_expContext extends ParserRuleContext {
		public Token name;
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<Ret_expContext> ret_exp() {
			return getRuleContexts(Ret_expContext.class);
		}
		public Ret_expContext ret_exp(int i) {
			return getRuleContext(Ret_expContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public TerminalNode NEG() { return getToken(FunctionCraftParser.NEG, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode REM() { return getToken(FunctionCraftParser.REM, 0); }
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode BOOL_OP1() { return getToken(FunctionCraftParser.BOOL_OP1, 0); }
		public TerminalNode BOOL_OP2() { return getToken(FunctionCraftParser.BOOL_OP2, 0); }
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public TerminalNode CONCAT() { return getToken(FunctionCraftParser.CONCAT, 0); }
		public TerminalNode UNI_OP() { return getToken(FunctionCraftParser.UNI_OP, 0); }
		public Ret_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRet_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRet_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRet_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ret_expContext ret_exp() throws RecognitionException {
		return ret_exp(0);
	}

	private Ret_expContext ret_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Ret_expContext _localctx = new Ret_expContext(_ctx, _parentState);
		Ret_expContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_ret_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STR:
			case FLOAT:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case NAME:
			case LBRACK:
			case ARROW:
				{
				setState(143);
				obj();
				}
				break;
			case LPAR:
				{
				setState(144);
				match(LPAR);
				setState(145);
				ret_exp(0);
				setState(146);
				match(RPAR);
				}
				break;
			case NEG:
			case NOT:
				{
				setState(148);
				((Ret_expContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NEG || _la==NOT) ) {
					((Ret_expContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				ret_exp(8);
				 System.out.println("Operator: " + (((Ret_expContext)_localctx).name!=null?((Ret_expContext)_localctx).name.getText():null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Ret_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ret_exp);
						setState(154);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(155);
						((Ret_expContext)_localctx).name = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3096224743817216L) != 0)) ) {
							((Ret_expContext)_localctx).name = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						ret_exp(8);
						 System.out.println("Operator: " + (((Ret_expContext)_localctx).name!=null?((Ret_expContext)_localctx).name.getText():null)); 
						}
						break;
					case 2:
						{
						_localctx = new Ret_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ret_exp);
						setState(159);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(160);
						((Ret_expContext)_localctx).name = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==NEG) ) {
							((Ret_expContext)_localctx).name = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(161);
						ret_exp(7);
						 System.out.println("Operator: " + (((Ret_expContext)_localctx).name!=null?((Ret_expContext)_localctx).name.getText():null)); 
						}
						break;
					case 3:
						{
						_localctx = new Ret_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ret_exp);
						setState(164);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(165);
						((Ret_expContext)_localctx).name = match(BOOL_OP1);
						setState(166);
						ret_exp(6);
						 System.out.println("Operator: " + (((Ret_expContext)_localctx).name!=null?((Ret_expContext)_localctx).name.getText():null)); 
						}
						break;
					case 4:
						{
						_localctx = new Ret_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ret_exp);
						setState(169);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(170);
						((Ret_expContext)_localctx).name = match(BOOL_OP2);
						setState(171);
						ret_exp(5);
						 System.out.println("Operator: " + (((Ret_expContext)_localctx).name!=null?((Ret_expContext)_localctx).name.getText():null)); 
						}
						break;
					case 5:
						{
						_localctx = new Ret_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ret_exp);
						setState(174);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(175);
						match(AND);
						setState(176);
						ret_exp(4);
						 System.out.println("Operator: &&"); 
						}
						break;
					case 6:
						{
						_localctx = new Ret_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ret_exp);
						setState(179);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(180);
						match(OR);
						setState(181);
						ret_exp(3);
						 System.out.println("Operator: ||"); 
						}
						break;
					case 7:
						{
						_localctx = new Ret_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ret_exp);
						setState(184);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(185);
						match(CONCAT);
						setState(186);
						ret_exp(2);
						 System.out.println("Operator: <<"); 
						}
						break;
					case 8:
						{
						_localctx = new Ret_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ret_exp);
						setState(189);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(190);
						((Ret_expContext)_localctx).name = match(UNI_OP);
						 System.out.println("Operator: " + (((Ret_expContext)_localctx).name!=null?((Ret_expContext)_localctx).name.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(197);
				func_call();
				}
				break;
			case 2:
				{
				setState(198);
				const_();
				}
				break;
			case 3:
				{
				setState(199);
				list();
				}
				break;
			case 4:
				{
				setState(200);
				identifier();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(FunctionCraftParser.ARROW, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Lam_parsContext lam_pars() {
			return getRuleContext(Lam_parsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode LCBRACK() { return getToken(FunctionCraftParser.LCBRACK, 0); }
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public Return_objContext return_obj() {
			return getRuleContext(Return_objContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode RCBRACK() { return getToken(FunctionCraftParser.RCBRACK, 0); }
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ARROW);
			 System.out.println("Structure: LAMBDA"); 
			setState(205);
			match(LPAR);
			setState(206);
			lam_pars();
			setState(207);
			match(RPAR);
			setState(208);
			match(LCBRACK);
			setState(209);
			match(RETURN);
			 System.out.println("RETURN"); 
			setState(211);
			return_obj();
			setState(212);
			match(SEMICOLON);
			setState(213);
			match(RCBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lam_parsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FunctionCraftParser.NAME, 0); }
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public Lam_parsContext lam_pars() {
			return getRuleContext(Lam_parsContext.class,0);
		}
		public Lam_parsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lam_pars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLam_pars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLam_pars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLam_pars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lam_parsContext lam_pars() throws RecognitionException {
		Lam_parsContext _localctx = new Lam_parsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lam_pars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(NAME);
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				{
				setState(216);
				match(COMMA);
				setState(217);
				lam_pars();
				}
				break;
			case RPAR:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_callContext extends ParserRuleContext {
		public Built_inContext built_in() {
			return getRuleContext(Built_inContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Ret_expContext ret_exp() {
			return getRuleContext(Ret_expContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public User_defContext user_def() {
			return getRuleContext(User_defContext.class,0);
		}
		public Call_parsContext call_pars() {
			return getRuleContext(Call_parsContext.class,0);
		}
		public TerminalNode NAME() { return getToken(FunctionCraftParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(221);
				built_in();
				setState(222);
				match(LPAR);
				setState(223);
				ret_exp(0);
				setState(224);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(226);
				user_def();
				}
				break;
			case 3:
				{
				setState(227);
				user_def();
				setState(228);
				match(LPAR);
				setState(229);
				call_pars();
				setState(230);
				match(RPAR);
				}
				break;
			case 4:
				{
				setState(232);
				match(NAME);
				setState(233);
				match(DOT);
				setState(234);
				match(MATCH);
				 System.out.println("Built-In: MATCH"); 
				setState(236);
				match(LPAR);
				setState(237);
				call_pars();
				setState(238);
				match(RPAR);
				}
				break;
			case 5:
				{
				setState(240);
				match(METHOD);
				setState(241);
				match(LPAR);
				setState(242);
				match(COLON);
				setState(243);
				match(NAME);
				setState(244);
				match(RPAR);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class User_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FunctionCraftParser.NAME, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Call_parsContext call_pars() {
			return getRuleContext(Call_parsContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public User_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterUser_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitUser_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitUser_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_defContext user_def() throws RecognitionException {
		User_defContext _localctx = new User_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_user_def);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(NAME);
				 System.out.println("Function Call"); 
				setState(249);
				match(LPAR);
				setState(252);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
				case NOT:
					{
					setState(250);
					call_pars();
					}
					break;
				case RPAR:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254);
				match(RPAR);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				lambda();
				setState(256);
				match(LPAR);
				setState(257);
				call_pars();
				setState(258);
				match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_parsContext extends ParserRuleContext {
		public Ret_expContext ret_exp() {
			return getRuleContext(Ret_expContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public Call_parsContext call_pars() {
			return getRuleContext(Call_parsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(FunctionCraftParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FunctionCraftParser.NL, i);
		}
		public Call_parsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_pars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCall_pars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCall_pars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCall_pars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_parsContext call_pars() throws RecognitionException {
		Call_parsContext _localctx = new Call_parsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_call_pars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(262);
				ret_exp(0);
				}
				break;
			case 2:
				{
				setState(263);
				lambda();
				}
				break;
			}
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
			case COMMA:
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(266);
					match(NL);
					}
				}

				setState(269);
				match(COMMA);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(270);
					match(NL);
					}
				}

				setState(273);
				call_pars();
				}
				break;
			case RPAR:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Built_inContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public Built_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBuilt_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBuilt_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBuilt_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_inContext built_in() throws RecognitionException {
		Built_inContext _localctx = new Built_inContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_built_in);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(PUTS);
				 System.out.println("Built-In: PUTS"); 
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(PUSH);
				 System.out.println("Built-In: PUSH"); 
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(LEN);
				 System.out.println("Built-In: LEN"); 
				}
				break;
			case CHOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(CHOP);
				 System.out.println("Built-In: CHOP"); 
				}
				break;
			case CHOMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				match(CHOMP);
				 System.out.println("Built-In: CHOMP"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<TerminalNode> NL() { return getTokens(FunctionCraftParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FunctionCraftParser.NL, i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<InstructsContext> instructs() {
			return getRuleContexts(InstructsContext.class);
		}
		public InstructsContext instructs(int i) {
			return getRuleContext(InstructsContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(DEF);
			setState(290);
			match(MAIN);
			 System.out.println("MAIN"); 
			setState(292);
			match(LPAR);
			setState(293);
			match(RPAR);
			setState(294);
			match(NL);
			setState(296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				instructs();
				}
				}
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 19144745838592382L) != 0) );
			setState(300);
			match(END);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(301);
				match(NL);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructsContext extends ParserRuleContext {
		public List<TerminalNode> COMMENT() { return getTokens(FunctionCraftParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionCraftParser.COMMENT, i);
		}
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(FunctionCraftParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FunctionCraftParser.NL, i);
		}
		public InstructsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterInstructs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitInstructs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitInstructs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructsContext instructs() throws RecognitionException {
		InstructsContext _localctx = new InstructsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instructs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(307);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(304);
						match(COMMENT);
						}
						break;
					case INT:
					case STR:
					case FLOAT:
					case TRUE:
					case FALSE:
					case IF:
					case LOOP_DO:
					case FOR:
					case CHOP:
					case CHOMP:
					case PUSH:
					case PUTS:
					case METHOD:
					case LEN:
					case PATTERN:
					case NAME:
					case LPAR:
					case LBRACK:
					case ARROW:
					case NEG:
					case NOT:
						{
						setState(305);
						clause();
						}
						break;
					case NL:
						{
						setState(306);
						match(NL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(309); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClauseContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(FunctionCraftParser.NL, 0); }
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<Ret_expContext> ret_exp() {
			return getRuleContexts(Ret_expContext.class);
		}
		public Ret_expContext ret_exp(int i) {
			return getRuleContext(Ret_expContext.class,i);
		}
		public TerminalNode CONCAT() { return getToken(FunctionCraftParser.CONCAT, 0); }
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_clause);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case LOOP_DO:
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(311);
					if_();
					}
					break;
				case LOOP_DO:
				case FOR:
					{
					setState(312);
					loop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315);
				match(NL);
				}
				break;
			case INT:
			case STR:
			case FLOAT:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case PATTERN:
			case NAME:
			case LPAR:
			case LBRACK:
			case ARROW:
			case NEG:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(317);
					assign();
					}
					break;
				case 2:
					{
					setState(318);
					func_call();
					}
					break;
				case 3:
					{
					setState(319);
					pattern();
					}
					break;
				case 4:
					{
					setState(320);
					ret_exp(0);
					setState(321);
					match(CONCAT);
					setState(322);
					ret_exp(0);
					 System.out.println("Operator: <<"); 
					}
					break;
				}
				setState(327);
				match(SEMICOLON);
				setState(328);
				match(NL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public IdentifierContext name;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(FunctionCraftParser.ASSIGN_OP, 0); }
		public TerminalNode EQ() { return getToken(FunctionCraftParser.EQ, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			((AssignContext)_localctx).name = identifier();
			setState(333);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==ASSIGN_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(334);
			value();
			 System.out.println("Assignment: " + (((AssignContext)_localctx).name!=null?_input.getText(((AssignContext)_localctx).name.start,((AssignContext)_localctx).name.stop):null)); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public Ret_expContext ret_exp() {
			return getRuleContext(Ret_expContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				lambda();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				ret_exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Lam_parsContext lam_pars() {
			return getRuleContext(Lam_parsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<TerminalNode> NL() { return getTokens(FunctionCraftParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FunctionCraftParser.NL, i);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode NAME() { return getToken(FunctionCraftParser.NAME, 0); }
		public List<CaseContext> case_() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case_(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(PATTERN);
			setState(342);
			((PatternContext)_localctx).name = match(NAME);
			 System.out.println("PatternDec: " + (((PatternContext)_localctx).name!=null?((PatternContext)_localctx).name.getText():null)); 
			setState(344);
			match(LPAR);
			setState(345);
			lam_pars();
			setState(346);
			match(RPAR);
			setState(347);
			match(NL);
			setState(350); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(350);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CASE:
						{
						setState(348);
						case_();
						}
						break;
					case NL:
						{
						setState(349);
						match(NL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(352); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(354);
			match(NL);
			setState(355);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(FunctionCraftParser.CASE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode EQ() { return getToken(FunctionCraftParser.EQ, 0); }
		public Ret_expContext ret_exp() {
			return getRuleContext(Ret_expContext.class,0);
		}
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(CASE);
			setState(358);
			conditions();
			setState(359);
			match(EQ);
			setState(360);
			ret_exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public Loop_doContext loop_do() {
			return getRuleContext(Loop_doContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loop);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP_DO:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				loop_do();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				for_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_doContext extends ParserRuleContext {
		public TerminalNode LOOP_DO() { return getToken(FunctionCraftParser.LOOP_DO, 0); }
		public TerminalNode NL() { return getToken(FunctionCraftParser.NL, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<ControlContext> control() {
			return getRuleContexts(ControlContext.class);
		}
		public ControlContext control(int i) {
			return getRuleContext(ControlContext.class,i);
		}
		public List<InstructsContext> instructs() {
			return getRuleContexts(InstructsContext.class);
		}
		public InstructsContext instructs(int i) {
			return getRuleContext(InstructsContext.class,i);
		}
		public Loop_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_doContext loop_do() throws RecognitionException {
		Loop_doContext _localctx = new Loop_doContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loop_do);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(LOOP_DO);
			 System.out.println("Loop: DO"); 
			setState(368);
			match(NL);
			setState(371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(371);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEXT:
				case NEXTIF:
				case BREAK:
				case BREAKIF:
					{
					setState(369);
					control();
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case COMMENT:
				case NL:
				case IF:
				case LOOP_DO:
				case FOR:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case PATTERN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
				case NOT:
					{
					setState(370);
					instructs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 19144745854321022L) != 0) );
			setState(375);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ControlContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode NL() { return getToken(FunctionCraftParser.NL, 0); }
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode BREAKIF() { return getToken(FunctionCraftParser.BREAKIF, 0); }
		public TerminalNode NEXTIF() { return getToken(FunctionCraftParser.NEXTIF, 0); }
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(377);
				match(BREAK);
				 System.out.println("Control: BREAK"); 
				}
				break;
			case NEXT:
				{
				setState(379);
				match(NEXT);
				 System.out.println("Control: NEXT"); 
				}
				break;
			case NEXTIF:
			case BREAKIF:
				{
				setState(385);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BREAKIF:
					{
					setState(381);
					match(BREAKIF);
					 System.out.println("Control: BREAK"); 
					}
					break;
				case NEXTIF:
					{
					setState(383);
					match(NEXTIF);
					 System.out.println("Control: NEXT"); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(387);
				conditions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(390);
			match(SEMICOLON);
			setState(391);
			match(NL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionsContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public List<TerminalNode> NOT() { return getTokens(FunctionCraftParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(FunctionCraftParser.NOT, i);
		}
		public List<TerminalNode> AND() { return getTokens(FunctionCraftParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FunctionCraftParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(FunctionCraftParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FunctionCraftParser.OR, i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditions);
		int _la;
		try {
			int _alt;
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(LPAR);
				setState(394);
				bool_exp();
				setState(395);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(LPAR);
				setState(409); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(409);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(398);
							conditions();
							setState(399);
							((ConditionsContext)_localctx).name = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==OR || _la==AND) ) {
								((ConditionsContext)_localctx).name = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							 System.out.println("Operator: " + (((ConditionsContext)_localctx).name!=null?((ConditionsContext)_localctx).name.getText():null)); 
							}
							break;
						case 2:
							{
							setState(402);
							match(LPAR);
							setState(403);
							match(NOT);
							setState(404);
							conditions();
							setState(405);
							match(RPAR);
							setState(406);
							((ConditionsContext)_localctx).name = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==OR || _la==AND) ) {
								((ConditionsContext)_localctx).name = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							 System.out.println("Operator: " + (((ConditionsContext)_localctx).name!=null?((ConditionsContext)_localctx).name.getText():null)); 
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(411); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(413);
					conditions();
					}
					break;
				case 2:
					{
					setState(414);
					match(LPAR);
					setState(415);
					match(NOT);
					setState(416);
					conditions();
					setState(417);
					match(RPAR);
					}
					break;
				}
				setState(421);
				match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expContext extends ParserRuleContext {
		public Token name;
		public List<Arith_expContext> arith_exp() {
			return getRuleContexts(Arith_expContext.class);
		}
		public Arith_expContext arith_exp(int i) {
			return getRuleContext(Arith_expContext.class,i);
		}
		public TerminalNode BOOL_OP1() { return getToken(FunctionCraftParser.BOOL_OP1, 0); }
		public List<TerminalNode> NOT() { return getTokens(FunctionCraftParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(FunctionCraftParser.NOT, i);
		}
		public TerminalNode BOOL_OP2() { return getToken(FunctionCraftParser.BOOL_OP2, 0); }
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public Bool_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBool_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBool_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBool_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expContext bool_exp() throws RecognitionException {
		Bool_expContext _localctx = new Bool_expContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bool_exp);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(425);
					match(NOT);
					 System.out.println("Operator: !"); 
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(430);
				arith_exp(0);
				setState(431);
				((Bool_expContext)_localctx).name = match(BOOL_OP1);
				 System.out.println("Operator: " + (((Bool_expContext)_localctx).name!=null?((Bool_expContext)_localctx).name.getText():null)); 
				setState(436);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(433);
					match(NOT);
					 System.out.println("Operator: !"); 
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(438);
				arith_exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(440);
					match(NOT);
					 System.out.println("Operator: !"); 
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(445);
				arith_exp(0);
				setState(446);
				((Bool_expContext)_localctx).name = match(BOOL_OP2);
				 System.out.println("Operator: " + (((Bool_expContext)_localctx).name!=null?((Bool_expContext)_localctx).name.getText():null)); 
				setState(451);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(448);
					match(NOT);
					 System.out.println("Operator: !"); 
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(453);
				arith_exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(455);
					match(NOT);
					 System.out.println("Operator: !"); 
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(460);
				arith_exp(0);
				setState(461);
				match(AND);
				 System.out.println("Operator: &&"); 
				setState(466);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(463);
					match(NOT);
					 System.out.println("Operator: !"); 
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(468);
				arith_exp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(470);
					match(NOT);
					 System.out.println("Operator: !"); 
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(475);
				arith_exp(0);
				setState(476);
				match(OR);
				 System.out.println("Operator: ||"); 
				setState(481);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(478);
					match(NOT);
					 System.out.println("Operator: !"); 
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(483);
				arith_exp(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(485);
					match(NOT);
					 System.out.println("Operator: !"); 
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(490);
				arith_exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arith_expContext extends ParserRuleContext {
		public Token name;
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<Arith_expContext> arith_exp() {
			return getRuleContexts(Arith_expContext.class);
		}
		public Arith_expContext arith_exp(int i) {
			return getRuleContext(Arith_expContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode NEG() { return getToken(FunctionCraftParser.NEG, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode REM() { return getToken(FunctionCraftParser.REM, 0); }
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode UNI_OP() { return getToken(FunctionCraftParser.UNI_OP, 0); }
		public Arith_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterArith_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitArith_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitArith_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_expContext arith_exp() throws RecognitionException {
		return arith_exp(0);
	}

	private Arith_expContext arith_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arith_expContext _localctx = new Arith_expContext(_ctx, _parentState);
		Arith_expContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_arith_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STR:
			case FLOAT:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case NAME:
			case LBRACK:
			case ARROW:
				{
				setState(494);
				obj();
				}
				break;
			case LPAR:
				{
				setState(495);
				match(LPAR);
				setState(496);
				arith_exp(0);
				setState(497);
				match(RPAR);
				}
				break;
			case NEG:
				{
				setState(499);
				match(NEG);
				setState(500);
				arith_exp(3);
				 System.out.println("Operator: -"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(518);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new Arith_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_exp);
						setState(505);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(506);
						((Arith_expContext)_localctx).name = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3096224743817216L) != 0)) ) {
							((Arith_expContext)_localctx).name = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(507);
						arith_exp(3);
						 System.out.println("Operator: " + (((Arith_expContext)_localctx).name!=null?((Arith_expContext)_localctx).name.getText():null)); 
						}
						break;
					case 2:
						{
						_localctx = new Arith_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_exp);
						setState(510);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(511);
						((Arith_expContext)_localctx).name = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==NEG) ) {
							((Arith_expContext)_localctx).name = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(512);
						arith_exp(2);
						 System.out.println("Operator: " + (((Arith_expContext)_localctx).name!=null?((Arith_expContext)_localctx).name.getText():null)); 
						}
						break;
					case 3:
						{
						_localctx = new Arith_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_exp);
						setState(515);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(516);
						((Arith_expContext)_localctx).name = match(UNI_OP);
						 System.out.println("Operator: " + (((Arith_expContext)_localctx).name!=null?((Arith_expContext)_localctx).name.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(FunctionCraftParser.NAME, 0); }
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public TerminalNode NL() { return getToken(FunctionCraftParser.NL, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode STR() { return getToken(FunctionCraftParser.STR, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public List<ControlContext> control() {
			return getRuleContexts(ControlContext.class);
		}
		public ControlContext control(int i) {
			return getRuleContext(ControlContext.class,i);
		}
		public List<InstructsContext> instructs() {
			return getRuleContexts(InstructsContext.class);
		}
		public InstructsContext instructs(int i) {
			return getRuleContext(InstructsContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(FOR);
			 System.out.println("Loop: FOR"); 
			setState(525);
			match(NAME);
			setState(526);
			match(IN);
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				{
				setState(527);
				match(STR);
				}
				break;
			case LBRACK:
				{
				setState(528);
				list();
				}
				break;
			case LPAR:
				{
				setState(529);
				range();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(532);
			match(NL);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19144745854321022L) != 0)) {
				{
				setState(535);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEXT:
				case NEXTIF:
				case BREAK:
				case BREAKIF:
					{
					setState(533);
					control();
					}
					break;
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case COMMENT:
				case NL:
				case IF:
				case LOOP_DO:
				case FOR:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case PATTERN:
				case NAME:
				case LPAR:
				case LBRACK:
				case ARROW:
				case NEG:
				case NOT:
					{
					setState(534);
					instructs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode DOTDOT() { return getToken(FunctionCraftParser.DOTDOT, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ConstContext> const_() {
			return getRuleContexts(ConstContext.class);
		}
		public ConstContext const_(int i) {
			return getRuleContext(ConstContext.class,i);
		}
		public List<Func_callContext> func_call() {
			return getRuleContexts(Func_callContext.class);
		}
		public Func_callContext func_call(int i) {
			return getRuleContext(Func_callContext.class,i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(LPAR);
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(543);
				identifier();
				}
				break;
			case 2:
				{
				setState(544);
				const_();
				}
				break;
			case 3:
				{
				setState(545);
				func_call();
				}
				break;
			}
			setState(548);
			match(DOTDOT);
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(549);
				identifier();
				}
				break;
			case 2:
				{
				setState(550);
				const_();
				}
				break;
			case 3:
				{
				setState(551);
				func_call();
				}
				break;
			}
			setState(554);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(FunctionCraftParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FunctionCraftParser.NL, i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<InstructsContext> instructs() {
			return getRuleContexts(InstructsContext.class);
		}
		public InstructsContext instructs(int i) {
			return getRuleContext(InstructsContext.class,i);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(IF);
			 System.out.println("Decision: IF"); 
			setState(558);
			conditions();
			setState(559);
			match(NL);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19144745838625150L) != 0)) {
				{
				setState(563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(560);
					instructs();
					}
					break;
				case 2:
					{
					setState(561);
					elseif();
					}
					break;
				case 3:
					{
					setState(562);
					match(NL);
					}
					break;
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(568);
				else_();
				}
			}

			setState(571);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(FunctionCraftParser.ELIF, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode NL() { return getToken(FunctionCraftParser.NL, 0); }
		public InstructsContext instructs() {
			return getRuleContext(InstructsContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(ELIF);
			 System.out.println("Decision: ELSE IF"); 
			setState(575);
			conditions();
			setState(576);
			match(NL);
			setState(577);
			instructs();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public TerminalNode NL() { return getToken(FunctionCraftParser.NL, 0); }
		public InstructsContext instructs() {
			return getRuleContext(InstructsContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(ELSE);
			 System.out.println("Decision: ELSE"); 
			setState(581);
			match(NL);
			setState(582);
			instructs();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(FunctionCraftParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(FunctionCraftParser.RBRACK, 0); }
		public List_insideContext list_inside() {
			return getRuleContext(List_insideContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(LBRACK);
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STR:
			case FLOAT:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case NAME:
			case LBRACK:
			case ARROW:
				{
				setState(585);
				list_inside();
				}
				break;
			case RBRACK:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(589);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_insideContext extends ParserRuleContext {
		public List_objContext list_obj() {
			return getRuleContext(List_objContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public List_insideContext list_inside() {
			return getRuleContext(List_insideContext.class,0);
		}
		public List_insideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_inside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_inside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_inside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_inside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_insideContext list_inside() throws RecognitionException {
		List_insideContext _localctx = new List_insideContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_list_inside);
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case ARROW:
					{
					setState(591);
					list_obj();
					}
					break;
				case LBRACK:
					{
					setState(592);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case STR:
				case FLOAT:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case NAME:
				case ARROW:
					{
					setState(595);
					list_obj();
					}
					break;
				case LBRACK:
					{
					setState(596);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(599);
				match(COMMA);
				setState(600);
				list_inside();
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_objContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public List_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_objContext list_obj() throws RecognitionException {
		List_objContext _localctx = new List_objContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_list_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(604);
				identifier();
				}
				break;
			case 2:
				{
				setState(605);
				const_();
				}
				break;
			case 3:
				{
				setState(606);
				func_call();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FunctionCraftParser.INT, 0); }
		public TerminalNode STR() { return getToken(FunctionCraftParser.STR, 0); }
		public TerminalNode FLOAT() { return getToken(FunctionCraftParser.FLOAT, 0); }
		public TerminalNode TRUE() { return getToken(FunctionCraftParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FunctionCraftParser.NAME, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(FunctionCraftParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(FunctionCraftParser.LBRACK, i);
		}
		public List<Ret_expContext> ret_exp() {
			return getRuleContexts(Ret_expContext.class);
		}
		public Ret_expContext ret_exp(int i) {
			return getRuleContext(Ret_expContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(FunctionCraftParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(FunctionCraftParser.RBRACK, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(NAME);
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(612);
					match(LBRACK);
					setState(613);
					ret_exp(0);
					setState(614);
					match(RBRACK);
					}
					} 
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return ret_exp_sempred((Ret_expContext)_localctx, predIndex);
		case 27:
			return arith_exp_sempred((Arith_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ret_exp_sempred(Ret_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean arith_exp_sempred(Arith_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		case 10:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u026e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000Q\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000V\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000Z\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001i\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003w\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003|\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0088\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u008d\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0099\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c1"+
		"\b\u0007\n\u0007\f\u0007\u00c4\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u00ca\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00dc\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00f6\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00fd\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0105\b\f\u0001\r\u0001\r\u0003\r\u0109\b\r\u0001\r\u0003\r"+
		"\u010c\b\r\u0001\r\u0001\r\u0003\r\u0110\b\r\u0001\r\u0001\r\u0003\r\u0114"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0120"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u0129\b\u000f\u000b\u000f\f\u000f\u012a"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u012f\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u0134\b\u0010\u000b\u0010\f\u0010\u0135\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u013a\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0146\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u014b\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0154\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u015f\b\u0014\u000b\u0014\f"+
		"\u0014\u0160\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u016d\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0004\u0017\u0174\b\u0017\u000b\u0017\f\u0017\u0175\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0182\b\u0018\u0001\u0018\u0003"+
		"\u0018\u0185\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u019a\b\u0019\u000b\u0019\f"+
		"\u0019\u019b\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01a4\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u01a8\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01ad\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01b5\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01bc\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01c4\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01cb"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01d3\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01da\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01e2\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01e9"+
		"\b\u001a\u0001\u001a\u0003\u001a\u01ec\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01f8\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u0207\b\u001b\n\u001b\f\u001b\u020a\t\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0213"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0218\b\u001c"+
		"\n\u001c\f\u001c\u021b\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0223\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0229\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u0234\b\u001e\n\u001e\f\u001e\u0237\t\u001e"+
		"\u0001\u001e\u0003\u001e\u023a\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u024c\b!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0003\"\u0252\b\"\u0001\"\u0001\"\u0003\"\u0256\b\""+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u025b\b\"\u0001#\u0001#\u0001#\u0003"+
		"#\u0260\b#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0269"+
		"\b%\n%\f%\u026c\t%\u0001%\u0000\u0002\u000e6&\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJ\u0000\u0006\u0002\u00002266\u0002\u00000133\u0002\u0000"+
		"//22\u0002\u0000--55\u0001\u00009:\u0001\u0000\u0001\u0005\u02ac\u0000"+
		"Y\u0001\u0000\u0000\u0000\u0002[\u0001\u0000\u0000\u0000\u0004m\u0001"+
		"\u0000\u0000\u0000\u0006{\u0001\u0000\u0000\u0000\b}\u0001\u0000\u0000"+
		"\u0000\n\u0081\u0001\u0000\u0000\u0000\f\u008c\u0001\u0000\u0000\u0000"+
		"\u000e\u0098\u0001\u0000\u0000\u0000\u0010\u00c9\u0001\u0000\u0000\u0000"+
		"\u0012\u00cb\u0001\u0000\u0000\u0000\u0014\u00d7\u0001\u0000\u0000\u0000"+
		"\u0016\u00f5\u0001\u0000\u0000\u0000\u0018\u0104\u0001\u0000\u0000\u0000"+
		"\u001a\u0108\u0001\u0000\u0000\u0000\u001c\u011f\u0001\u0000\u0000\u0000"+
		"\u001e\u0121\u0001\u0000\u0000\u0000 \u0133\u0001\u0000\u0000\u0000\""+
		"\u014a\u0001\u0000\u0000\u0000$\u014c\u0001\u0000\u0000\u0000&\u0153\u0001"+
		"\u0000\u0000\u0000(\u0155\u0001\u0000\u0000\u0000*\u0165\u0001\u0000\u0000"+
		"\u0000,\u016c\u0001\u0000\u0000\u0000.\u016e\u0001\u0000\u0000\u00000"+
		"\u0184\u0001\u0000\u0000\u00002\u01a7\u0001\u0000\u0000\u00004\u01eb\u0001"+
		"\u0000\u0000\u00006\u01f7\u0001\u0000\u0000\u00008\u020b\u0001\u0000\u0000"+
		"\u0000:\u021e\u0001\u0000\u0000\u0000<\u022c\u0001\u0000\u0000\u0000>"+
		"\u023d\u0001\u0000\u0000\u0000@\u0243\u0001\u0000\u0000\u0000B\u0248\u0001"+
		"\u0000\u0000\u0000D\u025a\u0001\u0000\u0000\u0000F\u025f\u0001\u0000\u0000"+
		"\u0000H\u0261\u0001\u0000\u0000\u0000J\u0263\u0001\u0000\u0000\u0000L"+
		"Q\u0003\u0002\u0001\u0000MQ\u0005\u0006\u0000\u0000NQ\u0005\b\u0000\u0000"+
		"OQ\u0003(\u0014\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RZ\u0003\u0000\u0000\u0000SU\u0003\u001e\u000f\u0000TV\u0005\b\u0000"+
		"\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0000\u0000\u0001XZ\u0001\u0000\u0000\u0000YP\u0001"+
		"\u0000\u0000\u0000YS\u0001\u0000\u0000\u0000Z\u0001\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u000b\u0000\u0000\\]\u0005 \u0000\u0000]^\u0006\u0001"+
		"\uffff\uffff\u0000^_\u0003\u0004\u0002\u0000_h\u0005\b\u0000\u0000`i\u0003"+
		" \u0010\u0000ab\u0005\f\u0000\u0000bc\u0006\u0001\uffff\uffff\u0000cd"+
		"\u0003\f\u0006\u0000de\u0005(\u0000\u0000ef\u0005\b\u0000\u0000fi\u0001"+
		"\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000h`\u0001\u0000\u0000\u0000"+
		"ha\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jk\u0005\r\u0000\u0000kl\u0005\b\u0000\u0000l\u0003\u0001\u0000"+
		"\u0000\u0000mp\u0005!\u0000\u0000nq\u0003\u0006\u0003\u0000oq\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0005\"\u0000\u0000s\u0005\u0001\u0000\u0000\u0000"+
		"tw\u0003\b\u0004\u0000uw\u0003J%\u0000vt\u0001\u0000\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000w|\u0001\u0000\u0000\u0000xy\u0005 \u0000\u0000yz\u0005"+
		"\'\u0000\u0000z|\u0003\u0006\u0003\u0000{v\u0001\u0000\u0000\u0000{x\u0001"+
		"\u0000\u0000\u0000|\u0007\u0001\u0000\u0000\u0000}~\u0005#\u0000\u0000"+
		"~\u007f\u0003\n\u0005\u0000\u007f\u0080\u0005$\u0000\u0000\u0080\t\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005 \u0000\u0000\u0082\u0083\u0005-\u0000"+
		"\u0000\u0083\u0087\u0003H$\u0000\u0084\u0085\u0005\'\u0000\u0000\u0085"+
		"\u0088\u0003\n\u0005\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u000b"+
		"\u0001\u0000\u0000\u0000\u0089\u008d\u0003\u000e\u0007\u0000\u008a\u008d"+
		"\u0003\u0012\t\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\r\u0001\u0000\u0000\u0000\u008e\u008f\u0006\u0007"+
		"\uffff\uffff\u0000\u008f\u0099\u0003\u0010\b\u0000\u0090\u0091\u0005!"+
		"\u0000\u0000\u0091\u0092\u0003\u000e\u0007\u0000\u0092\u0093\u0005\"\u0000"+
		"\u0000\u0093\u0099\u0001\u0000\u0000\u0000\u0094\u0095\u0007\u0000\u0000"+
		"\u0000\u0095\u0096\u0003\u000e\u0007\b\u0096\u0097\u0006\u0007\uffff\uffff"+
		"\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u008e\u0001\u0000\u0000"+
		"\u0000\u0098\u0090\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000"+
		"\u0000\u0099\u00c2\u0001\u0000\u0000\u0000\u009a\u009b\n\u0007\u0000\u0000"+
		"\u009b\u009c\u0007\u0001\u0000\u0000\u009c\u009d\u0003\u000e\u0007\b\u009d"+
		"\u009e\u0006\u0007\uffff\uffff\u0000\u009e\u00c1\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\n\u0006\u0000\u0000\u00a0\u00a1\u0007\u0002\u0000\u0000\u00a1"+
		"\u00a2\u0003\u000e\u0007\u0007\u00a2\u00a3\u0006\u0007\uffff\uffff\u0000"+
		"\u00a3\u00c1\u0001\u0000\u0000\u0000\u00a4\u00a5\n\u0005\u0000\u0000\u00a5"+
		"\u00a6\u00057\u0000\u0000\u00a6\u00a7\u0003\u000e\u0007\u0006\u00a7\u00a8"+
		"\u0006\u0007\uffff\uffff\u0000\u00a8\u00c1\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\n\u0004\u0000\u0000\u00aa\u00ab\u00058\u0000\u0000\u00ab\u00ac"+
		"\u0003\u000e\u0007\u0005\u00ac\u00ad\u0006\u0007\uffff\uffff\u0000\u00ad"+
		"\u00c1\u0001\u0000\u0000\u0000\u00ae\u00af\n\u0003\u0000\u0000\u00af\u00b0"+
		"\u0005:\u0000\u0000\u00b0\u00b1\u0003\u000e\u0007\u0004\u00b1\u00b2\u0006"+
		"\u0007\uffff\uffff\u0000\u00b2\u00c1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\n\u0002\u0000\u0000\u00b4\u00b5\u00059\u0000\u0000\u00b5\u00b6\u0003"+
		"\u000e\u0007\u0003\u00b6\u00b7\u0006\u0007\uffff\uffff\u0000\u00b7\u00c1"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\n\u0001\u0000\u0000\u00b9\u00ba\u0005"+
		"+\u0000\u0000\u00ba\u00bb\u0003\u000e\u0007\u0002\u00bb\u00bc\u0006\u0007"+
		"\uffff\uffff\u0000\u00bc\u00c1\u0001\u0000\u0000\u0000\u00bd\u00be\n\t"+
		"\u0000\u0000\u00be\u00bf\u00054\u0000\u0000\u00bf\u00c1\u0006\u0007\uffff"+
		"\uffff\u0000\u00c0\u009a\u0001\u0000\u0000\u0000\u00c0\u009f\u0001\u0000"+
		"\u0000\u0000\u00c0\u00a4\u0001\u0000\u0000\u0000\u00c0\u00a9\u0001\u0000"+
		"\u0000\u0000\u00c0\u00ae\u0001\u0000\u0000\u0000\u00c0\u00b3\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u000f\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00ca\u0003\u0016"+
		"\u000b\u0000\u00c6\u00ca\u0003H$\u0000\u00c7\u00ca\u0003B!\u0000\u00c8"+
		"\u00ca\u0003J%\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000\u00c9\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u0011\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"*\u0000\u0000\u00cc\u00cd\u0006\t\uffff\uffff\u0000\u00cd\u00ce\u0005"+
		"!\u0000\u0000\u00ce\u00cf\u0003\u0014\n\u0000\u00cf\u00d0\u0005\"\u0000"+
		"\u0000\u00d0\u00d1\u0005%\u0000\u0000\u00d1\u00d2\u0005\f\u0000\u0000"+
		"\u00d2\u00d3\u0006\t\uffff\uffff\u0000\u00d3\u00d4\u0003\f\u0006\u0000"+
		"\u00d4\u00d5\u0005(\u0000\u0000\u00d5\u00d6\u0005&\u0000\u0000\u00d6\u0013"+
		"\u0001\u0000\u0000\u0000\u00d7\u00db\u0005 \u0000\u0000\u00d8\u00d9\u0005"+
		"\'\u0000\u0000\u00d9\u00dc\u0003\u0014\n\u0000\u00da\u00dc\u0001\u0000"+
		"\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u0015\u0001\u0000\u0000\u0000\u00dd\u00de\u0003\u001c"+
		"\u000e\u0000\u00de\u00df\u0005!\u0000\u0000\u00df\u00e0\u0003\u000e\u0007"+
		"\u0000\u00e0\u00e1\u0005\"\u0000\u0000\u00e1\u00f6\u0001\u0000\u0000\u0000"+
		"\u00e2\u00f6\u0003\u0018\f\u0000\u00e3\u00e4\u0003\u0018\f\u0000\u00e4"+
		"\u00e5\u0005!\u0000\u0000\u00e5\u00e6\u0003\u001a\r\u0000\u00e6\u00e7"+
		"\u0005\"\u0000\u0000\u00e7\u00f6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		" \u0000\u0000\u00e9\u00ea\u0005,\u0000\u0000\u00ea\u00eb\u0005\u001f\u0000"+
		"\u0000\u00eb\u00ec\u0006\u000b\uffff\uffff\u0000\u00ec\u00ed\u0005!\u0000"+
		"\u0000\u00ed\u00ee\u0003\u001a\r\u0000\u00ee\u00ef\u0005\"\u0000\u0000"+
		"\u00ef\u00f6\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u001c\u0000\u0000"+
		"\u00f1\u00f2\u0005!\u0000\u0000\u00f2\u00f3\u0005)\u0000\u0000\u00f3\u00f4"+
		"\u0005 \u0000\u0000\u00f4\u00f6\u0005\"\u0000\u0000\u00f5\u00dd\u0001"+
		"\u0000\u0000\u0000\u00f5\u00e2\u0001\u0000\u0000\u0000\u00f5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00e8\u0001\u0000\u0000\u0000\u00f5\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f6\u0017\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		" \u0000\u0000\u00f8\u00f9\u0006\f\uffff\uffff\u0000\u00f9\u00fc\u0005"+
		"!\u0000\u0000\u00fa\u00fd\u0003\u001a\r\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0105\u0005\"\u0000"+
		"\u0000\u00ff\u0100\u0003\u0012\t\u0000\u0100\u0101\u0005!\u0000\u0000"+
		"\u0101\u0102\u0003\u001a\r\u0000\u0102\u0103\u0005\"\u0000\u0000\u0103"+
		"\u0105\u0001\u0000\u0000\u0000\u0104\u00f7\u0001\u0000\u0000\u0000\u0104"+
		"\u00ff\u0001\u0000\u0000\u0000\u0105\u0019\u0001\u0000\u0000\u0000\u0106"+
		"\u0109\u0003\u000e\u0007\u0000\u0107\u0109\u0003\u0012\t\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u0113"+
		"\u0001\u0000\u0000\u0000\u010a\u010c\u0005\b\u0000\u0000\u010b\u010a\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u010f\u0005\'\u0000\u0000\u010e\u0110\u0005\b"+
		"\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0114\u0003\u001a"+
		"\r\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u010b\u0001\u0000\u0000"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u001b\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0005\u001b\u0000\u0000\u0116\u0120\u0006\u000e\uffff"+
		"\uffff\u0000\u0117\u0118\u0005\u001a\u0000\u0000\u0118\u0120\u0006\u000e"+
		"\uffff\uffff\u0000\u0119\u011a\u0005\u001d\u0000\u0000\u011a\u0120\u0006"+
		"\u000e\uffff\uffff\u0000\u011b\u011c\u0005\u0018\u0000\u0000\u011c\u0120"+
		"\u0006\u000e\uffff\uffff\u0000\u011d\u011e\u0005\u0019\u0000\u0000\u011e"+
		"\u0120\u0006\u000e\uffff\uffff\u0000\u011f\u0115\u0001\u0000\u0000\u0000"+
		"\u011f\u0117\u0001\u0000\u0000\u0000\u011f\u0119\u0001\u0000\u0000\u0000"+
		"\u011f\u011b\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u0120\u001d\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u000b\u0000\u0000"+
		"\u0122\u0123\u0005\n\u0000\u0000\u0123\u0124\u0006\u000f\uffff\uffff\u0000"+
		"\u0124\u0125\u0005!\u0000\u0000\u0125\u0126\u0005\"\u0000\u0000\u0126"+
		"\u0128\u0005\b\u0000\u0000\u0127\u0129\u0003 \u0010\u0000\u0128\u0127"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012e\u0005\r\u0000\u0000\u012d\u012f\u0005"+
		"\b\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u001f\u0001\u0000\u0000\u0000\u0130\u0134\u0005\u0006"+
		"\u0000\u0000\u0131\u0134\u0003\"\u0011\u0000\u0132\u0134\u0005\b\u0000"+
		"\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136!\u0001\u0000\u0000\u0000\u0137\u013a\u0003<\u001e\u0000\u0138"+
		"\u013a\u0003,\u0016\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0005\b\u0000\u0000\u013c\u014b\u0001\u0000\u0000\u0000\u013d\u0146\u0003"+
		"$\u0012\u0000\u013e\u0146\u0003\u0016\u000b\u0000\u013f\u0146\u0003(\u0014"+
		"\u0000\u0140\u0141\u0003\u000e\u0007\u0000\u0141\u0142\u0005+\u0000\u0000"+
		"\u0142\u0143\u0003\u000e\u0007\u0000\u0143\u0144\u0006\u0011\uffff\uffff"+
		"\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u013d\u0001\u0000\u0000"+
		"\u0000\u0145\u013e\u0001\u0000\u0000\u0000\u0145\u013f\u0001\u0000\u0000"+
		"\u0000\u0145\u0140\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005(\u0000\u0000\u0148\u0149\u0005\b\u0000\u0000"+
		"\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u0139\u0001\u0000\u0000\u0000"+
		"\u014a\u0145\u0001\u0000\u0000\u0000\u014b#\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0003J%\u0000\u014d\u014e\u0007\u0003\u0000\u0000\u014e\u014f\u0003"+
		"&\u0013\u0000\u014f\u0150\u0006\u0012\uffff\uffff\u0000\u0150%\u0001\u0000"+
		"\u0000\u0000\u0151\u0154\u0003\u0012\t\u0000\u0152\u0154\u0003\u000e\u0007"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000\u0000"+
		"\u0000\u0154\'\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u001e\u0000\u0000"+
		"\u0156\u0157\u0005 \u0000\u0000\u0157\u0158\u0006\u0014\uffff\uffff\u0000"+
		"\u0158\u0159\u0005!\u0000\u0000\u0159\u015a\u0003\u0014\n\u0000\u015a"+
		"\u015b\u0005\"\u0000\u0000\u015b\u015e\u0005\b\u0000\u0000\u015c\u015f"+
		"\u0003*\u0015\u0000\u015d\u015f\u0005\b\u0000\u0000\u015e\u015c\u0001"+
		"\u0000\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001"+
		"\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005"+
		"\b\u0000\u0000\u0163\u0164\u0005(\u0000\u0000\u0164)\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0005\u0007\u0000\u0000\u0166\u0167\u00032\u0019\u0000"+
		"\u0167\u0168\u0005-\u0000\u0000\u0168\u0169\u0003\u000e\u0007\u0000\u0169"+
		"+\u0001\u0000\u0000\u0000\u016a\u016d\u0003.\u0017\u0000\u016b\u016d\u0003"+
		"8\u001c\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000"+
		"\u0000\u0000\u016d-\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u0011\u0000"+
		"\u0000\u016f\u0170\u0006\u0017\uffff\uffff\u0000\u0170\u0173\u0005\b\u0000"+
		"\u0000\u0171\u0174\u00030\u0018\u0000\u0172\u0174\u0003 \u0010\u0000\u0173"+
		"\u0171\u0001\u0000\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0005\r\u0000\u0000\u0178/\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0005\u0016\u0000\u0000\u017a\u0185\u0006\u0018\uffff\uffff\u0000\u017b"+
		"\u017c\u0005\u0014\u0000\u0000\u017c\u0185\u0006\u0018\uffff\uffff\u0000"+
		"\u017d\u017e\u0005\u0017\u0000\u0000\u017e\u0182\u0006\u0018\uffff\uffff"+
		"\u0000\u017f\u0180\u0005\u0015\u0000\u0000\u0180\u0182\u0006\u0018\uffff"+
		"\uffff\u0000\u0181\u017d\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0185\u00032\u0019"+
		"\u0000\u0184\u0179\u0001\u0000\u0000\u0000\u0184\u017b\u0001\u0000\u0000"+
		"\u0000\u0184\u0181\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0005(\u0000\u0000\u0187\u0188\u0005\b\u0000\u0000"+
		"\u01881\u0001\u0000\u0000\u0000\u0189\u018a\u0005!\u0000\u0000\u018a\u018b"+
		"\u00034\u001a\u0000\u018b\u018c\u0005\"\u0000\u0000\u018c\u01a8\u0001"+
		"\u0000\u0000\u0000\u018d\u0199\u0005!\u0000\u0000\u018e\u018f\u00032\u0019"+
		"\u0000\u018f\u0190\u0007\u0004\u0000\u0000\u0190\u0191\u0006\u0019\uffff"+
		"\uffff\u0000\u0191\u019a\u0001\u0000\u0000\u0000\u0192\u0193\u0005!\u0000"+
		"\u0000\u0193\u0194\u00056\u0000\u0000\u0194\u0195\u00032\u0019\u0000\u0195"+
		"\u0196\u0005\"\u0000\u0000\u0196\u0197\u0007\u0004\u0000\u0000\u0197\u0198"+
		"\u0006\u0019\uffff\uffff\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199"+
		"\u018e\u0001\u0000\u0000\u0000\u0199\u0192\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0001\u0000\u0000\u0000\u019c\u01a3\u0001\u0000\u0000\u0000\u019d"+
		"\u01a4\u00032\u0019\u0000\u019e\u019f\u0005!\u0000\u0000\u019f\u01a0\u0005"+
		"6\u0000\u0000\u01a0\u01a1\u00032\u0019\u0000\u01a1\u01a2\u0005\"\u0000"+
		"\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u019d\u0001\u0000\u0000"+
		"\u0000\u01a3\u019e\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0005\"\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a7\u0189\u0001\u0000\u0000\u0000\u01a7\u018d\u0001\u0000\u0000\u0000"+
		"\u01a83\u0001\u0000\u0000\u0000\u01a9\u01aa\u00056\u0000\u0000\u01aa\u01ad"+
		"\u0006\u001a\uffff\uffff\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u00036\u001b\u0000\u01af\u01b0"+
		"\u00057\u0000\u0000\u01b0\u01b4\u0006\u001a\uffff\uffff\u0000\u01b1\u01b2"+
		"\u00056\u0000\u0000\u01b2\u01b5\u0006\u001a\uffff\uffff\u0000\u01b3\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u00036\u001b\u0000\u01b7\u01ec\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005"+
		"6\u0000\u0000\u01b9\u01bc\u0006\u001a\uffff\uffff\u0000\u01ba\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bb\u01ba\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0003"+
		"6\u001b\u0000\u01be\u01bf\u00058\u0000\u0000\u01bf\u01c3\u0006\u001a\uffff"+
		"\uffff\u0000\u01c0\u01c1\u00056\u0000\u0000\u01c1\u01c4\u0006\u001a\uffff"+
		"\uffff\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u00036\u001b\u0000\u01c6\u01ec\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u00056\u0000\u0000\u01c8\u01cb\u0006\u001a\uffff\uffff"+
		"\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c7\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u00036\u001b\u0000\u01cd\u01ce\u0005:\u0000\u0000\u01ce"+
		"\u01d2\u0006\u001a\uffff\uffff\u0000\u01cf\u01d0\u00056\u0000\u0000\u01d0"+
		"\u01d3\u0006\u001a\uffff\uffff\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d2\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u00036\u001b\u0000\u01d5"+
		"\u01ec\u0001\u0000\u0000\u0000\u01d6\u01d7\u00056\u0000\u0000\u01d7\u01da"+
		"\u0006\u001a\uffff\uffff\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u00036\u001b\u0000\u01dc\u01dd"+
		"\u00059\u0000\u0000\u01dd\u01e1\u0006\u001a\uffff\uffff\u0000\u01de\u01df"+
		"\u00056\u0000\u0000\u01df\u01e2\u0006\u001a\uffff\uffff\u0000\u01e0\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u00036\u001b\u0000\u01e4\u01ec\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005"+
		"6\u0000\u0000\u01e6\u01e9\u0006\u001a\uffff\uffff\u0000\u01e7\u01e9\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec\u0003"+
		"6\u001b\u0000\u01eb\u01ac\u0001\u0000\u0000\u0000\u01eb\u01bb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ca\u0001\u0000\u0000\u0000\u01eb\u01d9\u0001\u0000"+
		"\u0000\u0000\u01eb\u01e8\u0001\u0000\u0000\u0000\u01ec5\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0006\u001b\uffff\uffff\u0000\u01ee\u01f8\u0003\u0010"+
		"\b\u0000\u01ef\u01f0\u0005!\u0000\u0000\u01f0\u01f1\u00036\u001b\u0000"+
		"\u01f1\u01f2\u0005\"\u0000\u0000\u01f2\u01f8\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u00052\u0000\u0000\u01f4\u01f5\u00036\u001b\u0003\u01f5\u01f6\u0006"+
		"\u001b\uffff\uffff\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01ed"+
		"\u0001\u0000\u0000\u0000\u01f7\u01ef\u0001\u0000\u0000\u0000\u01f7\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f8\u0208\u0001\u0000\u0000\u0000\u01f9\u01fa"+
		"\n\u0002\u0000\u0000\u01fa\u01fb\u0007\u0001\u0000\u0000\u01fb\u01fc\u0003"+
		"6\u001b\u0003\u01fc\u01fd\u0006\u001b\uffff\uffff\u0000\u01fd\u0207\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\n\u0001\u0000\u0000\u01ff\u0200\u0007\u0002"+
		"\u0000\u0000\u0200\u0201\u00036\u001b\u0002\u0201\u0202\u0006\u001b\uffff"+
		"\uffff\u0000\u0202\u0207\u0001\u0000\u0000\u0000\u0203\u0204\n\u0004\u0000"+
		"\u0000\u0204\u0205\u00054\u0000\u0000\u0205\u0207\u0006\u001b\uffff\uffff"+
		"\u0000\u0206\u01f9\u0001\u0000\u0000\u0000\u0206\u01fe\u0001\u0000\u0000"+
		"\u0000\u0206\u0203\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000"+
		"\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u02097\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0005\u0012\u0000\u0000\u020c\u020d\u0006\u001c\uffff\uffff"+
		"\u0000\u020d\u020e\u0005 \u0000\u0000\u020e\u0212\u0005\u0013\u0000\u0000"+
		"\u020f\u0213\u0005\u0002\u0000\u0000\u0210\u0213\u0003B!\u0000\u0211\u0213"+
		"\u0003:\u001d\u0000\u0212\u020f\u0001\u0000\u0000\u0000\u0212\u0210\u0001"+
		"\u0000\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001"+
		"\u0000\u0000\u0000\u0214\u0219\u0005\b\u0000\u0000\u0215\u0218\u00030"+
		"\u0018\u0000\u0216\u0218\u0003 \u0010\u0000\u0217\u0215\u0001\u0000\u0000"+
		"\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218\u021b\u0001\u0000\u0000"+
		"\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0005\r\u0000\u0000\u021d9\u0001\u0000\u0000\u0000"+
		"\u021e\u0222\u0005!\u0000\u0000\u021f\u0223\u0003J%\u0000\u0220\u0223"+
		"\u0003H$\u0000\u0221\u0223\u0003\u0016\u000b\u0000\u0222\u021f\u0001\u0000"+
		"\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0221\u0001\u0000"+
		"\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0228\u0005.\u0000"+
		"\u0000\u0225\u0229\u0003J%\u0000\u0226\u0229\u0003H$\u0000\u0227\u0229"+
		"\u0003\u0016\u000b\u0000\u0228\u0225\u0001\u0000\u0000\u0000\u0228\u0226"+
		"\u0001\u0000\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u022a"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\u0005\"\u0000\u0000\u022b;\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0005\u000e\u0000\u0000\u022d\u022e\u0006"+
		"\u001e\uffff\uffff\u0000\u022e\u022f\u00032\u0019\u0000\u022f\u0235\u0005"+
		"\b\u0000\u0000\u0230\u0234\u0003 \u0010\u0000\u0231\u0234\u0003>\u001f"+
		"\u0000\u0232\u0234\u0005\b\u0000\u0000\u0233\u0230\u0001\u0000\u0000\u0000"+
		"\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000"+
		"\u0234\u0237\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000"+
		"\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u023a\u0003@ \u0000\u0239\u0238"+
		"\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0005\r\u0000\u0000\u023c=\u0001"+
		"\u0000\u0000\u0000\u023d\u023e\u0005\u000f\u0000\u0000\u023e\u023f\u0006"+
		"\u001f\uffff\uffff\u0000\u023f\u0240\u00032\u0019\u0000\u0240\u0241\u0005"+
		"\b\u0000\u0000\u0241\u0242\u0003 \u0010\u0000\u0242?\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0005\u0010\u0000\u0000\u0244\u0245\u0006 \uffff\uffff"+
		"\u0000\u0245\u0246\u0005\b\u0000\u0000\u0246\u0247\u0003 \u0010\u0000"+
		"\u0247A\u0001\u0000\u0000\u0000\u0248\u024b\u0005#\u0000\u0000\u0249\u024c"+
		"\u0003D\"\u0000\u024a\u024c\u0001\u0000\u0000\u0000\u024b\u0249\u0001"+
		"\u0000\u0000\u0000\u024b\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001"+
		"\u0000\u0000\u0000\u024d\u024e\u0005$\u0000\u0000\u024eC\u0001\u0000\u0000"+
		"\u0000\u024f\u0252\u0003F#\u0000\u0250\u0252\u0003B!\u0000\u0251\u024f"+
		"\u0001\u0000\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u025b"+
		"\u0001\u0000\u0000\u0000\u0253\u0256\u0003F#\u0000\u0254\u0256\u0003B"+
		"!\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0254\u0001\u0000\u0000"+
		"\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0258\u0005\'\u0000\u0000"+
		"\u0258\u0259\u0003D\"\u0000\u0259\u025b\u0001\u0000\u0000\u0000\u025a"+
		"\u0251\u0001\u0000\u0000\u0000\u025a\u0255\u0001\u0000\u0000\u0000\u025b"+
		"E\u0001\u0000\u0000\u0000\u025c\u0260\u0003J%\u0000\u025d\u0260\u0003"+
		"H$\u0000\u025e\u0260\u0003\u0016\u000b\u0000\u025f\u025c\u0001\u0000\u0000"+
		"\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u025e\u0001\u0000\u0000"+
		"\u0000\u0260G\u0001\u0000\u0000\u0000\u0261\u0262\u0007\u0005\u0000\u0000"+
		"\u0262I\u0001\u0000\u0000\u0000\u0263\u026a\u0005 \u0000\u0000\u0264\u0265"+
		"\u0005#\u0000\u0000\u0265\u0266\u0003\u000e\u0007\u0000\u0266\u0267\u0005"+
		"$\u0000\u0000\u0267\u0269\u0001\u0000\u0000\u0000\u0268\u0264\u0001\u0000"+
		"\u0000\u0000\u0269\u026c\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000"+
		"\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026bK\u0001\u0000\u0000"+
		"\u0000\u026c\u026a\u0001\u0000\u0000\u0000DPUYhpv{\u0087\u008c\u0098\u00c0"+
		"\u00c2\u00c9\u00db\u00f5\u00fc\u0104\u0108\u010b\u010f\u0113\u011f\u012a"+
		"\u012e\u0133\u0135\u0139\u0145\u014a\u0153\u015e\u0160\u016c\u0173\u0175"+
		"\u0181\u0184\u0199\u019b\u01a3\u01a7\u01ac\u01b4\u01bb\u01c3\u01ca\u01d2"+
		"\u01d9\u01e1\u01e8\u01eb\u01f7\u0206\u0208\u0212\u0217\u0219\u0222\u0228"+
		"\u0233\u0235\u0239\u024b\u0251\u0255\u025a\u025f\u026a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}