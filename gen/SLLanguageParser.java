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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, COMMENT=17, 
		LINE_COMMENT=18, INICIO=19, FIN=20, PROGRAMA=21, PIZQ=22, PDER=23, BIZQ=24, 
		BDER=25, LIZQ=26, LDER=27, ID=28, ESP=29, NUM=30, DOUBLE=31, BOOL=32, 
		CADENA=33, SMCOLON=34;
	public static final int
		RULE_s = 0, RULE_settings = 1, RULE_assignationConst = 2, RULE_assignationTypes = 3, 
		RULE_assignationVar = 4, RULE_objeto = 5, RULE_tipo = 6, RULE_expr = 7, 
		RULE_body = 8, RULE_sentence = 9, RULE_ifSentence = 10, RULE_repeatSentence = 11, 
		RULE_whileSentence = 12, RULE_printSentence = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "settings", "assignationConst", "assignationTypes", "assignationVar", 
			"objeto", "tipo", "expr", "body", "sentence", "ifSentence", "repeatSentence", 
			"whileSentence", "printSentence"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'tipos'", "'var'", "','", "'='", "':'", "'numerico'", 
			"'cadena'", "'logico'", "'vector'", "'matriz'", "'registro'", "'si'", 
			"'repetir'", "'mientras'", "'imprimir'", null, null, "'inicio'", "'fin'", 
			"'programa'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, null, null, 
			null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "COMMENT", "LINE_COMMENT", "INICIO", "FIN", 
			"PROGRAMA", "PIZQ", "PDER", "BIZQ", "BDER", "LIZQ", "LDER", "ID", "ESP", 
			"NUM", "DOUBLE", "BOOL", "CADENA", "SMCOLON"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAMA) {
				{
				setState(28);
				match(PROGRAMA);
				setState(29);
				match(ID);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(30);
					match(SMCOLON);
					}
				}

				}
			}

			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(35);
				settings();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(INICIO);
			setState(42);
			body();
			setState(43);
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__0);
				setState(46);
				assignationConst();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(47);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__1);
				setState(51);
				assignationTypes();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(52);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(T__2);
				setState(56);
				assignationVar();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(57);
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
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(ID);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(63);
					match(T__3);
					setState(64);
					match(ID);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(T__4);
				setState(71);
				expr();
				}
				}
				setState(74); 
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
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				objeto();
				}
				}
				setState(79); 
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
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				match(ID);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(82);
					match(T__3);
					setState(83);
					match(ID);
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(T__5);
				setState(90);
				tipo();
				}
				}
				setState(93); 
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
			setState(95);
			match(ID);
			setState(96);
			match(T__5);
			setState(97);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(T__8);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(ID);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(T__9);
				setState(104);
				match(BIZQ);
				setState(105);
				match(PDER);
				setState(106);
				tipo();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				match(T__10);
				setState(108);
				match(BIZQ);
				setState(109);
				match(BDER);
				setState(110);
				tipo();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				match(T__11);
				setState(112);
				match(LIZQ);
				setState(113);
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
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA))) != 0)) ) {
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
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				sentence();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0) );
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
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				ifSentence();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				repeatSentence();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				whileSentence();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				printSentence();
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
			setState(129);
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
			setState(131);
			match(T__13);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__14);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__15);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u008c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\5\2\"\n\2\5\2$\n\2"+
		"\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3\63\n\3\3"+
		"\3\3\3\3\3\5\38\n\3\3\3\3\3\3\3\5\3=\n\3\5\3?\n\3\3\4\3\4\3\4\7\4D\n\4"+
		"\f\4\16\4G\13\4\3\4\3\4\6\4K\n\4\r\4\16\4L\3\5\6\5P\n\5\r\5\16\5Q\3\6"+
		"\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\6\6^\n\6\r\6\16\6_\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"u\n\b\3\t\3\t\3\n\6\nz\n\n\r\n\16\n{\3\13\3\13\3\13\3\13\5\13\u0082\n"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\3\3\2 #\2\u0094\2#\3\2\2\2\4>\3\2\2\2\6J\3\2\2\2"+
		"\bO\3\2\2\2\n]\3\2\2\2\fa\3\2\2\2\16t\3\2\2\2\20v\3\2\2\2\22y\3\2\2\2"+
		"\24\u0081\3\2\2\2\26\u0083\3\2\2\2\30\u0085\3\2\2\2\32\u0087\3\2\2\2\34"+
		"\u0089\3\2\2\2\36\37\7\27\2\2\37!\7\36\2\2 \"\7$\2\2! \3\2\2\2!\"\3\2"+
		"\2\2\"$\3\2\2\2#\36\3\2\2\2#$\3\2\2\2$(\3\2\2\2%\'\5\4\3\2&%\3\2\2\2\'"+
		"*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\25\2\2,-\5\22\n"+
		"\2-.\7\26\2\2.\3\3\2\2\2/\60\7\3\2\2\60\62\5\6\4\2\61\63\7$\2\2\62\61"+
		"\3\2\2\2\62\63\3\2\2\2\63?\3\2\2\2\64\65\7\4\2\2\65\67\5\b\5\2\668\7$"+
		"\2\2\67\66\3\2\2\2\678\3\2\2\28?\3\2\2\29:\7\5\2\2:<\5\n\6\2;=\7$\2\2"+
		"<;\3\2\2\2<=\3\2\2\2=?\3\2\2\2>/\3\2\2\2>\64\3\2\2\2>9\3\2\2\2?\5\3\2"+
		"\2\2@E\7\36\2\2AB\7\6\2\2BD\7\36\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3"+
		"\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\7\2\2IK\5\20\t\2J@\3\2\2\2KL\3\2\2\2LJ"+
		"\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NP\5\f\7\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2R\t\3\2\2\2SX\7\36\2\2TU\7\6\2\2UW\7\36\2\2VT\3\2\2\2WZ\3\2"+
		"\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\b\2\2\\^\5\16\b\2]S"+
		"\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2ab\7\36\2\2bc\7\b\2"+
		"\2cd\5\16\b\2d\r\3\2\2\2eu\7\t\2\2fu\7\n\2\2gu\7\13\2\2hu\7\36\2\2ij\7"+
		"\f\2\2jk\7\32\2\2kl\7\31\2\2lu\5\16\b\2mn\7\r\2\2no\7\32\2\2op\7\33\2"+
		"\2pu\5\16\b\2qr\7\16\2\2rs\7\34\2\2su\7\35\2\2te\3\2\2\2tf\3\2\2\2tg\3"+
		"\2\2\2th\3\2\2\2ti\3\2\2\2tm\3\2\2\2tq\3\2\2\2u\17\3\2\2\2vw\t\2\2\2w"+
		"\21\3\2\2\2xz\5\24\13\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\23\3"+
		"\2\2\2}\u0082\5\26\f\2~\u0082\5\30\r\2\177\u0082\5\32\16\2\u0080\u0082"+
		"\5\34\17\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\25\3\2\2\2\u0083\u0084\7\17\2\2\u0084\27\3\2\2\2\u0085"+
		"\u0086\7\20\2\2\u0086\31\3\2\2\2\u0087\u0088\7\21\2\2\u0088\33\3\2\2\2"+
		"\u0089\u008a\7\22\2\2\u008a\35\3\2\2\2\21!#(\62\67<>ELQX_t{\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}