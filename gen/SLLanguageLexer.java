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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, COMMENT=17, 
		LINE_COMMENT=18, INICIO=19, FIN=20, PROGRAMA=21, PIZQ=22, PDER=23, BIZQ=24, 
		BDER=25, LIZQ=26, LDER=27, ID=28, ESP=29, NUM=30, DOUBLE=31, BOOL=32, 
		CADENA=33, SMCOLON=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "COMMENT", 
			"LINE_COMMENT", "INICIO", "FIN", "PROGRAMA", "PIZQ", "PDER", "BIZQ", 
			"BDER", "LIZQ", "LDER", "ID", "ESP", "NUM", "DOUBLE", "BOOL", "CADENA", 
			"SMCOLON"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0127\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00ad\n\22\f\22\16\22"+
		"\u00b0\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00bb\n"+
		"\23\f\23\16\23\u00be\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35"+
		"\u00e4\n\35\f\35\16\35\u00e7\13\35\3\36\6\36\u00ea\n\36\r\36\16\36\u00eb"+
		"\3\36\3\36\3\37\6\37\u00f1\n\37\r\37\16\37\u00f2\3 \6 \u00f6\n \r \16"+
		" \u00f7\3 \3 \3 \6 \u00fd\n \r \16 \u00fe\5 \u0101\n \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u0110\n!\3\"\3\"\3\"\7\"\u0115\n\"\f\"\16\""+
		"\u0118\13\"\3\"\3\"\3\"\3\"\7\"\u011e\n\"\f\"\16\"\u0121\13\"\3\"\5\""+
		"\u0124\n\"\3#\3#\3\u00ae\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\t\4\2\f\f\17\17\4\2C\\c|\6\2"+
		"\62;C\\aac|\5\2\13\f\17\17\"\"\3\2\62;\3\2\60\60\f\2#(*+\61;??AAC\\^^"+
		"c|\u00c1\u00c1\u00c4\u00c4\2\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5M\3\2\2\2\7S\3\2\2\2\tW\3\2\2\2\13"+
		"Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21f\3\2\2\2\23m\3\2\2\2\25t\3\2\2\2\27"+
		"{\3\2\2\2\31\u0082\3\2\2\2\33\u008b\3\2\2\2\35\u008e\3\2\2\2\37\u0096"+
		"\3\2\2\2!\u009f\3\2\2\2#\u00a8\3\2\2\2%\u00b6\3\2\2\2\'\u00c1\3\2\2\2"+
		")\u00c8\3\2\2\2+\u00cc\3\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2\2\2\61\u00d9"+
		"\3\2\2\2\63\u00db\3\2\2\2\65\u00dd\3\2\2\2\67\u00df\3\2\2\29\u00e1\3\2"+
		"\2\2;\u00e9\3\2\2\2=\u00f0\3\2\2\2?\u00f5\3\2\2\2A\u010f\3\2\2\2C\u0123"+
		"\3\2\2\2E\u0125\3\2\2\2GH\7e\2\2HI\7q\2\2IJ\7p\2\2JK\7u\2\2KL\7v\2\2L"+
		"\4\3\2\2\2MN\7v\2\2NO\7k\2\2OP\7r\2\2PQ\7q\2\2QR\7u\2\2R\6\3\2\2\2ST\7"+
		"x\2\2TU\7c\2\2UV\7t\2\2V\b\3\2\2\2WX\7.\2\2X\n\3\2\2\2YZ\7?\2\2Z\f\3\2"+
		"\2\2[\\\7<\2\2\\\16\3\2\2\2]^\7p\2\2^_\7w\2\2_`\7o\2\2`a\7g\2\2ab\7t\2"+
		"\2bc\7k\2\2cd\7e\2\2de\7q\2\2e\20\3\2\2\2fg\7e\2\2gh\7c\2\2hi\7f\2\2i"+
		"j\7g\2\2jk\7p\2\2kl\7c\2\2l\22\3\2\2\2mn\7n\2\2no\7q\2\2op\7i\2\2pq\7"+
		"k\2\2qr\7e\2\2rs\7q\2\2s\24\3\2\2\2tu\7x\2\2uv\7g\2\2vw\7e\2\2wx\7v\2"+
		"\2xy\7q\2\2yz\7t\2\2z\26\3\2\2\2{|\7o\2\2|}\7c\2\2}~\7v\2\2~\177\7t\2"+
		"\2\177\u0080\7k\2\2\u0080\u0081\7|\2\2\u0081\30\3\2\2\2\u0082\u0083\7"+
		"t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7i\2\2\u0085\u0086\7k\2\2\u0086\u0087"+
		"\7u\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a\7q\2\2\u008a"+
		"\32\3\2\2\2\u008b\u008c\7u\2\2\u008c\u008d\7k\2\2\u008d\34\3\2\2\2\u008e"+
		"\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091\7r\2\2\u0091\u0092\7g\2\2"+
		"\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7t\2\2\u0095\36\3\2"+
		"\2\2\u0096\u0097\7o\2\2\u0097\u0098\7k\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7p\2\2\u009a\u009b\7v\2\2\u009b\u009c\7t\2\2\u009c\u009d\7c\2\2\u009d"+
		"\u009e\7u\2\2\u009e \3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7o\2\2\u00a1"+
		"\u00a2\7r\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7o\2\2"+
		"\u00a5\u00a6\7k\2\2\u00a6\u00a7\7t\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7\61"+
		"\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7,\2\2\u00b2"+
		"\u00b3\7\61\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\22\2\2\u00b5$\3\2\2"+
		"\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00bc\3\2\2\2\u00b9"+
		"\u00bb\n\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\b\23\2\2\u00c0&\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"\u00c4\7k\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7q\2\2"+
		"\u00c7(\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2"+
		"\2\u00cb*\3\2\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7"+
		"q\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7o\2\2\u00d3\u00d4\7c\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6.\3"+
		"\2\2\2\u00d7\u00d8\7+\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7]\2\2\u00da\62"+
		"\3\2\2\2\u00db\u00dc\7_\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7}\2\2\u00de"+
		"\66\3\2\2\2\u00df\u00e0\7\177\2\2\u00e08\3\2\2\2\u00e1\u00e5\t\3\2\2\u00e2"+
		"\u00e4\t\4\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6:\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea"+
		"\t\5\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\36\2\2\u00ee<\3\2\2\2"+
		"\u00ef\u00f1\t\6\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3>\3\2\2\2\u00f4\u00f6\t\6\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u0100\3\2\2\2\u00f9\u0101\3\2\2\2\u00fa\u00fc\t\7\2\2\u00fb"+
		"\u00fd\t\6\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00f9\3\2\2\2\u0100"+
		"\u00fa\3\2\2\2\u0101@\3\2\2\2\u0102\u0103\7V\2\2\u0103\u0104\7T\2\2\u0104"+
		"\u0105\7W\2\2\u0105\u0110\7G\2\2\u0106\u0107\7H\2\2\u0107\u0108\7C\2\2"+
		"\u0108\u0109\7N\2\2\u0109\u010a\7U\2\2\u010a\u0110\7G\2\2\u010b\u010c"+
		"\7U\2\2\u010c\u0110\7K\2\2\u010d\u010e\7P\2\2\u010e\u0110\7Q\2\2\u010f"+
		"\u0102\3\2\2\2\u010f\u0106\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u0110B\3\2\2\2\u0111\u0112\7)\2\2\u0112\u0116\t\3\2\2\u0113\u0115"+
		"\t\b\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u0124\7)"+
		"\2\2\u011a\u011b\7$\2\2\u011b\u011f\t\3\2\2\u011c\u011e\t\b\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\7$\2\2\u0123"+
		"\u0111\3\2\2\2\u0123\u011a\3\2\2\2\u0124D\3\2\2\2\u0125\u0126\7=\2\2\u0126"+
		"F\3\2\2\2\17\2\u00ae\u00bc\u00e5\u00eb\u00f2\u00f7\u00fe\u0100\u010f\u0116"+
		"\u011f\u0123\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}