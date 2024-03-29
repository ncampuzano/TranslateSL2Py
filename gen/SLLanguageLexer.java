// Generated from C:/Users/Nicolas Campuzano/iCloudDrive/Universidad Nacional/Semestre IX/Progamming Languages/TranslateSL2Py/grammar\SLLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		PERIOD=18, ROP=19, PASO=20, SINO=21, VECTOR=22, MATRIZ=23, REGISTRO=24, 
		NUMERICO=25, CADENATIPO=26, LOGICO=27, COMMENT=28, LINE_COMMENT=29, INICIO=30, 
		FIN=31, PROGRAMA=32, PIZQ=33, PDER=34, BIZQ=35, BDER=36, LIZQ=37, LDER=38, 
		NUM=39, DOUBLE=40, BOOL=41, CADENA=42, ID=43, ESP=44, SMCOLON=45, COMA=46, 
		OPERADORSUMA=47, OPERADOR=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"PERIOD", "ROP", "PASO", "SINO", "VECTOR", "MATRIZ", "REGISTRO", "NUMERICO", 
			"CADENATIPO", "LOGICO", "COMMENT", "LINE_COMMENT", "INICIO", "FIN", "PROGRAMA", 
			"PIZQ", "PDER", "BIZQ", "BDER", "LIZQ", "LDER", "NUM", "DOUBLE", "BOOL", 
			"CADENA", "ID", "ESP", "SMCOLON", "COMA", "OPERADORSUMA", "OPERADOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'tipos'", "'var'", "'='", "':'", "'si'", "'mientras'", 
			"'repetir'", "'hasta'", "'desde'", "'imprimir'", "'leer'", "'eval'", 
			"'caso'", "'retorna'", "'subrutina'", "'ref'", "'.'", null, "'paso'", 
			"'sino'", "'vector'", "'matriz'", "'registro'", "'numerico'", "'cadena'", 
			"'logico'", null, null, "'inicio'", "'fin'", "'programa'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", null, null, null, null, null, null, "';'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PERIOD", "ROP", "PASO", "SINO", 
			"VECTOR", "MATRIZ", "REGISTRO", "NUMERICO", "CADENATIPO", "LOGICO", "COMMENT", 
			"LINE_COMMENT", "INICIO", "FIN", "PROGRAMA", "PIZQ", "PDER", "BIZQ", 
			"BDER", "LIZQ", "LDER", "NUM", "DOUBLE", "BOOL", "CADENA", "ID", "ESP", 
			"SMCOLON", "COMA", "OPERADORSUMA", "OPERADOR"
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


	public SLLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SLLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u01a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00cd\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u010b\n\35"+
		"\f\35\16\35\u010e\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7"+
		"\36\u0119\n\36\f\36\16\36\u011c\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\5(\u0141\n(\3(\6(\u0144\n(\r(\16(\u0145\3)"+
		"\5)\u0149\n)\3)\6)\u014c\n)\r)\16)\u014d\3)\3)\3)\6)\u0153\n)\r)\16)\u0154"+
		"\5)\u0157\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0166\n*\3+\3+"+
		"\7+\u016a\n+\f+\16+\u016d\13+\3+\3+\3+\3+\3+\3+\7+\u0175\n+\f+\16+\u0178"+
		"\13+\3+\3+\3+\3+\3+\7+\u017f\n+\f+\16+\u0182\13+\3+\5+\u0185\n+\3,\3,"+
		"\7,\u0189\n,\f,\16,\u018c\13,\3-\6-\u018f\n-\r-\16-\u0190\3-\3-\3.\3."+
		"\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u01a5\n\61\6\u010c\u016b\u0176\u0180\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62\3\2\n\4\2\f\f\17\17\3\2\62;\3\2\60\60\4\2C\\c|\6"+
		"\2\62;C\\aac|\5\2\13\f\17\17\"\"\5\2,-//\61\61\5\2\'\'>@``\2\u01bc\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\3c\3\2\2\2\5i\3\2\2\2\7o\3\2\2\2\ts\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2"+
		"\17z\3\2\2\2\21\u0083\3\2\2\2\23\u008b\3\2\2\2\25\u0091\3\2\2\2\27\u0097"+
		"\3\2\2\2\31\u00a0\3\2\2\2\33\u00a5\3\2\2\2\35\u00aa\3\2\2\2\37\u00af\3"+
		"\2\2\2!\u00b7\3\2\2\2#\u00c1\3\2\2\2%\u00c5\3\2\2\2\'\u00cc\3\2\2\2)\u00ce"+
		"\3\2\2\2+\u00d3\3\2\2\2-\u00d8\3\2\2\2/\u00df\3\2\2\2\61\u00e6\3\2\2\2"+
		"\63\u00ef\3\2\2\2\65\u00f8\3\2\2\2\67\u00ff\3\2\2\29\u0106\3\2\2\2;\u0114"+
		"\3\2\2\2=\u011f\3\2\2\2?\u0126\3\2\2\2A\u012a\3\2\2\2C\u0133\3\2\2\2E"+
		"\u0135\3\2\2\2G\u0137\3\2\2\2I\u0139\3\2\2\2K\u013b\3\2\2\2M\u013d\3\2"+
		"\2\2O\u0140\3\2\2\2Q\u0148\3\2\2\2S\u0165\3\2\2\2U\u0184\3\2\2\2W\u0186"+
		"\3\2\2\2Y\u018e\3\2\2\2[\u0194\3\2\2\2]\u0196\3\2\2\2_\u0198\3\2\2\2a"+
		"\u01a4\3\2\2\2cd\7e\2\2de\7q\2\2ef\7p\2\2fg\7u\2\2gh\7v\2\2h\4\3\2\2\2"+
		"ij\7v\2\2jk\7k\2\2kl\7r\2\2lm\7q\2\2mn\7u\2\2n\6\3\2\2\2op\7x\2\2pq\7"+
		"c\2\2qr\7t\2\2r\b\3\2\2\2st\7?\2\2t\n\3\2\2\2uv\7<\2\2v\f\3\2\2\2wx\7"+
		"u\2\2xy\7k\2\2y\16\3\2\2\2z{\7o\2\2{|\7k\2\2|}\7g\2\2}~\7p\2\2~\177\7"+
		"v\2\2\177\u0080\7t\2\2\u0080\u0081\7c\2\2\u0081\u0082\7u\2\2\u0082\20"+
		"\3\2\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7r\2\2\u0086"+
		"\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2\u0089\u008a\7t\2\2"+
		"\u008a\22\3\2\2\2\u008b\u008c\7j\2\2\u008c\u008d\7c\2\2\u008d\u008e\7"+
		"u\2\2\u008e\u008f\7v\2\2\u008f\u0090\7c\2\2\u0090\24\3\2\2\2\u0091\u0092"+
		"\7f\2\2\u0092\u0093\7g\2\2\u0093\u0094\7u\2\2\u0094\u0095\7f\2\2\u0095"+
		"\u0096\7g\2\2\u0096\26\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7o\2\2\u0099"+
		"\u009a\7r\2\2\u009a\u009b\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7o\2\2"+
		"\u009d\u009e\7k\2\2\u009e\u009f\7t\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7"+
		"n\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7t\2\2\u00a4\32"+
		"\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7x\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7c\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\u00ae\7q\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7t\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7t\2\2"+
		"\u00b4\u00b5\7p\2\2\u00b5\u00b6\7c\2\2\u00b6 \3\2\2\2\u00b7\u00b8\7u\2"+
		"\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7d\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc"+
		"\7w\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\u00c0\7c\2\2\u00c0\"\3\2\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c4\7h\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6&\3\2\2\2\u00c7"+
		"\u00c8\7c\2\2\u00c8\u00c9\7p\2\2\u00c9\u00cd\7f\2\2\u00ca\u00cb\7q\2\2"+
		"\u00cb\u00cd\7t\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd(\3\2"+
		"\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2"+
		"\7q\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6"+
		"\7p\2\2\u00d6\u00d7\7q\2\2\u00d7,\3\2\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da"+
		"\7g\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7q\2\2\u00dd"+
		"\u00de\7t\2\2\u00de.\3\2\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7c\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7|\2\2"+
		"\u00e5\60\3\2\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7"+
		"i\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed"+
		"\7t\2\2\u00ed\u00ee\7q\2\2\u00ee\62\3\2\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1"+
		"\7w\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7t\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7q\2\2\u00f7\64\3\2\2\2\u00f8"+
		"\u00f9\7e\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7g\2\2"+
		"\u00fc\u00fd\7p\2\2\u00fd\u00fe\7c\2\2\u00fe\66\3\2\2\2\u00ff\u0100\7"+
		"n\2\2\u0100\u0101\7q\2\2\u0101\u0102\7i\2\2\u0102\u0103\7k\2\2\u0103\u0104"+
		"\7e\2\2\u0104\u0105\7q\2\2\u01058\3\2\2\2\u0106\u0107\7\61\2\2\u0107\u0108"+
		"\7,\2\2\u0108\u010c\3\2\2\2\u0109\u010b\13\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7,\2\2\u0110\u0111\7\61\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\b\35\2\2\u0113:\3\2\2\2\u0114\u0115\7\61\2"+
		"\2\u0115\u0116\7\61\2\2\u0116\u011a\3\2\2\2\u0117\u0119\n\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\b\36\2\2\u011e"+
		"<\3\2\2\2\u011f\u0120\7k\2\2\u0120\u0121\7p\2\2\u0121\u0122\7k\2\2\u0122"+
		"\u0123\7e\2\2\u0123\u0124\7k\2\2\u0124\u0125\7q\2\2\u0125>\3\2\2\2\u0126"+
		"\u0127\7h\2\2\u0127\u0128\7k\2\2\u0128\u0129\7p\2\2\u0129@\3\2\2\2\u012a"+
		"\u012b\7r\2\2\u012b\u012c\7t\2\2\u012c\u012d\7q\2\2\u012d\u012e\7i\2\2"+
		"\u012e\u012f\7t\2\2\u012f\u0130\7c\2\2\u0130\u0131\7o\2\2\u0131\u0132"+
		"\7c\2\2\u0132B\3\2\2\2\u0133\u0134\7*\2\2\u0134D\3\2\2\2\u0135\u0136\7"+
		"+\2\2\u0136F\3\2\2\2\u0137\u0138\7]\2\2\u0138H\3\2\2\2\u0139\u013a\7_"+
		"\2\2\u013aJ\3\2\2\2\u013b\u013c\7}\2\2\u013cL\3\2\2\2\u013d\u013e\7\177"+
		"\2\2\u013eN\3\2\2\2\u013f\u0141\7/\2\2\u0140\u013f\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0144\t\3\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146P\3\2\2\2"+
		"\u0147\u0149\7/\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b"+
		"\3\2\2\2\u014a\u014c\t\3\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0156\3\2\2\2\u014f\u0157\3\2"+
		"\2\2\u0150\u0152\t\4\2\2\u0151\u0153\t\3\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2"+
		"\2\2\u0156\u014f\3\2\2\2\u0156\u0150\3\2\2\2\u0157R\3\2\2\2\u0158\u0159"+
		"\7V\2\2\u0159\u015a\7T\2\2\u015a\u015b\7W\2\2\u015b\u0166\7G\2\2\u015c"+
		"\u015d\7H\2\2\u015d\u015e\7C\2\2\u015e\u015f\7N\2\2\u015f\u0160\7U\2\2"+
		"\u0160\u0166\7G\2\2\u0161\u0162\7U\2\2\u0162\u0166\7K\2\2\u0163\u0164"+
		"\7P\2\2\u0164\u0166\7Q\2\2\u0165\u0158\3\2\2\2\u0165\u015c\3\2\2\2\u0165"+
		"\u0161\3\2\2\2\u0165\u0163\3\2\2\2\u0166T\3\2\2\2\u0167\u016b\7$\2\2\u0168"+
		"\u016a\13\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u016c\3"+
		"\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0185\7$\2\2\u016f\u0170\7\u00e4\2\2\u0170\u0171\7\u20ae\2\2\u0171\u0172"+
		"\7\u0155\2\2\u0172\u0176\3\2\2\2\u0173\u0175\13\2\2\2\u0174\u0173\3\2"+
		"\2\2\u0175\u0178\3\2\2\2\u0176\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7\u00e4\2\2\u017a\u017b"+
		"\7\u20ae\2\2\u017b\u0185\7\uffff\2\2\u017c\u0180\7)\2\2\u017d\u017f\13"+
		"\2\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u0181\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\7)"+
		"\2\2\u0184\u0167\3\2\2\2\u0184\u016f\3\2\2\2\u0184\u017c\3\2\2\2\u0185"+
		"V\3\2\2\2\u0186\u018a\t\5\2\2\u0187\u0189\t\6\2\2\u0188\u0187\3\2\2\2"+
		"\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bX\3"+
		"\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f\t\7\2\2\u018e\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0193\b-\2\2\u0193Z\3\2\2\2\u0194\u0195\7=\2\2\u0195\\\3\2"+
		"\2\2\u0196\u0197\7.\2\2\u0197^\3\2\2\2\u0198\u0199\t\b\2\2\u0199`\3\2"+
		"\2\2\u019a\u01a5\t\t\2\2\u019b\u019c\7>\2\2\u019c\u01a5\7?\2\2\u019d\u019e"+
		"\7@\2\2\u019e\u01a5\7?\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1\7p\2\2\u01a1"+
		"\u01a5\7f\2\2\u01a2\u01a3\7q\2\2\u01a3\u01a5\7t\2\2\u01a4\u019a\3\2\2"+
		"\2\u01a4\u019b\3\2\2\2\u01a4\u019d\3\2\2\2\u01a4\u019f\3\2\2\2\u01a4\u01a2"+
		"\3\2\2\2\u01a5b\3\2\2\2\24\2\u00cc\u010c\u011a\u0140\u0145\u0148\u014d"+
		"\u0154\u0156\u0165\u016b\u0176\u0180\u0184\u018a\u0190\u01a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}