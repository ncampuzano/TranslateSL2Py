// Generated from C:/Users/Nicolas Campuzano/iCloudDrive/Universidad Nacional/Semestre IX/Progamming Languages/TranslateSL2Py/grammar\SLLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, COMMENT=19, LINE_COMMENT=20, INICIO=21, FIN=22, PROGRAMA=23, 
		PIZQ=24, PDER=25, BIZQ=26, BDER=27, LIZQ=28, LDER=29, ID=30, ESP=31, NUM=32, 
		DOUBLE=33, BOOL=34, CADENA=35, SMCOLON=36, COMA=37, OPERADOR=38;
	public static final int
		RULE_s = 0, RULE_settings = 1, RULE_assignationConst = 2, RULE_assignationTypes = 3, 
		RULE_assignationVar = 4, RULE_objeto = 5, RULE_tipo = 6, RULE_expr = 7, 
		RULE_body = 8, RULE_sentence = 9, RULE_ifSentence = 10, RULE_repeatSentence = 11, 
		RULE_whileSentence = 12, RULE_printSentence = 13, RULE_readSentence = 14, 
		RULE_expression = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "settings", "assignationConst", "assignationTypes", "assignationVar", 
			"objeto", "tipo", "expr", "body", "sentence", "ifSentence", "repeatSentence", 
			"whileSentence", "printSentence", "readSentence", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'tipos'", "'var'", "'='", "':'", "'numerico'", "'cadena'", 
			"'logico'", "'vector'", "'matriz'", "'registro'", "'si'", "'repetir'", 
			"'desde'", "'hasta'", "'paso'", "'imprimir'", "'leer'", null, null, "'inicio'", 
			"'fin'", "'programa'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, 
			null, null, null, null, null, "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "COMMENT", "LINE_COMMENT", 
			"INICIO", "FIN", "PROGRAMA", "PIZQ", "PDER", "BIZQ", "BDER", "LIZQ", 
			"LDER", "ID", "ESP", "NUM", "DOUBLE", "BOOL", "CADENA", "SMCOLON", "COMA", 
			"OPERADOR"
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
	public String getGrammarFileName() { return "SLLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SLLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(SLLanguageParser.INICIO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode FIN() { return getToken(SLLanguageParser.FIN, 0); }
		public TerminalNode PROGRAMA() { return getToken(SLLanguageParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public List<SettingsContext> settings() {
			return getRuleContexts(SettingsContext.class);
		}
		public SettingsContext settings(int i) {
			return getRuleContext(SettingsContext.class,i);
		}
		public TerminalNode SMCOLON() { return getToken(SLLanguageParser.SMCOLON, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAMA) {
				{
				setState(32);
				match(PROGRAMA);
				setState(33);
				match(ID);
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(34);
					match(SMCOLON);
					}
				}

				}
			}

			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(39);
				settings();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(INICIO);
			setState(46);
			body();
			setState(47);
			match(FIN);
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

	public static class SettingsContext extends ParserRuleContext {
		public AssignationConstContext assignationConst() {
			return getRuleContext(AssignationConstContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(SLLanguageParser.SMCOLON, 0); }
		public AssignationTypesContext assignationTypes() {
			return getRuleContext(AssignationTypesContext.class,0);
		}
		public AssignationVarContext assignationVar() {
			return getRuleContext(AssignationVarContext.class,0);
		}
		public SettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterSettings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitSettings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitSettings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingsContext settings() throws RecognitionException {
		SettingsContext _localctx = new SettingsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_settings);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__0);
				setState(50);
				assignationConst();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(51);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__1);
				setState(55);
				assignationTypes();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(56);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(T__2);
				setState(60);
				assignationVar();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(61);
					match(SMCOLON);
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

	public static class AssignationConstContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SLLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLLanguageParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(SLLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SLLanguageParser.COMA, i);
		}
		public AssignationConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignationConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterAssignationConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitAssignationConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitAssignationConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationConstContext assignationConst() throws RecognitionException {
		AssignationConstContext _localctx = new AssignationConstContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignationConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				match(ID);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(67);
					match(COMA);
					setState(68);
					match(ID);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(T__3);
				setState(75);
				expr();
				}
				}
				setState(78); 
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

	public static class AssignationTypesContext extends ParserRuleContext {
		public List<ObjetoContext> objeto() {
			return getRuleContexts(ObjetoContext.class);
		}
		public ObjetoContext objeto(int i) {
			return getRuleContext(ObjetoContext.class,i);
		}
		public AssignationTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignationTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterAssignationTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitAssignationTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitAssignationTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationTypesContext assignationTypes() throws RecognitionException {
		AssignationTypesContext _localctx = new AssignationTypesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignationTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				objeto();
				}
				}
				setState(83); 
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

	public static class AssignationVarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SLLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLLanguageParser.ID, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(SLLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SLLanguageParser.COMA, i);
		}
		public AssignationVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignationVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterAssignationVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitAssignationVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitAssignationVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationVarContext assignationVar() throws RecognitionException {
		AssignationVarContext _localctx = new AssignationVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignationVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				match(ID);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(86);
					match(COMA);
					setState(87);
					match(ID);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(T__4);
				setState(94);
				tipo();
				}
				}
				setState(97); 
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

	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(T__4);
			setState(101);
			tipo();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode BIZQ() { return getToken(SLLanguageParser.BIZQ, 0); }
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode BDER() { return getToken(SLLanguageParser.BDER, 0); }
		public TerminalNode LIZQ() { return getToken(SLLanguageParser.LIZQ, 0); }
		public TerminalNode LDER() { return getToken(SLLanguageParser.LDER, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(T__7);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(ID);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				match(T__8);
				setState(108);
				match(BIZQ);
				setState(109);
				match(PDER);
				setState(110);
				tipo();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				match(T__9);
				setState(112);
				match(BIZQ);
				setState(113);
				match(BDER);
				setState(114);
				tipo();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				match(T__10);
				setState(116);
				match(LIZQ);
				setState(117);
				match(LDER);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SLLanguageParser.NUM, 0); }
		public TerminalNode CADENA() { return getToken(SLLanguageParser.CADENA, 0); }
		public TerminalNode BOOL() { return getToken(SLLanguageParser.BOOL, 0); }
		public TerminalNode DOUBLE() { return getToken(SLLanguageParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA))) != 0)) ) {
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

	public static class BodyContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				sentence();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << PIZQ) | (1L << ID) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA))) != 0) );
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

	public static class SentenceContext extends ParserRuleContext {
		public IfSentenceContext ifSentence() {
			return getRuleContext(IfSentenceContext.class,0);
		}
		public RepeatSentenceContext repeatSentence() {
			return getRuleContext(RepeatSentenceContext.class,0);
		}
		public WhileSentenceContext whileSentence() {
			return getRuleContext(WhileSentenceContext.class,0);
		}
		public PrintSentenceContext printSentence() {
			return getRuleContext(PrintSentenceContext.class,0);
		}
		public ReadSentenceContext readSentence() {
			return getRuleContext(ReadSentenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentence);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				ifSentence();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				repeatSentence();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				whileSentence();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				printSentence();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				readSentence();
				}
				break;
			case PIZQ:
			case ID:
			case NUM:
			case DOUBLE:
			case BOOL:
			case CADENA:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				expression(0);
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

	public static class IfSentenceContext extends ParserRuleContext {
		public IfSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterIfSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitIfSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitIfSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfSentenceContext ifSentence() throws RecognitionException {
		IfSentenceContext _localctx = new IfSentenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__11);
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

	public static class RepeatSentenceContext extends ParserRuleContext {
		public RepeatSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterRepeatSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitRepeatSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitRepeatSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatSentenceContext repeatSentence() throws RecognitionException {
		RepeatSentenceContext _localctx = new RepeatSentenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_repeatSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__12);
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

	public static class WhileSentenceContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LIZQ() { return getToken(SLLanguageParser.LIZQ, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode LDER() { return getToken(SLLanguageParser.LDER, 0); }
		public WhileSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterWhileSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitWhileSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitWhileSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileSentenceContext whileSentence() throws RecognitionException {
		WhileSentenceContext _localctx = new WhileSentenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__13);
			setState(140);
			expression(0);
			setState(141);
			match(T__14);
			setState(142);
			expr();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(143);
				match(T__15);
				setState(144);
				expr();
				}
			}

			setState(147);
			match(LIZQ);
			setState(148);
			body();
			setState(149);
			match(LDER);
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

	public static class PrintSentenceContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(SLLanguageParser.PIZQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
		public List<TerminalNode> COMA() { return getTokens(SLLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SLLanguageParser.COMA, i);
		}
		public TerminalNode SMCOLON() { return getToken(SLLanguageParser.SMCOLON, 0); }
		public PrintSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterPrintSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitPrintSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitPrintSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintSentenceContext printSentence() throws RecognitionException {
		PrintSentenceContext _localctx = new PrintSentenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__16);
			setState(152);
			match(PIZQ);
			setState(153);
			expression(0);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(154);
				match(COMA);
				setState(155);
				expression(0);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(PDER);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(162);
				match(SMCOLON);
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

	public static class ReadSentenceContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(SLLanguageParser.PIZQ, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
		public TerminalNode SMCOLON() { return getToken(SLLanguageParser.SMCOLON, 0); }
		public ReadSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterReadSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitReadSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitReadSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadSentenceContext readSentence() throws RecognitionException {
		ReadSentenceContext _localctx = new ReadSentenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_readSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__17);
			setState(166);
			match(PIZQ);
			setState(167);
			match(ID);
			setState(168);
			match(PDER);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(169);
				match(SMCOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(SLLanguageParser.PIZQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode OPERADOR() { return getToken(SLLanguageParser.OPERADOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(173);
				expr();
				}
				break;
			case 2:
				{
				setState(174);
				match(PIZQ);
				setState(175);
				expression(0);
				setState(176);
				match(PDER);
				}
				break;
			case 3:
				{
				setState(178);
				match(ID);
				setState(179);
				match(T__3);
				setState(180);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(183);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(184);
					match(OPERADOR);
					setState(185);
					expression(4);
					}
					} 
				}
				setState(190);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\5\2&\n\2\5\2(\n\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\5\3\67\n\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\5\3A\n\3\5\3C\n\3\3"+
		"\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\6\4O\n\4\r\4\16\4P\3\5\6\5"+
		"T\n\5\r\5\16\5U\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\6\6b\n\6\r"+
		"\6\16\6c\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\by\n\b\3\t\3\t\3\n\6\n~\n\n\r\n\16\n\177\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0088\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0094\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u009f\n\17\f\17\16\17\u00a2\13\17\3\17\3\17\5\17\u00a6\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00ad\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00b8\n\21\3\21\3\21\3\21\7\21\u00bd\n\21\f\21\16\21\u00c0"+
		"\13\21\3\21\2\3 \22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\4\2  "+
		"\"%\2\u00d1\2\'\3\2\2\2\4B\3\2\2\2\6N\3\2\2\2\bS\3\2\2\2\na\3\2\2\2\f"+
		"e\3\2\2\2\16x\3\2\2\2\20z\3\2\2\2\22}\3\2\2\2\24\u0087\3\2\2\2\26\u0089"+
		"\3\2\2\2\30\u008b\3\2\2\2\32\u008d\3\2\2\2\34\u0099\3\2\2\2\36\u00a7\3"+
		"\2\2\2 \u00b7\3\2\2\2\"#\7\31\2\2#%\7 \2\2$&\7&\2\2%$\3\2\2\2%&\3\2\2"+
		"\2&(\3\2\2\2\'\"\3\2\2\2\'(\3\2\2\2(,\3\2\2\2)+\5\4\3\2*)\3\2\2\2+.\3"+
		"\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\27\2\2\60\61\5\22"+
		"\n\2\61\62\7\30\2\2\62\3\3\2\2\2\63\64\7\3\2\2\64\66\5\6\4\2\65\67\7&"+
		"\2\2\66\65\3\2\2\2\66\67\3\2\2\2\67C\3\2\2\289\7\4\2\29;\5\b\5\2:<\7&"+
		"\2\2;:\3\2\2\2;<\3\2\2\2<C\3\2\2\2=>\7\5\2\2>@\5\n\6\2?A\7&\2\2@?\3\2"+
		"\2\2@A\3\2\2\2AC\3\2\2\2B\63\3\2\2\2B8\3\2\2\2B=\3\2\2\2C\5\3\2\2\2DI"+
		"\7 \2\2EF\7\'\2\2FH\7 \2\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3"+
		"\2\2\2KI\3\2\2\2LM\7\6\2\2MO\5\20\t\2ND\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ"+
		"\3\2\2\2Q\7\3\2\2\2RT\5\f\7\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V\t\3\2\2\2W\\\7 \2\2XY\7\'\2\2Y[\7 \2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\7\2\2`b\5\16\b\2aW\3\2\2\2bc\3"+
		"\2\2\2ca\3\2\2\2cd\3\2\2\2d\13\3\2\2\2ef\7 \2\2fg\7\7\2\2gh\5\16\b\2h"+
		"\r\3\2\2\2iy\7\b\2\2jy\7\t\2\2ky\7\n\2\2ly\7 \2\2mn\7\13\2\2no\7\34\2"+
		"\2op\7\33\2\2py\5\16\b\2qr\7\f\2\2rs\7\34\2\2st\7\35\2\2ty\5\16\b\2uv"+
		"\7\r\2\2vw\7\36\2\2wy\7\37\2\2xi\3\2\2\2xj\3\2\2\2xk\3\2\2\2xl\3\2\2\2"+
		"xm\3\2\2\2xq\3\2\2\2xu\3\2\2\2y\17\3\2\2\2z{\t\2\2\2{\21\3\2\2\2|~\5\24"+
		"\13\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\23\3"+
		"\2\2\2\u0081\u0088\5\26\f\2\u0082\u0088\5\30\r\2\u0083\u0088\5\32\16\2"+
		"\u0084\u0088\5\34\17\2\u0085\u0088\5\36\20\2\u0086\u0088\5 \21\2\u0087"+
		"\u0081\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\25\3\2\2\2\u0089\u008a"+
		"\7\16\2\2\u008a\27\3\2\2\2\u008b\u008c\7\17\2\2\u008c\31\3\2\2\2\u008d"+
		"\u008e\7\20\2\2\u008e\u008f\5 \21\2\u008f\u0090\7\21\2\2\u0090\u0093\5"+
		"\20\t\2\u0091\u0092\7\22\2\2\u0092\u0094\5\20\t\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\36\2\2\u0096\u0097"+
		"\5\22\n\2\u0097\u0098\7\37\2\2\u0098\33\3\2\2\2\u0099\u009a\7\23\2\2\u009a"+
		"\u009b\7\32\2\2\u009b\u00a0\5 \21\2\u009c\u009d\7\'\2\2\u009d\u009f\5"+
		" \21\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\33"+
		"\2\2\u00a4\u00a6\7&\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\35\3\2\2\2\u00a7\u00a8\7\24\2\2\u00a8\u00a9\7\32\2\2\u00a9\u00aa\7 \2"+
		"\2\u00aa\u00ac\7\33\2\2\u00ab\u00ad\7&\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00af\b\21\1\2\u00af\u00b8\5\20\t\2\u00b0"+
		"\u00b1\7\32\2\2\u00b1\u00b2\5 \21\2\u00b2\u00b3\7\33\2\2\u00b3\u00b8\3"+
		"\2\2\2\u00b4\u00b5\7 \2\2\u00b5\u00b6\7\6\2\2\u00b6\u00b8\5 \21\3\u00b7"+
		"\u00ae\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\u00be\3\2"+
		"\2\2\u00b9\u00ba\f\5\2\2\u00ba\u00bb\7(\2\2\u00bb\u00bd\5 \21\6\u00bc"+
		"\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf!\3\2\2\2\u00c0\u00be\3\2\2\2\27%\',\66;@BIPU\\cx\177\u0087"+
		"\u0093\u00a0\u00a5\u00ac\u00b7\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}