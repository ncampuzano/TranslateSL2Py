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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, SINO=28, COMMENT=29, LINE_COMMENT=30, INICIO=31, 
		FIN=32, PROGRAMA=33, PIZQ=34, PDER=35, BIZQ=36, BDER=37, LIZQ=38, LDER=39, 
		NUM=40, DOUBLE=41, BOOL=42, CADENA=43, ID=44, ESP=45, SMCOLON=46, COMA=47, 
		OPERADOR=48, ROP=49;
	public static final int
		RULE_s = 0, RULE_settings = 1, RULE_assignationConst = 2, RULE_assignationTypes = 3, 
		RULE_assignationVar = 4, RULE_objeto = 5, RULE_tipo = 6, RULE_tipoVector = 7, 
		RULE_body = 8, RULE_sentence = 9, RULE_callToFunctionSentence = 10, RULE_assignationSentence = 11, 
		RULE_bodyIfSentence = 12, RULE_sinoSentence = 13, RULE_ifSentence = 14, 
		RULE_whileSentence = 15, RULE_doWhileSentence = 16, RULE_repeatSentence = 17, 
		RULE_printSentence = 18, RULE_readSentence = 19, RULE_switchSentence = 20, 
		RULE_caseSentence = 21, RULE_expressionBoolean = 22, RULE_expression = 23, 
		RULE_constant = 24, RULE_id = 25, RULE_vector = 26, RULE_functionParameters = 27, 
		RULE_subrutine = 28, RULE_subrutineStart = 29, RULE_optionalReturn = 30, 
		RULE_functionDeclartion = 31, RULE_declaration = 32, RULE_functionDeclarationParams = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "settings", "assignationConst", "assignationTypes", "assignationVar", 
			"objeto", "tipo", "tipoVector", "body", "sentence", "callToFunctionSentence", 
			"assignationSentence", "bodyIfSentence", "sinoSentence", "ifSentence", 
			"whileSentence", "doWhileSentence", "repeatSentence", "printSentence", 
			"readSentence", "switchSentence", "caseSentence", "expressionBoolean", 
			"expression", "constant", "id", "vector", "functionParameters", "subrutine", 
			"subrutineStart", "optionalReturn", "functionDeclartion", "declaration", 
			"functionDeclarationParams"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'tipos'", "'var'", "'='", "':'", "'vector'", "'matriz'", 
			"'registro'", "'numerico'", "'cadena'", "'logico'", "'si'", "'mientras'", 
			"'repetir'", "'hasta'", "'desde'", "'paso'", "'imprimir'", "'leer'", 
			"'eval'", "'caso'", "'and'", "'or'", "'.'", "'subrutina'", "'retorna'", 
			"'ref'", "'sino'", null, null, "'inicio'", "'fin'", "'programa'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", null, null, null, null, null, null, 
			"';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "SINO", "COMMENT", "LINE_COMMENT", "INICIO", 
			"FIN", "PROGRAMA", "PIZQ", "PDER", "BIZQ", "BDER", "LIZQ", "LDER", "NUM", 
			"DOUBLE", "BOOL", "CADENA", "ID", "ESP", "SMCOLON", "COMA", "OPERADOR", 
			"ROP"
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
		public List<SubrutineContext> subrutine() {
			return getRuleContexts(SubrutineContext.class);
		}
		public SubrutineContext subrutine(int i) {
			return getRuleContext(SubrutineContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAMA) {
				{
				setState(68);
				match(PROGRAMA);
				setState(69);
				match(ID);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(70);
					match(SMCOLON);
					}
				}

				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(75);
				settings();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(INICIO);
			setState(82);
			body();
			setState(83);
			match(FIN);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					subrutine();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(T__0);
				setState(91);
				assignationConst();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(92);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__1);
				setState(96);
				assignationTypes();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(97);
					match(SMCOLON);
					}
				}

				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__2);
				setState(101);
				assignationVar();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(102);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				id();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(108);
					match(COMA);
					setState(109);
					id();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(T__3);
				setState(116);
				expression(0);
				}
				}
				setState(120); 
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
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				objeto();
				}
				}
				setState(125); 
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(127);
					id();
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(128);
						match(COMA);
						setState(129);
						id();
						}
						}
						setState(134);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(135);
					match(T__4);
					setState(136);
					tipo();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(140); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ObjetoContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			setState(142);
			id();
			setState(143);
			match(T__4);
			setState(144);
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
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__5);
				setState(147);
				match(BIZQ);
				setState(148);
				tipoVector();
				setState(149);
				match(BDER);
				setState(150);
				tipo();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__6);
				setState(153);
				match(BIZQ);
				setState(154);
				tipoVector();
				setState(155);
				match(BDER);
				setState(156);
				tipo();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(T__7);
				setState(159);
				match(LIZQ);
				setState(160);
				assignationVar();
				setState(161);
				match(LDER);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(T__10);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(169);
				match(OPERADOR);
				}
				break;
			case 2:
				{
				setState(170);
				expression(0);
				}
				break;
			}
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					match(COMA);
					setState(174);
					tipoVector();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				sentence();
				}
				}
				setState(183); 
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				ifSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				repeatSentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				whileSentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				printSentence();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				readSentence();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				switchSentence();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				doWhileSentence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(192);
				assignationSentence();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(193);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			setState(196);
			id();
			setState(197);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			setState(199);
			id();
			setState(200);
			match(T__3);
			setState(201);
			expression(0);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(202);
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
			setState(205);
			body();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINO) {
				{
				{
				setState(206);
				match(SINO);
				setState(207);
				sinoSentence();
				}
				}
				setState(212);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				ifSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
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
			setState(217);
			match(T__11);
			setState(218);
			match(PIZQ);
			setState(219);
			expressionBoolean();
			setState(220);
			match(PDER);
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIZQ:
				{
				setState(221);
				match(LIZQ);
				setState(222);
				bodyIfSentence();
				setState(223);
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
				setState(225);
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
			setState(228);
			match(T__12);
			setState(229);
			match(PIZQ);
			setState(230);
			expression(0);
			setState(231);
			match(PDER);
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
			setState(236);
			match(T__13);
			setState(237);
			body();
			setState(238);
			match(T__14);
			setState(239);
			match(PIZQ);
			setState(240);
			expression(0);
			setState(241);
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
			setState(243);
			match(T__15);
			setState(244);
			assignationSentence();
			setState(245);
			match(T__14);
			setState(246);
			expression(0);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(247);
				match(T__16);
				setState(248);
				expression(0);
				}
			}

			setState(251);
			match(LIZQ);
			setState(252);
			body();
			setState(253);
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
			setState(255);
			match(T__17);
			setState(256);
			match(PIZQ);
			setState(257);
			expression(0);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(258);
				match(COMA);
				setState(259);
				expression(0);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(PDER);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(266);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
			setState(269);
			match(T__18);
			setState(270);
			match(PIZQ);
			setState(271);
			id();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(272);
				match(COMA);
				setState(273);
				id();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(PDER);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMCOLON) {
				{
				setState(280);
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
			setState(283);
			match(T__19);
			setState(284);
			match(LIZQ);
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285);
				caseSentence();
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(290);
				match(SINO);
				setState(291);
				sentence();
				}
			}

			setState(294);
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
			setState(296);
			match(T__20);
			setState(297);
			match(PIZQ);
			setState(298);
			expressionBoolean();
			setState(299);
			match(PDER);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(300);
				sentence();
				}
				}
				setState(305);
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
			setState(306);
			expression(0);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(308);
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
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(312);
				match(PIZQ);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << LIZQ) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << ID) | (1L << OPERADOR))) != 0)) {
					{
					setState(313);
					expression(0);
					}
				}

				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(316);
					match(COMA);
					setState(317);
					expression(0);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				match(PDER);
				}
				break;
			case 2:
				{
				setState(324);
				match(OPERADOR);
				setState(325);
				expression(5);
				}
				break;
			case 3:
				{
				setState(326);
				match(BIZQ);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << LIZQ) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << ID) | (1L << OPERADOR))) != 0)) {
					{
					setState(327);
					expression(0);
					}
				}

				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(330);
					match(COMA);
					setState(331);
					expression(0);
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				match(BDER);
				}
				break;
			case 4:
				{
				setState(338);
				match(LIZQ);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << LIZQ) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << ID) | (1L << OPERADOR))) != 0)) {
					{
					setState(339);
					expression(0);
					}
				}

				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(342);
					match(COMA);
					setState(343);
					expression(0);
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349);
				match(LDER);
				}
				break;
			case 5:
				{
				setState(350);
				constant();
				}
				break;
			case 6:
				{
				setState(351);
				callToFunctionSentence();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(354);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(355);
					match(OPERADOR);
					setState(356);
					expression(0);
					setState(358);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(357);
						match(SMCOLON);
						}
						break;
					}
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(NUM);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(CADENA);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(BOOL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				match(DOUBLE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
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
			setState(372);
			match(ID);
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(373);
				vector();
				}
				break;
			case 2:
				{
				setState(374);
				functionParameters();
				}
				break;
			case 3:
				{
				setState(375);
				match(T__23);
				setState(376);
				constant();
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
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
			setState(379);
			match(BIZQ);
			setState(380);
			expression(0);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(381);
				match(COMA);
				setState(382);
				expression(0);
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
			match(BDER);
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(389);
				match(T__23);
				setState(390);
				constant();
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

	public static class FunctionParametersContext extends ParserRuleContext {
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
			setState(393);
			match(PIZQ);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << BIZQ) | (1L << LIZQ) | (1L << NUM) | (1L << DOUBLE) | (1L << BOOL) | (1L << CADENA) | (1L << ID) | (1L << OPERADOR))) != 0)) {
				{
				setState(394);
				expression(0);
				}
			}

			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(397);
				match(COMA);
				setState(398);
				expression(0);
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
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

	public static class SubrutineContext extends ParserRuleContext {
		public SubrutineStartContext subrutineStart() {
			return getRuleContext(SubrutineStartContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public SubrutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterSubrutine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitSubrutine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitSubrutine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrutineContext subrutine() throws RecognitionException {
		SubrutineContext _localctx = new SubrutineContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subrutine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			subrutineStart();
			setState(407);
			s();
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

	public static class SubrutineStartContext extends ParserRuleContext {
		public FunctionDeclartionContext functionDeclartion() {
			return getRuleContext(FunctionDeclartionContext.class,0);
		}
		public OptionalReturnContext optionalReturn() {
			return getRuleContext(OptionalReturnContext.class,0);
		}
		public SubrutineStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutineStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterSubrutineStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitSubrutineStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitSubrutineStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrutineStartContext subrutineStart() throws RecognitionException {
		SubrutineStartContext _localctx = new SubrutineStartContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subrutineStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__24);
			setState(410);
			functionDeclartion();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(411);
				optionalReturn();
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

	public static class OptionalReturnContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public OptionalReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterOptionalReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitOptionalReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitOptionalReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalReturnContext optionalReturn() throws RecognitionException {
		OptionalReturnContext _localctx = new OptionalReturnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_optionalReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__25);
			setState(415);
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

	public static class FunctionDeclartionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLLanguageParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(SLLanguageParser.PIZQ, 0); }
		public FunctionDeclarationParamsContext functionDeclarationParams() {
			return getRuleContext(FunctionDeclarationParamsContext.class,0);
		}
		public TerminalNode PDER() { return getToken(SLLanguageParser.PDER, 0); }
		public FunctionDeclartionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclartion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterFunctionDeclartion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitFunctionDeclartion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitFunctionDeclartion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclartionContext functionDeclartion() throws RecognitionException {
		FunctionDeclartionContext _localctx = new FunctionDeclartionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionDeclartion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(ID);
			setState(418);
			match(PIZQ);
			setState(419);
			functionDeclarationParams();
			setState(420);
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<AssignationVarContext> assignationVar() {
			return getRuleContexts(AssignationVarContext.class);
		}
		public AssignationVarContext assignationVar(int i) {
			return getRuleContext(AssignationVarContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(422);
				assignationVar();
				}
				}
				setState(425); 
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

	public static class FunctionDeclarationParamsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SMCOLON() { return getTokens(SLLanguageParser.SMCOLON); }
		public TerminalNode SMCOLON(int i) {
			return getToken(SLLanguageParser.SMCOLON, i);
		}
		public FunctionDeclarationParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterFunctionDeclarationParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitFunctionDeclarationParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitFunctionDeclarationParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationParamsContext functionDeclarationParams() throws RecognitionException {
		FunctionDeclarationParamsContext _localctx = new FunctionDeclarationParamsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionDeclarationParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(427);
				match(T__26);
				}
			}

			setState(430);
			declaration();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SMCOLON) {
				{
				{
				setState(431);
				match(SMCOLON);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__26) {
					{
					{
					setState(432);
					match(T__26);
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438);
				declaration();
				}
				}
				setState(443);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u01bf\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\5\2J\n\2\5\2L\n\2\3\2\7\2O\n\2\f\2\16\2"+
		"R\13\2\3\2\3\2\3\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\3\3\3\3\3\5\3`\n\3\3"+
		"\3\3\3\3\3\5\3e\n\3\3\3\3\3\3\3\5\3j\n\3\5\3l\n\3\3\4\3\4\3\4\7\4q\n\4"+
		"\f\4\16\4t\13\4\3\4\3\4\3\4\6\4y\n\4\r\4\16\4z\3\5\6\5~\n\5\r\5\16\5\177"+
		"\3\6\3\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088\13\6\3\6\3\6\3\6\6\6\u008d\n"+
		"\6\r\6\16\6\u008e\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00aa\n\b\3\t\3\t"+
		"\5\t\u00ae\n\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\n\6\n\u00b8"+
		"\n\n\r\n\16\n\u00b9\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00c5\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00ce\n\r\3\16\3\16\3\16\7"+
		"\16\u00d3\n\16\f\16\16\16\u00d6\13\16\3\17\3\17\5\17\u00da\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e5\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00fc\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0107\n\24\f\24\16\24\u010a\13\24\3\24\3\24\5\24\u010e"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u0115\n\25\f\25\16\25\u0118\13\25"+
		"\3\25\3\25\5\25\u011c\n\25\3\26\3\26\3\26\6\26\u0121\n\26\r\26\16\26\u0122"+
		"\3\26\3\26\5\26\u0127\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u0130"+
		"\n\27\f\27\16\27\u0133\13\27\3\30\3\30\3\30\5\30\u0138\n\30\3\31\3\31"+
		"\3\31\5\31\u013d\n\31\3\31\3\31\7\31\u0141\n\31\f\31\16\31\u0144\13\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u014b\n\31\3\31\3\31\7\31\u014f\n\31\f"+
		"\31\16\31\u0152\13\31\3\31\3\31\3\31\5\31\u0157\n\31\3\31\3\31\7\31\u015b"+
		"\n\31\f\31\16\31\u015e\13\31\3\31\3\31\3\31\5\31\u0163\n\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0169\n\31\7\31\u016b\n\31\f\31\16\31\u016e\13\31\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0175\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u017c"+
		"\n\33\3\34\3\34\3\34\3\34\7\34\u0182\n\34\f\34\16\34\u0185\13\34\3\34"+
		"\3\34\3\34\5\34\u018a\n\34\3\35\3\35\5\35\u018e\n\35\3\35\3\35\7\35\u0192"+
		"\n\35\f\35\16\35\u0195\13\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\5"+
		"\37\u019f\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\6\"\u01aa\n\"\r\"\16\"\u01ab"+
		"\3#\5#\u01af\n#\3#\3#\3#\7#\u01b4\n#\f#\16#\u01b7\13#\3#\7#\u01ba\n#\f"+
		"#\16#\u01bd\13#\3#\2\3\60$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BD\2\3\3\2\30\31\2\u01e5\2K\3\2\2\2\4k\3\2\2\2\6"+
		"x\3\2\2\2\b}\3\2\2\2\n\u008c\3\2\2\2\f\u0090\3\2\2\2\16\u00a9\3\2\2\2"+
		"\20\u00ad\3\2\2\2\22\u00b7\3\2\2\2\24\u00c4\3\2\2\2\26\u00c6\3\2\2\2\30"+
		"\u00c9\3\2\2\2\32\u00cf\3\2\2\2\34\u00d9\3\2\2\2\36\u00db\3\2\2\2 \u00e6"+
		"\3\2\2\2\"\u00ee\3\2\2\2$\u00f5\3\2\2\2&\u0101\3\2\2\2(\u010f\3\2\2\2"+
		"*\u011d\3\2\2\2,\u012a\3\2\2\2.\u0134\3\2\2\2\60\u0162\3\2\2\2\62\u0174"+
		"\3\2\2\2\64\u0176\3\2\2\2\66\u017d\3\2\2\28\u018b\3\2\2\2:\u0198\3\2\2"+
		"\2<\u019b\3\2\2\2>\u01a0\3\2\2\2@\u01a3\3\2\2\2B\u01a9\3\2\2\2D\u01ae"+
		"\3\2\2\2FG\7#\2\2GI\7.\2\2HJ\7\60\2\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KF"+
		"\3\2\2\2KL\3\2\2\2LP\3\2\2\2MO\5\4\3\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2P"+
		"Q\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7!\2\2TU\5\22\n\2UY\7\"\2\2VX\5:\36\2"+
		"WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\3\3\2\2\2[Y\3\2\2\2\\]\7\3\2"+
		"\2]_\5\6\4\2^`\7\60\2\2_^\3\2\2\2_`\3\2\2\2`l\3\2\2\2ab\7\4\2\2bd\5\b"+
		"\5\2ce\7\60\2\2dc\3\2\2\2de\3\2\2\2el\3\2\2\2fg\7\5\2\2gi\5\n\6\2hj\7"+
		"\60\2\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2k\\\3\2\2\2ka\3\2\2\2kf\3\2\2\2l"+
		"\5\3\2\2\2mr\5\64\33\2no\7\61\2\2oq\5\64\33\2pn\3\2\2\2qt\3\2\2\2rp\3"+
		"\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\6\2\2vw\5\60\31\2wy\3\2\2\2x"+
		"m\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\7\3\2\2\2|~\5\f\7\2}|\3\2\2\2"+
		"~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\t\3\2\2\2\u0081\u0086"+
		"\5\64\33\2\u0082\u0083\7\61\2\2\u0083\u0085\5\64\33\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\7\2\2\u008a\u008b\5\16"+
		"\b\2\u008b\u008d\3\2\2\2\u008c\u0081\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\13\3\2\2\2\u0090\u0091\5\64\33"+
		"\2\u0091\u0092\7\7\2\2\u0092\u0093\5\16\b\2\u0093\r\3\2\2\2\u0094\u0095"+
		"\7\b\2\2\u0095\u0096\7&\2\2\u0096\u0097\5\20\t\2\u0097\u0098\7\'\2\2\u0098"+
		"\u0099\5\16\b\2\u0099\u00aa\3\2\2\2\u009a\u009b\7\t\2\2\u009b\u009c\7"+
		"&\2\2\u009c\u009d\5\20\t\2\u009d\u009e\7\'\2\2\u009e\u009f\5\16\b\2\u009f"+
		"\u00aa\3\2\2\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2\7(\2\2\u00a2\u00a3\5\n"+
		"\6\2\u00a3\u00a4\7)\2\2\u00a4\u00aa\3\2\2\2\u00a5\u00aa\7\13\2\2\u00a6"+
		"\u00aa\7\f\2\2\u00a7\u00aa\7\r\2\2\u00a8\u00aa\7.\2\2\u00a9\u0094\3\2"+
		"\2\2\u00a9\u009a\3\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9"+
		"\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\17\3\2\2"+
		"\2\u00ab\u00ae\7\62\2\2\u00ac\u00ae\5\60\31\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b2\5"+
		"\20\t\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\21\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\5\24\13"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\23\3\2\2\2\u00bb\u00c5\5\36\20\2\u00bc\u00c5\5$\23\2\u00bd"+
		"\u00c5\5 \21\2\u00be\u00c5\5&\24\2\u00bf\u00c5\5(\25\2\u00c0\u00c5\5*"+
		"\26\2\u00c1\u00c5\5\"\22\2\u00c2\u00c5\5\30\r\2\u00c3\u00c5\5\26\f\2\u00c4"+
		"\u00bb\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2"+
		"\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\25\3\2\2\2\u00c6\u00c7\5\64\33"+
		"\2\u00c7\u00c8\58\35\2\u00c8\27\3\2\2\2\u00c9\u00ca\5\64\33\2\u00ca\u00cb"+
		"\7\6\2\2\u00cb\u00cd\5\60\31\2\u00cc\u00ce\7\60\2\2\u00cd\u00cc\3\2\2"+
		"\2\u00cd\u00ce\3\2\2\2\u00ce\31\3\2\2\2\u00cf\u00d4\5\22\n\2\u00d0\u00d1"+
		"\7\36\2\2\u00d1\u00d3\5\34\17\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7\u00da\5\36\20\2\u00d8\u00da\5\24\13\2\u00d9\u00d7\3\2\2"+
		"\2\u00d9\u00d8\3\2\2\2\u00da\35\3\2\2\2\u00db\u00dc\7\16\2\2\u00dc\u00dd"+
		"\7$\2\2\u00dd\u00de\5.\30\2\u00de\u00e4\7%\2\2\u00df\u00e0\7(\2\2\u00e0"+
		"\u00e1\5\32\16\2\u00e1\u00e2\7)\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\5"+
		"\24\13\2\u00e4\u00df\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\37\3\2\2\2\u00e6"+
		"\u00e7\7\17\2\2\u00e7\u00e8\7$\2\2\u00e8\u00e9\5\60\31\2\u00e9\u00ea\7"+
		"%\2\2\u00ea\u00eb\7(\2\2\u00eb\u00ec\5\22\n\2\u00ec\u00ed\7)\2\2\u00ed"+
		"!\3\2\2\2\u00ee\u00ef\7\20\2\2\u00ef\u00f0\5\22\n\2\u00f0\u00f1\7\21\2"+
		"\2\u00f1\u00f2\7$\2\2\u00f2\u00f3\5\60\31\2\u00f3\u00f4\7%\2\2\u00f4#"+
		"\3\2\2\2\u00f5\u00f6\7\22\2\2\u00f6\u00f7\5\30\r\2\u00f7\u00f8\7\21\2"+
		"\2\u00f8\u00fb\5\60\31\2\u00f9\u00fa\7\23\2\2\u00fa\u00fc\5\60\31\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7("+
		"\2\2\u00fe\u00ff\5\22\n\2\u00ff\u0100\7)\2\2\u0100%\3\2\2\2\u0101\u0102"+
		"\7\24\2\2\u0102\u0103\7$\2\2\u0103\u0108\5\60\31\2\u0104\u0105\7\61\2"+
		"\2\u0105\u0107\5\60\31\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010b\u010d\7%\2\2\u010c\u010e\7\60\2\2\u010d\u010c\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\'\3\2\2\2\u010f\u0110\7\25\2\2\u0110\u0111\7$\2\2"+
		"\u0111\u0116\5\64\33\2\u0112\u0113\7\61\2\2\u0113\u0115\5\64\33\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\7%\2\2\u011a"+
		"\u011c\7\60\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c)\3\2\2\2"+
		"\u011d\u011e\7\26\2\2\u011e\u0120\7(\2\2\u011f\u0121\5,\27\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0125\7\36\2\2\u0125\u0127\5\24\13\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7)\2\2\u0129"+
		"+\3\2\2\2\u012a\u012b\7\27\2\2\u012b\u012c\7$\2\2\u012c\u012d\5.\30\2"+
		"\u012d\u0131\7%\2\2\u012e\u0130\5\24\13\2\u012f\u012e\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132-\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0137\5\60\31\2\u0135\u0136\t\2\2\2\u0136\u0138\5"+
		"\60\31\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138/\3\2\2\2\u0139"+
		"\u013a\b\31\1\2\u013a\u013c\7$\2\2\u013b\u013d\5\60\31\2\u013c\u013b\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u0142\3\2\2\2\u013e\u013f\7\61\2\2\u013f"+
		"\u0141\5\60\31\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0163\7%\2\2\u0146\u0147\7\62\2\2\u0147\u0163\5\60\31\7\u0148\u014a\7"+
		"&\2\2\u0149\u014b\5\60\31\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u0150\3\2\2\2\u014c\u014d\7\61\2\2\u014d\u014f\5\60\31\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0163\7\'\2\2\u0154\u0156\7("+
		"\2\2\u0155\u0157\5\60\31\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u015c\3\2\2\2\u0158\u0159\7\61\2\2\u0159\u015b\5\60\31\2\u015a\u0158"+
		"\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0163\7)\2\2\u0160\u0163\5\62"+
		"\32\2\u0161\u0163\5\26\f\2\u0162\u0139\3\2\2\2\u0162\u0146\3\2\2\2\u0162"+
		"\u0148\3\2\2\2\u0162\u0154\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2"+
		"\2\2\u0163\u016c\3\2\2\2\u0164\u0165\f\t\2\2\u0165\u0166\7\62\2\2\u0166"+
		"\u0168\5\60\31\2\u0167\u0169\7\60\2\2\u0168\u0167\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0164\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\61\3\2\2\2\u016e\u016c\3\2\2"+
		"\2\u016f\u0175\7*\2\2\u0170\u0175\7-\2\2\u0171\u0175\7,\2\2\u0172\u0175"+
		"\7+\2\2\u0173\u0175\5\64\33\2\u0174\u016f\3\2\2\2\u0174\u0170\3\2\2\2"+
		"\u0174\u0171\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175\63"+
		"\3\2\2\2\u0176\u017b\7.\2\2\u0177\u017c\5\66\34\2\u0178\u017c\58\35\2"+
		"\u0179\u017a\7\32\2\2\u017a\u017c\5\62\32\2\u017b\u0177\3\2\2\2\u017b"+
		"\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\65\3\2\2"+
		"\2\u017d\u017e\7&\2\2\u017e\u0183\5\60\31\2\u017f\u0180\7\61\2\2\u0180"+
		"\u0182\5\60\31\2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3"+
		"\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0189\7\'\2\2\u0187\u0188\7\32\2\2\u0188\u018a\5\62\32\2\u0189\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\67\3\2\2\2\u018b\u018d\7$\2\2\u018c"+
		"\u018e\5\60\31\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0193\3"+
		"\2\2\2\u018f\u0190\7\61\2\2\u0190\u0192\5\60\31\2\u0191\u018f\3\2\2\2"+
		"\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7%\2\2\u01979\3\2\2\2\u0198\u0199"+
		"\5<\37\2\u0199\u019a\5\2\2\2\u019a;\3\2\2\2\u019b\u019c\7\33\2\2\u019c"+
		"\u019e\5@!\2\u019d\u019f\5> \2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2"+
		"\u019f=\3\2\2\2\u01a0\u01a1\7\34\2\2\u01a1\u01a2\5\16\b\2\u01a2?\3\2\2"+
		"\2\u01a3\u01a4\7.\2\2\u01a4\u01a5\7$\2\2\u01a5\u01a6\5D#\2\u01a6\u01a7"+
		"\7%\2\2\u01a7A\3\2\2\2\u01a8\u01aa\5\n\6\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01acC\3\2\2\2\u01ad"+
		"\u01af\7\35\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3"+
		"\2\2\2\u01b0\u01bb\5B\"\2\u01b1\u01b5\7\60\2\2\u01b2\u01b4\7\35\2\2\u01b3"+
		"\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\5B\"\2\u01b9"+
		"\u01b1\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bcE\3\2\2\2\u01bd\u01bb\3\2\2\2\65IKPY_dikrz\177\u0086\u008e\u00a9"+
		"\u00ad\u00b3\u00b9\u00c4\u00cd\u00d4\u00d9\u00e4\u00fb\u0108\u010d\u0116"+
		"\u011b\u0122\u0126\u0131\u0137\u013c\u0142\u014a\u0150\u0156\u015c\u0162"+
		"\u0168\u016c\u0174\u017b\u0183\u0189\u018d\u0193\u019e\u01ab\u01ae\u01b5"+
		"\u01bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}