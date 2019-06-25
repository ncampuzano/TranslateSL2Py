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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, SINO=24, COMMENT=25, 
		LINE_COMMENT=26, INICIO=27, FIN=28, PROGRAMA=29, PIZQ=30, PDER=31, BIZQ=32, 
		BDER=33, LIZQ=34, LDER=35, NUM=36, DOUBLE=37, BOOL=38, CADENA=39, ID=40, 
		ESP=41, SMCOLON=42, COMA=43, OPERADOR=44, ROP=45;
	public static final int
		RULE_s = 0, RULE_settings = 1, RULE_assignationConst = 2, RULE_assignationTypes = 3, 
		RULE_assignationVar = 4, RULE_objeto = 5, RULE_tipo = 6, RULE_tipoVector = 7, 
		RULE_body = 8, RULE_sentence = 9, RULE_callToFunctionSentence = 10, RULE_assignationSentence = 11, 
		RULE_bodyIfSentence = 12, RULE_sinoSentence = 13, RULE_ifSentence = 14, 
		RULE_whileSentence = 15, RULE_doWhileSentence = 16, RULE_repeatSentence = 17, 
		RULE_printSentence = 18, RULE_readSentence = 19, RULE_switchSentence = 20, 
		RULE_caseSentence = 21, RULE_expressionBoolean = 22, RULE_expression = 23, 
		RULE_constant = 24, RULE_id = 25, RULE_vector = 26, RULE_functionParameters = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "settings", "assignationConst", "assignationTypes", "assignationVar", 
			"objeto", "tipo", "tipoVector", "body", "sentence", "callToFunctionSentence", 
			"assignationSentence", "bodyIfSentence", "sinoSentence", "ifSentence", 
			"whileSentence", "doWhileSentence", "repeatSentence", "printSentence", 
			"readSentence", "switchSentence", "caseSentence", "expressionBoolean", 
			"expression", "constant", "id", "vector", "functionParameters"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'tipos'", "'var'", "'='", "':'", "'vector'", "'matriz'", 
			"'registro'", "'numerico'", "'cadena'", "'logico'", "'si'", "'mientras'", 
			"'repetir'", "'hasta'", "'desde'", "'paso'", "'imprimir'", "'leer'", 
			"'eval'", "'caso'", "'and'", "'or'", "'sino'", null, null, "'inicio'", 
			"'fin'", "'programa'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, 
			null, null, null, null, null, "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SINO", "COMMENT", "LINE_COMMENT", "INICIO", "FIN", "PROGRAMA", "PIZQ", 
			"PDER", "BIZQ", "BDER", "LIZQ", "LDER", "NUM", "DOUBLE", "BOOL", "CADENA", 
			"ID", "ESP", "SMCOLON", "COMA", "OPERADOR", "ROP"
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAMA) {
				{
				setState(56);
				match(PROGRAMA);
				setState(57);
				match(ID);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(58);
					match(SMCOLON);
					}
				}

				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(63);
				settings();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(INICIO);
			setState(70);
			body();
			setState(71);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__0);
				setState(74);
				assignationConst();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(75);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__1);
				setState(79);
				assignationTypes();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(80);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T__2);
				setState(84);
				assignationVar();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(85);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(91);
					match(COMA);
					setState(92);
					match(ID);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(T__3);
				setState(99);
				expression(0);
				}
				}
				setState(102); 
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
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				objeto();
				}
				}
				setState(107); 
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
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				match(ID);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(110);
					match(COMA);
					setState(111);
					match(ID);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(T__4);
				setState(118);
				tipo();
				}
				}
				setState(121); 
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
			setState(123);
			match(ID);
			setState(124);
			match(T__4);
			setState(125);
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
		public TerminalNode BIZQ() { return getToken(SLLanguageParser.BIZQ, 0); }
		public TipoVectorContext tipoVector() {
			return getRuleContext(TipoVectorContext.class,0);
		}
		public TerminalNode BDER() { return getToken(SLLanguageParser.BDER, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode LIZQ() { return getToken(SLLanguageParser.LIZQ, 0); }
		public AssignationVarContext assignationVar() {
			return getRuleContext(AssignationVarContext.class,0);
		}
		public TerminalNode LDER() { return getToken(SLLanguageParser.LDER, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
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
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__5);
				setState(128);
				match(BIZQ);
				setState(129);
				tipoVector();
				setState(130);
				match(BDER);
				setState(131);
				tipo();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__6);
				setState(134);
				match(BIZQ);
				setState(135);
				tipoVector();
				setState(136);
				match(BDER);
				setState(137);
				tipo();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__7);
				setState(140);
				match(LIZQ);
				setState(141);
				assignationVar();
				setState(142);
				match(LDER);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				match(T__10);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(ID);
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

	public static class TipoVectorContext extends ParserRuleContext {
		public TerminalNode OPERADOR() { return getToken(SLLanguageParser.OPERADOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(SLLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SLLanguageParser.COMA, i);
		}
		public List<TipoVectorContext> tipoVector() {
			return getRuleContexts(TipoVectorContext.class);
		}
		public TipoVectorContext tipoVector(int i) {
			return getRuleContext(TipoVectorContext.class,i);
		}
		public TipoVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterTipoVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitTipoVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitTipoVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoVectorContext tipoVector() throws RecognitionException {
		TipoVectorContext _localctx = new TipoVectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipoVector);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(150);
				match(OPERADOR);
				}
				break;
			case 2:
				{
				setState(151);
				expression(0);
				}
				break;
			}
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					match(COMA);
					setState(155);
					tipoVector();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				sentence();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ID))) != 0) );
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
		public SwitchSentenceContext switchSentence() {
			return getRuleContext(SwitchSentenceContext.class,0);
		}
		public DoWhileSentenceContext doWhileSentence() {
			return getRuleContext(DoWhileSentenceContext.class,0);
		}
		public AssignationSentenceContext assignationSentence() {
			return getRuleContext(AssignationSentenceContext.class,0);
		}
		public CallToFunctionSentenceContext callToFunctionSentence() {
			return getRuleContext(CallToFunctionSentenceContext.class,0);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				ifSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				repeatSentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				whileSentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				printSentence();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				readSentence();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				switchSentence();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				doWhileSentence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				assignationSentence();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
				callToFunctionSentence();
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

	public static class CallToFunctionSentenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public CallToFunctionSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callToFunctionSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterCallToFunctionSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitCallToFunctionSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitCallToFunctionSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallToFunctionSentenceContext callToFunctionSentence() throws RecognitionException {
		CallToFunctionSentenceContext _localctx = new CallToFunctionSentenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callToFunctionSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			functionParameters();
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

	public static class AssignationSentenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(SLLanguageParser.SMCOLON, 0); }
		public AssignationSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignationSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterAssignationSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitAssignationSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitAssignationSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationSentenceContext assignationSentence() throws RecognitionException {
		AssignationSentenceContext _localctx = new AssignationSentenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignationSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(T__3);
			setState(182);
			expression(0);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(183);
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

	public static class BodyIfSentenceContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> SINO() { return getTokens(SLLanguageParser.SINO); }
		public TerminalNode SINO(int i) {
			return getToken(SLLanguageParser.SINO, i);
		}
		public List<SinoSentenceContext> sinoSentence() {
			return getRuleContexts(SinoSentenceContext.class);
		}
		public SinoSentenceContext sinoSentence(int i) {
			return getRuleContext(SinoSentenceContext.class,i);
		}
		public BodyIfSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyIfSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterBodyIfSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitBodyIfSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitBodyIfSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyIfSentenceContext bodyIfSentence() throws RecognitionException {
		BodyIfSentenceContext _localctx = new BodyIfSentenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bodyIfSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			body();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINO) {
				{
				{
				setState(187);
				match(SINO);
				setState(188);
				sinoSentence();
				}
				}
				setState(193);
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

	public static class SinoSentenceContext extends ParserRuleContext {
		public IfSentenceContext ifSentence() {
			return getRuleContext(IfSentenceContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public SinoSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinoSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterSinoSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitSinoSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitSinoSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoSentenceContext sinoSentence() throws RecognitionException {
		SinoSentenceContext _localctx = new SinoSentenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sinoSentence);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				ifSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				sentence();
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

	public static class IfSentenceContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(SLLanguageParser.PIZQ, 0); }
		public ExpressionBooleanContext expressionBoolean() {
			return getRuleContext(ExpressionBooleanContext.class,0);
		}
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
		public TerminalNode LIZQ() { return getToken(SLLanguageParser.LIZQ, 0); }
		public BodyIfSentenceContext bodyIfSentence() {
			return getRuleContext(BodyIfSentenceContext.class,0);
		}
		public TerminalNode LDER() { return getToken(SLLanguageParser.LDER, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_ifSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__11);
			setState(199);
			match(PIZQ);
			setState(200);
			expressionBoolean();
			setState(201);
			match(PDER);
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIZQ:
				{
				setState(202);
				match(LIZQ);
				setState(203);
				bodyIfSentence();
				setState(204);
				match(LDER);
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case ID:
				{
				setState(206);
				sentence();
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

	public static class WhileSentenceContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(SLLanguageParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
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
		enterRule(_localctx, 30, RULE_whileSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__12);
			setState(210);
			match(PIZQ);
			setState(211);
			expression(0);
			setState(212);
			match(PDER);
			setState(213);
			match(LIZQ);
			setState(214);
			body();
			setState(215);
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

	public static class DoWhileSentenceContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(SLLanguageParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
		public DoWhileSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterDoWhileSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitDoWhileSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitDoWhileSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileSentenceContext doWhileSentence() throws RecognitionException {
		DoWhileSentenceContext _localctx = new DoWhileSentenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_doWhileSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__13);
			setState(218);
			body();
			setState(219);
			match(T__14);
			setState(220);
			match(PIZQ);
			setState(221);
			expression(0);
			setState(222);
			match(PDER);
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
		public AssignationSentenceContext assignationSentence() {
			return getRuleContext(AssignationSentenceContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LIZQ() { return getToken(SLLanguageParser.LIZQ, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode LDER() { return getToken(SLLanguageParser.LDER, 0); }
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
		enterRule(_localctx, 34, RULE_repeatSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__15);
			setState(225);
			assignationSentence();
			setState(226);
			match(T__14);
			setState(227);
			expression(0);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(228);
				match(T__16);
				setState(229);
				expression(0);
				}
			}

			setState(232);
			match(LIZQ);
			setState(233);
			body();
			setState(234);
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
		enterRule(_localctx, 36, RULE_printSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__17);
			setState(237);
			match(PIZQ);
			setState(238);
			expression(0);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(239);
				match(COMA);
				setState(240);
				expression(0);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(PDER);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(247);
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
		enterRule(_localctx, 38, RULE_readSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__18);
			setState(251);
			match(PIZQ);
			setState(252);
			expression(0);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(253);
				match(COMA);
				setState(254);
				expression(0);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(PDER);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(261);
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

	public static class SwitchSentenceContext extends ParserRuleContext {
		public TerminalNode LIZQ() { return getToken(SLLanguageParser.LIZQ, 0); }
		public TerminalNode LDER() { return getToken(SLLanguageParser.LDER, 0); }
		public List<CaseSentenceContext> caseSentence() {
			return getRuleContexts(CaseSentenceContext.class);
		}
		public CaseSentenceContext caseSentence(int i) {
			return getRuleContext(CaseSentenceContext.class,i);
		}
		public TerminalNode SINO() { return getToken(SLLanguageParser.SINO, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public SwitchSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterSwitchSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitSwitchSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitSwitchSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchSentenceContext switchSentence() throws RecognitionException {
		SwitchSentenceContext _localctx = new SwitchSentenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switchSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__19);
			setState(265);
			match(LIZQ);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266);
				caseSentence();
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(271);
				match(SINO);
				setState(272);
				sentence();
				}
			}

			setState(275);
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

	public static class CaseSentenceContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(SLLanguageParser.PIZQ, 0); }
		public ExpressionBooleanContext expressionBoolean() {
			return getRuleContext(ExpressionBooleanContext.class,0);
		}
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public CaseSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterCaseSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitCaseSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitCaseSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseSentenceContext caseSentence() throws RecognitionException {
		CaseSentenceContext _localctx = new CaseSentenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caseSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__20);
			setState(278);
			match(PIZQ);
			setState(279);
			expressionBoolean();
			setState(280);
			match(PDER);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(281);
				sentence();
				}
				}
				setState(286);
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

	public static class ExpressionBooleanContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterExpressionBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitExpressionBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitExpressionBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionBooleanContext expressionBoolean() throws RecognitionException {
		ExpressionBooleanContext _localctx = new ExpressionBooleanContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expression(0);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(288);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				expression(0);
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
		public TerminalNode PIZQ() { return getToken(SLLanguageParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(SLLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SLLanguageParser.COMA, i);
		}
		public TerminalNode OPERADOR() { return getToken(SLLanguageParser.OPERADOR, 0); }
		public TerminalNode BIZQ() { return getToken(SLLanguageParser.BIZQ, 0); }
		public TerminalNode BDER() { return getToken(SLLanguageParser.BDER, 0); }
		public TerminalNode LIZQ() { return getToken(SLLanguageParser.LIZQ, 0); }
		public TerminalNode LDER() { return getToken(SLLanguageParser.LDER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public CallToFunctionSentenceContext callToFunctionSentence() {
			return getRuleContext(CallToFunctionSentenceContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(SLLanguageParser.SMCOLON, 0); }
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(293);
				match(PIZQ);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << LIZQ) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << ID) | (1L << OPERADOR))) != 0)) {
					{
					setState(294);
					expression(0);
					}
				}

				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(297);
					match(COMA);
					setState(298);
					expression(0);
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(PDER);
				}
				break;
			case 2:
				{
				setState(305);
				match(OPERADOR);
				setState(306);
				expression(5);
				}
				break;
			case 3:
				{
				setState(307);
				match(BIZQ);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << LIZQ) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << ID) | (1L << OPERADOR))) != 0)) {
					{
					setState(308);
					expression(0);
					}
				}

				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(311);
					match(COMA);
					setState(312);
					expression(0);
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				match(BDER);
				}
				break;
			case 4:
				{
				setState(319);
				match(LIZQ);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << LIZQ) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << ID) | (1L << OPERADOR))) != 0)) {
					{
					setState(320);
					expression(0);
					}
				}

				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(323);
					match(COMA);
					setState(324);
					expression(0);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(LDER);
				}
				break;
			case 5:
				{
				setState(331);
				constant();
				}
				break;
			case 6:
				{
				setState(332);
				callToFunctionSentence();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(335);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(336);
					match(OPERADOR);
					setState(337);
					expression(0);
					setState(339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(338);
						match(SMCOLON);
						}
						break;
					}
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SLLanguageParser.NUM, 0); }
		public TerminalNode CADENA() { return getToken(SLLanguageParser.CADENA, 0); }
		public TerminalNode BOOL() { return getToken(SLLanguageParser.BOOL, 0); }
		public TerminalNode DOUBLE() { return getToken(SLLanguageParser.DOUBLE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constant);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(NUM);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(CADENA);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(BOOL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				match(DOUBLE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				id();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(ID);
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(354);
				vector();
				}
				break;
			case 2:
				{
				setState(355);
				functionParameters();
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

	public static class VectorContext extends ParserRuleContext {
		public TerminalNode BIZQ() { return getToken(SLLanguageParser.BIZQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BDER() { return getToken(SLLanguageParser.BDER, 0); }
		public List<TerminalNode> COMA() { return getTokens(SLLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SLLanguageParser.COMA, i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(BIZQ);
			setState(359);
			expression(0);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(360);
				match(COMA);
				setState(361);
				expression(0);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(BDER);
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

	public static class FunctionParametersContext extends ParserRuleContext {
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
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(PIZQ);
			setState(370);
			expression(0);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(371);
				match(COMA);
				setState(372);
				expression(0);
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(PDER);
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
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u017f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\5\2>\n\2\5\2@\n\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3O\n\3\3\3"+
		"\3\3\3\3\5\3T\n\3\3\3\3\3\3\3\5\3Y\n\3\5\3[\n\3\3\4\3\4\3\4\7\4`\n\4\f"+
		"\4\16\4c\13\4\3\4\3\4\6\4g\n\4\r\4\16\4h\3\5\6\5l\n\5\r\5\16\5m\3\6\3"+
		"\6\3\6\7\6s\n\6\f\6\16\6v\13\6\3\6\3\6\6\6z\n\6\r\6\16\6{\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\t\3\t\5\t\u009b\n\t\3\t\3\t\7\t\u009f"+
		"\n\t\f\t\16\t\u00a2\13\t\3\n\6\n\u00a5\n\n\r\n\16\n\u00a6\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b2\n\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\5\r\u00bb\n\r\3\16\3\16\3\16\7\16\u00c0\n\16\f\16\16\16\u00c3"+
		"\13\16\3\17\3\17\5\17\u00c7\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00d2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e9"+
		"\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u00f4\n\24\f\24"+
		"\16\24\u00f7\13\24\3\24\3\24\5\24\u00fb\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0102\n\25\f\25\16\25\u0105\13\25\3\25\3\25\5\25\u0109\n\25\3\26"+
		"\3\26\3\26\6\26\u010e\n\26\r\26\16\26\u010f\3\26\3\26\5\26\u0114\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u011d\n\27\f\27\16\27\u0120\13"+
		"\27\3\30\3\30\3\30\5\30\u0125\n\30\3\31\3\31\3\31\5\31\u012a\n\31\3\31"+
		"\3\31\7\31\u012e\n\31\f\31\16\31\u0131\13\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0138\n\31\3\31\3\31\7\31\u013c\n\31\f\31\16\31\u013f\13\31\3\31"+
		"\3\31\3\31\5\31\u0144\n\31\3\31\3\31\7\31\u0148\n\31\f\31\16\31\u014b"+
		"\13\31\3\31\3\31\3\31\5\31\u0150\n\31\3\31\3\31\3\31\3\31\5\31\u0156\n"+
		"\31\7\31\u0158\n\31\f\31\16\31\u015b\13\31\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0162\n\32\3\33\3\33\3\33\5\33\u0167\n\33\3\34\3\34\3\34\3\34\7\34"+
		"\u016d\n\34\f\34\16\34\u0170\13\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35"+
		"\u0178\n\35\f\35\16\35\u017b\13\35\3\35\3\35\3\35\2\3\60\36\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\3\3\2\30\31\2\u01a2"+
		"\2?\3\2\2\2\4Z\3\2\2\2\6f\3\2\2\2\bk\3\2\2\2\ny\3\2\2\2\f}\3\2\2\2\16"+
		"\u0096\3\2\2\2\20\u009a\3\2\2\2\22\u00a4\3\2\2\2\24\u00b1\3\2\2\2\26\u00b3"+
		"\3\2\2\2\30\u00b6\3\2\2\2\32\u00bc\3\2\2\2\34\u00c6\3\2\2\2\36\u00c8\3"+
		"\2\2\2 \u00d3\3\2\2\2\"\u00db\3\2\2\2$\u00e2\3\2\2\2&\u00ee\3\2\2\2(\u00fc"+
		"\3\2\2\2*\u010a\3\2\2\2,\u0117\3\2\2\2.\u0121\3\2\2\2\60\u014f\3\2\2\2"+
		"\62\u0161\3\2\2\2\64\u0163\3\2\2\2\66\u0168\3\2\2\28\u0173\3\2\2\2:;\7"+
		"\37\2\2;=\7*\2\2<>\7,\2\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?:\3\2\2\2?@\3"+
		"\2\2\2@D\3\2\2\2AC\5\4\3\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3"+
		"\2\2\2FD\3\2\2\2GH\7\35\2\2HI\5\22\n\2IJ\7\36\2\2J\3\3\2\2\2KL\7\3\2\2"+
		"LN\5\6\4\2MO\7,\2\2NM\3\2\2\2NO\3\2\2\2O[\3\2\2\2PQ\7\4\2\2QS\5\b\5\2"+
		"RT\7,\2\2SR\3\2\2\2ST\3\2\2\2T[\3\2\2\2UV\7\5\2\2VX\5\n\6\2WY\7,\2\2X"+
		"W\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZK\3\2\2\2ZP\3\2\2\2ZU\3\2\2\2[\5\3\2\2\2"+
		"\\a\7*\2\2]^\7-\2\2^`\7*\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b"+
		"d\3\2\2\2ca\3\2\2\2de\7\6\2\2eg\5\60\31\2f\\\3\2\2\2gh\3\2\2\2hf\3\2\2"+
		"\2hi\3\2\2\2i\7\3\2\2\2jl\5\f\7\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2n\t\3\2\2\2ot\7*\2\2pq\7-\2\2qs\7*\2\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2"+
		"\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\7\2\2xz\5\16\b\2yo\3\2\2\2z{\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|\13\3\2\2\2}~\7*\2\2~\177\7\7\2\2\177\u0080\5"+
		"\16\b\2\u0080\r\3\2\2\2\u0081\u0082\7\b\2\2\u0082\u0083\7\"\2\2\u0083"+
		"\u0084\5\20\t\2\u0084\u0085\7#\2\2\u0085\u0086\5\16\b\2\u0086\u0097\3"+
		"\2\2\2\u0087\u0088\7\t\2\2\u0088\u0089\7\"\2\2\u0089\u008a\5\20\t\2\u008a"+
		"\u008b\7#\2\2\u008b\u008c\5\16\b\2\u008c\u0097\3\2\2\2\u008d\u008e\7\n"+
		"\2\2\u008e\u008f\7$\2\2\u008f\u0090\5\n\6\2\u0090\u0091\7%\2\2\u0091\u0097"+
		"\3\2\2\2\u0092\u0097\7\13\2\2\u0093\u0097\7\f\2\2\u0094\u0097\7\r\2\2"+
		"\u0095\u0097\7*\2\2\u0096\u0081\3\2\2\2\u0096\u0087\3\2\2\2\u0096\u008d"+
		"\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\17\3\2\2\2\u0098\u009b\7.\2\2\u0099\u009b\5\60\31"+
		"\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u00a0\3\2\2\2\u009c\u009d"+
		"\7-\2\2\u009d\u009f\5\20\t\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\21\3\2\2\2\u00a2\u00a0\3\2\2"+
		"\2\u00a3\u00a5\5\24\13\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\23\3\2\2\2\u00a8\u00b2\5\36\20"+
		"\2\u00a9\u00b2\5$\23\2\u00aa\u00b2\5 \21\2\u00ab\u00b2\5&\24\2\u00ac\u00b2"+
		"\5(\25\2\u00ad\u00b2\5*\26\2\u00ae\u00b2\5\"\22\2\u00af\u00b2\5\30\r\2"+
		"\u00b0\u00b2\5\26\f\2\u00b1\u00a8\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa"+
		"\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\25\3\2\2"+
		"\2\u00b3\u00b4\7*\2\2\u00b4\u00b5\58\35\2\u00b5\27\3\2\2\2\u00b6\u00b7"+
		"\7*\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00ba\5\60\31\2\u00b9\u00bb\7,\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00c1\5\22\n"+
		"\2\u00bd\u00be\7\32\2\2\u00be\u00c0\5\34\17\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\33\3\2\2"+
		"\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\5\36\20\2\u00c5\u00c7\5\24\13\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\35\3\2\2\2\u00c8\u00c9\7\16\2"+
		"\2\u00c9\u00ca\7 \2\2\u00ca\u00cb\5.\30\2\u00cb\u00d1\7!\2\2\u00cc\u00cd"+
		"\7$\2\2\u00cd\u00ce\5\32\16\2\u00ce\u00cf\7%\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00d2\5\24\13\2\u00d1\u00cc\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\37\3\2"+
		"\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\7 \2\2\u00d5\u00d6\5\60\31\2\u00d6"+
		"\u00d7\7!\2\2\u00d7\u00d8\7$\2\2\u00d8\u00d9\5\22\n\2\u00d9\u00da\7%\2"+
		"\2\u00da!\3\2\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd\5\22\n\2\u00dd\u00de"+
		"\7\21\2\2\u00de\u00df\7 \2\2\u00df\u00e0\5\60\31\2\u00e0\u00e1\7!\2\2"+
		"\u00e1#\3\2\2\2\u00e2\u00e3\7\22\2\2\u00e3\u00e4\5\30\r\2\u00e4\u00e5"+
		"\7\21\2\2\u00e5\u00e8\5\60\31\2\u00e6\u00e7\7\23\2\2\u00e7\u00e9\5\60"+
		"\31\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\7$\2\2\u00eb\u00ec\5\22\n\2\u00ec\u00ed\7%\2\2\u00ed%\3\2\2\2\u00ee"+
		"\u00ef\7\24\2\2\u00ef\u00f0\7 \2\2\u00f0\u00f5\5\60\31\2\u00f1\u00f2\7"+
		"-\2\2\u00f2\u00f4\5\60\31\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fa\7!\2\2\u00f9\u00fb\7,\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\'\3\2\2\2\u00fc\u00fd\7\25\2\2\u00fd\u00fe\7 \2\2\u00fe"+
		"\u0103\5\60\31\2\u00ff\u0100\7-\2\2\u0100\u0102\5\60\31\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\7!\2\2\u0107\u0109\7,\2"+
		"\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109)\3\2\2\2\u010a\u010b"+
		"\7\26\2\2\u010b\u010d\7$\2\2\u010c\u010e\5,\27\2\u010d\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u0112\7\32\2\2\u0112\u0114\5\24\13\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7%\2\2\u0116+\3\2\2\2\u0117"+
		"\u0118\7\27\2\2\u0118\u0119\7 \2\2\u0119\u011a\5.\30\2\u011a\u011e\7!"+
		"\2\2\u011b\u011d\5\24\13\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f-\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0121\u0124\5\60\31\2\u0122\u0123\t\2\2\2\u0123\u0125\5\60\31\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125/\3\2\2\2\u0126\u0127\b\31\1\2"+
		"\u0127\u0129\7 \2\2\u0128\u012a\5\60\31\2\u0129\u0128\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012f\3\2\2\2\u012b\u012c\7-\2\2\u012c\u012e\5\60\31\2"+
		"\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0150\7!\2\2\u0133"+
		"\u0134\7.\2\2\u0134\u0150\5\60\31\7\u0135\u0137\7\"\2\2\u0136\u0138\5"+
		"\60\31\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013d\3\2\2\2\u0139"+
		"\u013a\7-\2\2\u013a\u013c\5\60\31\2\u013b\u0139\3\2\2\2\u013c\u013f\3"+
		"\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0150\7#\2\2\u0141\u0143\7$\2\2\u0142\u0144\5\60"+
		"\31\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149\3\2\2\2\u0145"+
		"\u0146\7-\2\2\u0146\u0148\5\60\31\2\u0147\u0145\3\2\2\2\u0148\u014b\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u0150\7%\2\2\u014d\u0150\5\62\32\2\u014e\u0150\5"+
		"\26\f\2\u014f\u0126\3\2\2\2\u014f\u0133\3\2\2\2\u014f\u0135\3\2\2\2\u014f"+
		"\u0141\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0159\3\2"+
		"\2\2\u0151\u0152\f\t\2\2\u0152\u0153\7.\2\2\u0153\u0155\5\60\31\2\u0154"+
		"\u0156\7,\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2"+
		"\2\2\u0157\u0151\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\61\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0162\7&\2\2"+
		"\u015d\u0162\7)\2\2\u015e\u0162\7(\2\2\u015f\u0162\7\'\2\2\u0160\u0162"+
		"\5\64\33\2\u0161\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015e\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\63\3\2\2\2\u0163\u0166"+
		"\7*\2\2\u0164\u0167\5\66\34\2\u0165\u0167\58\35\2\u0166\u0164\3\2\2\2"+
		"\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\65\3\2\2\2\u0168\u0169"+
		"\7\"\2\2\u0169\u016e\5\60\31\2\u016a\u016b\7-\2\2\u016b\u016d\5\60\31"+
		"\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7#\2\2\u0172"+
		"\67\3\2\2\2\u0173\u0174\7 \2\2\u0174\u0179\5\60\31\2\u0175\u0176\7-\2"+
		"\2\u0176\u0178\5\60\31\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017c\u017d\7!\2\2\u017d9\3\2\2\2-=?DNSXZahmt{\u0096\u009a\u00a0"+
		"\u00a6\u00b1\u00ba\u00c1\u00c6\u00d1\u00e8\u00f5\u00fa\u0103\u0108\u010f"+
		"\u0113\u011e\u0124\u0129\u012f\u0137\u013d\u0143\u0149\u014f\u0155\u0159"+
		"\u0161\u0166\u016e\u0179";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}