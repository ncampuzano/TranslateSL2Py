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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, COMMENT=24, 
		LINE_COMMENT=25, INICIO=26, FIN=27, PROGRAMA=28, PIZQ=29, PDER=30, BIZQ=31, 
		BDER=32, LIZQ=33, LDER=34, ID=35, ESP=36, NUM=37, DOUBLE=38, BOOL=39, 
		CADENA=40, SMCOLON=41, COMA=42, OPERADOR=43, ROP=44;
	public static final int
		RULE_s = 0, RULE_settings = 1, RULE_assignationConst = 2, RULE_assignationTypes = 3, 
		RULE_assignationVar = 4, RULE_objeto = 5, RULE_tipo = 6, RULE_tipoVector = 7, 
		RULE_constant = 8, RULE_body = 9, RULE_sentence = 10, RULE_ifSentence = 11, 
		RULE_repeatSentence = 12, RULE_whileSentence = 13, RULE_printSentence = 14, 
		RULE_readSentence = 15, RULE_switchSentence = 16, RULE_caseSentence = 17, 
		RULE_expressionBoolean = 18, RULE_expression = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "settings", "assignationConst", "assignationTypes", "assignationVar", 
			"objeto", "tipo", "tipoVector", "constant", "body", "sentence", "ifSentence", 
			"repeatSentence", "whileSentence", "printSentence", "readSentence", "switchSentence", 
			"caseSentence", "expressionBoolean", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'tipos'", "'var'", "'='", "':'", "'numerico'", "'cadena'", 
			"'logico'", "'vector'", "'matriz'", "'registro'", "'si'", "'repetir'", 
			"'desde'", "'hasta'", "'paso'", "'imprimir'", "'leer'", "'eval'", "'sino'", 
			"'caso'", "'and'", "'or'", null, null, "'inicio'", "'fin'", "'programa'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", null, null, null, null, null, 
			null, "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"COMMENT", "LINE_COMMENT", "INICIO", "FIN", "PROGRAMA", "PIZQ", "PDER", 
			"BIZQ", "BDER", "LIZQ", "LDER", "ID", "ESP", "NUM", "DOUBLE", "BOOL", 
			"CADENA", "SMCOLON", "COMA", "OPERADOR", "ROP"
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAMA) {
				{
				setState(40);
				match(PROGRAMA);
				setState(41);
				match(ID);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(42);
					match(SMCOLON);
					}
				}

				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(47);
				settings();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(INICIO);
			setState(54);
			body();
			setState(55);
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
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__0);
				setState(58);
				assignationConst();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(59);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__1);
				setState(63);
				assignationTypes();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(64);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(T__2);
				setState(68);
				assignationVar();
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(69);
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
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				match(ID);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(75);
					match(COMA);
					setState(76);
					match(ID);
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(T__3);
				setState(83);
				expression(0);
				}
				}
				setState(86); 
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
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				objeto();
				}
				}
				setState(91); 
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
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				match(ID);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(94);
					match(COMA);
					setState(95);
					match(ID);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(T__4);
				setState(102);
				tipo();
				}
				}
				setState(105); 
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
			setState(107);
			match(ID);
			setState(108);
			match(T__4);
			setState(109);
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
		public TipoVectorContext tipoVector() {
			return getRuleContext(TipoVectorContext.class,0);
		}
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode BDER() { return getToken(SLLanguageParser.BDER, 0); }
		public TerminalNode LIZQ() { return getToken(SLLanguageParser.LIZQ, 0); }
		public AssignationVarContext assignationVar() {
			return getRuleContext(AssignationVarContext.class,0);
		}
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(T__7);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(ID);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(T__8);
				setState(116);
				match(BIZQ);
				setState(117);
				tipoVector();
				setState(118);
				match(PDER);
				setState(119);
				tipo();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(T__9);
				setState(122);
				match(BIZQ);
				setState(123);
				tipoVector();
				setState(124);
				match(BDER);
				setState(125);
				tipo();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				match(T__10);
				setState(128);
				match(LIZQ);
				setState(129);
				assignationVar();
				setState(130);
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

	public static class TipoVectorContext extends ParserRuleContext {
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
			setState(134);
			expression(0);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					match(COMA);
					setState(136);
					tipoVector();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SLLanguageParser.NUM, 0); }
		public TerminalNode CADENA() { return getToken(SLLanguageParser.CADENA, 0); }
		public TerminalNode BOOL() { return getToken(SLLanguageParser.BOOL, 0); }
		public TerminalNode DOUBLE() { return getToken(SLLanguageParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
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
		enterRule(_localctx, 16, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		enterRule(_localctx, 18, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				sentence();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << PIZQ) | (1L << BIZQ) | (1L << ID) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << OPERADOR))) != 0) );
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
		enterRule(_localctx, 20, RULE_sentence);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				ifSentence();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				repeatSentence();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				whileSentence();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				printSentence();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				readSentence();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				switchSentence();
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
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
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
		enterRule(_localctx, 22, RULE_ifSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 24, RULE_repeatSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		enterRule(_localctx, 26, RULE_whileSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__13);
			setState(163);
			expression(0);
			setState(164);
			match(T__14);
			setState(165);
			expression(0);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(166);
				match(T__15);
				setState(167);
				expression(0);
				}
			}

			setState(170);
			match(LIZQ);
			setState(171);
			body();
			setState(172);
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
		enterRule(_localctx, 28, RULE_printSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__16);
			setState(175);
			match(PIZQ);
			setState(176);
			expression(0);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(177);
				match(COMA);
				setState(178);
				expression(0);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(PDER);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(185);
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
		public List<TerminalNode> ID() { return getTokens(SLLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLLanguageParser.ID, i);
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
		enterRule(_localctx, 30, RULE_readSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__17);
			setState(189);
			match(PIZQ);
			setState(190);
			match(ID);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(191);
				match(COMA);
				setState(192);
				match(ID);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(PDER);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(199);
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
		enterRule(_localctx, 32, RULE_switchSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__18);
			setState(203);
			match(LIZQ);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				caseSentence();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(209);
				match(T__19);
				setState(210);
				expression(0);
				}
			}

			setState(213);
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
		enterRule(_localctx, 34, RULE_caseSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__20);
			setState(216);
			match(PIZQ);
			setState(217);
			expressionBoolean();
			setState(218);
			match(PDER);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << ID) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << OPERADOR))) != 0)) {
				{
				{
				setState(219);
				expression(0);
				}
				}
				setState(224);
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
		enterRule(_localctx, 36, RULE_expressionBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expression(0);
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			expression(0);
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
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode SMCOLON() { return getToken(SLLanguageParser.SMCOLON, 0); }
		public TerminalNode OPERADOR() { return getToken(SLLanguageParser.OPERADOR, 0); }
		public TerminalNode BIZQ() { return getToken(SLLanguageParser.BIZQ, 0); }
		public TerminalNode BDER() { return getToken(SLLanguageParser.BDER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(230);
				match(PIZQ);
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(231);
					expression(0);
					}
					}
					setState(234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << ID) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << OPERADOR))) != 0) );
				setState(236);
				match(PDER);
				}
				break;
			case 2:
				{
				setState(238);
				match(ID);
				setState(239);
				match(T__3);
				setState(240);
				expression(0);
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(241);
					match(SMCOLON);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(244);
				match(OPERADOR);
				setState(245);
				expression(3);
				}
				break;
			case 4:
				{
				setState(246);
				match(BIZQ);
				setState(247);
				expression(0);
				setState(248);
				match(BDER);
				}
				break;
			case 5:
				{
				setState(250);
				constant();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(253);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(254);
					match(OPERADOR);
					setState(255);
					expression(0);
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(256);
						match(SMCOLON);
						}
						break;
					}
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\5\2.\n\2\5\2\60\n\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3?\n\3\3\3\3\3"+
		"\3\3\5\3D\n\3\3\3\3\3\3\3\5\3I\n\3\5\3K\n\3\3\4\3\4\3\4\7\4P\n\4\f\4\16"+
		"\4S\13\4\3\4\3\4\6\4W\n\4\r\4\16\4X\3\5\6\5\\\n\5\r\5\16\5]\3\6\3\6\3"+
		"\6\7\6c\n\6\f\6\16\6f\13\6\3\6\3\6\6\6j\n\6\r\6\16\6k\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u0087\n\b\3\t\3\t\3\t\7\t\u008c\n\t\f\t\16\t\u008f"+
		"\13\t\3\n\3\n\3\13\6\13\u0094\n\13\r\13\16\13\u0095\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u009f\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00ab\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00b6\n\20\f\20\16\20\u00b9\13\20\3\20\3\20\5\20\u00bd\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u00c4\n\21\f\21\16\21\u00c7\13\21\3\21\3\21\5\21"+
		"\u00cb\n\21\3\22\3\22\3\22\6\22\u00d0\n\22\r\22\16\22\u00d1\3\22\3\22"+
		"\5\22\u00d6\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00df\n\23\f"+
		"\23\16\23\u00e2\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\6\25\u00eb\n"+
		"\25\r\25\16\25\u00ec\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f5\n\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00fe\n\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0104\n\25\7\25\u0106\n\25\f\25\16\25\u0109\13\25\3\25\2\3(\26\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\4\2%%\'*\3\2\30\31\2\u0121"+
		"\2/\3\2\2\2\4J\3\2\2\2\6V\3\2\2\2\b[\3\2\2\2\ni\3\2\2\2\fm\3\2\2\2\16"+
		"\u0086\3\2\2\2\20\u0088\3\2\2\2\22\u0090\3\2\2\2\24\u0093\3\2\2\2\26\u009e"+
		"\3\2\2\2\30\u00a0\3\2\2\2\32\u00a2\3\2\2\2\34\u00a4\3\2\2\2\36\u00b0\3"+
		"\2\2\2 \u00be\3\2\2\2\"\u00cc\3\2\2\2$\u00d9\3\2\2\2&\u00e3\3\2\2\2(\u00fd"+
		"\3\2\2\2*+\7\36\2\2+-\7%\2\2,.\7+\2\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2"+
		"/*\3\2\2\2/\60\3\2\2\2\60\64\3\2\2\2\61\63\5\4\3\2\62\61\3\2\2\2\63\66"+
		"\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7"+
		"\34\2\289\5\24\13\29:\7\35\2\2:\3\3\2\2\2;<\7\3\2\2<>\5\6\4\2=?\7+\2\2"+
		">=\3\2\2\2>?\3\2\2\2?K\3\2\2\2@A\7\4\2\2AC\5\b\5\2BD\7+\2\2CB\3\2\2\2"+
		"CD\3\2\2\2DK\3\2\2\2EF\7\5\2\2FH\5\n\6\2GI\7+\2\2HG\3\2\2\2HI\3\2\2\2"+
		"IK\3\2\2\2J;\3\2\2\2J@\3\2\2\2JE\3\2\2\2K\5\3\2\2\2LQ\7%\2\2MN\7,\2\2"+
		"NP\7%\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2"+
		"TU\7\6\2\2UW\5(\25\2VL\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\7\3\2\2"+
		"\2Z\\\5\f\7\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_d\7"+
		"%\2\2`a\7,\2\2ac\7%\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2"+
		"\2\2fd\3\2\2\2gh\7\7\2\2hj\5\16\b\2i_\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3"+
		"\2\2\2l\13\3\2\2\2mn\7%\2\2no\7\7\2\2op\5\16\b\2p\r\3\2\2\2q\u0087\7\b"+
		"\2\2r\u0087\7\t\2\2s\u0087\7\n\2\2t\u0087\7%\2\2uv\7\13\2\2vw\7!\2\2w"+
		"x\5\20\t\2xy\7 \2\2yz\5\16\b\2z\u0087\3\2\2\2{|\7\f\2\2|}\7!\2\2}~\5\20"+
		"\t\2~\177\7\"\2\2\177\u0080\5\16\b\2\u0080\u0087\3\2\2\2\u0081\u0082\7"+
		"\r\2\2\u0082\u0083\7#\2\2\u0083\u0084\5\n\6\2\u0084\u0085\7$\2\2\u0085"+
		"\u0087\3\2\2\2\u0086q\3\2\2\2\u0086r\3\2\2\2\u0086s\3\2\2\2\u0086t\3\2"+
		"\2\2\u0086u\3\2\2\2\u0086{\3\2\2\2\u0086\u0081\3\2\2\2\u0087\17\3\2\2"+
		"\2\u0088\u008d\5(\25\2\u0089\u008a\7,\2\2\u008a\u008c\5\20\t\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\21\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\t\2\2\2\u0091\23\3\2\2\2\u0092"+
		"\u0094\5\26\f\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\25\3\2\2\2\u0097\u009f\5\30\r\2\u0098"+
		"\u009f\5\32\16\2\u0099\u009f\5\34\17\2\u009a\u009f\5\36\20\2\u009b\u009f"+
		"\5 \21\2\u009c\u009f\5\"\22\2\u009d\u009f\5(\25\2\u009e\u0097\3\2\2\2"+
		"\u009e\u0098\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\27\3\2\2\2\u00a0"+
		"\u00a1\7\16\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3\33\3\2\2\2"+
		"\u00a4\u00a5\7\20\2\2\u00a5\u00a6\5(\25\2\u00a6\u00a7\7\21\2\2\u00a7\u00aa"+
		"\5(\25\2\u00a8\u00a9\7\22\2\2\u00a9\u00ab\5(\25\2\u00aa\u00a8\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae"+
		"\5\24\13\2\u00ae\u00af\7$\2\2\u00af\35\3\2\2\2\u00b0\u00b1\7\23\2\2\u00b1"+
		"\u00b2\7\37\2\2\u00b2\u00b7\5(\25\2\u00b3\u00b4\7,\2\2\u00b4\u00b6\5("+
		"\25\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\7 "+
		"\2\2\u00bb\u00bd\7+\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\37\3\2\2\2\u00be\u00bf\7\24\2\2\u00bf\u00c0\7\37\2\2\u00c0\u00c5\7%\2"+
		"\2\u00c1\u00c2\7,\2\2\u00c2\u00c4\7%\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00ca\7 \2\2\u00c9\u00cb\7+\2\2\u00ca\u00c9\3\2\2"+
		"\2\u00ca\u00cb\3\2\2\2\u00cb!\3\2\2\2\u00cc\u00cd\7\25\2\2\u00cd\u00cf"+
		"\7#\2\2\u00ce\u00d0\5$\23\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\7\26"+
		"\2\2\u00d4\u00d6\5(\25\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8#\3\2\2\2\u00d9\u00da\7\27\2\2"+
		"\u00da\u00db\7\37\2\2\u00db\u00dc\5&\24\2\u00dc\u00e0\7 \2\2\u00dd\u00df"+
		"\5(\25\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1%\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\5(\25\2"+
		"\u00e4\u00e5\t\3\2\2\u00e5\u00e6\5(\25\2\u00e6\'\3\2\2\2\u00e7\u00e8\b"+
		"\25\1\2\u00e8\u00ea\7\37\2\2\u00e9\u00eb\5(\25\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\7 \2\2\u00ef\u00fe\3\2\2\2\u00f0\u00f1\7%\2\2\u00f1\u00f2"+
		"\7\6\2\2\u00f2\u00f4\5(\25\2\u00f3\u00f5\7+\2\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00fe\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7\u00fe\5(\25"+
		"\5\u00f8\u00f9\7!\2\2\u00f9\u00fa\5(\25\2\u00fa\u00fb\7\"\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fe\5\22\n\2\u00fd\u00e7\3\2\2\2\u00fd\u00f0\3\2\2\2"+
		"\u00fd\u00f6\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0107"+
		"\3\2\2\2\u00ff\u0100\f\b\2\2\u0100\u0101\7-\2\2\u0101\u0103\5(\25\2\u0102"+
		"\u0104\7+\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2"+
		"\2\2\u0105\u00ff\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108)\3\2\2\2\u0109\u0107\3\2\2\2\37-/\64>CHJQX]dk\u0086"+
		"\u008d\u0095\u009e\u00aa\u00b7\u00bc\u00c5\u00ca\u00d1\u00d5\u00e0\u00ec"+
		"\u00f4\u00fd\u0103\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}