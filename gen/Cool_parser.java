// Generated from E:/Computer Engineering & Communications/4 - Computer Engineering Fourth Year/2nd Term/Compilers/ParserProject/src\Cool_parser.g4.g4 by ANTLR 4.8


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
public class Cool_parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INHERITS=1, CLASS=2, NEW=3, SELF=4, IF=5, THEN=6, ELSE=7, FI=8, CASE=9,
		OF=10, ESAC=11, WHILE=12, LOOP=13, POOL=14, LET=15, IN=16, INTEGER=17,
		LITERAL=18, TYPE=19, ID=20, ASSIGN_OPERATOR=21, CASE_ARROW=22, EQUAL=23,
		SMALLER_THAN=24, BIGGER_THAN=25, LESS_THAN_OR_EQUAL=26, PLUS=27, MINUS=28,
		DIVIDE=29, MULTIPLY=30, INTEGER_NEGATIVE=31, WHITESPACE=32, NEWLINE=33,
		OPEN_COMMENT=34, CLOSE_COMMENT=35, COMMENT=36, ONE_LINE_COMMENT=37, OPEN_CURLY=38,
		CLOSE_CURLY=39, OPENP_PRANSIS=40, CLOSE_PRANSIS=41, OPEN_SQUARE=42, CLOSE_SQUARE=43,
		SEMICOLUN=44, COLUN=45, COMMA=46, DOT=47, AT=48, ERROR=49, ISVOID=50,
		NOT=51, TRUE=52, FALSE=53, IDENTIFIER=54, LARROW=55, LBRACE=56, LE=57,
		LPAREN=58, LT=59, RARROW=60, RBRACE=61, RPAREN=62, SEMI=63, STRING=64,
		TILDE=65, TIMES=66;
	public static final int
		RULE_program = 0, RULE_programBlocks = 1, RULE_classDefine = 2, RULE_featureList = 3,
		RULE_feature = 4, RULE_method = 5, RULE_property = 6, RULE_formalList = 7,
		RULE_formal = 8, RULE_branch_list = 9, RULE_branch_entity = 10, RULE_e_list = 11,
		RULE_expr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programBlocks", "classDefine", "featureList", "feature",
			"method", "property", "formalList", "formal", "branch_list", "branch_entity",
			"e_list", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, "'<-'", "'=>'",
			"'='", "'<'", "'>'", "'<='", "'+'", "'-'", "'/'", "'*'", "'~'", null,
			null, "'(*'", "'*)'", null, null, "'{'", "'}'", "'('", "')'", "'['",
			"']'", "';'", "':'", "','", "'.'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INHERITS", "CLASS", "NEW", "SELF", "IF", "THEN", "ELSE", "FI",
			"CASE", "OF", "ESAC", "WHILE", "LOOP", "POOL", "LET", "IN", "INTEGER",
			"LITERAL", "TYPE", "ID", "ASSIGN_OPERATOR", "CASE_ARROW", "EQUAL", "SMALLER_THAN",
			"BIGGER_THAN", "LESS_THAN_OR_EQUAL", "PLUS", "MINUS", "DIVIDE", "MULTIPLY",
			"INTEGER_NEGATIVE", "WHITESPACE", "NEWLINE", "OPEN_COMMENT", "CLOSE_COMMENT",
			"COMMENT", "ONE_LINE_COMMENT", "OPEN_CURLY", "CLOSE_CURLY", "OPENP_PRANSIS",
			"CLOSE_PRANSIS", "OPEN_SQUARE", "CLOSE_SQUARE", "SEMICOLUN", "COLUN",
			"COMMA", "DOT", "AT", "ERROR", "ISVOID", "NOT", "TRUE", "FALSE", "IDENTIFIER",
			"LARROW", "LBRACE", "LE", "LPAREN", "LT", "RARROW", "RBRACE", "RPAREN",
			"SEMI", "STRING", "TILDE", "TIMES"
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

	/**
	 {@link #getTokenNames()} getter function.

	 @returns Token Name.
	 */
	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	/**
	{@link #getVocabulary()} getter function.

	@returns VOCABULARY.
     */
	@Override
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	/**
	 {@link #getGrammarFileName()} getter function.

	 @returns File Name of grammer.
	 */
	@Override
	public String getGrammarFileName() { return "Cool_parser.g4.g4"; }

	/**
	 {@link #getRuleNames()} getter function.

	 @returns Name of Rule type.
	 */
	@Override
	public String[] getRuleNames() { return ruleNames; }

	/**
	 {@link #getSerializedATN()} getter function.

	 @returns _serializedATN.
	 */
	@Override
	public String getSerializedATN() { return _serializedATN; }

	/**
	 {@link #getATN()} getter function.

	 @returns ATNDeserializer().deserialize(_serializedATN.toCharArray());.
	 */
	@Override
	public ATN getATN() { return _ATN; }

	/**
	 Constructor of class {@link #Cool_parser} .

	 @param input TokenStream class object.
	 @returns Interpret it into ParserATNSimulator .
	 */
	public Cool_parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public AST.Program obj;
		public ProgramBlocksContext blocks;
		public ProgramBlocksContext programBlocks() {
			return getRuleContext(ProgramBlocksContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((ProgramContext)_localctx).blocks = programBlocks();

			        ((ProgramContext)_localctx).obj =  new AST.Program(((ProgramContext)_localctx).blocks.obj, ((ProgramContext)_localctx).blocks.obj.get(0).lineNo);


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

	public static class ProgramBlocksContext extends ParserRuleContext {
		public ArrayList<AST.Block> obj;
		public ProgramBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlocks; }

		public ProgramBlocksContext() { }
		public void copyFrom(ProgramBlocksContext ctx) {
			super.copyFrom(ctx);
			this.obj = ctx.obj;
		}
	}
	public static class ClassesContext extends ProgramBlocksContext {
		public ClassDefineContext def;
		public List<TerminalNode> SEMICOLUN() { return getTokens(Cool_parser.SEMICOLUN); }
		public TerminalNode SEMICOLUN(int i) {
			return getToken(Cool_parser.SEMICOLUN, i);
		}
		public List<ClassDefineContext> classDefine() {
			return getRuleContexts(ClassDefineContext.class);
		}
		public ClassDefineContext classDefine(int i) {
			return getRuleContext(ClassDefineContext.class,i);
		}
		public ClassesContext(ProgramBlocksContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitClasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitClasses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EOFContext extends ProgramBlocksContext {
		public TerminalNode EOF() { return getToken(Cool_parser.EOF, 0); }
		public EOFContext(ProgramBlocksContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterEOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitEOF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitEOF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBlocksContext programBlocks() throws RecognitionException {
		ProgramBlocksContext _localctx = new ProgramBlocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlocks);

				((ProgramBlocksContext)_localctx).obj =  new ArrayList<AST.Block>();
				_localctx.obj.add(new AST.Block("", "", new ArrayList<AST.Feature>(), 1));

		int _la;
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new ClassesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					((ClassesContext)_localctx).def = classDefine();
					_localctx.obj.add(((ClassesContext)_localctx).def.obj);
					setState(31);
					match(SEMICOLUN);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CLASS );
				}
				break;
			case EOF:
				_localctx = new EOFContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(EOF);
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

	public static class ClassDefineContext extends ParserRuleContext {
		public AST.Block obj;
		public Token def;
		public Token type;
		public FeatureListContext fl;
		public Token itype;
		public TerminalNode OPEN_CURLY() { return getToken(Cool_parser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(Cool_parser.CLOSE_CURLY, 0); }
		public TerminalNode CLASS() { return getToken(Cool_parser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(Cool_parser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(Cool_parser.TYPE, i);
		}
		public FeatureListContext featureList() {
			return getRuleContext(FeatureListContext.class,0);
		}
		public TerminalNode INHERITS() { return getToken(Cool_parser.INHERITS, 0); }
		public ClassDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterClassDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitClassDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitClassDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDefine);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((ClassDefineContext)_localctx).def = match(CLASS);
				setState(41);
				((ClassDefineContext)_localctx).type = match(TYPE);
				setState(42);
				match(OPEN_CURLY);
				setState(43);
				((ClassDefineContext)_localctx).fl = featureList();
				setState(44);
				match(CLOSE_CURLY);

				        ((ClassDefineContext)_localctx).obj =  new AST.Block(((ClassDefineContext)_localctx).type.getText(), "No_inherits", ((ClassDefineContext)_localctx).fl.obj, ((ClassDefineContext)_localctx).def.getLine());

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				((ClassDefineContext)_localctx).def = match(CLASS);
				setState(48);
				((ClassDefineContext)_localctx).type = match(TYPE);
				setState(49);
				match(INHERITS);
				setState(50);
				((ClassDefineContext)_localctx).itype = match(TYPE);
				setState(51);
				match(OPEN_CURLY);
				setState(52);
				((ClassDefineContext)_localctx).fl = featureList();
				setState(53);
				match(CLOSE_CURLY);

				        ((ClassDefineContext)_localctx).obj =  new AST.Block(((ClassDefineContext)_localctx).type.getText(), ((ClassDefineContext)_localctx).itype.getText(), ((ClassDefineContext)_localctx).fl.obj, ((ClassDefineContext)_localctx).def.getLine());

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

	public static class FeatureListContext extends ParserRuleContext {
		public ArrayList<AST.Feature> obj;
		public FeatureContext f;
		public List<TerminalNode> SEMICOLUN() { return getTokens(Cool_parser.SEMICOLUN); }
		public TerminalNode SEMICOLUN(int i) {
			return getToken(Cool_parser.SEMICOLUN, i);
		}
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public FeatureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterFeatureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitFeatureList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitFeatureList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureListContext featureList() throws RecognitionException {
		FeatureListContext _localctx = new FeatureListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_featureList);

		        ((FeatureListContext)_localctx).obj =  new ArrayList<AST.Feature>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(58);
				((FeatureListContext)_localctx).f = feature();
				_localctx.obj.add(((FeatureListContext)_localctx).f.obj);
				setState(60);
				match(SEMICOLUN);
				}
				}
				setState(66);
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

	public static class FeatureContext extends ParserRuleContext {
		public AST.Feature obj;
		public MethodContext m;
		public PropertyContext p;
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_feature);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((FeatureContext)_localctx).m = method();

				        ((FeatureContext)_localctx).obj =  ((FeatureContext)_localctx).m.obj;

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((FeatureContext)_localctx).p = property();

				        ((FeatureContext)_localctx).obj =  ((FeatureContext)_localctx).p.obj;

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

	public static class MethodContext extends ParserRuleContext {
		public AST.Method obj;
		public Token id;
		public Token type;
		public ExprContext e;
		public FormalListContext fl;
		public TerminalNode OPENP_PRANSIS() { return getToken(Cool_parser.OPENP_PRANSIS, 0); }
		public TerminalNode CLOSE_PRANSIS() { return getToken(Cool_parser.CLOSE_PRANSIS, 0); }
		public TerminalNode COLUN() { return getToken(Cool_parser.COLUN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(Cool_parser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(Cool_parser.CLOSE_CURLY, 0); }
		public TerminalNode ID() { return getToken(Cool_parser.ID, 0); }
		public TerminalNode TYPE() { return getToken(Cool_parser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				((MethodContext)_localctx).id = match(ID);
				setState(76);
				match(OPENP_PRANSIS);
				setState(77);
				match(CLOSE_PRANSIS);
				setState(78);
				match(COLUN);
				setState(79);
				((MethodContext)_localctx).type = match(TYPE);
				setState(80);
				match(OPEN_CURLY);
				setState(81);
				((MethodContext)_localctx).e = expr(0);
				setState(82);
				match(CLOSE_CURLY);

				        ((MethodContext)_localctx).obj =  new AST.Method(((MethodContext)_localctx).id.getText(), ((MethodContext)_localctx).type.getText(), new ArrayList<AST.Formal>(), ((MethodContext)_localctx).e.obj, ((MethodContext)_localctx).id.getLine());

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((MethodContext)_localctx).id = match(ID);
				setState(86);
				match(OPENP_PRANSIS);
				setState(87);
				((MethodContext)_localctx).fl = formalList();
				setState(88);
				match(CLOSE_PRANSIS);
				setState(89);
				match(COLUN);
				setState(90);
				((MethodContext)_localctx).type = match(TYPE);
				setState(91);
				match(OPEN_CURLY);
				setState(92);
				((MethodContext)_localctx).e = expr(0);
				setState(93);
				match(CLOSE_CURLY);

				        ((MethodContext)_localctx).obj =  new AST.Method(((MethodContext)_localctx).id.getText(), ((MethodContext)_localctx).type.getText(), ((MethodContext)_localctx).fl.obj, ((MethodContext)_localctx).e.obj, ((MethodContext)_localctx).id.getLine());

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

	public static class PropertyContext extends ParserRuleContext {
		public AST.Property obj;
		public Token id;
		public Token type;
		public ExprContext e;
		public TerminalNode COLUN() { return getToken(Cool_parser.COLUN, 0); }
		public TerminalNode ID() { return getToken(Cool_parser.ID, 0); }
		public TerminalNode TYPE() { return getToken(Cool_parser.TYPE, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(Cool_parser.ASSIGN_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Boolean flag = false;
			setState(99);
			((PropertyContext)_localctx).id = match(ID);
			setState(100);
			match(COLUN);
			setState(101);
			((PropertyContext)_localctx).type = match(TYPE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_OPERATOR) {
				{
				setState(102);
				match(ASSIGN_OPERATOR);
				setState(103);
				((PropertyContext)_localctx).e = expr(0);
				flag=true;
				}
			}


			      if(flag)
			        ((PropertyContext)_localctx).obj =  new AST.Property(((PropertyContext)_localctx).id.getText(), ((PropertyContext)_localctx).type.getText(), ((PropertyContext)_localctx).id.getLine(), ((PropertyContext)_localctx).e.obj);
			      else
			        ((PropertyContext)_localctx).obj =  new AST.Property(((PropertyContext)_localctx).id.getText(), ((PropertyContext)_localctx).type.getText(), ((PropertyContext)_localctx).id.getLine());

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

	public static class FormalListContext extends ParserRuleContext {
		public ArrayList<AST.Formal> obj;
		public FormalContext f;
		public FormalContext fi;
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Cool_parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Cool_parser.COMMA, i);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterFormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitFormalList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitFormalList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalList);

		        ((FormalListContext)_localctx).obj =  new ArrayList<AST.Formal>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((FormalListContext)_localctx).f = formal();
			_localctx.obj.add(((FormalListContext)_localctx).f.obj);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				((FormalListContext)_localctx).fi = formal();
				_localctx.obj.add(((FormalListContext)_localctx).fi.obj);
				}
				}
				setState(120);
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

	public static class FormalContext extends ParserRuleContext {
		public AST.Formal obj;
		public Token id;
		public Token type;
		public TerminalNode COLUN() { return getToken(Cool_parser.COLUN, 0); }
		public TerminalNode ID() { return getToken(Cool_parser.ID, 0); }
		public TerminalNode TYPE() { return getToken(Cool_parser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((FormalContext)_localctx).id = match(ID);
			setState(122);
			match(COLUN);
			setState(123);
			((FormalContext)_localctx).type = match(TYPE);

			        ((FormalContext)_localctx).obj =  new AST.Formal(((FormalContext)_localctx).id.getText(), ((FormalContext)_localctx).type.getText());

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

	public static class Branch_listContext extends ParserRuleContext {
		public ArrayList<AST.branch> obj;
		public Branch_entityContext b;
		public List<TerminalNode> SEMICOLUN() { return getTokens(Cool_parser.SEMICOLUN); }
		public TerminalNode SEMICOLUN(int i) {
			return getToken(Cool_parser.SEMICOLUN, i);
		}
		public List<Branch_entityContext> branch_entity() {
			return getRuleContexts(Branch_entityContext.class);
		}
		public Branch_entityContext branch_entity(int i) {
			return getRuleContext(Branch_entityContext.class,i);
		}
		public Branch_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterBranch_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitBranch_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitBranch_list(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 {@link #branch_list()}

	 @returns Branch_listContext class object .
	 */
	public final Branch_listContext branch_list() throws RecognitionException {
		Branch_listContext _localctx = new Branch_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_branch_list);

				((Branch_listContext)_localctx).obj =  new ArrayList<AST.branch>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				((Branch_listContext)_localctx).b = branch_entity();
				setState(127);
				match(SEMICOLUN);
				_localctx.obj.add(((Branch_listContext)_localctx).b.obj);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class Branch_entityContext extends ParserRuleContext {
		public AST.branch obj;
		public Token id;
		public Token type;
		public ExprContext ex;
		public TerminalNode COLUN() { return getToken(Cool_parser.COLUN, 0); }
		public TerminalNode CASE_ARROW() { return getToken(Cool_parser.CASE_ARROW, 0); }
		public TerminalNode ID() { return getToken(Cool_parser.ID, 0); }
		public TerminalNode TYPE() { return getToken(Cool_parser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Branch_entityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterBranch_entity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitBranch_entity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitBranch_entity(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 {@link #branch_entity()}  .

	 ]
	 @returns Branch_entityContext class object.
	 */
	public final Branch_entityContext branch_entity() throws RecognitionException {
		Branch_entityContext _localctx = new Branch_entityContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_branch_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((Branch_entityContext)_localctx).id = match(ID);
			setState(135);
			match(COLUN);
			setState(136);
			((Branch_entityContext)_localctx).type = match(TYPE);
			setState(137);
			match(CASE_ARROW);
			setState(138);
			((Branch_entityContext)_localctx).ex = expr(0);

						((Branch_entityContext)_localctx).obj =  new AST.branch(((Branch_entityContext)_localctx).id.getText(), ((Branch_entityContext)_localctx).type.getText(),((Branch_entityContext)_localctx).ex.obj, ((Branch_entityContext)_localctx).id.getLine());

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

	public static class E_listContext extends ParserRuleContext {
		public List<AST.Expression> obj;
		public ExprContext e;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Cool_parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Cool_parser.COMMA, i);
		}
		public E_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterE_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitE_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitE_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E_listContext e_list() throws RecognitionException {
		E_listContext _localctx = new E_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_e_list);

				((E_listContext)_localctx).obj =  new ArrayList<AST.Expression>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << INTEGER) | (1L << LITERAL) | (1L << ID) | (1L << INTEGER_NEGATIVE) | (1L << OPEN_CURLY) | (1L << OPENP_PRANSIS) | (1L << ISVOID) | (1L << NOT) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(141);
				((E_listContext)_localctx).e = expr(0);
				_localctx.obj.add(((E_listContext)_localctx).e.obj);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(143);
					match(COMMA);
					setState(144);
					((E_listContext)_localctx).e = expr(0);
					_localctx.obj.add(((E_listContext)_localctx).e.obj);
					}
					}
					setState(151);
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

	public static class ExprContext extends ParserRuleContext {
		public AST.Expression obj;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }

		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.obj = ctx.obj;
		}
	}
	public static class LetInContext extends ExprContext {
		public Token i1;
		public ExprContext e1;
		public Token i;
		public ExprContext e;
		public ExprContext e2;
		public TerminalNode LET() { return getToken(Cool_parser.LET, 0); }
		public List<TerminalNode> COLUN() { return getTokens(Cool_parser.COLUN); }
		public TerminalNode COLUN(int i) {
			return getToken(Cool_parser.COLUN, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(Cool_parser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(Cool_parser.TYPE, i);
		}
		public TerminalNode IN() { return getToken(Cool_parser.IN, 0); }
		public List<TerminalNode> ID() { return getTokens(Cool_parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Cool_parser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ASSIGN_OPERATOR() { return getTokens(Cool_parser.ASSIGN_OPERATOR); }
		public TerminalNode ASSIGN_OPERATOR(int i) {
			return getToken(Cool_parser.ASSIGN_OPERATOR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Cool_parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Cool_parser.COMMA, i);
		}
		public LetInContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterLetIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitLetIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitLetIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExprContext {
		public ExprContext expr1;
		public Token op;
		public ExprContext expr2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(Cool_parser.MINUS, 0); }
		public MinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DispatchContext extends ExprContext {
		public ExprContext expr1;
		public Token id;
		public E_listContext e;
		public TerminalNode DOT() { return getToken(Cool_parser.DOT, 0); }
		public TerminalNode OPENP_PRANSIS() { return getToken(Cool_parser.OPENP_PRANSIS, 0); }
		public TerminalNode CLOSE_PRANSIS() { return getToken(Cool_parser.CLOSE_PRANSIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Cool_parser.ID, 0); }
		public E_listContext e_list() {
			return getRuleContext(E_listContext.class,0);
		}
		public DispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public Token value;
		public TerminalNode LITERAL() { return getToken(Cool_parser.LITERAL, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidContext extends ExprContext {
		public ExprContext e;
		public TerminalNode ISVOID() { return getToken(Cool_parser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsvoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExprContext {
		public ExprContext expr1;
		public ExprContext expr2;
		public TerminalNode WHILE() { return getToken(Cool_parser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(Cool_parser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(Cool_parser.POOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessOREqualContext extends ExprContext {
		public ExprContext expr1;
		public Token op;
		public ExprContext expr2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(Cool_parser.LESS_THAN_OR_EQUAL, 0); }
		public LessOREqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterLessOREqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitLessOREqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitLessOREqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExprContext {
		public ExprContext expr1;
		public Token op;
		public ExprContext expr2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(Cool_parser.DIVIDE, 0); }
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeContext extends ExprContext {
		public Token op;
		public ExprContext expr2;
		public TerminalNode INTEGER_NEGATIVE() { return getToken(Cool_parser.INTEGER_NEGATIVE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegativeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNotContext extends ExprContext {
		public Token op;
		public ExprContext expr2;
		public TerminalNode NOT() { return getToken(Cool_parser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExprContext {
		public ExprContext exp;
		public TerminalNode OPEN_CURLY() { return getToken(Cool_parser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(Cool_parser.CLOSE_CURLY, 0); }
		public List<TerminalNode> SEMICOLUN() { return getTokens(Cool_parser.SEMICOLUN); }
		public TerminalNode SEMICOLUN(int i) {
			return getToken(Cool_parser.SEMICOLUN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public Token id;
		public TerminalNode ID() { return getToken(Cool_parser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExprContext {
		public ExprContext expr1;
		public Token op;
		public ExprContext expr2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(Cool_parser.MULTIPLY, 0); }
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ExprContext {
		public ExprContext expr1;
		public ExprContext expr2;
		public ExprContext expr3;
		public TerminalNode IF() { return getToken(Cool_parser.IF, 0); }
		public TerminalNode THEN() { return getToken(Cool_parser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(Cool_parser.ELSE, 0); }
		public TerminalNode FI() { return getToken(Cool_parser.FI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Own_dispatch_callContext extends ExprContext {
		public Token id;
		public E_listContext e;
		public TerminalNode OPENP_PRANSIS() { return getToken(Cool_parser.OPENP_PRANSIS, 0); }
		public TerminalNode CLOSE_PRANSIS() { return getToken(Cool_parser.CLOSE_PRANSIS, 0); }
		public TerminalNode ID() { return getToken(Cool_parser.ID, 0); }
		public E_listContext e_list() {
			return getRuleContext(E_listContext.class,0);
		}
		public Own_dispatch_callContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterOwn_dispatch_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitOwn_dispatch_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitOwn_dispatch_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends ExprContext {
		public ExprContext expr1;
		public Branch_listContext bl;
		public TerminalNode CASE() { return getToken(Cool_parser.CASE, 0); }
		public TerminalNode OF() { return getToken(Cool_parser.OF, 0); }
		public TerminalNode ESAC() { return getToken(Cool_parser.ESAC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		/**
		 @returns Obtain Rule Context given Branch_listContext.class .
		 */
		/**
		 * {@link #branch_list()} Obtain Rule Context given Branch_listContext.class .
		 *
		 * @returns getRuleContext(Branch_listContext.class,0)
		 */
		public Branch_listContext branch_list() {
			return getRuleContext(Branch_listContext.class,0);
		}
		/**
		 * {@link #CaseContext()} Copy from ctx .
		 *
		 * @param ctx ExprContext class object .
		 * @returns
		 */
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewContext extends ExprContext {
		public Token type;
		public TerminalNode NEW() { return getToken(Cool_parser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(Cool_parser.TYPE, 0); }
		public NewContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExprContext {
		public ExprContext expr1;
		public TerminalNode OPENP_PRANSIS() { return getToken(Cool_parser.OPENP_PRANSIS, 0); }
		public TerminalNode CLOSE_PRANSIS() { return getToken(Cool_parser.CLOSE_PRANSIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallerThanContext extends ExprContext {
		public ExprContext expr1;
		public Token op;
		public ExprContext expr2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SMALLER_THAN() { return getToken(Cool_parser.SMALLER_THAN, 0); }
		public SmallerThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterSmallerThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitSmallerThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitSmallerThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExprContext {
		public Token id;
		public Token op;
		public ExprContext expr1;
		public TerminalNode ID() { return getToken(Cool_parser.ID, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(Cool_parser.ASSIGN_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ExprContext {
		public Token bool;
		public TerminalNode FALSE() { return getToken(Cool_parser.FALSE, 0); }
		public FalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Static_dispatchContext extends ExprContext {
		public ExprContext expr1;
		public Token type;
		public Token id;
		public E_listContext e;
		public TerminalNode AT() { return getToken(Cool_parser.AT, 0); }
		public TerminalNode DOT() { return getToken(Cool_parser.DOT, 0); }
		public TerminalNode OPENP_PRANSIS() { return getToken(Cool_parser.OPENP_PRANSIS, 0); }
		public TerminalNode CLOSE_PRANSIS() { return getToken(Cool_parser.CLOSE_PRANSIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(Cool_parser.TYPE, 0); }
		public TerminalNode ID() { return getToken(Cool_parser.ID, 0); }
		public E_listContext e_list() {
			return getRuleContext(E_listContext.class,0);
		}
		public Static_dispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterStatic_dispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitStatic_dispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitStatic_dispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public Token value;
		public TerminalNode INTEGER() { return getToken(Cool_parser.INTEGER, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends ExprContext {
		public ExprContext expr1;
		public Token op;
		public ExprContext expr2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(Cool_parser.PLUS, 0); }
		public PlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ExprContext {
		public ExprContext expr1;
		public Token op;
		public ExprContext expr2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(Cool_parser.EQUAL, 0); }
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ExprContext {
		public Token bool;
		public TerminalNode TRUE() { return getToken(Cool_parser.TRUE, 0); }
		public TrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_parserListener ) ((Cool_parserListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_parserVisitor ) return ((Cool_parserVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155);
				((AssignmentContext)_localctx).id = match(ID);
				setState(156);
				((AssignmentContext)_localctx).op = match(ASSIGN_OPERATOR);
				setState(157);
				((AssignmentContext)_localctx).expr1 = expr(26);

				        ((AssignmentContext)_localctx).obj =  new AST.Assignment(((AssignmentContext)_localctx).id.getText(), ((AssignmentContext)_localctx).expr1.obj);

				}
				break;
			case 2:
				{
				_localctx = new Own_dispatch_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				((Own_dispatch_callContext)_localctx).id = match(ID);
				setState(161);
				match(OPENP_PRANSIS);
				setState(162);
				((Own_dispatch_callContext)_localctx).e = e_list();
				setState(163);
				match(CLOSE_PRANSIS);

				        ((Own_dispatch_callContext)_localctx).obj =  new AST.dispatch(new AST.no_expr(((Own_dispatch_callContext)_localctx).id.getLine()), ((Own_dispatch_callContext)_localctx).id.getText(), ((Own_dispatch_callContext)_localctx).e.obj, ((Own_dispatch_callContext)_localctx).id.getLine());

				}
				break;
			case 3:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(IF);
				setState(167);
				((IfContext)_localctx).expr1 = expr(0);
				setState(168);
				match(THEN);
				setState(169);
				((IfContext)_localctx).expr2 = expr(0);
				setState(170);
				match(ELSE);
				setState(171);
				((IfContext)_localctx).expr3 = expr(0);
				setState(172);
				match(FI);

				        ((IfContext)_localctx).obj =  new AST.If(((IfContext)_localctx).expr1.obj, ((IfContext)_localctx).expr2.obj, ((IfContext)_localctx).expr3.obj);

				}
				break;
			case 4:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(WHILE);
				setState(176);
				((WhileContext)_localctx).expr1 = expr(0);
				setState(177);
				match(LOOP);
				setState(178);
				((WhileContext)_localctx).expr2 = expr(0);
				setState(179);
				match(POOL);

				        ((WhileContext)_localctx).obj =  new AST.While(((WhileContext)_localctx).expr1.obj, ((WhileContext)_localctx).expr2.obj);

				}
				break;
			case 5:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(OPEN_CURLY);
				 ArrayList<AST.Expression> list = new ArrayList<AST.Expression>();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					((BlockContext)_localctx).exp = expr(0);
					setState(185);
					match(SEMICOLUN);
					list.add(((BlockContext)_localctx).exp.obj);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << INTEGER) | (1L << LITERAL) | (1L << ID) | (1L << INTEGER_NEGATIVE) | (1L << OPEN_CURLY) | (1L << OPENP_PRANSIS) | (1L << ISVOID) | (1L << NOT) | (1L << TRUE) | (1L << FALSE))) != 0) );
				setState(192);
				match(CLOSE_CURLY);

				        ((BlockContext)_localctx).obj =  new AST.BlockOfExpressions(list);

				}
				break;
			case 6:
				{
				_localctx = new LetInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				            ArrayList<AST.Expression> exprs = new ArrayList<>();
				            ArrayList<String> ids = new ArrayList<>();
				            ArrayList<Boolean> flags = new ArrayList<>();
				            Boolean flag;
				            AST.Expression ex;

				setState(196);
				match(LET);
				setState(197);
				((LetInContext)_localctx).i1 = match(ID);
				flag = false; ex = new AST.Expression(); ids.add(((LetInContext)_localctx).i1.getText());
				setState(199);
				match(COLUN);
				setState(200);
				match(TYPE);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OPERATOR) {
					{
					setState(201);
					match(ASSIGN_OPERATOR);
					setState(202);
					((LetInContext)_localctx).e1 = expr(0);
					flag = true; ex = ((LetInContext)_localctx).e1.obj;
					}
				}

				flags.add(flag); exprs.add(ex);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(208);
					match(COMMA);
					setState(209);
					((LetInContext)_localctx).i = match(ID);
					flag = false; ex = new AST.Expression(); ids.add(((LetInContext)_localctx).i.getText());
					setState(211);
					match(COLUN);
					setState(212);
					match(TYPE);
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN_OPERATOR) {
						{
						setState(213);
						match(ASSIGN_OPERATOR);
						setState(214);
						((LetInContext)_localctx).e = expr(0);
						flag = true; ex = ((LetInContext)_localctx).e.obj;
						}
					}

					flags.add(flag); exprs.add(ex);
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(IN);
				setState(226);
				((LetInContext)_localctx).e2 = expr(19);

				            ((LetInContext)_localctx).obj =  new AST.Let(flags, ids, exprs, ((LetInContext)_localctx).e2.obj);

				}
				break;
			case 7:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(CASE);
				setState(230);
				((CaseContext)_localctx).expr1 = expr(0);
				setState(231);
				match(OF);
				setState(232);
				((CaseContext)_localctx).bl = branch_list();
				setState(233);
				match(ESAC);

				        ((CaseContext)_localctx).obj =  new AST.Case(((CaseContext)_localctx).expr1.obj, ((CaseContext)_localctx).bl.obj, ((CaseContext)_localctx).expr1.obj.lineNo);

				}
				break;
			case 8:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(NEW);
				setState(237);
				((NewContext)_localctx).type = match(TYPE);

				        ((NewContext)_localctx).obj =  new AST.NewType(((NewContext)_localctx).type.getText());

				}
				break;
			case 9:
				{
				_localctx = new IsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(ISVOID);
				setState(240);
				((IsvoidContext)_localctx).e = expr(16);

				        ((IsvoidContext)_localctx).obj =  new AST.IsVoid(((IsvoidContext)_localctx).e.obj);

				}
				break;
			case 10:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				((NegativeContext)_localctx).op = match(INTEGER_NEGATIVE);
				setState(244);
				((NegativeContext)_localctx).expr2 = expr(11);

				           ((NegativeContext)_localctx).obj =  new AST.Arithmetic(
				                        ((NegativeContext)_localctx).expr2.obj,
				                        ((NegativeContext)_localctx).expr2.obj,
				                        ((NegativeContext)_localctx).op.getText());

				}
				break;
			case 11:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				((BoolNotContext)_localctx).op = match(NOT);
				setState(248);
				((BoolNotContext)_localctx).expr2 = expr(7);

				        ((BoolNotContext)_localctx).obj =  new AST.LogOp(((BoolNotContext)_localctx).expr2.obj, ((BoolNotContext)_localctx).op.getText());

				}
				break;
			case 12:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(OPENP_PRANSIS);
				setState(252);
				((ParenthesesContext)_localctx).expr1 = expr(0);
				setState(253);
				match(CLOSE_PRANSIS);

				        ((ParenthesesContext)_localctx).obj =  new AST.Parentheses(((ParenthesesContext)_localctx).expr1.obj);

				}
				break;
			case 13:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				((IdContext)_localctx).id = match(ID);

				        ((IdContext)_localctx).obj =  new AST.Id(((IdContext)_localctx).id.getText());

				}
				break;
			case 14:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				((IntContext)_localctx).value = match(INTEGER);

				        ((IntContext)_localctx).obj =  new AST.IntConst(Integer.parseInt(((IntContext)_localctx).value.getText()));

				}
				break;
			case 15:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				((StringContext)_localctx).value = match(LITERAL);

				        ((StringContext)_localctx).obj =  new AST.Literal(((StringContext)_localctx).value.getText());

				}
				break;
			case 16:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				((TrueContext)_localctx).bool = match(TRUE);

				        ((TrueContext)_localctx).obj =  new AST.Bool(((TrueContext)_localctx).bool.getText().toUpperCase());

				}
				break;
			case 17:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				((FalseContext)_localctx).bool = match(FALSE);

				        ((FalseContext)_localctx).obj =  new AST.Bool(((FalseContext)_localctx).bool.getText().toUpperCase());

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new ExprContext(_parentctx, _parentState));
						((PlusContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(269);
						((PlusContext)_localctx).op = match(PLUS);
						setState(270);
						((PlusContext)_localctx).expr2 = expr(16);

						                     ((PlusContext)_localctx).obj =  new AST.Arithmetic(
						                                  ((PlusContext)_localctx).expr1.obj,
						                                  ((PlusContext)_localctx).expr2.obj,
						                                  ((PlusContext)_localctx).op.getText());

						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new ExprContext(_parentctx, _parentState));
						((MinusContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(274);
						((MinusContext)_localctx).op = match(MINUS);
						setState(275);
						((MinusContext)_localctx).expr2 = expr(15);

						                   ((MinusContext)_localctx).obj =  new AST.Arithmetic(
						                           ((MinusContext)_localctx).expr1.obj,
						                           ((MinusContext)_localctx).expr2.obj,
						                          ((MinusContext)_localctx).op.getText());

						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(279);
						((MultiplicationContext)_localctx).op = match(MULTIPLY);
						setState(280);
						((MultiplicationContext)_localctx).expr2 = expr(14);

						                     ((MultiplicationContext)_localctx).obj =  new AST.Arithmetic(
						                                  ((MultiplicationContext)_localctx).expr1.obj,
						                                  ((MultiplicationContext)_localctx).expr2.obj,
						                                  ((MultiplicationContext)_localctx).op.getText());

						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						((DivisionContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(284);
						((DivisionContext)_localctx).op = match(DIVIDE);
						setState(285);
						((DivisionContext)_localctx).expr2 = expr(13);

						                     ((DivisionContext)_localctx).obj =  new AST.Arithmetic(
						                                  ((DivisionContext)_localctx).expr1.obj,
						                                  ((DivisionContext)_localctx).expr2.obj,
						                                  ((DivisionContext)_localctx).op.getText());

						}
						break;
					case 5:
						{
						_localctx = new SmallerThanContext(new ExprContext(_parentctx, _parentState));
						((SmallerThanContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(289);
						((SmallerThanContext)_localctx).op = match(SMALLER_THAN);
						setState(290);
						((SmallerThanContext)_localctx).expr2 = expr(11);

						                  ((SmallerThanContext)_localctx).obj =  new AST.Relational(((SmallerThanContext)_localctx).expr1.obj, ((SmallerThanContext)_localctx).expr2.obj, ((SmallerThanContext)_localctx).op.getText());

						}
						break;
					case 6:
						{
						_localctx = new LessOREqualContext(new ExprContext(_parentctx, _parentState));
						((LessOREqualContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(294);
						((LessOREqualContext)_localctx).op = match(LESS_THAN_OR_EQUAL);
						setState(295);
						((LessOREqualContext)_localctx).expr2 = expr(10);

						                  ((LessOREqualContext)_localctx).obj =  new AST.Relational(((LessOREqualContext)_localctx).expr1.obj, ((LessOREqualContext)_localctx).expr2.obj, ((LessOREqualContext)_localctx).op.getText());

						}
						break;
					case 7:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						((EqualContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(299);
						((EqualContext)_localctx).op = match(EQUAL);
						setState(300);
						((EqualContext)_localctx).expr2 = expr(9);

						                  ((EqualContext)_localctx).obj =  new AST.Relational(((EqualContext)_localctx).expr1.obj, ((EqualContext)_localctx).expr2.obj, ((EqualContext)_localctx).op.getText());

						}
						break;
					case 8:
						{
						_localctx = new DispatchContext(new ExprContext(_parentctx, _parentState));
						((DispatchContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(304);
						match(DOT);
						setState(305);
						((DispatchContext)_localctx).id = match(ID);
						setState(306);
						match(OPENP_PRANSIS);
						setState(307);
						((DispatchContext)_localctx).e = e_list();
						setState(308);
						match(CLOSE_PRANSIS);

						                  ((DispatchContext)_localctx).obj =  new AST.dispatch(((DispatchContext)_localctx).expr1.obj, ((DispatchContext)_localctx).id.getText(), ((DispatchContext)_localctx).e.obj, ((DispatchContext)_localctx).id.getLine());

						}
						break;
					case 9:
						{
						_localctx = new Static_dispatchContext(new ExprContext(_parentctx, _parentState));
						((Static_dispatchContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(312);
						match(AT);
						setState(313);
						((Static_dispatchContext)_localctx).type = match(TYPE);
						setState(314);
						match(DOT);
						setState(315);
						((Static_dispatchContext)_localctx).id = match(ID);
						setState(316);
						match(OPENP_PRANSIS);
						setState(317);
						((Static_dispatchContext)_localctx).e = e_list();
						setState(318);
						match(CLOSE_PRANSIS);

						                  ((Static_dispatchContext)_localctx).obj =  new AST.static_dispatch(((Static_dispatchContext)_localctx).expr1.obj, ((Static_dispatchContext)_localctx).type.getText(), ((Static_dispatchContext)_localctx).id.getText(), ((Static_dispatchContext)_localctx).e.obj, ((Static_dispatchContext)_localctx).expr1.obj.lineNo);

						}
						break;
					}
					}
				}
				setState(325);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 25);
		case 8:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0149\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3$\n\3\r\3"+
		"\16\3%\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16\5D\13\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7c\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tw\n\t\f\t\16"+
		"\tz\13\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\6\13\u0085\n\13\r\13"+
		"\16\13\u0086\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0096"+
		"\n\r\f\r\16\r\u0099\13\r\5\r\u009b\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6"+
		"\16\u00bf\n\16\r\16\16\16\u00c0\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00d0\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00dc\n\16\3\16\7\16\u00df\n\16\f\16\16\16\u00e2"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u010d\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0144\n\16\f\16\16\16\u0147\13\16\3\16\2\3\32\17\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\2\2\2\u0163\2\34\3\2\2\2\4(\3\2\2\2\6:\3\2\2\2\bB\3"+
		"\2\2\2\nK\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20p\3\2\2\2\22{\3\2\2\2\24\u0084"+
		"\3\2\2\2\26\u0088\3\2\2\2\30\u009a\3\2\2\2\32\u010c\3\2\2\2\34\35\5\4"+
		"\3\2\35\36\b\2\1\2\36\3\3\2\2\2\37 \5\6\4\2 !\b\3\1\2!\"\7.\2\2\"$\3\2"+
		"\2\2#\37\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&)\3\2\2\2\')\7\2\2\3(#"+
		"\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\7\4\2\2+,\7\25\2\2,-\7(\2\2-.\5\b\5\2"+
		"./\7)\2\2/\60\b\4\1\2\60;\3\2\2\2\61\62\7\4\2\2\62\63\7\25\2\2\63\64\7"+
		"\3\2\2\64\65\7\25\2\2\65\66\7(\2\2\66\67\5\b\5\2\678\7)\2\289\b\4\1\2"+
		"9;\3\2\2\2:*\3\2\2\2:\61\3\2\2\2;\7\3\2\2\2<=\5\n\6\2=>\b\5\1\2>?\7.\2"+
		"\2?A\3\2\2\2@<\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DB\3\2"+
		"\2\2EF\5\f\7\2FG\b\6\1\2GL\3\2\2\2HI\5\16\b\2IJ\b\6\1\2JL\3\2\2\2KE\3"+
		"\2\2\2KH\3\2\2\2L\13\3\2\2\2MN\7\26\2\2NO\7*\2\2OP\7+\2\2PQ\7/\2\2QR\7"+
		"\25\2\2RS\7(\2\2ST\5\32\16\2TU\7)\2\2UV\b\7\1\2Vc\3\2\2\2WX\7\26\2\2X"+
		"Y\7*\2\2YZ\5\20\t\2Z[\7+\2\2[\\\7/\2\2\\]\7\25\2\2]^\7(\2\2^_\5\32\16"+
		"\2_`\7)\2\2`a\b\7\1\2ac\3\2\2\2bM\3\2\2\2bW\3\2\2\2c\r\3\2\2\2de\b\b\1"+
		"\2ef\7\26\2\2fg\7/\2\2gl\7\25\2\2hi\7\27\2\2ij\5\32\16\2jk\b\b\1\2km\3"+
		"\2\2\2lh\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\b\1\2o\17\3\2\2\2pq\5\22\n\2"+
		"qx\b\t\1\2rs\7\60\2\2st\5\22\n\2tu\b\t\1\2uw\3\2\2\2vr\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y\21\3\2\2\2zx\3\2\2\2{|\7\26\2\2|}\7/\2\2}~\7\25"+
		"\2\2~\177\b\n\1\2\177\23\3\2\2\2\u0080\u0081\5\26\f\2\u0081\u0082\7.\2"+
		"\2\u0082\u0083\b\13\1\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2"+
		"\2\u0088\u0089\7\26\2\2\u0089\u008a\7/\2\2\u008a\u008b\7\25\2\2\u008b"+
		"\u008c\7\30\2\2\u008c\u008d\5\32\16\2\u008d\u008e\b\f\1\2\u008e\27\3\2"+
		"\2\2\u008f\u0090\5\32\16\2\u0090\u0097\b\r\1\2\u0091\u0092\7\60\2\2\u0092"+
		"\u0093\5\32\16\2\u0093\u0094\b\r\1\2\u0094\u0096\3\2\2\2\u0095\u0091\3"+
		"\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u008f\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\31\3\2\2\2\u009c\u009d\b\16\1\2\u009d\u009e\7\26\2\2\u009e"+
		"\u009f\7\27\2\2\u009f\u00a0\5\32\16\34\u00a0\u00a1\b\16\1\2\u00a1\u010d"+
		"\3\2\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a4\7*\2\2\u00a4\u00a5\5\30\r\2"+
		"\u00a5\u00a6\7+\2\2\u00a6\u00a7\b\16\1\2\u00a7\u010d\3\2\2\2\u00a8\u00a9"+
		"\7\7\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac\5\32\16"+
		"\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00af\7\n\2\2\u00af"+
		"\u00b0\b\16\1\2\u00b0\u010d\3\2\2\2\u00b1\u00b2\7\16\2\2\u00b2\u00b3\5"+
		"\32\16\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\7\20\2"+
		"\2\u00b6\u00b7\b\16\1\2\u00b7\u010d\3\2\2\2\u00b8\u00b9\7(\2\2\u00b9\u00be"+
		"\b\16\1\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\7.\2\2\u00bc\u00bd\b\16\1"+
		"\2\u00bd\u00bf\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7)\2\2\u00c3"+
		"\u00c4\b\16\1\2\u00c4\u010d\3\2\2\2\u00c5\u00c6\b\16\1\2\u00c6\u00c7\7"+
		"\21\2\2\u00c7\u00c8\7\26\2\2\u00c8\u00c9\b\16\1\2\u00c9\u00ca\7/\2\2\u00ca"+
		"\u00cf\7\25\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00cd\5\32\16\2\u00cd\u00ce"+
		"\b\16\1\2\u00ce\u00d0\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00d0\3\2\2\2"+
		"\u00d0\u00d1\3\2\2\2\u00d1\u00e0\b\16\1\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4"+
		"\7\26\2\2\u00d4\u00d5\b\16\1\2\u00d5\u00d6\7/\2\2\u00d6\u00db\7\25\2\2"+
		"\u00d7\u00d8\7\27\2\2\u00d8\u00d9\5\32\16\2\u00d9\u00da\b\16\1\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\b\16\1\2\u00de\u00d2\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e4\7\22\2\2\u00e4\u00e5\5\32\16\25\u00e5\u00e6\b\16\1\2"+
		"\u00e6\u010d\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9\5\32\16\2\u00e9"+
		"\u00ea\7\f\2\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec\7\r\2\2\u00ec\u00ed\b"+
		"\16\1\2\u00ed\u010d\3\2\2\2\u00ee\u00ef\7\5\2\2\u00ef\u00f0\7\25\2\2\u00f0"+
		"\u010d\b\16\1\2\u00f1\u00f2\7\64\2\2\u00f2\u00f3\5\32\16\22\u00f3\u00f4"+
		"\b\16\1\2\u00f4\u010d\3\2\2\2\u00f5\u00f6\7!\2\2\u00f6\u00f7\5\32\16\r"+
		"\u00f7\u00f8\b\16\1\2\u00f8\u010d\3\2\2\2\u00f9\u00fa\7\65\2\2\u00fa\u00fb"+
		"\5\32\16\t\u00fb\u00fc\b\16\1\2\u00fc\u010d\3\2\2\2\u00fd\u00fe\7*\2\2"+
		"\u00fe\u00ff\5\32\16\2\u00ff\u0100\7+\2\2\u0100\u0101\b\16\1\2\u0101\u010d"+
		"\3\2\2\2\u0102\u0103\7\26\2\2\u0103\u010d\b\16\1\2\u0104\u0105\7\23\2"+
		"\2\u0105\u010d\b\16\1\2\u0106\u0107\7\24\2\2\u0107\u010d\b\16\1\2\u0108"+
		"\u0109\7\66\2\2\u0109\u010d\b\16\1\2\u010a\u010b\7\67\2\2\u010b\u010d"+
		"\b\16\1\2\u010c\u009c\3\2\2\2\u010c\u00a2\3\2\2\2\u010c\u00a8\3\2\2\2"+
		"\u010c\u00b1\3\2\2\2\u010c\u00b8\3\2\2\2\u010c\u00c5\3\2\2\2\u010c\u00e7"+
		"\3\2\2\2\u010c\u00ee\3\2\2\2\u010c\u00f1\3\2\2\2\u010c\u00f5\3\2\2\2\u010c"+
		"\u00f9\3\2\2\2\u010c\u00fd\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0104\3\2"+
		"\2\2\u010c\u0106\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u0145\3\2\2\2\u010e\u010f\f\21\2\2\u010f\u0110\7\35\2\2\u0110\u0111\5"+
		"\32\16\22\u0111\u0112\b\16\1\2\u0112\u0144\3\2\2\2\u0113\u0114\f\20\2"+
		"\2\u0114\u0115\7\36\2\2\u0115\u0116\5\32\16\21\u0116\u0117\b\16\1\2\u0117"+
		"\u0144\3\2\2\2\u0118\u0119\f\17\2\2\u0119\u011a\7 \2\2\u011a\u011b\5\32"+
		"\16\20\u011b\u011c\b\16\1\2\u011c\u0144\3\2\2\2\u011d\u011e\f\16\2\2\u011e"+
		"\u011f\7\37\2\2\u011f\u0120\5\32\16\17\u0120\u0121\b\16\1\2\u0121\u0144"+
		"\3\2\2\2\u0122\u0123\f\f\2\2\u0123\u0124\7\32\2\2\u0124\u0125\5\32\16"+
		"\r\u0125\u0126\b\16\1\2\u0126\u0144\3\2\2\2\u0127\u0128\f\13\2\2\u0128"+
		"\u0129\7\34\2\2\u0129\u012a\5\32\16\f\u012a\u012b\b\16\1\2\u012b\u0144"+
		"\3\2\2\2\u012c\u012d\f\n\2\2\u012d\u012e\7\31\2\2\u012e\u012f\5\32\16"+
		"\13\u012f\u0130\b\16\1\2\u0130\u0144\3\2\2\2\u0131\u0132\f\33\2\2\u0132"+
		"\u0133\7\61\2\2\u0133\u0134\7\26\2\2\u0134\u0135\7*\2\2\u0135\u0136\5"+
		"\30\r\2\u0136\u0137\7+\2\2\u0137\u0138\b\16\1\2\u0138\u0144\3\2\2\2\u0139"+
		"\u013a\f\31\2\2\u013a\u013b\7\62\2\2\u013b\u013c\7\25\2\2\u013c\u013d"+
		"\7\61\2\2\u013d\u013e\7\26\2\2\u013e\u013f\7*\2\2\u013f\u0140\5\30\r\2"+
		"\u0140\u0141\7+\2\2\u0141\u0142\b\16\1\2\u0142\u0144\3\2\2\2\u0143\u010e"+
		"\3\2\2\2\u0143\u0113\3\2\2\2\u0143\u0118\3\2\2\2\u0143\u011d\3\2\2\2\u0143"+
		"\u0122\3\2\2\2\u0143\u0127\3\2\2\2\u0143\u012c\3\2\2\2\u0143\u0131\3\2"+
		"\2\2\u0143\u0139\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\33\3\2\2\2\u0147\u0145\3\2\2\2\24%(:BKblx\u0086\u0097"+
		"\u009a\u00c0\u00cf\u00db\u00e0\u010c\u0143\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}