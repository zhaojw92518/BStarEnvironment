package cn.edu.buaa.act.bstar.parser;
// Generated from .\BStar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BStarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MACHINE=1, INVARIANT=2, ATTRIBUTE=3, OPERATIONS=4, END=5, INCLUDE=6, FUNCTION=7, 
		ROBUST=8, PRECONDITION=9, POSTCONDITION=10, SHORT_TYPE=11, INT_TYPE=12, 
		LONG_TYPE=13, FLOAT_TYPE=14, DOUBLE_TYPE=15, CHAR_TYPE=16, STRING_TYPE=17, 
		PROPOSITION_TYPE=18, SET_TYPE=19, TUPLE_TYPE=20, BOOL_TYPE=21, ENUM_TYPE=22, 
		CONST=23, UNSIGNED=24, TRUE=25, FALSE=26, NIL=27, STRUCT=28, VOID=29, 
		RETURN=30, IF=31, ELSE=32, WHILE=33, BREAK=34, CONTINUE=35, TYPEDEF=36, 
		SUF=37, DEFINE=38, FORALL=39, COMMA=40, POINT=41, AT=42, SEMICOLON=43, 
		L_BRACKET=44, R_BRACKET=45, L_BRACE=46, R_BRACE=47, L_ANGLE_BRACKET=48, 
		R_ANGLE_BRACKET=49, ADD=50, SUB=51, MUL=52, DIV=53, MOD=54, NOT=55, CONJUNCTION=56, 
		DISJUNCTION=57, IMPLICATION=58, EXIST=59, EGRE=60, ELES=61, EQU=62, UEQU=63, 
		SEPERATOR=64, BELONG=65, NOTBELONG=66, INTER=67, UNION=68, DIFFER=69, 
		ASSIGNMENT=70, ADDRGET=71, ADDR=72, CHAR=73, STRING=74, AT_STR=75, INTEGER=76, 
		REAL=77, ID=78, WS=79, COMMENT=80, COMMENT_2=81;
	public static final String[] tokenNames = {
		"<INVALID>", "'MACHINE'", "'INVARIANT'", "'ATTRIBUTES'", "'OPERATIONS'", 
		"'END'", "'INCLUDE'", "'FUNCTION'", "'ROBUST'", "'Precondition'", "'Postcondition'", 
		"'short'", "'int'", "'long'", "'float'", "'double'", "'char'", "'string'", 
		"'proposition'", "'set'", "'tuple'", "'bool'", "'enum'", "'const'", "'unsigned'", 
		"'true'", "'false'", "'nil'", "'struct'", "'void'", "'return'", "'if'", 
		"'else'", "'while'", "'break'", "'continue'", "'typedef'", "'.bs'", "'#define'", 
		"'#'", "','", "'.'", "'@'", "';'", "'('", "')'", "'{'", "'}'", "'<'", 
		"'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&&'", "'||'", "'=>'", 
		"'!'", "'>='", "'<='", "'=='", "'!='", "'|'", "':'", "'!:'", "'/-\\'", 
		"'\\-/'", "'--'", "'='", "'->'", "'&'", "CHAR", "STRING", "AT_STR", "INTEGER", 
		"REAL", "ID", "WS", "COMMENT", "COMMENT_2"
	};
	public static final int
		RULE_abmachine = 0, RULE_code_text = 1, RULE_includes = 2, RULE_attributes = 3, 
		RULE_cv_define = 4, RULE_single_cv_define = 5, RULE_single_var_define = 6, 
		RULE_var_define = 7, RULE_cst_define = 8, RULE_operations = 9, RULE_function_define = 10, 
		RULE_declare_operations = 11, RULE_declares = 12, RULE_function_declare = 13, 
		RULE_cdeclare_operations = 14, RULE_cfunction_declare = 15, RULE_defines = 16, 
		RULE_type = 17, RULE_normal_type = 18, RULE_set_type = 19, RULE_struct_type = 20, 
		RULE_enum_type = 21, RULE_single_enum_type = 22, RULE_point_id = 23, RULE_addr_id = 24, 
		RULE_robust = 25, RULE_function = 26, RULE_para_define_list = 27, RULE_function_call = 28, 
		RULE_para_value_list = 29, RULE_append_paras = 30, RULE_attributes_2 = 31, 
		RULE_com_statement = 32, RULE_invariant = 33, RULE_statement = 34, RULE_element_take = 35, 
		RULE_break_stat = 36, RULE_continue_stat = 37, RULE_assign_stat = 38, 
		RULE_return_stat = 39, RULE_while_stat = 40, RULE_if_stat = 41, RULE_else_stat = 42, 
		RULE_define = 43, RULE_include = 44, RULE_point = 45, RULE_belong = 46, 
		RULE_not_belong = 47, RULE_addr_get = 48, RULE_nil = 49, RULE_id = 50, 
		RULE_string = 51, RULE_at_str = 52, RULE_true_str = 53, RULE_false_str = 54, 
		RULE_integer = 55, RULE_real = 56, RULE_char_str = 57, RULE_statement_at = 58, 
		RULE_belong_pair = 59, RULE_term_latter = 60, RULE_term_element_comma = 61, 
		RULE_term_set = 62, RULE_term_tuple = 63, RULE_term = 64, RULE_one_e = 65, 
		RULE_unary_e = 66, RULE_mse_0 = 67, RULE_mse_1_latter = 68, RULE_mse_1 = 69, 
		RULE_mse_latter = 70, RULE_mse = 71, RULE_condition_term = 72, RULE_condition_term_latter = 73, 
		RULE_id_list = 74, RULE_quan_e = 75, RULE_pro_term_e = 76, RULE_and_pro_e = 77, 
		RULE_or_pro_e = 78, RULE_imp_pro_e = 79, RULE_pro_e = 80, RULE_element = 81;
	public static final String[] ruleNames = {
		"abmachine", "code_text", "includes", "attributes", "cv_define", "single_cv_define", 
		"single_var_define", "var_define", "cst_define", "operations", "function_define", 
		"declare_operations", "declares", "function_declare", "cdeclare_operations", 
		"cfunction_declare", "defines", "type", "normal_type", "set_type", "struct_type", 
		"enum_type", "single_enum_type", "point_id", "addr_id", "robust", "function", 
		"para_define_list", "function_call", "para_value_list", "append_paras", 
		"attributes_2", "com_statement", "invariant", "statement", "element_take", 
		"break_stat", "continue_stat", "assign_stat", "return_stat", "while_stat", 
		"if_stat", "else_stat", "define", "include", "point", "belong", "not_belong", 
		"addr_get", "nil", "id", "string", "at_str", "true_str", "false_str", 
		"integer", "real", "char_str", "statement_at", "belong_pair", "term_latter", 
		"term_element_comma", "term_set", "term_tuple", "term", "one_e", "unary_e", 
		"mse_0", "mse_1_latter", "mse_1", "mse_latter", "mse", "condition_term", 
		"condition_term_latter", "id_list", "quan_e", "pro_term_e", "and_pro_e", 
		"or_pro_e", "imp_pro_e", "pro_e", "element"
	};

	@Override
	public String getGrammarFileName() { return "BStar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public BStarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AbmachineContext extends ParserRuleContext {
		public TerminalNode MACHINE() { return getToken(BStarParser.MACHINE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode END() { return getToken(BStarParser.END, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(BStarParser.ATTRIBUTE, 0); }
		public Code_textContext code_text() {
			return getRuleContext(Code_textContext.class,0);
		}
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public IncludesContext includes() {
			return getRuleContext(IncludesContext.class,0);
		}
		public Cv_defineContext cv_define() {
			return getRuleContext(Cv_defineContext.class,0);
		}
		public AbmachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abmachine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAbmachine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbmachineContext abmachine() throws RecognitionException {
		AbmachineContext _localctx = new AbmachineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abmachine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(MACHINE);
			setState(165); id();
			setState(167);
			_la = _input.LA(1);
			if (_la==INCLUDE) {
				{
				setState(166); includes();
				}
			}

			setState(174);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(169); match(ATTRIBUTE);
				setState(171);
				_la = _input.LA(1);
				if (_la==DEFINE) {
					{
					setState(170); defines();
					}
				}

				setState(173); cv_define();
				}
			}

			setState(177);
			_la = _input.LA(1);
			if (_la==OPERATIONS) {
				{
				setState(176); code_text();
				}
			}

			setState(179); match(END);
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

	public static class Code_textContext extends ParserRuleContext {
		public Cdeclare_operationsContext cdeclare_operations() {
			return getRuleContext(Cdeclare_operationsContext.class,0);
		}
		public Declare_operationsContext declare_operations() {
			return getRuleContext(Declare_operationsContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public Code_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCode_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_textContext code_text() throws RecognitionException {
		Code_textContext _localctx = new Code_textContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_text);
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); operations();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); declare_operations();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183); cdeclare_operations();
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

	public static class IncludesContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(BStarParser.SEMICOLON); }
		public TerminalNode SUF(int i) {
			return getToken(BStarParser.SUF, i);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode R_ANGLE_BRACKET(int i) {
			return getToken(BStarParser.R_ANGLE_BRACKET, i);
		}
		public List<TerminalNode> L_ANGLE_BRACKET() { return getTokens(BStarParser.L_ANGLE_BRACKET); }
		public TerminalNode L_ANGLE_BRACKET(int i) {
			return getToken(BStarParser.L_ANGLE_BRACKET, i);
		}
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public List<TerminalNode> SUF() { return getTokens(BStarParser.SUF); }
		public List<TerminalNode> R_ANGLE_BRACKET() { return getTokens(BStarParser.R_ANGLE_BRACKET); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(BStarParser.SEMICOLON, i);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public IncludesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitIncludes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludesContext includes() throws RecognitionException {
		IncludesContext _localctx = new IncludesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_includes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186); include();
				setState(193);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(187); string();
					}
					break;
				case L_ANGLE_BRACKET:
					{
					setState(188); match(L_ANGLE_BRACKET);
					setState(189); id();
					setState(190); match(SUF);
					setState(191); match(R_ANGLE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195); match(SEMICOLON);
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
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

	public static class AttributesContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(BStarParser.ATTRIBUTE, 0); }
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public Cv_defineContext cv_define() {
			return getRuleContext(Cv_defineContext.class,0);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(ATTRIBUTE);
			setState(203);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(202); defines();
				}
			}

			setState(205); cv_define();
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

	public static class Cv_defineContext extends ParserRuleContext {
		public List<Single_cv_defineContext> single_cv_define() {
			return getRuleContexts(Single_cv_defineContext.class);
		}
		public Single_cv_defineContext single_cv_define(int i) {
			return getRuleContext(Single_cv_defineContext.class,i);
		}
		public Cv_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cv_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCv_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cv_defineContext cv_define() throws RecognitionException {
		Cv_defineContext _localctx = new Cv_defineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cv_define);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(207); single_cv_define();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(210); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class Single_cv_defineContext extends ParserRuleContext {
		public Cst_defineContext cst_define() {
			return getRuleContext(Cst_defineContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public Var_defineContext var_define() {
			return getRuleContext(Var_defineContext.class,0);
		}
		public Single_cv_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_cv_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitSingle_cv_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_cv_defineContext single_cv_define() throws RecognitionException {
		Single_cv_defineContext _localctx = new Single_cv_defineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_single_cv_define);
		try {
			setState(218);
			switch (_input.LA(1)) {
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case PROPOSITION_TYPE:
			case SET_TYPE:
			case UNSIGNED:
			case VOID:
			case TYPEDEF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); var_define();
				setState(213); match(SEMICOLON);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); cst_define();
				setState(216); match(SEMICOLON);
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

	public static class Single_var_defineContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(BStarParser.ASSIGNMENT, 0); }
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
		public Single_var_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_var_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitSingle_var_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_var_defineContext single_var_define() throws RecognitionException {
		Single_var_defineContext _localctx = new Single_var_defineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_single_var_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(220); match(MUL);
				setState(221); point_id();
				}
				break;
			case ID:
				{
				setState(222); id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(225); match(ASSIGNMENT);
				setState(226); element();
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

	public static class Var_defineContext extends ParserRuleContext {
		public List<Single_var_defineContext> single_var_define() {
			return getRuleContexts(Single_var_defineContext.class);
		}
		public TerminalNode TYPEDEF() { return getToken(BStarParser.TYPEDEF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Single_var_defineContext single_var_define(int i) {
			return getRuleContext(Single_var_defineContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Var_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitVar_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defineContext var_define() throws RecognitionException {
		Var_defineContext _localctx = new Var_defineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_define);
		int _la;
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); type();
				setState(230); single_var_define();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(231); match(COMMA);
					setState(232); single_var_define();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); match(TYPEDEF);
				setState(239); enum_type();
				setState(240); id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242); match(TYPEDEF);
				setState(243); type();
				setState(244); point_id();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246); match(TYPEDEF);
				setState(247); struct_type();
				setState(248); point_id();
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

	public static class Cst_defineContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(BStarParser.CONST, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public List<Point_idContext> point_id() {
			return getRuleContexts(Point_idContext.class);
		}
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(BStarParser.ASSIGNMENT, i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(BStarParser.ASSIGNMENT); }
		public Point_idContext point_id(int i) {
			return getRuleContext(Point_idContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Cst_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cst_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCst_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cst_defineContext cst_define() throws RecognitionException {
		Cst_defineContext _localctx = new Cst_defineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cst_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(CONST);
			setState(253); type();
			setState(254); point_id();
			setState(255); match(ASSIGNMENT);
			setState(256); element();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(257); match(COMMA);
				setState(258); point_id();
				setState(259); match(ASSIGNMENT);
				setState(260); element();
				}
				}
				setState(266);
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

	public static class OperationsContext extends ParserRuleContext {
		public TerminalNode OPERATIONS() { return getToken(BStarParser.OPERATIONS, 0); }
		public Function_defineContext function_define(int i) {
			return getRuleContext(Function_defineContext.class,i);
		}
		public List<Function_defineContext> function_define() {
			return getRuleContexts(Function_defineContext.class);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(OPERATIONS);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268); function_define();
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID );
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

	public static class Function_defineContext extends ParserRuleContext {
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public Com_statementContext com_statement() {
			return getRuleContext(Com_statementContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Para_define_listContext para_define_list() {
			return getRuleContext(Para_define_listContext.class,0);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public Function_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitFunction_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defineContext function_define() throws RecognitionException {
		Function_defineContext _localctx = new Function_defineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); type();
			setState(274); point_id();
			setState(275); match(L_BRACKET);
			setState(276); para_define_list();
			setState(277); match(R_BRACKET);
			setState(278); match(L_BRACE);
			setState(279); com_statement();
			setState(280); match(R_BRACE);
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

	public static class Declare_operationsContext extends ParserRuleContext {
		public TerminalNode OPERATIONS() { return getToken(BStarParser.OPERATIONS, 0); }
		public DeclaresContext declares() {
			return getRuleContext(DeclaresContext.class,0);
		}
		public Declare_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_operations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitDeclare_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_operationsContext declare_operations() throws RecognitionException {
		Declare_operationsContext _localctx = new Declare_operationsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declare_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(OPERATIONS);
			setState(283); declares();
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

	public static class DeclaresContext extends ParserRuleContext {
		public Function_declareContext function_declare(int i) {
			return getRuleContext(Function_declareContext.class,i);
		}
		public List<Function_declareContext> function_declare() {
			return getRuleContexts(Function_declareContext.class);
		}
		public DeclaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declares; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitDeclares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaresContext declares() throws RecognitionException {
		DeclaresContext _localctx = new DeclaresContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285); function_declare();
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID );
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

	public static class Function_declareContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Para_define_listContext para_define_list() {
			return getRuleContext(Para_define_listContext.class,0);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitFunction_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declareContext function_declare() throws RecognitionException {
		Function_declareContext _localctx = new Function_declareContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); type();
			setState(291); point_id();
			setState(292); match(L_BRACKET);
			setState(293); para_define_list();
			setState(294); match(R_BRACKET);
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

	public static class Cdeclare_operationsContext extends ParserRuleContext {
		public TerminalNode OPERATIONS() { return getToken(BStarParser.OPERATIONS, 0); }
		public Cfunction_declareContext cfunction_declare(int i) {
			return getRuleContext(Cfunction_declareContext.class,i);
		}
		public List<Cfunction_declareContext> cfunction_declare() {
			return getRuleContexts(Cfunction_declareContext.class);
		}
		public Cdeclare_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdeclare_operations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCdeclare_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cdeclare_operationsContext cdeclare_operations() throws RecognitionException {
		Cdeclare_operationsContext _localctx = new Cdeclare_operationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cdeclare_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(OPERATIONS);
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297); cfunction_declare();
				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID );
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

	public static class Cfunction_declareContext extends ParserRuleContext {
		public RobustContext robust() {
			return getRuleContext(RobustContext.class,0);
		}
		public Function_declareContext function_declare() {
			return getRuleContext(Function_declareContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Cfunction_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfunction_declare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCfunction_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cfunction_declareContext cfunction_declare() throws RecognitionException {
		Cfunction_declareContext _localctx = new Cfunction_declareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cfunction_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); function_declare();
			setState(303); robust();
			setState(304); function();
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

	public static class DefinesContext extends ParserRuleContext {
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public DefinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defines; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitDefines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinesContext defines() throws RecognitionException {
		DefinesContext _localctx = new DefinesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306); define();
				setState(307); id();
				setState(308); element();
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEFINE );
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
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Normal_typeContext normal_type() {
			return getRuleContext(Normal_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			setState(323);
			switch (_input.LA(1)) {
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case PROPOSITION_TYPE:
			case UNSIGNED:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); normal_type();
				}
				break;
			case SET_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); set_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(316); id();
				setState(321);
				_la = _input.LA(1);
				if (_la==L_ANGLE_BRACKET) {
					{
					setState(317); match(L_ANGLE_BRACKET);
					setState(318); type();
					setState(319); match(R_ANGLE_BRACKET);
					}
				}

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

	public static class Normal_typeContext extends ParserRuleContext {
		public TerminalNode PROPOSITION_TYPE() { return getToken(BStarParser.PROPOSITION_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(BStarParser.INT_TYPE, 0); }
		public List<TerminalNode> LONG_TYPE() { return getTokens(BStarParser.LONG_TYPE); }
		public TerminalNode FLOAT_TYPE() { return getToken(BStarParser.FLOAT_TYPE, 0); }
		public TerminalNode LONG_TYPE(int i) {
			return getToken(BStarParser.LONG_TYPE, i);
		}
		public TerminalNode CHAR_TYPE() { return getToken(BStarParser.CHAR_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(BStarParser.DOUBLE_TYPE, 0); }
		public TerminalNode VOID() { return getToken(BStarParser.VOID, 0); }
		public TerminalNode UNSIGNED() { return getToken(BStarParser.UNSIGNED, 0); }
		public TerminalNode STRING_TYPE() { return getToken(BStarParser.STRING_TYPE, 0); }
		public TerminalNode SHORT_TYPE() { return getToken(BStarParser.SHORT_TYPE, 0); }
		public Normal_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitNormal_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_typeContext normal_type() throws RecognitionException {
		Normal_typeContext _localctx = new Normal_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_normal_type);
		try {
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325); match(SHORT_TYPE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326); match(UNSIGNED);
				setState(327); match(SHORT_TYPE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328); match(INT_TYPE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329); match(UNSIGNED);
				setState(330); match(INT_TYPE);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331); match(LONG_TYPE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(332); match(UNSIGNED);
				setState(333); match(LONG_TYPE);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(334); match(LONG_TYPE);
				setState(335); match(LONG_TYPE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(336); match(UNSIGNED);
				setState(337); match(LONG_TYPE);
				setState(338); match(LONG_TYPE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(339); match(CHAR_TYPE);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(340); match(UNSIGNED);
				setState(341); match(CHAR_TYPE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(342); match(FLOAT_TYPE);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(343); match(UNSIGNED);
				setState(344); match(FLOAT_TYPE);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(345); match(DOUBLE_TYPE);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(346); match(UNSIGNED);
				setState(347); match(DOUBLE_TYPE);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(348); match(STRING_TYPE);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(349); match(PROPOSITION_TYPE);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(350); match(VOID);
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

	public static class Set_typeContext extends ParserRuleContext {
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public TerminalNode SET_TYPE() { return getToken(BStarParser.SET_TYPE, 0); }
		public At_strContext at_str() {
			return getRuleContext(At_strContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public Set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitSet_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_typeContext set_type() throws RecognitionException {
		Set_typeContext _localctx = new Set_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_set_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(SET_TYPE);
			setState(354); match(L_ANGLE_BRACKET);
			setState(355); type();
			setState(356); match(R_ANGLE_BRACKET);
			setState(358);
			_la = _input.LA(1);
			if (_la==AT_STR) {
				{
				setState(357); at_str();
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

	public static class Struct_typeContext extends ParserRuleContext {
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(BStarParser.SEMICOLON); }
		public TerminalNode STRUCT() { return getToken(BStarParser.STRUCT, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Point_idContext> point_id() {
			return getRuleContexts(Point_idContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(BStarParser.SEMICOLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public Point_idContext point_id(int i) {
			return getRuleContext(Point_idContext.class,i);
		}
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitStruct_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_struct_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(STRUCT);
			setState(361); match(L_BRACE);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				{
				setState(362); type();
				setState(363); point_id();
				setState(364); match(SEMICOLON);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371); match(R_BRACE);
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

	public static class Enum_typeContext extends ParserRuleContext {
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public Single_enum_typeContext single_enum_type(int i) {
			return getRuleContext(Single_enum_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public List<Single_enum_typeContext> single_enum_type() {
			return getRuleContexts(Single_enum_typeContext.class);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public TerminalNode ENUM_TYPE() { return getToken(BStarParser.ENUM_TYPE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Enum_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitEnum_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_typeContext enum_type() throws RecognitionException {
		Enum_typeContext _localctx = new Enum_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enum_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); match(ENUM_TYPE);
			setState(374); match(L_BRACE);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(375); single_enum_type();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(376); match(COMMA);
					setState(377); single_enum_type();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388); match(R_BRACE);
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

	public static class Single_enum_typeContext extends ParserRuleContext {
		public Unary_eContext unary_e() {
			return getRuleContext(Unary_eContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(BStarParser.ASSIGNMENT, 0); }
		public Single_enum_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_enum_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitSingle_enum_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_enum_typeContext single_enum_type() throws RecognitionException {
		Single_enum_typeContext _localctx = new Single_enum_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_single_enum_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390); id();
			setState(393);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(391); match(ASSIGNMENT);
				setState(392); unary_e();
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

	public static class Point_idContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
		public Point_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPoint_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Point_idContext point_id() throws RecognitionException {
		Point_idContext _localctx = new Point_idContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_point_id);
		try {
			setState(402);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(395); match(MUL);
				setState(396); point_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(397); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(398); match(L_BRACKET);
				setState(399); point_id();
				setState(400); match(R_BRACKET);
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

	public static class Addr_idContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ADDR() { return getToken(BStarParser.ADDR, 0); }
		public Addr_idContext addr_id() {
			return getRuleContext(Addr_idContext.class,0);
		}
		public Addr_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addr_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAddr_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Addr_idContext addr_id() throws RecognitionException {
		Addr_idContext _localctx = new Addr_idContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_addr_id);
		try {
			setState(411);
			switch (_input.LA(1)) {
			case ADDR:
				enterOuterAlt(_localctx, 1);
				{
				setState(404); match(ADDR);
				setState(405); addr_id();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(406); id();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(407); match(L_BRACKET);
				setState(408); addr_id();
				setState(409); match(R_BRACKET);
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

	public static class RobustContext extends ParserRuleContext {
		public TerminalNode PRECONDITION(int i) {
			return getToken(BStarParser.PRECONDITION, i);
		}
		public TerminalNode ROBUST() { return getToken(BStarParser.ROBUST, 0); }
		public List<Pro_eContext> pro_e() {
			return getRuleContexts(Pro_eContext.class);
		}
		public List<TerminalNode> PRECONDITION() { return getTokens(BStarParser.PRECONDITION); }
		public TerminalNode POSTCONDITION(int i) {
			return getToken(BStarParser.POSTCONDITION, i);
		}
		public List<TerminalNode> POSTCONDITION() { return getTokens(BStarParser.POSTCONDITION); }
		public Pro_eContext pro_e(int i) {
			return getRuleContext(Pro_eContext.class,i);
		}
		public RobustContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_robust; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitRobust(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RobustContext robust() throws RecognitionException {
		RobustContext _localctx = new RobustContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_robust);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); match(ROBUST);
			setState(419); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(414); match(PRECONDITION);
				setState(415); pro_e();
				setState(416); match(POSTCONDITION);
				setState(417); pro_e();
				}
				}
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRECONDITION );
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(BStarParser.FUNCTION, 0); }
		public TerminalNode PRECONDITION(int i) {
			return getToken(BStarParser.PRECONDITION, i);
		}
		public List<Pro_eContext> pro_e() {
			return getRuleContexts(Pro_eContext.class);
		}
		public List<TerminalNode> PRECONDITION() { return getTokens(BStarParser.PRECONDITION); }
		public TerminalNode POSTCONDITION(int i) {
			return getToken(BStarParser.POSTCONDITION, i);
		}
		public List<TerminalNode> POSTCONDITION() { return getTokens(BStarParser.POSTCONDITION); }
		public Pro_eContext pro_e(int i) {
			return getRuleContext(Pro_eContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); match(FUNCTION);
			setState(429); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(424); match(PRECONDITION);
				setState(425); pro_e();
				setState(426); match(POSTCONDITION);
				setState(427); pro_e();
				}
				}
				setState(431); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRECONDITION );
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

	public static class Para_define_listContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public List<Point_idContext> point_id() {
			return getRuleContexts(Point_idContext.class);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public Point_idContext point_id(int i) {
			return getRuleContext(Point_idContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Para_define_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_define_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPara_define_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_define_listContext para_define_list() throws RecognitionException {
		Para_define_listContext _localctx = new Para_define_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_para_define_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << PROPOSITION_TYPE) | (1L << SET_TYPE) | (1L << UNSIGNED) | (1L << VOID))) != 0) || _la==ID) {
				{
				setState(433); type();
				setState(434); point_id();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(435); match(COMMA);
					setState(436); type();
					setState(437); point_id();
					}
					}
					setState(443);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Para_value_listContext para_value_list() {
			return getRuleContext(Para_value_listContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Append_parasContext append_paras() {
			return getRuleContext(Append_parasContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); id();
			setState(447); match(L_BRACKET);
			setState(448); para_value_list();
			setState(449); match(R_BRACKET);
			setState(451);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(450); append_paras();
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

	public static class Para_value_listContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Para_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_value_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPara_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_value_listContext para_value_list() throws RecognitionException {
		Para_value_listContext _localctx = new Para_value_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_para_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (TRUE - 25)) | (1L << (FALSE - 25)) | (1L << (NIL - 25)) | (1L << (FORALL - 25)) | (1L << (L_BRACKET - 25)) | (1L << (L_BRACE - 25)) | (1L << (L_ANGLE_BRACKET - 25)) | (1L << (ADD - 25)) | (1L << (SUB - 25)) | (1L << (MUL - 25)) | (1L << (NOT - 25)) | (1L << (EXIST - 25)) | (1L << (ADDR - 25)) | (1L << (CHAR - 25)) | (1L << (STRING - 25)) | (1L << (INTEGER - 25)) | (1L << (REAL - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				setState(453); element();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(454); match(COMMA);
					setState(455); element();
					}
					}
					setState(460);
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

	public static class Append_parasContext extends ParserRuleContext {
		public List<TerminalNode> AT() { return getTokens(BStarParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(BStarParser.AT, i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Append_parasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append_paras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAppend_paras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Append_parasContext append_paras() throws RecognitionException {
		Append_parasContext _localctx = new Append_parasContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_append_paras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); match(AT);
			setState(464); id();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(465); match(COMMA);
				setState(466); id();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472); match(AT);
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

	public static class Attributes_2Context extends ParserRuleContext {
		public Cv_defineContext cv_define() {
			return getRuleContext(Cv_defineContext.class,0);
		}
		public Attributes_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes_2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAttributes_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attributes_2Context attributes_2() throws RecognitionException {
		Attributes_2Context _localctx = new Attributes_2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_attributes_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474); cv_define();
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

	public static class Com_statementContext extends ParserRuleContext {
		public Attributes_2Context attributes_2() {
			return getRuleContext(Attributes_2Context.class,0);
		}
		public InvariantContext invariant() {
			return getRuleContext(InvariantContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Com_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCom_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Com_statementContext com_statement() throws RecognitionException {
		Com_statementContext _localctx = new Com_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_com_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(476); attributes_2();
				}
				break;
			}
			setState(480);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(479); invariant();
				}
			}

			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (TRUE - 25)) | (1L << (FALSE - 25)) | (1L << (NIL - 25)) | (1L << (RETURN - 25)) | (1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (BREAK - 25)) | (1L << (CONTINUE - 25)) | (1L << (FORALL - 25)) | (1L << (SEMICOLON - 25)) | (1L << (L_BRACKET - 25)) | (1L << (L_BRACE - 25)) | (1L << (L_ANGLE_BRACKET - 25)) | (1L << (ADD - 25)) | (1L << (SUB - 25)) | (1L << (MUL - 25)) | (1L << (NOT - 25)) | (1L << (EXIST - 25)) | (1L << (ADDR - 25)) | (1L << (CHAR - 25)) | (1L << (STRING - 25)) | (1L << (AT_STR - 25)) | (1L << (INTEGER - 25)) | (1L << (REAL - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				{
				setState(482); statement();
				}
				}
				setState(487);
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

	public static class InvariantContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public TerminalNode INVARIANT() { return getToken(BStarParser.INVARIANT, 0); }
		public InvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitInvariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_invariant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); match(INVARIANT);
			setState(489); pro_e();
			setState(490); match(SEMICOLON);
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
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public Continue_statContext continue_stat() {
			return getRuleContext(Continue_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Break_statContext break_stat() {
			return getRuleContext(Break_statContext.class,0);
		}
		public Statement_atContext statement_at() {
			return getRuleContext(Statement_atContext.class,0);
		}
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public Element_takeContext element_take() {
			return getRuleContext(Element_takeContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_statement);
		int _la;
		try {
			setState(519);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493); assign_stat();
				setState(494); match(SEMICOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496); element_take();
				setState(497); match(SEMICOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(499); function_call();
				setState(500); match(SEMICOLON);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(502); return_stat();
				setState(503); match(SEMICOLON);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(505); while_stat();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(506); if_stat();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(507); match(L_BRACE);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (TRUE - 25)) | (1L << (FALSE - 25)) | (1L << (NIL - 25)) | (1L << (RETURN - 25)) | (1L << (IF - 25)) | (1L << (WHILE - 25)) | (1L << (BREAK - 25)) | (1L << (CONTINUE - 25)) | (1L << (FORALL - 25)) | (1L << (SEMICOLON - 25)) | (1L << (L_BRACKET - 25)) | (1L << (L_BRACE - 25)) | (1L << (L_ANGLE_BRACKET - 25)) | (1L << (ADD - 25)) | (1L << (SUB - 25)) | (1L << (MUL - 25)) | (1L << (NOT - 25)) | (1L << (EXIST - 25)) | (1L << (ADDR - 25)) | (1L << (CHAR - 25)) | (1L << (STRING - 25)) | (1L << (AT_STR - 25)) | (1L << (INTEGER - 25)) | (1L << (REAL - 25)) | (1L << (ID - 25)))) != 0)) {
					{
					{
					setState(508); statement();
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(514); match(R_BRACE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(515); element();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(516); break_stat();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(517); continue_stat();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(518); statement_at();
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

	public static class Element_takeContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Element_takeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_take; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitElement_take(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_takeContext element_take() throws RecognitionException {
		Element_takeContext _localctx = new Element_takeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_element_take);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); term();
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

	public static class Break_statContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(BStarParser.BREAK, 0); }
		public Break_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitBreak_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statContext break_stat() throws RecognitionException {
		Break_statContext _localctx = new Break_statContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_break_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); match(BREAK);
			setState(524); match(SEMICOLON);
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

	public static class Continue_statContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(BStarParser.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(BStarParser.CONTINUE, 0); }
		public Continue_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitContinue_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statContext continue_stat() throws RecognitionException {
		Continue_statContext _localctx = new Continue_statContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_continue_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526); match(CONTINUE);
			setState(527); match(SEMICOLON);
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

	public static class Assign_statContext extends ParserRuleContext {
		public TerminalNode ADDRGET(int i) {
			return getToken(BStarParser.ADDRGET, i);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public List<TerminalNode> POINT() { return getTokens(BStarParser.POINT); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Point_idContext point_id() {
			return getRuleContext(Point_idContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode POINT(int i) {
			return getToken(BStarParser.POINT, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(BStarParser.ASSIGNMENT, 0); }
		public List<TerminalNode> ADDRGET() { return getTokens(BStarParser.ADDRGET); }
		public Assign_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAssign_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statContext assign_stat() throws RecognitionException {
		Assign_statContext _localctx = new Assign_statContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assign_stat);
		int _la;
		try {
			setState(545);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529); point_id();
				setState(530); match(ASSIGNMENT);
				setState(531); element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533); point_id();
				setState(538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(538);
					switch (_input.LA(1)) {
					case POINT:
						{
						setState(534); match(POINT);
						setState(535); id();
						}
						break;
					case ADDRGET:
						{
						setState(536); match(ADDRGET);
						setState(537); id();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(540); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==POINT || _la==ADDRGET );
				setState(542); match(ASSIGNMENT);
				setState(543); element();
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

	public static class Return_statContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BStarParser.RETURN, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitReturn_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_return_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); match(RETURN);
			setState(549);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (TRUE - 25)) | (1L << (FALSE - 25)) | (1L << (NIL - 25)) | (1L << (FORALL - 25)) | (1L << (L_BRACKET - 25)) | (1L << (L_BRACE - 25)) | (1L << (L_ANGLE_BRACKET - 25)) | (1L << (ADD - 25)) | (1L << (SUB - 25)) | (1L << (MUL - 25)) | (1L << (NOT - 25)) | (1L << (EXIST - 25)) | (1L << (ADDR - 25)) | (1L << (CHAR - 25)) | (1L << (STRING - 25)) | (1L << (INTEGER - 25)) | (1L << (REAL - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				setState(548); element();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(BStarParser.WHILE, 0); }
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); match(WHILE);
			setState(552); match(L_BRACKET);
			setState(553); pro_e();
			setState(554); match(R_BRACKET);
			setState(555); statement();
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

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode IF() { return getToken(BStarParser.IF, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_statContext else_stat() {
			return getRuleContext(Else_statContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557); match(IF);
			setState(558); match(L_BRACKET);
			setState(559); pro_e();
			setState(560); match(R_BRACKET);
			setState(561); statement();
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(562); else_stat();
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

	public static class Else_statContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BStarParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitElse_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statContext else_stat() throws RecognitionException {
		Else_statContext _localctx = new Else_statContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_else_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); match(ELSE);
			setState(566); statement();
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

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(BStarParser.DEFINE, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); match(DEFINE);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(BStarParser.INCLUDE, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); match(INCLUDE);
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

	public static class PointContext extends ParserRuleContext {
		public TerminalNode POINT() { return getToken(BStarParser.POINT, 0); }
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572); match(POINT);
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

	public static class BelongContext extends ParserRuleContext {
		public TerminalNode BELONG() { return getToken(BStarParser.BELONG, 0); }
		public BelongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belong; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitBelong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BelongContext belong() throws RecognitionException {
		BelongContext _localctx = new BelongContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_belong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); match(BELONG);
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

	public static class Not_belongContext extends ParserRuleContext {
		public TerminalNode NOTBELONG() { return getToken(BStarParser.NOTBELONG, 0); }
		public Not_belongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_belong; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitNot_belong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_belongContext not_belong() throws RecognitionException {
		Not_belongContext _localctx = new Not_belongContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_not_belong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576); match(NOTBELONG);
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

	public static class Addr_getContext extends ParserRuleContext {
		public TerminalNode ADDRGET() { return getToken(BStarParser.ADDRGET, 0); }
		public Addr_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addr_get; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAddr_get(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Addr_getContext addr_get() throws RecognitionException {
		Addr_getContext _localctx = new Addr_getContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_addr_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578); match(ADDRGET);
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

	public static class NilContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(BStarParser.NIL, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580); match(NIL);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BStarParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582); match(ID);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BStarParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); match(STRING);
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

	public static class At_strContext extends ParserRuleContext {
		public TerminalNode AT_STR() { return getToken(BStarParser.AT_STR, 0); }
		public At_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAt_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final At_strContext at_str() throws RecognitionException {
		At_strContext _localctx = new At_strContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_at_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); match(AT_STR);
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

	public static class True_strContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(BStarParser.TRUE, 0); }
		public True_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTrue_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_strContext true_str() throws RecognitionException {
		True_strContext _localctx = new True_strContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_true_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); match(TRUE);
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

	public static class False_strContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(BStarParser.FALSE, 0); }
		public False_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitFalse_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final False_strContext false_str() throws RecognitionException {
		False_strContext _localctx = new False_strContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_false_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590); match(FALSE);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BStarParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592); match(INTEGER);
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

	public static class RealContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(BStarParser.REAL, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594); match(REAL);
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

	public static class Char_strContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(BStarParser.CHAR, 0); }
		public Char_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitChar_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_strContext char_str() throws RecognitionException {
		Char_strContext _localctx = new Char_strContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_char_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596); match(CHAR);
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

	public static class Statement_atContext extends ParserRuleContext {
		public TerminalNode AT_STR() { return getToken(BStarParser.AT_STR, 0); }
		public Statement_atContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_at; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitStatement_at(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_atContext statement_at() throws RecognitionException {
		Statement_atContext _localctx = new Statement_atContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_statement_at);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598); match(AT_STR);
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

	public static class Belong_pairContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public BelongContext belong() {
			return getRuleContext(BelongContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Belong_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belong_pair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitBelong_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Belong_pairContext belong_pair() throws RecognitionException {
		Belong_pairContext _localctx = new Belong_pairContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_belong_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(600); id();
				}
				break;
			case INTEGER:
				{
				setState(601); integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(604); belong();
			setState(605); element();
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

	public static class Term_latterContext extends ParserRuleContext {
		public MseContext mse() {
			return getRuleContext(MseContext.class,0);
		}
		public TerminalNode POINT() { return getToken(BStarParser.POINT, 0); }
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public BelongContext belong() {
			return getRuleContext(BelongContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<Belong_pairContext> belong_pair() {
			return getRuleContexts(Belong_pairContext.class);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public Belong_pairContext belong_pair(int i) {
			return getRuleContext(Belong_pairContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public TerminalNode ADDRGET() { return getToken(BStarParser.ADDRGET, 0); }
		public Not_belongContext not_belong() {
			return getRuleContext(Not_belongContext.class,0);
		}
		public Term_latterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_latter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTerm_latter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_latterContext term_latter() throws RecognitionException {
		Term_latterContext _localctx = new Term_latterContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_term_latter);
		int _la;
		try {
			setState(628);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607); match(POINT);
				setState(608); match(L_ANGLE_BRACKET);
				setState(609); belong_pair();
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(610); match(COMMA);
					setState(611); belong_pair();
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(617); match(R_ANGLE_BRACKET);
				setState(620);
				switch (_input.LA(1)) {
				case BELONG:
					{
					setState(618); belong();
					}
					break;
				case NOTBELONG:
					{
					setState(619); not_belong();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(622); mse();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624); match(POINT);
				setState(625); id();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(626); match(ADDRGET);
				setState(627); id();
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

	public static class Term_element_commaContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BStarParser.COMMA, 0); }
		public Term_element_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_element_comma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTerm_element_comma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_element_commaContext term_element_comma() throws RecognitionException {
		Term_element_commaContext _localctx = new Term_element_commaContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_term_element_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630); match(COMMA);
			setState(631); element();
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

	public static class Term_setContext extends ParserRuleContext {
		public TerminalNode R_BRACE() { return getToken(BStarParser.R_BRACE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode L_BRACE() { return getToken(BStarParser.L_BRACE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Term_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTerm_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_setContext term_set() throws RecognitionException {
		Term_setContext _localctx = new Term_setContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_term_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); match(L_BRACE);
			setState(634); element();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(635); match(COMMA);
				setState(636); element();
				}
				}
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(642); match(R_BRACE);
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

	public static class Term_tupleContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Term_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_tuple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTerm_tuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_tupleContext term_tuple() throws RecognitionException {
		Term_tupleContext _localctx = new Term_tupleContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_term_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644); match(L_ANGLE_BRACKET);
			setState(645); element();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(646); match(COMMA);
				setState(647); element();
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653); match(R_ANGLE_BRACKET);
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

	public static class TermContext extends ParserRuleContext {
		public Term_latterContext term_latter(int i) {
			return getRuleContext(Term_latterContext.class,i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public True_strContext true_str() {
			return getRuleContext(True_strContext.class,0);
		}
		public Term_setContext term_set() {
			return getRuleContext(Term_setContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Char_strContext char_str() {
			return getRuleContext(Char_strContext.class,0);
		}
		public False_strContext false_str() {
			return getRuleContext(False_strContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public List<Term_latterContext> term_latter() {
			return getRuleContexts(Term_latterContext.class);
		}
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public Term_tupleContext term_tuple() {
			return getRuleContext(Term_tupleContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(655); nil();
				}
				break;

			case 2:
				{
				setState(656); string();
				}
				break;

			case 3:
				{
				setState(657); true_str();
				}
				break;

			case 4:
				{
				setState(658); false_str();
				}
				break;

			case 5:
				{
				setState(659); integer();
				}
				break;

			case 6:
				{
				setState(660); real();
				}
				break;

			case 7:
				{
				setState(661); char_str();
				}
				break;

			case 8:
				{
				setState(662); term_set();
				}
				break;

			case 9:
				{
				setState(663); term_tuple();
				}
				break;

			case 10:
				{
				setState(664); function_call();
				}
				break;

			case 11:
				{
				setState(665); id();
				}
				break;

			case 12:
				{
				setState(666); match(L_BRACKET);
				setState(667); element();
				setState(668); match(R_BRACKET);
				}
				break;
			}
			setState(675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(672); term_latter();
					}
					} 
				}
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class One_eContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(BStarParser.NOT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public One_eContext one_e() {
			return getRuleContext(One_eContext.class,0);
		}
		public TerminalNode ADDR() { return getToken(BStarParser.ADDR, 0); }
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
		public One_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitOne_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_eContext one_e() throws RecognitionException {
		One_eContext _localctx = new One_eContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_one_e);
		try {
			setState(685);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(678); match(NOT);
				setState(679); one_e();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(680); match(MUL);
				setState(681); one_e();
				}
				break;
			case ADDR:
				enterOuterAlt(_localctx, 3);
				{
				setState(682); match(ADDR);
				setState(683); one_e();
				}
				break;
			case TRUE:
			case FALSE:
			case NIL:
			case L_BRACKET:
			case L_BRACE:
			case L_ANGLE_BRACKET:
			case CHAR:
			case STRING:
			case INTEGER:
			case REAL:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(684); term();
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

	public static class Unary_eContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public One_eContext one_e() {
			return getRuleContext(One_eContext.class,0);
		}
		public TerminalNode SUB() { return getToken(BStarParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(BStarParser.ADD, 0); }
		public Unary_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitUnary_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_eContext unary_e() throws RecognitionException {
		Unary_eContext _localctx = new Unary_eContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unary_e);
		int _la;
		try {
			setState(690);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(688); term();
				}
				break;
			case TRUE:
			case FALSE:
			case NIL:
			case L_BRACKET:
			case L_BRACE:
			case L_ANGLE_BRACKET:
			case MUL:
			case NOT:
			case ADDR:
			case CHAR:
			case STRING:
			case INTEGER:
			case REAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(689); one_e();
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

	public static class Mse_0Context extends ParserRuleContext {
		public Unary_eContext unary_e() {
			return getRuleContext(Unary_eContext.class,0);
		}
		public Mse_0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mse_0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMse_0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mse_0Context mse_0() throws RecognitionException {
		Mse_0Context _localctx = new Mse_0Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_mse_0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692); unary_e();
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

	public static class Mse_1_latterContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(BStarParser.UNION, 0); }
		public Mse_0Context mse_0() {
			return getRuleContext(Mse_0Context.class,0);
		}
		public TerminalNode INTER() { return getToken(BStarParser.INTER, 0); }
		public TerminalNode MOD() { return getToken(BStarParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(BStarParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(BStarParser.MUL, 0); }
		public Mse_1_latterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mse_1_latter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMse_1_latter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mse_1_latterContext mse_1_latter() throws RecognitionException {
		Mse_1_latterContext _localctx = new Mse_1_latterContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_mse_1_latter);
		try {
			setState(704);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(694); match(MUL);
				setState(695); mse_0();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(696); match(DIV);
				setState(697); mse_0();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(698); match(MOD);
				setState(699); mse_0();
				}
				break;
			case INTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(700); match(INTER);
				setState(701); mse_0();
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 5);
				{
				setState(702); match(UNION);
				setState(703); mse_0();
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

	public static class Mse_1Context extends ParserRuleContext {
		public List<Mse_1_latterContext> mse_1_latter() {
			return getRuleContexts(Mse_1_latterContext.class);
		}
		public Mse_1_latterContext mse_1_latter(int i) {
			return getRuleContext(Mse_1_latterContext.class,i);
		}
		public Mse_0Context mse_0() {
			return getRuleContext(Mse_0Context.class,0);
		}
		public Mse_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mse_1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMse_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mse_1Context mse_1() throws RecognitionException {
		Mse_1Context _localctx = new Mse_1Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_mse_1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706); mse_0();
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(707); mse_1_latter();
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class Mse_latterContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(BStarParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(BStarParser.ADD, 0); }
		public TerminalNode DIFFER() { return getToken(BStarParser.DIFFER, 0); }
		public Mse_1Context mse_1() {
			return getRuleContext(Mse_1Context.class,0);
		}
		public Mse_latterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mse_latter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMse_latter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mse_latterContext mse_latter() throws RecognitionException {
		Mse_latterContext _localctx = new Mse_latterContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_mse_latter);
		try {
			setState(719);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(713); match(ADD);
				setState(714); mse_1();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(715); match(SUB);
				setState(716); mse_1();
				}
				break;
			case DIFFER:
				enterOuterAlt(_localctx, 3);
				{
				setState(717); match(DIFFER);
				setState(718); mse_1();
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

	public static class MseContext extends ParserRuleContext {
		public List<Mse_latterContext> mse_latter() {
			return getRuleContexts(Mse_latterContext.class);
		}
		public Mse_latterContext mse_latter(int i) {
			return getRuleContext(Mse_latterContext.class,i);
		}
		public Mse_1Context mse_1() {
			return getRuleContext(Mse_1Context.class,0);
		}
		public MseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitMse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MseContext mse() throws RecognitionException {
		MseContext _localctx = new MseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_mse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(721); mse_1();
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(722); mse_latter();
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class Condition_termContext extends ParserRuleContext {
		public MseContext mse() {
			return getRuleContext(MseContext.class,0);
		}
		public Condition_term_latterContext condition_term_latter() {
			return getRuleContext(Condition_term_latterContext.class,0);
		}
		public Condition_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCondition_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_termContext condition_term() throws RecognitionException {
		Condition_termContext _localctx = new Condition_termContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_condition_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728); mse();
			setState(730);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(729); condition_term_latter();
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

	public static class Condition_term_latterContext extends ParserRuleContext {
		public MseContext mse() {
			return getRuleContext(MseContext.class,0);
		}
		public TerminalNode EGRE() { return getToken(BStarParser.EGRE, 0); }
		public TerminalNode UEQU() { return getToken(BStarParser.UEQU, 0); }
		public TerminalNode NOTBELONG() { return getToken(BStarParser.NOTBELONG, 0); }
		public TerminalNode R_ANGLE_BRACKET() { return getToken(BStarParser.R_ANGLE_BRACKET, 0); }
		public TerminalNode ELES() { return getToken(BStarParser.ELES, 0); }
		public TerminalNode EQU() { return getToken(BStarParser.EQU, 0); }
		public TerminalNode L_ANGLE_BRACKET() { return getToken(BStarParser.L_ANGLE_BRACKET, 0); }
		public TerminalNode BELONG() { return getToken(BStarParser.BELONG, 0); }
		public Condition_term_latterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_term_latter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitCondition_term_latter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_term_latterContext condition_term_latter() throws RecognitionException {
		Condition_term_latterContext _localctx = new Condition_term_latterContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_condition_term_latter);
		try {
			setState(748);
			switch (_input.LA(1)) {
			case L_ANGLE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(732); match(L_ANGLE_BRACKET);
				setState(733); mse();
				}
				break;
			case ELES:
				enterOuterAlt(_localctx, 2);
				{
				setState(734); match(ELES);
				setState(735); mse();
				}
				break;
			case R_ANGLE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(736); match(R_ANGLE_BRACKET);
				setState(737); mse();
				}
				break;
			case EGRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(738); match(EGRE);
				setState(739); mse();
				}
				break;
			case NOTBELONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(740); match(NOTBELONG);
				setState(741); mse();
				}
				break;
			case BELONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(742); match(BELONG);
				setState(743); mse();
				}
				break;
			case EQU:
				enterOuterAlt(_localctx, 7);
				{
				setState(744); match(EQU);
				setState(745); mse();
				}
				break;
			case UEQU:
				enterOuterAlt(_localctx, 8);
				{
				setState(746); match(UEQU);
				setState(747); mse();
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BStarParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BStarParser.COMMA, i);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_id_list);
		int _la;
		try {
			setState(769);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(750); id();
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(751); match(COMMA);
					setState(752); id();
					}
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(758); match(L_BRACKET);
				setState(759); id();
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(760); match(COMMA);
					setState(761); id();
					}
					}
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(767); match(R_BRACKET);
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

	public static class Quan_eContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(BStarParser.R_BRACKET, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(BStarParser.L_BRACKET, 0); }
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public TerminalNode EXIST() { return getToken(BStarParser.EXIST, 0); }
		public TerminalNode FORALL() { return getToken(BStarParser.FORALL, 0); }
		public Imp_pro_eContext imp_pro_e() {
			return getRuleContext(Imp_pro_eContext.class,0);
		}
		public Quan_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quan_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitQuan_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quan_eContext quan_e() throws RecognitionException {
		Quan_eContext _localctx = new Quan_eContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_quan_e);
		try {
			setState(783);
			switch (_input.LA(1)) {
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(771); match(EXIST);
				setState(772); id_list();
				setState(773); match(L_BRACKET);
				setState(774); pro_e();
				setState(775); match(R_BRACKET);
				}
				break;
			case FORALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(777); match(FORALL);
				setState(778); id_list();
				setState(779); match(L_BRACKET);
				setState(780); imp_pro_e();
				setState(781); match(R_BRACKET);
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

	public static class Pro_term_eContext extends ParserRuleContext {
		public Condition_termContext condition_term() {
			return getRuleContext(Condition_termContext.class,0);
		}
		public Quan_eContext quan_e() {
			return getRuleContext(Quan_eContext.class,0);
		}
		public Pro_term_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pro_term_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPro_term_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pro_term_eContext pro_term_e() throws RecognitionException {
		Pro_term_eContext _localctx = new Pro_term_eContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_pro_term_e);
		try {
			setState(787);
			switch (_input.LA(1)) {
			case FORALL:
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(785); quan_e();
				}
				break;
			case TRUE:
			case FALSE:
			case NIL:
			case L_BRACKET:
			case L_BRACE:
			case L_ANGLE_BRACKET:
			case ADD:
			case SUB:
			case MUL:
			case NOT:
			case ADDR:
			case CHAR:
			case STRING:
			case INTEGER:
			case REAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(786); condition_term();
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

	public static class And_pro_eContext extends ParserRuleContext {
		public Pro_term_eContext pro_term_e(int i) {
			return getRuleContext(Pro_term_eContext.class,i);
		}
		public TerminalNode CONJUNCTION(int i) {
			return getToken(BStarParser.CONJUNCTION, i);
		}
		public List<TerminalNode> CONJUNCTION() { return getTokens(BStarParser.CONJUNCTION); }
		public List<Pro_term_eContext> pro_term_e() {
			return getRuleContexts(Pro_term_eContext.class);
		}
		public And_pro_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_pro_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitAnd_pro_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_pro_eContext and_pro_e() throws RecognitionException {
		And_pro_eContext _localctx = new And_pro_eContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_and_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789); pro_term_e();
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJUNCTION) {
				{
				{
				setState(790); match(CONJUNCTION);
				setState(791); pro_term_e();
				}
				}
				setState(796);
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

	public static class Or_pro_eContext extends ParserRuleContext {
		public List<TerminalNode> DISJUNCTION() { return getTokens(BStarParser.DISJUNCTION); }
		public List<And_pro_eContext> and_pro_e() {
			return getRuleContexts(And_pro_eContext.class);
		}
		public TerminalNode DISJUNCTION(int i) {
			return getToken(BStarParser.DISJUNCTION, i);
		}
		public And_pro_eContext and_pro_e(int i) {
			return getRuleContext(And_pro_eContext.class,i);
		}
		public Or_pro_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_pro_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitOr_pro_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_pro_eContext or_pro_e() throws RecognitionException {
		Or_pro_eContext _localctx = new Or_pro_eContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_or_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); and_pro_e();
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJUNCTION) {
				{
				{
				setState(798); match(DISJUNCTION);
				setState(799); and_pro_e();
				}
				}
				setState(804);
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

	public static class Imp_pro_eContext extends ParserRuleContext {
		public TerminalNode IMPLICATION() { return getToken(BStarParser.IMPLICATION, 0); }
		public Or_pro_eContext or_pro_e(int i) {
			return getRuleContext(Or_pro_eContext.class,i);
		}
		public List<Or_pro_eContext> or_pro_e() {
			return getRuleContexts(Or_pro_eContext.class);
		}
		public Imp_pro_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp_pro_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitImp_pro_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imp_pro_eContext imp_pro_e() throws RecognitionException {
		Imp_pro_eContext _localctx = new Imp_pro_eContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_imp_pro_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805); or_pro_e();
			setState(806); match(IMPLICATION);
			setState(807); or_pro_e();
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

	public static class Pro_eContext extends ParserRuleContext {
		public TerminalNode IMPLICATION(int i) {
			return getToken(BStarParser.IMPLICATION, i);
		}
		public List<TerminalNode> IMPLICATION() { return getTokens(BStarParser.IMPLICATION); }
		public Or_pro_eContext or_pro_e(int i) {
			return getRuleContext(Or_pro_eContext.class,i);
		}
		public List<Or_pro_eContext> or_pro_e() {
			return getRuleContexts(Or_pro_eContext.class);
		}
		public Pro_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pro_e; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitPro_e(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pro_eContext pro_e() throws RecognitionException {
		Pro_eContext _localctx = new Pro_eContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_pro_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809); or_pro_e();
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPLICATION) {
				{
				{
				setState(810); match(IMPLICATION);
				setState(811); or_pro_e();
				}
				}
				setState(816);
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

	public static class ElementContext extends ParserRuleContext {
		public Pro_eContext pro_e() {
			return getRuleContext(Pro_eContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BStarVisitor ) return ((BStarVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817); pro_e();
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3S\u0336\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\5\2\u00aa\n\2\3\2\3\2\5\2\u00ae\n\2\3\2\5\2\u00b1\n\2\3\2\5\2\u00b4"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\5\3\u00bb\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u00c4\n\4\3\4\3\4\6\4\u00c8\n\4\r\4\16\4\u00c9\3\5\3\5\5\5\u00ce\n\5"+
		"\3\5\3\5\3\6\6\6\u00d3\n\6\r\6\16\6\u00d4\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00dd\n\7\3\b\3\b\3\b\5\b\u00e2\n\b\3\b\3\b\5\b\u00e6\n\b\3\t\3\t\3\t"+
		"\3\t\7\t\u00ec\n\t\f\t\16\t\u00ef\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00fd\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u0109\n\n\f\n\16\n\u010c\13\n\3\13\3\13\6\13\u0110\n\13\r\13\16\13"+
		"\u0111\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\6\16\u0121"+
		"\n\16\r\16\16\16\u0122\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\6\20\u012d"+
		"\n\20\r\20\16\20\u012e\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u0139"+
		"\n\22\r\22\16\22\u013a\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0144\n"+
		"\23\5\23\u0146\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0162\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0169\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u0171\n\26\f\26\16\26\u0174\13\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u017d\n\27\f\27\16\27\u0180\13"+
		"\27\7\27\u0182\n\27\f\27\16\27\u0185\13\27\3\27\3\27\3\30\3\30\3\30\5"+
		"\30\u018c\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0195\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u019e\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\6\33\u01a6\n\33\r\33\16\33\u01a7\3\34\3\34\3\34\3\34\3\34\3\34\6"+
		"\34\u01b0\n\34\r\34\16\34\u01b1\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01ba"+
		"\n\35\f\35\16\35\u01bd\13\35\5\35\u01bf\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u01c6\n\36\3\37\3\37\3\37\7\37\u01cb\n\37\f\37\16\37\u01ce\13\37"+
		"\5\37\u01d0\n\37\3 \3 \3 \3 \7 \u01d6\n \f \16 \u01d9\13 \3 \3 \3!\3!"+
		"\3\"\5\"\u01e0\n\"\3\"\5\"\u01e3\n\"\3\"\7\"\u01e6\n\"\f\"\16\"\u01e9"+
		"\13\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7"+
		"$\u0200\n$\f$\16$\u0203\13$\3$\3$\3$\3$\3$\5$\u020a\n$\3%\3%\3&\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\6(\u021d\n(\r(\16(\u021e\3(\3"+
		"(\3(\5(\u0224\n(\3)\3)\5)\u0228\n)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\5+\u0236\n+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\5=\u025d\n=\3=\3=\3=\3>\3>\3>\3>\3>\7>\u0267\n>\f>\16"+
		">\u026a\13>\3>\3>\3>\5>\u026f\n>\3>\3>\3>\3>\3>\3>\5>\u0277\n>\3?\3?\3"+
		"?\3@\3@\3@\3@\7@\u0280\n@\f@\16@\u0283\13@\3@\3@\3A\3A\3A\3A\7A\u028b"+
		"\nA\fA\16A\u028e\13A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\5B\u02a1\nB\3B\7B\u02a4\nB\fB\16B\u02a7\13B\3C\3C\3C\3C\3C\3C\3C\5C"+
		"\u02b0\nC\3D\3D\3D\5D\u02b5\nD\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F"+
		"\u02c3\nF\3G\3G\7G\u02c7\nG\fG\16G\u02ca\13G\3H\3H\3H\3H\3H\3H\5H\u02d2"+
		"\nH\3I\3I\7I\u02d6\nI\fI\16I\u02d9\13I\3J\3J\5J\u02dd\nJ\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u02ef\nK\3L\3L\3L\7L\u02f4\nL\f"+
		"L\16L\u02f7\13L\3L\3L\3L\3L\7L\u02fd\nL\fL\16L\u0300\13L\3L\3L\5L\u0304"+
		"\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0312\nM\3N\3N\5N\u0316\nN"+
		"\3O\3O\3O\7O\u031b\nO\fO\16O\u031e\13O\3P\3P\3P\7P\u0323\nP\fP\16P\u0326"+
		"\13P\3Q\3Q\3Q\3Q\3R\3R\3R\7R\u032f\nR\fR\16R\u0332\13R\3S\3S\3S\2T\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\2\3"+
		"\3\2\64\65\u0360\2\u00a6\3\2\2\2\4\u00ba\3\2\2\2\6\u00c7\3\2\2\2\b\u00cb"+
		"\3\2\2\2\n\u00d2\3\2\2\2\f\u00dc\3\2\2\2\16\u00e1\3\2\2\2\20\u00fc\3\2"+
		"\2\2\22\u00fe\3\2\2\2\24\u010d\3\2\2\2\26\u0113\3\2\2\2\30\u011c\3\2\2"+
		"\2\32\u0120\3\2\2\2\34\u0124\3\2\2\2\36\u012a\3\2\2\2 \u0130\3\2\2\2\""+
		"\u0138\3\2\2\2$\u0145\3\2\2\2&\u0161\3\2\2\2(\u0163\3\2\2\2*\u016a\3\2"+
		"\2\2,\u0177\3\2\2\2.\u0188\3\2\2\2\60\u0194\3\2\2\2\62\u019d\3\2\2\2\64"+
		"\u019f\3\2\2\2\66\u01a9\3\2\2\28\u01be\3\2\2\2:\u01c0\3\2\2\2<\u01cf\3"+
		"\2\2\2>\u01d1\3\2\2\2@\u01dc\3\2\2\2B\u01df\3\2\2\2D\u01ea\3\2\2\2F\u0209"+
		"\3\2\2\2H\u020b\3\2\2\2J\u020d\3\2\2\2L\u0210\3\2\2\2N\u0223\3\2\2\2P"+
		"\u0225\3\2\2\2R\u0229\3\2\2\2T\u022f\3\2\2\2V\u0237\3\2\2\2X\u023a\3\2"+
		"\2\2Z\u023c\3\2\2\2\\\u023e\3\2\2\2^\u0240\3\2\2\2`\u0242\3\2\2\2b\u0244"+
		"\3\2\2\2d\u0246\3\2\2\2f\u0248\3\2\2\2h\u024a\3\2\2\2j\u024c\3\2\2\2l"+
		"\u024e\3\2\2\2n\u0250\3\2\2\2p\u0252\3\2\2\2r\u0254\3\2\2\2t\u0256\3\2"+
		"\2\2v\u0258\3\2\2\2x\u025c\3\2\2\2z\u0276\3\2\2\2|\u0278\3\2\2\2~\u027b"+
		"\3\2\2\2\u0080\u0286\3\2\2\2\u0082\u02a0\3\2\2\2\u0084\u02af\3\2\2\2\u0086"+
		"\u02b4\3\2\2\2\u0088\u02b6\3\2\2\2\u008a\u02c2\3\2\2\2\u008c\u02c4\3\2"+
		"\2\2\u008e\u02d1\3\2\2\2\u0090\u02d3\3\2\2\2\u0092\u02da\3\2\2\2\u0094"+
		"\u02ee\3\2\2\2\u0096\u0303\3\2\2\2\u0098\u0311\3\2\2\2\u009a\u0315\3\2"+
		"\2\2\u009c\u0317\3\2\2\2\u009e\u031f\3\2\2\2\u00a0\u0327\3\2\2\2\u00a2"+
		"\u032b\3\2\2\2\u00a4\u0333\3\2\2\2\u00a6\u00a7\7\3\2\2\u00a7\u00a9\5f"+
		"\64\2\u00a8\u00aa\5\6\4\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00b0\3\2\2\2\u00ab\u00ad\7\5\2\2\u00ac\u00ae\5\"\22\2\u00ad\u00ac\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\5\n\6\2\u00b0"+
		"\u00ab\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b4\5\4"+
		"\3\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\7\7\2\2\u00b6\3\3\2\2\2\u00b7\u00bb\5\24\13\2\u00b8\u00bb\5\30"+
		"\r\2\u00b9\u00bb\5\36\20\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\5\3\2\2\2\u00bc\u00c3\5Z.\2\u00bd\u00c4\5h\65\2\u00be"+
		"\u00bf\7\62\2\2\u00bf\u00c0\5f\64\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\7"+
		"\63\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00bc\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\7\3\2\2\2\u00cb\u00cd\7\5\2\2\u00cc\u00ce\5\"\22\2\u00cd\u00cc\3\2\2"+
		"\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5\n\6\2\u00d0\t"+
		"\3\2\2\2\u00d1\u00d3\5\f\7\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\13\3\2\2\2\u00d6\u00d7\5\20\t"+
		"\2\u00d7\u00d8\7-\2\2\u00d8\u00dd\3\2\2\2\u00d9\u00da\5\22\n\2\u00da\u00db"+
		"\7-\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd"+
		"\r\3\2\2\2\u00de\u00df\7\66\2\2\u00df\u00e2\5\60\31\2\u00e0\u00e2\5f\64"+
		"\2\u00e1\u00de\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e4"+
		"\7H\2\2\u00e4\u00e6\5\u00a4S\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2"+
		"\u00e6\17\3\2\2\2\u00e7\u00e8\5$\23\2\u00e8\u00ed\5\16\b\2\u00e9\u00ea"+
		"\7*\2\2\u00ea\u00ec\5\16\b\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00fd\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f1\7&\2\2\u00f1\u00f2\5,\27\2\u00f2\u00f3\5f\64\2\u00f3"+
		"\u00fd\3\2\2\2\u00f4\u00f5\7&\2\2\u00f5\u00f6\5$\23\2\u00f6\u00f7\5\60"+
		"\31\2\u00f7\u00fd\3\2\2\2\u00f8\u00f9\7&\2\2\u00f9\u00fa\5*\26\2\u00fa"+
		"\u00fb\5\60\31\2\u00fb\u00fd\3\2\2\2\u00fc\u00e7\3\2\2\2\u00fc\u00f0\3"+
		"\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd\21\3\2\2\2\u00fe"+
		"\u00ff\7\31\2\2\u00ff\u0100\5$\23\2\u0100\u0101\5\60\31\2\u0101\u0102"+
		"\7H\2\2\u0102\u010a\5\u00a4S\2\u0103\u0104\7*\2\2\u0104\u0105\5\60\31"+
		"\2\u0105\u0106\7H\2\2\u0106\u0107\5\u00a4S\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0103\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\23\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\7\6\2\2\u010e\u0110"+
		"\5\26\f\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2"+
		"\u0111\u0112\3\2\2\2\u0112\25\3\2\2\2\u0113\u0114\5$\23\2\u0114\u0115"+
		"\5\60\31\2\u0115\u0116\7.\2\2\u0116\u0117\58\35\2\u0117\u0118\7/\2\2\u0118"+
		"\u0119\7\60\2\2\u0119\u011a\5B\"\2\u011a\u011b\7\61\2\2\u011b\27\3\2\2"+
		"\2\u011c\u011d\7\6\2\2\u011d\u011e\5\32\16\2\u011e\31\3\2\2\2\u011f\u0121"+
		"\5\34\17\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\33\3\2\2\2\u0124\u0125\5$\23\2\u0125\u0126"+
		"\5\60\31\2\u0126\u0127\7.\2\2\u0127\u0128\58\35\2\u0128\u0129\7/\2\2\u0129"+
		"\35\3\2\2\2\u012a\u012c\7\6\2\2\u012b\u012d\5 \21\2\u012c\u012b\3\2\2"+
		"\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\37"+
		"\3\2\2\2\u0130\u0131\5\34\17\2\u0131\u0132\5\64\33\2\u0132\u0133\5\66"+
		"\34\2\u0133!\3\2\2\2\u0134\u0135\5X-\2\u0135\u0136\5f\64\2\u0136\u0137"+
		"\5\u00a4S\2\u0137\u0139\3\2\2\2\u0138\u0134\3\2\2\2\u0139\u013a\3\2\2"+
		"\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b#\3\2\2\2\u013c\u0146"+
		"\5&\24\2\u013d\u0146\5(\25\2\u013e\u0143\5f\64\2\u013f\u0140\7\62\2\2"+
		"\u0140\u0141\5$\23\2\u0141\u0142\7\63\2\2\u0142\u0144\3\2\2\2\u0143\u013f"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u013c\3\2\2\2\u0145"+
		"\u013d\3\2\2\2\u0145\u013e\3\2\2\2\u0146%\3\2\2\2\u0147\u0162\7\r\2\2"+
		"\u0148\u0149\7\32\2\2\u0149\u0162\7\r\2\2\u014a\u0162\7\16\2\2\u014b\u014c"+
		"\7\32\2\2\u014c\u0162\7\16\2\2\u014d\u0162\7\17\2\2\u014e\u014f\7\32\2"+
		"\2\u014f\u0162\7\17\2\2\u0150\u0151\7\17\2\2\u0151\u0162\7\17\2\2\u0152"+
		"\u0153\7\32\2\2\u0153\u0154\7\17\2\2\u0154\u0162\7\17\2\2\u0155\u0162"+
		"\7\22\2\2\u0156\u0157\7\32\2\2\u0157\u0162\7\22\2\2\u0158\u0162\7\20\2"+
		"\2\u0159\u015a\7\32\2\2\u015a\u0162\7\20\2\2\u015b\u0162\7\21\2\2\u015c"+
		"\u015d\7\32\2\2\u015d\u0162\7\21\2\2\u015e\u0162\7\23\2\2\u015f\u0162"+
		"\7\24\2\2\u0160\u0162\7\37\2\2\u0161\u0147\3\2\2\2\u0161\u0148\3\2\2\2"+
		"\u0161\u014a\3\2\2\2\u0161\u014b\3\2\2\2\u0161\u014d\3\2\2\2\u0161\u014e"+
		"\3\2\2\2\u0161\u0150\3\2\2\2\u0161\u0152\3\2\2\2\u0161\u0155\3\2\2\2\u0161"+
		"\u0156\3\2\2\2\u0161\u0158\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u015b\3\2"+
		"\2\2\u0161\u015c\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0160\3\2\2\2\u0162\'\3\2\2\2\u0163\u0164\7\25\2\2\u0164\u0165\7\62\2"+
		"\2\u0165\u0166\5$\23\2\u0166\u0168\7\63\2\2\u0167\u0169\5j\66\2\u0168"+
		"\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169)\3\2\2\2\u016a\u016b\7\36\2\2"+
		"\u016b\u0172\7\60\2\2\u016c\u016d\5$\23\2\u016d\u016e\5\60\31\2\u016e"+
		"\u016f\7-\2\2\u016f\u0171\3\2\2\2\u0170\u016c\3\2\2\2\u0171\u0174\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0176\7\61\2\2\u0176+\3\2\2\2\u0177\u0178\7\30\2"+
		"\2\u0178\u0183\7\60\2\2\u0179\u017e\5.\30\2\u017a\u017b\7*\2\2\u017b\u017d"+
		"\5.\30\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0179\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7\61\2\2\u0187-\3\2\2\2"+
		"\u0188\u018b\5f\64\2\u0189\u018a\7H\2\2\u018a\u018c\5\u0086D\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c/\3\2\2\2\u018d\u018e\7\66\2\2\u018e"+
		"\u0195\5\60\31\2\u018f\u0195\5f\64\2\u0190\u0191\7.\2\2\u0191\u0192\5"+
		"\60\31\2\u0192\u0193\7/\2\2\u0193\u0195\3\2\2\2\u0194\u018d\3\2\2\2\u0194"+
		"\u018f\3\2\2\2\u0194\u0190\3\2\2\2\u0195\61\3\2\2\2\u0196\u0197\7J\2\2"+
		"\u0197\u019e\5\62\32\2\u0198\u019e\5f\64\2\u0199\u019a\7.\2\2\u019a\u019b"+
		"\5\62\32\2\u019b\u019c\7/\2\2\u019c\u019e\3\2\2\2\u019d\u0196\3\2\2\2"+
		"\u019d\u0198\3\2\2\2\u019d\u0199\3\2\2\2\u019e\63\3\2\2\2\u019f\u01a5"+
		"\7\n\2\2\u01a0\u01a1\7\13\2\2\u01a1\u01a2\5\u00a2R\2\u01a2\u01a3\7\f\2"+
		"\2\u01a3\u01a4\5\u00a2R\2\u01a4\u01a6\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\65\3\2\2"+
		"\2\u01a9\u01af\7\t\2\2\u01aa\u01ab\7\13\2\2\u01ab\u01ac\5\u00a2R\2\u01ac"+
		"\u01ad\7\f\2\2\u01ad\u01ae\5\u00a2R\2\u01ae\u01b0\3\2\2\2\u01af\u01aa"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\67\3\2\2\2\u01b3\u01b4\5$\23\2\u01b4\u01bb\5\60\31\2\u01b5\u01b6\7*\2"+
		"\2\u01b6\u01b7\5$\23\2\u01b7\u01b8\5\60\31\2\u01b8\u01ba\3\2\2\2\u01b9"+
		"\u01b5\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01b3\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf9\3\2\2\2\u01c0\u01c1\5f\64\2\u01c1\u01c2\7.\2\2\u01c2"+
		"\u01c3\5<\37\2\u01c3\u01c5\7/\2\2\u01c4\u01c6\5> \2\u01c5\u01c4\3\2\2"+
		"\2\u01c5\u01c6\3\2\2\2\u01c6;\3\2\2\2\u01c7\u01cc\5\u00a4S\2\u01c8\u01c9"+
		"\7*\2\2\u01c9\u01cb\5\u00a4S\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2"+
		"\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0=\3\2\2\2\u01d1"+
		"\u01d2\7,\2\2\u01d2\u01d7\5f\64\2\u01d3\u01d4\7*\2\2\u01d4\u01d6\5f\64"+
		"\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\7,\2\2\u01db"+
		"?\3\2\2\2\u01dc\u01dd\5\n\6\2\u01ddA\3\2\2\2\u01de\u01e0\5@!\2\u01df\u01de"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\5D#\2\u01e2"+
		"\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e7\3\2\2\2\u01e4\u01e6\5F"+
		"$\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8C\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\7\4\2\2"+
		"\u01eb\u01ec\5\u00a2R\2\u01ec\u01ed\7-\2\2\u01edE\3\2\2\2\u01ee\u020a"+
		"\7-\2\2\u01ef\u01f0\5N(\2\u01f0\u01f1\7-\2\2\u01f1\u020a\3\2\2\2\u01f2"+
		"\u01f3\5H%\2\u01f3\u01f4\7-\2\2\u01f4\u020a\3\2\2\2\u01f5\u01f6\5:\36"+
		"\2\u01f6\u01f7\7-\2\2\u01f7\u020a\3\2\2\2\u01f8\u01f9\5P)\2\u01f9\u01fa"+
		"\7-\2\2\u01fa\u020a\3\2\2\2\u01fb\u020a\5R*\2\u01fc\u020a\5T+\2\u01fd"+
		"\u0201\7\60\2\2\u01fe\u0200\5F$\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0204\u020a\7\61\2\2\u0205\u020a\5\u00a4S\2\u0206\u020a"+
		"\5J&\2\u0207\u020a\5L\'\2\u0208\u020a\5v<\2\u0209\u01ee\3\2\2\2\u0209"+
		"\u01ef\3\2\2\2\u0209\u01f2\3\2\2\2\u0209\u01f5\3\2\2\2\u0209\u01f8\3\2"+
		"\2\2\u0209\u01fb\3\2\2\2\u0209\u01fc\3\2\2\2\u0209\u01fd\3\2\2\2\u0209"+
		"\u0205\3\2\2\2\u0209\u0206\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2"+
		"\2\2\u020aG\3\2\2\2\u020b\u020c\5\u0082B\2\u020cI\3\2\2\2\u020d\u020e"+
		"\7$\2\2\u020e\u020f\7-\2\2\u020fK\3\2\2\2\u0210\u0211\7%\2\2\u0211\u0212"+
		"\7-\2\2\u0212M\3\2\2\2\u0213\u0214\5\60\31\2\u0214\u0215\7H\2\2\u0215"+
		"\u0216\5\u00a4S\2\u0216\u0224\3\2\2\2\u0217\u021c\5\60\31\2\u0218\u0219"+
		"\7+\2\2\u0219\u021d\5f\64\2\u021a\u021b\7I\2\2\u021b\u021d\5f\64\2\u021c"+
		"\u0218\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021c\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7H\2\2\u0221"+
		"\u0222\5\u00a4S\2\u0222\u0224\3\2\2\2\u0223\u0213\3\2\2\2\u0223\u0217"+
		"\3\2\2\2\u0224O\3\2\2\2\u0225\u0227\7 \2\2\u0226\u0228\5\u00a4S\2\u0227"+
		"\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228Q\3\2\2\2\u0229\u022a\7#\2\2\u022a"+
		"\u022b\7.\2\2\u022b\u022c\5\u00a2R\2\u022c\u022d\7/\2\2\u022d\u022e\5"+
		"F$\2\u022eS\3\2\2\2\u022f\u0230\7!\2\2\u0230\u0231\7.\2\2\u0231\u0232"+
		"\5\u00a2R\2\u0232\u0233\7/\2\2\u0233\u0235\5F$\2\u0234\u0236\5V,\2\u0235"+
		"\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236U\3\2\2\2\u0237\u0238\7\"\2\2"+
		"\u0238\u0239\5F$\2\u0239W\3\2\2\2\u023a\u023b\7(\2\2\u023bY\3\2\2\2\u023c"+
		"\u023d\7\b\2\2\u023d[\3\2\2\2\u023e\u023f\7+\2\2\u023f]\3\2\2\2\u0240"+
		"\u0241\7C\2\2\u0241_\3\2\2\2\u0242\u0243\7D\2\2\u0243a\3\2\2\2\u0244\u0245"+
		"\7I\2\2\u0245c\3\2\2\2\u0246\u0247\7\35\2\2\u0247e\3\2\2\2\u0248\u0249"+
		"\7P\2\2\u0249g\3\2\2\2\u024a\u024b\7L\2\2\u024bi\3\2\2\2\u024c\u024d\7"+
		"M\2\2\u024dk\3\2\2\2\u024e\u024f\7\33\2\2\u024fm\3\2\2\2\u0250\u0251\7"+
		"\34\2\2\u0251o\3\2\2\2\u0252\u0253\7N\2\2\u0253q\3\2\2\2\u0254\u0255\7"+
		"O\2\2\u0255s\3\2\2\2\u0256\u0257\7K\2\2\u0257u\3\2\2\2\u0258\u0259\7M"+
		"\2\2\u0259w\3\2\2\2\u025a\u025d\5f\64\2\u025b\u025d\5p9\2\u025c\u025a"+
		"\3\2\2\2\u025c\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\5^\60\2\u025f"+
		"\u0260\5\u00a4S\2\u0260y\3\2\2\2\u0261\u0262\7+\2\2\u0262\u0263\7\62\2"+
		"\2\u0263\u0268\5x=\2\u0264\u0265\7*\2\2\u0265\u0267\5x=\2\u0266\u0264"+
		"\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026e\7\63\2\2\u026c\u026f\5"+
		"^\60\2\u026d\u026f\5`\61\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0271\5\u0090I\2\u0271\u0277\3\2\2\2\u0272\u0273"+
		"\7+\2\2\u0273\u0277\5f\64\2\u0274\u0275\7I\2\2\u0275\u0277\5f\64\2\u0276"+
		"\u0261\3\2\2\2\u0276\u0272\3\2\2\2\u0276\u0274\3\2\2\2\u0277{\3\2\2\2"+
		"\u0278\u0279\7*\2\2\u0279\u027a\5\u00a4S\2\u027a}\3\2\2\2\u027b\u027c"+
		"\7\60\2\2\u027c\u0281\5\u00a4S\2\u027d\u027e\7*\2\2\u027e\u0280\5\u00a4"+
		"S\2\u027f\u027d\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0284\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\7\61"+
		"\2\2\u0285\177\3\2\2\2\u0286\u0287\7\62\2\2\u0287\u028c\5\u00a4S\2\u0288"+
		"\u0289\7*\2\2\u0289\u028b\5\u00a4S\2\u028a\u0288\3\2\2\2\u028b\u028e\3"+
		"\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e"+
		"\u028c\3\2\2\2\u028f\u0290\7\63\2\2\u0290\u0081\3\2\2\2\u0291\u02a1\5"+
		"d\63\2\u0292\u02a1\5h\65\2\u0293\u02a1\5l\67\2\u0294\u02a1\5n8\2\u0295"+
		"\u02a1\5p9\2\u0296\u02a1\5r:\2\u0297\u02a1\5t;\2\u0298\u02a1\5~@\2\u0299"+
		"\u02a1\5\u0080A\2\u029a\u02a1\5:\36\2\u029b\u02a1\5f\64\2\u029c\u029d"+
		"\7.\2\2\u029d\u029e\5\u00a4S\2\u029e\u029f\7/\2\2\u029f\u02a1\3\2\2\2"+
		"\u02a0\u0291\3\2\2\2\u02a0\u0292\3\2\2\2\u02a0\u0293\3\2\2\2\u02a0\u0294"+
		"\3\2\2\2\u02a0\u0295\3\2\2\2\u02a0\u0296\3\2\2\2\u02a0\u0297\3\2\2\2\u02a0"+
		"\u0298\3\2\2\2\u02a0\u0299\3\2\2\2\u02a0\u029a\3\2\2\2\u02a0\u029b\3\2"+
		"\2\2\u02a0\u029c\3\2\2\2\u02a1\u02a5\3\2\2\2\u02a2\u02a4\5z>\2\u02a3\u02a2"+
		"\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u0083\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\79\2\2\u02a9\u02b0\5\u0084"+
		"C\2\u02aa\u02ab\7\66\2\2\u02ab\u02b0\5\u0084C\2\u02ac\u02ad\7J\2\2\u02ad"+
		"\u02b0\5\u0084C\2\u02ae\u02b0\5\u0082B\2\u02af\u02a8\3\2\2\2\u02af\u02aa"+
		"\3\2\2\2\u02af\u02ac\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0\u0085\3\2\2\2\u02b1"+
		"\u02b2\t\2\2\2\u02b2\u02b5\5\u0082B\2\u02b3\u02b5\5\u0084C\2\u02b4\u02b1"+
		"\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5\u0087\3\2\2\2\u02b6\u02b7\5\u0086D"+
		"\2\u02b7\u0089\3\2\2\2\u02b8\u02b9\7\66\2\2\u02b9\u02c3\5\u0088E\2\u02ba"+
		"\u02bb\7\67\2\2\u02bb\u02c3\5\u0088E\2\u02bc\u02bd\78\2\2\u02bd\u02c3"+
		"\5\u0088E\2\u02be\u02bf\7E\2\2\u02bf\u02c3\5\u0088E\2\u02c0\u02c1\7F\2"+
		"\2\u02c1\u02c3\5\u0088E\2\u02c2\u02b8\3\2\2\2\u02c2\u02ba\3\2\2\2\u02c2"+
		"\u02bc\3\2\2\2\u02c2\u02be\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u008b\3\2"+
		"\2\2\u02c4\u02c8\5\u0088E\2\u02c5\u02c7\5\u008aF\2\u02c6\u02c5\3\2\2\2"+
		"\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u008d"+
		"\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\7\64\2\2\u02cc\u02d2\5\u008c"+
		"G\2\u02cd\u02ce\7\65\2\2\u02ce\u02d2\5\u008cG\2\u02cf\u02d0\7G\2\2\u02d0"+
		"\u02d2\5\u008cG\2\u02d1\u02cb\3\2\2\2\u02d1\u02cd\3\2\2\2\u02d1\u02cf"+
		"\3\2\2\2\u02d2\u008f\3\2\2\2\u02d3\u02d7\5\u008cG\2\u02d4\u02d6\5\u008e"+
		"H\2\u02d5\u02d4\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u0091\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02dc\5\u0090"+
		"I\2\u02db\u02dd\5\u0094K\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u0093\3\2\2\2\u02de\u02df\7\62\2\2\u02df\u02ef\5\u0090I\2\u02e0\u02e1"+
		"\7?\2\2\u02e1\u02ef\5\u0090I\2\u02e2\u02e3\7\63\2\2\u02e3\u02ef\5\u0090"+
		"I\2\u02e4\u02e5\7>\2\2\u02e5\u02ef\5\u0090I\2\u02e6\u02e7\7D\2\2\u02e7"+
		"\u02ef\5\u0090I\2\u02e8\u02e9\7C\2\2\u02e9\u02ef\5\u0090I\2\u02ea\u02eb"+
		"\7@\2\2\u02eb\u02ef\5\u0090I\2\u02ec\u02ed\7A\2\2\u02ed\u02ef\5\u0090"+
		"I\2\u02ee\u02de\3\2\2\2\u02ee\u02e0\3\2\2\2\u02ee\u02e2\3\2\2\2\u02ee"+
		"\u02e4\3\2\2\2\u02ee\u02e6\3\2\2\2\u02ee\u02e8\3\2\2\2\u02ee\u02ea\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ef\u0095\3\2\2\2\u02f0\u02f5\5f\64\2\u02f1"+
		"\u02f2\7*\2\2\u02f2\u02f4\5f\64\2\u02f3\u02f1\3\2\2\2\u02f4\u02f7\3\2"+
		"\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u0304\3\2\2\2\u02f7"+
		"\u02f5\3\2\2\2\u02f8\u02f9\7.\2\2\u02f9\u02fe\5f\64\2\u02fa\u02fb\7*\2"+
		"\2\u02fb\u02fd\5f\64\2\u02fc\u02fa\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc"+
		"\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02fe\3\2\2\2\u0301"+
		"\u0302\7/\2\2\u0302\u0304\3\2\2\2\u0303\u02f0\3\2\2\2\u0303\u02f8\3\2"+
		"\2\2\u0304\u0097\3\2\2\2\u0305\u0306\7=\2\2\u0306\u0307\5\u0096L\2\u0307"+
		"\u0308\7.\2\2\u0308\u0309\5\u00a2R\2\u0309\u030a\7/\2\2\u030a\u0312\3"+
		"\2\2\2\u030b\u030c\7)\2\2\u030c\u030d\5\u0096L\2\u030d\u030e\7.\2\2\u030e"+
		"\u030f\5\u00a0Q\2\u030f\u0310\7/\2\2\u0310\u0312\3\2\2\2\u0311\u0305\3"+
		"\2\2\2\u0311\u030b\3\2\2\2\u0312\u0099\3\2\2\2\u0313\u0316\5\u0098M\2"+
		"\u0314\u0316\5\u0092J\2\u0315\u0313\3\2\2\2\u0315\u0314\3\2\2\2\u0316"+
		"\u009b\3\2\2\2\u0317\u031c\5\u009aN\2\u0318\u0319\7:\2\2\u0319\u031b\5"+
		"\u009aN\2\u031a\u0318\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2"+
		"\u031c\u031d\3\2\2\2\u031d\u009d\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0324"+
		"\5\u009cO\2\u0320\u0321\7;\2\2\u0321\u0323\5\u009cO\2\u0322\u0320\3\2"+
		"\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u009f\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u0328\5\u009eP\2\u0328\u0329"+
		"\7<\2\2\u0329\u032a\5\u009eP\2\u032a\u00a1\3\2\2\2\u032b\u0330\5\u009e"+
		"P\2\u032c\u032d\7<\2\2\u032d\u032f\5\u009eP\2\u032e\u032c\3\2\2\2\u032f"+
		"\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u00a3\3\2"+
		"\2\2\u0332\u0330\3\2\2\2\u0333\u0334\5\u00a2R\2\u0334\u00a5\3\2\2\2I\u00a9"+
		"\u00ad\u00b0\u00b3\u00ba\u00c3\u00c9\u00cd\u00d4\u00dc\u00e1\u00e5\u00ed"+
		"\u00fc\u010a\u0111\u0122\u012e\u013a\u0143\u0145\u0161\u0168\u0172\u017e"+
		"\u0183\u018b\u0194\u019d\u01a7\u01b1\u01bb\u01be\u01c5\u01cc\u01cf\u01d7"+
		"\u01df\u01e2\u01e7\u0201\u0209\u021c\u021e\u0223\u0227\u0235\u025c\u0268"+
		"\u026e\u0276\u0281\u028c\u02a0\u02a5\u02af\u02b4\u02c2\u02c8\u02d1\u02d7"+
		"\u02dc\u02ee\u02f5\u02fe\u0303\u0311\u0315\u031c\u0324\u0330";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}