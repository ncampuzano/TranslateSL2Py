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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, SINO=24, MULTOP=25, 
		COMMENT=26, LINE_COMMENT=27, INICIO=28, FIN=29, PROGRAMA=30, PIZQ=31, 
		PDER=32, BIZQ=33, BDER=34, LIZQ=35, LDER=36, ID=37, ESP=38, NUM=39, DOUBLE=40, 
		BOOL=41, CADENA=42, SMCOLON=43, COMA=44, OPERADOR=45, ROP=46, CALLFUNCTION=47;
	public static final int
		RULE_s = 0, RULE_settings = 1, RULE_assignationConst = 2, RULE_assignationTypes = 3, 
		RULE_assignationVar = 4, RULE_objeto = 5, RULE_tipo = 6, RULE_tipoVector = 7, 
		RULE_body = 8, RULE_sentence = 9, RULE_assignationSentence = 10, RULE_bodyIfSentence = 11, 
		RULE_sinoSentence = 12, RULE_ifSentence = 13, RULE_whileSentence = 14, 
		RULE_doWhileSentence = 15, RULE_repeatSentence = 16, RULE_printSentence = 17, 
		RULE_readSentence = 18, RULE_switchSentence = 19, RULE_caseSentence = 20, 
		RULE_expressionBoolean = 21, RULE_expression = 22, RULE_constant = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "settings", "assignationConst", "assignationTypes", "assignationVar", 
			"objeto", "tipo", "tipoVector", "body", "sentence", "assignationSentence", 
			"bodyIfSentence", "sinoSentence", "ifSentence", "whileSentence", "doWhileSentence", 
			"repeatSentence", "printSentence", "readSentence", "switchSentence", 
			"caseSentence", "expressionBoolean", "expression", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'tipos'", "'var'", "'='", "':'", "'vector'", "'matriz'", 
			"'registro'", "'numerico'", "'cadena'", "'logico'", "'si'", "'mientras'", 
			"'repetir'", "'hasta'", "'desde'", "'paso'", "'imprimir'", "'leer'", 
			"'eval'", "'caso'", "'and'", "'or'", "'sino'", "'*'", null, null, "'inicio'", 
			"'fin'", "'programa'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, 
			null, null, null, null, null, "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SINO", "MULTOP", "COMMENT", "LINE_COMMENT", "INICIO", "FIN", "PROGRAMA", 
			"PIZQ", "PDER", "BIZQ", "BDER", "LIZQ", "LDER", "ID", "ESP", "NUM", "DOUBLE", 
			"BOOL", "CADENA", "SMCOLON", "COMA", "OPERADOR", "ROP", "CALLFUNCTION"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAMA) {
				{
				setState(48);
				match(PROGRAMA);
				setState(49);
				match(ID);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(50);
					match(SMCOLON);
					}
				}

				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(55);
				settings();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(INICIO);
			setState(62);
			body();
			setState(63);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__0);
				setState(66);
				assignationConst();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(67);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__1);
				setState(71);
				assignationTypes();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(72);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(T__2);
				setState(76);
				assignationVar();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(77);
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
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				match(ID);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(83);
					match(COMA);
					setState(84);
					match(ID);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(T__3);
				setState(91);
				expression(0);
				}
				}
				setState(94); 
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
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				objeto();
				}
				}
				setState(99); 
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
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				match(ID);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(102);
					match(COMA);
					setState(103);
					match(ID);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(T__4);
				setState(110);
				tipo();
				}
				}
				setState(113); 
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
			setState(115);
			match(ID);
			setState(116);
			match(T__4);
			setState(117);
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__5);
				setState(120);
				match(BIZQ);
				setState(121);
				tipoVector();
				setState(122);
				match(BDER);
				setState(123);
				tipo();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__6);
				setState(126);
				match(BIZQ);
				setState(127);
				tipoVector();
				setState(128);
				match(BDER);
				setState(129);
				tipo();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(T__7);
				setState(132);
				match(LIZQ);
				setState(133);
				assignationVar();
				setState(134);
				match(LDER);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(T__10);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
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
		public TerminalNode MULTOP() { return getToken(SLLanguageParser.MULTOP, 0); }
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTOP:
				{
				setState(142);
				match(MULTOP);
				}
				break;
			case PIZQ:
			case BIZQ:
			case ID:
			case NUM:
			case DOUBLE:
			case BOOL:
			case CADENA:
			case OPERADOR:
			case CALLFUNCTION:
				{
				setState(143);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					match(COMA);
					setState(147);
					tipoVector();
					}
					} 
				}
				setState(152);
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
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				sentence();
				}
				}
				setState(156); 
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
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				ifSentence();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				repeatSentence();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				whileSentence();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				printSentence();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				readSentence();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				switchSentence();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				doWhileSentence();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				assignationSentence();
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
		enterRule(_localctx, 20, RULE_assignationSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(T__3);
			setState(170);
			expression(0);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(171);
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
		enterRule(_localctx, 22, RULE_bodyIfSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			body();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINO) {
				{
				{
				setState(175);
				match(SINO);
				setState(176);
				sinoSentence();
				}
				}
				setState(181);
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
		enterRule(_localctx, 24, RULE_sinoSentence);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				ifSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		enterRule(_localctx, 26, RULE_ifSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__11);
			setState(187);
			match(PIZQ);
			setState(188);
			expressionBoolean();
			setState(189);
			match(PDER);
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIZQ:
				{
				setState(190);
				match(LIZQ);
				setState(191);
				bodyIfSentence();
				setState(192);
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
				setState(194);
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
		enterRule(_localctx, 28, RULE_whileSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__12);
			setState(198);
			match(PIZQ);
			setState(199);
			expression(0);
			setState(200);
			match(PDER);
			setState(201);
			match(LIZQ);
			setState(202);
			body();
			setState(203);
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
		enterRule(_localctx, 30, RULE_doWhileSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__13);
			setState(206);
			body();
			setState(207);
			match(T__14);
			setState(208);
			match(PIZQ);
			setState(209);
			expression(0);
			setState(210);
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
		enterRule(_localctx, 32, RULE_repeatSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__15);
			setState(213);
			assignationSentence();
			setState(214);
			match(T__14);
			setState(215);
			expression(0);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(216);
				match(T__16);
				setState(217);
				expression(0);
				}
			}

			setState(220);
			match(LIZQ);
			setState(221);
			body();
			setState(222);
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
		enterRule(_localctx, 34, RULE_printSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__17);
			setState(225);
			match(PIZQ);
			setState(226);
			expression(0);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(227);
				match(COMA);
				setState(228);
				expression(0);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(PDER);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(235);
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
		enterRule(_localctx, 36, RULE_readSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__18);
			setState(239);
			match(PIZQ);
			setState(240);
			expression(0);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(241);
				match(COMA);
				setState(242);
				expression(0);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(PDER);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(249);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_switchSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__19);
			setState(253);
			match(LIZQ);
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				caseSentence();
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(259);
				match(SINO);
				setState(260);
				expression(0);
				}
			}

			setState(263);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 40, RULE_caseSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__20);
			setState(266);
			match(PIZQ);
			setState(267);
			expressionBoolean();
			setState(268);
			match(PDER);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << ID) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << OPERADOR) | (1L << CALLFUNCTION))) != 0)) {
				{
				{
				setState(269);
				expression(0);
				}
				}
				setState(274);
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
		enterRule(_localctx, 42, RULE_expressionBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			expression(0);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(276);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(277);
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
		public TerminalNode OPERADOR() { return getToken(SLLanguageParser.OPERADOR, 0); }
		public TerminalNode BIZQ() { return getToken(SLLanguageParser.BIZQ, 0); }
		public TerminalNode BDER() { return getToken(SLLanguageParser.BDER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				setState(281);
				match(PIZQ);
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(282);
					expression(0);
					}
					}
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << ID) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << OPERADOR) | (1L << CALLFUNCTION))) != 0) );
				setState(287);
				match(PDER);
				}
				break;
			case OPERADOR:
				{
				setState(289);
				match(OPERADOR);
				setState(290);
				expression(3);
				}
				break;
			case BIZQ:
				{
				setState(291);
				match(BIZQ);
				setState(292);
				expression(0);
				setState(293);
				match(BDER);
				}
				break;
			case ID:
			case NUM:
			case DOUBLE:
			case BOOL:
			case CADENA:
			case CALLFUNCTION:
				{
				setState(295);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(298);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(299);
					match(OPERADOR);
					setState(300);
					expression(0);
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(301);
						match(SMCOLON);
						}
						break;
					}
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode CALLFUNCTION() { return getToken(SLLanguageParser.CALLFUNCTION, 0); }
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
		enterRule(_localctx, 46, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << CALLFUNCTION))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u013a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\5\2\66\n\2\5\28\n\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\5\3L\n\3\3\3\3\3\3\3\5\3Q\n\3"+
		"\5\3S\n\3\3\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\6\4_\n\4\r\4\16"+
		"\4`\3\5\6\5d\n\5\r\5\16\5e\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6"+
		"\6\6r\n\6\r\6\16\6s\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\t\3"+
		"\t\5\t\u0093\n\t\3\t\3\t\7\t\u0097\n\t\f\t\16\t\u009a\13\t\3\n\6\n\u009d"+
		"\n\n\r\n\16\n\u009e\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a9"+
		"\n\13\3\f\3\f\3\f\3\f\5\f\u00af\n\f\3\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r"+
		"\u00b7\13\r\3\16\3\16\5\16\u00bb\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00c6\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00dd\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00e8\n"+
		"\23\f\23\16\23\u00eb\13\23\3\23\3\23\5\23\u00ef\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u00f6\n\24\f\24\16\24\u00f9\13\24\3\24\3\24\5\24\u00fd\n"+
		"\24\3\25\3\25\3\25\6\25\u0102\n\25\r\25\16\25\u0103\3\25\3\25\5\25\u0108"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u0111\n\26\f\26\16\26\u0114"+
		"\13\26\3\27\3\27\3\27\5\27\u0119\n\27\3\30\3\30\3\30\6\30\u011e\n\30\r"+
		"\30\16\30\u011f\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u012b"+
		"\n\30\3\30\3\30\3\30\3\30\5\30\u0131\n\30\7\30\u0133\n\30\f\30\16\30\u0136"+
		"\13\30\3\31\3\31\3\31\2\3.\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\2\4\3\2\30\31\5\2\'\'),\61\61\2\u0151\2\67\3\2\2\2\4R\3\2"+
		"\2\2\6^\3\2\2\2\bc\3\2\2\2\nq\3\2\2\2\fu\3\2\2\2\16\u008e\3\2\2\2\20\u0092"+
		"\3\2\2\2\22\u009c\3\2\2\2\24\u00a8\3\2\2\2\26\u00aa\3\2\2\2\30\u00b0\3"+
		"\2\2\2\32\u00ba\3\2\2\2\34\u00bc\3\2\2\2\36\u00c7\3\2\2\2 \u00cf\3\2\2"+
		"\2\"\u00d6\3\2\2\2$\u00e2\3\2\2\2&\u00f0\3\2\2\2(\u00fe\3\2\2\2*\u010b"+
		"\3\2\2\2,\u0115\3\2\2\2.\u012a\3\2\2\2\60\u0137\3\2\2\2\62\63\7 \2\2\63"+
		"\65\7\'\2\2\64\66\7-\2\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\62"+
		"\3\2\2\2\678\3\2\2\28<\3\2\2\29;\5\4\3\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\36\2\2@A\5\22\n\2AB\7\37\2\2B\3\3\2"+
		"\2\2CD\7\3\2\2DF\5\6\4\2EG\7-\2\2FE\3\2\2\2FG\3\2\2\2GS\3\2\2\2HI\7\4"+
		"\2\2IK\5\b\5\2JL\7-\2\2KJ\3\2\2\2KL\3\2\2\2LS\3\2\2\2MN\7\5\2\2NP\5\n"+
		"\6\2OQ\7-\2\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RC\3\2\2\2RH\3\2\2\2RM\3\2"+
		"\2\2S\5\3\2\2\2TY\7\'\2\2UV\7.\2\2VX\7\'\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\6\2\2]_\5.\30\2^T\3\2\2\2_`\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2a\7\3\2\2\2bd\5\f\7\2cb\3\2\2\2de\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2f\t\3\2\2\2gl\7\'\2\2hi\7.\2\2ik\7\'\2\2jh\3\2\2\2k"+
		"n\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\7\2\2pr\5\16\b\2"+
		"qg\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\13\3\2\2\2uv\7\'\2\2vw\7\7\2"+
		"\2wx\5\16\b\2x\r\3\2\2\2yz\7\b\2\2z{\7#\2\2{|\5\20\t\2|}\7$\2\2}~\5\16"+
		"\b\2~\u008f\3\2\2\2\177\u0080\7\t\2\2\u0080\u0081\7#\2\2\u0081\u0082\5"+
		"\20\t\2\u0082\u0083\7$\2\2\u0083\u0084\5\16\b\2\u0084\u008f\3\2\2\2\u0085"+
		"\u0086\7\n\2\2\u0086\u0087\7%\2\2\u0087\u0088\5\n\6\2\u0088\u0089\7&\2"+
		"\2\u0089\u008f\3\2\2\2\u008a\u008f\7\13\2\2\u008b\u008f\7\f\2\2\u008c"+
		"\u008f\7\r\2\2\u008d\u008f\7\'\2\2\u008ey\3\2\2\2\u008e\177\3\2\2\2\u008e"+
		"\u0085\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008d\3\2\2\2\u008f\17\3\2\2\2\u0090\u0093\7\33\2\2\u0091\u0093"+
		"\5.\30\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0098\3\2\2\2\u0094"+
		"\u0095\7.\2\2\u0095\u0097\5\20\t\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\21\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009d\5\24\13\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a9"+
		"\5\34\17\2\u00a1\u00a9\5\"\22\2\u00a2\u00a9\5\36\20\2\u00a3\u00a9\5$\23"+
		"\2\u00a4\u00a9\5&\24\2\u00a5\u00a9\5(\25\2\u00a6\u00a9\5 \21\2\u00a7\u00a9"+
		"\5\26\f\2\u00a8\u00a0\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a2\3\2\2\2"+
		"\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\7\'\2\2\u00ab"+
		"\u00ac\7\6\2\2\u00ac\u00ae\5.\30\2\u00ad\u00af\7-\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00b5\5\22\n\2\u00b1\u00b2"+
		"\7\32\2\2\u00b2\u00b4\5\32\16\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2"+
		"\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00bb\5\34\17\2\u00b9\u00bb\5\24\13\2\u00ba\u00b8\3\2\2"+
		"\2\u00ba\u00b9\3\2\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\7\16\2\2\u00bd\u00be"+
		"\7!\2\2\u00be\u00bf\5,\27\2\u00bf\u00c5\7\"\2\2\u00c0\u00c1\7%\2\2\u00c1"+
		"\u00c2\5\30\r\2\u00c2\u00c3\7&\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c6\5\24"+
		"\13\2\u00c5\u00c0\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00c8"+
		"\7\17\2\2\u00c8\u00c9\7!\2\2\u00c9\u00ca\5.\30\2\u00ca\u00cb\7\"\2\2\u00cb"+
		"\u00cc\7%\2\2\u00cc\u00cd\5\22\n\2\u00cd\u00ce\7&\2\2\u00ce\37\3\2\2\2"+
		"\u00cf\u00d0\7\20\2\2\u00d0\u00d1\5\22\n\2\u00d1\u00d2\7\21\2\2\u00d2"+
		"\u00d3\7!\2\2\u00d3\u00d4\5.\30\2\u00d4\u00d5\7\"\2\2\u00d5!\3\2\2\2\u00d6"+
		"\u00d7\7\22\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00d9\7\21\2\2\u00d9\u00dc"+
		"\5.\30\2\u00da\u00db\7\23\2\2\u00db\u00dd\5.\30\2\u00dc\u00da\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7%\2\2\u00df\u00e0"+
		"\5\22\n\2\u00e0\u00e1\7&\2\2\u00e1#\3\2\2\2\u00e2\u00e3\7\24\2\2\u00e3"+
		"\u00e4\7!\2\2\u00e4\u00e9\5.\30\2\u00e5\u00e6\7.\2\2\u00e6\u00e8\5.\30"+
		"\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\7\"\2\2\u00ed"+
		"\u00ef\7-\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef%\3\2\2\2\u00f0"+
		"\u00f1\7\25\2\2\u00f1\u00f2\7!\2\2\u00f2\u00f7\5.\30\2\u00f3\u00f4\7."+
		"\2\2\u00f4\u00f6\5.\30\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fc\7\"\2\2\u00fb\u00fd\7-\2\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\'\3\2\2\2\u00fe\u00ff\7\26\2\2\u00ff\u0101\7%\2\2"+
		"\u0100\u0102\5*\26\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106\7\32\2\2"+
		"\u0106\u0108\5.\30\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\7&\2\2\u010a)\3\2\2\2\u010b\u010c\7\27\2\2\u010c"+
		"\u010d\7!\2\2\u010d\u010e\5,\27\2\u010e\u0112\7\"\2\2\u010f\u0111\5.\30"+
		"\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113+\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0118\5.\30\2\u0116"+
		"\u0117\t\2\2\2\u0117\u0119\5.\30\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119-\3\2\2\2\u011a\u011b\b\30\1\2\u011b\u011d\7!\2\2\u011c\u011e"+
		"\5.\30\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\"\2\2\u0122\u012b\3\2"+
		"\2\2\u0123\u0124\7/\2\2\u0124\u012b\5.\30\5\u0125\u0126\7#\2\2\u0126\u0127"+
		"\5.\30\2\u0127\u0128\7$\2\2\u0128\u012b\3\2\2\2\u0129\u012b\5\60\31\2"+
		"\u012a\u011a\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u0129"+
		"\3\2\2\2\u012b\u0134\3\2\2\2\u012c\u012d\f\7\2\2\u012d\u012e\7/\2\2\u012e"+
		"\u0130\5.\30\2\u012f\u0131\7-\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0133\3\2\2\2\u0132\u012c\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135/\3\2\2\2\u0136\u0134\3\2\2\2"+
		"\u0137\u0138\t\3\2\2\u0138\61\3\2\2\2$\65\67<FKPRY`els\u008e\u0092\u0098"+
		"\u009e\u00a8\u00ae\u00b5\u00ba\u00c5\u00dc\u00e9\u00ee\u00f7\u00fc\u0103"+
		"\u0107\u0112\u0118\u011f\u012a\u0130\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}