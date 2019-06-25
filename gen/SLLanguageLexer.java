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
		T__17=18, COMMENT=19, LINE_COMMENT=20, INICIO=21, FIN=22, PROGRAMA=23, 
		PIZQ=24, PDER=25, BIZQ=26, BDER=27, LIZQ=28, LDER=29, ID=30, ESP=31, NUM=32, 
		DOUBLE=33, BOOL=34, CADENA=35, SMCOLON=36, COMA=37, OPERADOR=38;
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
			"T__17", "COMMENT", "LINE_COMMENT", "INICIO", "FIN", "PROGRAMA", "PIZQ", 
			"PDER", "BIZQ", "BDER", "LIZQ", "LDER", "ID", "ESP", "NUM", "DOUBLE", 
			"BOOL", "CADENA", "SMCOLON", "COMA", "OPERADOR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0133\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00c0\n\24"+
		"\f\24\16\24\u00c3\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7"+
		"\25\u00ce\n\25\f\25\16\25\u00d1\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\7\37\u00f7\n\37\f\37\16\37\u00fa\13\37\3 \6 \u00fd\n \r \16 "+
		"\u00fe\3 \3 \3!\6!\u0104\n!\r!\16!\u0105\3\"\6\"\u0109\n\"\r\"\16\"\u010a"+
		"\3\"\3\"\3\"\6\"\u0110\n\"\r\"\16\"\u0111\5\"\u0114\n\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0123\n#\3$\3$\7$\u0127\n$\f$\16$\u012a\13"+
		"$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\u00c1\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\n\4\2\f\f"+
		"\17\17\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\3\2\62;\3\2\60\60\t"+
		"\2\f\f\"(*+\60;??Aac|\5\2,-//\61\61\2\u013e\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\3O\3\2\2\2\5U\3\2\2\2\7[\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rc\3"+
		"\2\2\2\17l\3\2\2\2\21s\3\2\2\2\23z\3\2\2\2\25\u0081\3\2\2\2\27\u0088\3"+
		"\2\2\2\31\u0091\3\2\2\2\33\u0094\3\2\2\2\35\u009c\3\2\2\2\37\u00a2\3\2"+
		"\2\2!\u00a8\3\2\2\2#\u00ad\3\2\2\2%\u00b6\3\2\2\2\'\u00bb\3\2\2\2)\u00c9"+
		"\3\2\2\2+\u00d4\3\2\2\2-\u00db\3\2\2\2/\u00df\3\2\2\2\61\u00e8\3\2\2\2"+
		"\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2\29\u00f0\3\2\2\2;\u00f2"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u00fc\3\2\2\2A\u0103\3\2\2\2C\u0108\3\2\2\2E"+
		"\u0122\3\2\2\2G\u0124\3\2\2\2I\u012d\3\2\2\2K\u012f\3\2\2\2M\u0131\3\2"+
		"\2\2OP\7e\2\2PQ\7q\2\2QR\7p\2\2RS\7u\2\2ST\7v\2\2T\4\3\2\2\2UV\7v\2\2"+
		"VW\7k\2\2WX\7r\2\2XY\7q\2\2YZ\7u\2\2Z\6\3\2\2\2[\\\7x\2\2\\]\7c\2\2]^"+
		"\7t\2\2^\b\3\2\2\2_`\7?\2\2`\n\3\2\2\2ab\7<\2\2b\f\3\2\2\2cd\7p\2\2de"+
		"\7w\2\2ef\7o\2\2fg\7g\2\2gh\7t\2\2hi\7k\2\2ij\7e\2\2jk\7q\2\2k\16\3\2"+
		"\2\2lm\7e\2\2mn\7c\2\2no\7f\2\2op\7g\2\2pq\7p\2\2qr\7c\2\2r\20\3\2\2\2"+
		"st\7n\2\2tu\7q\2\2uv\7i\2\2vw\7k\2\2wx\7e\2\2xy\7q\2\2y\22\3\2\2\2z{\7"+
		"x\2\2{|\7g\2\2|}\7e\2\2}~\7v\2\2~\177\7q\2\2\177\u0080\7t\2\2\u0080\24"+
		"\3\2\2\2\u0081\u0082\7o\2\2\u0082\u0083\7c\2\2\u0083\u0084\7v\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086\u0087\7|\2\2\u0087\26\3\2\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\u008b\7i\2\2\u008b\u008c\7k\2\2"+
		"\u008c\u008d\7u\2\2\u008d\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090"+
		"\7q\2\2\u0090\30\3\2\2\2\u0091\u0092\7u\2\2\u0092\u0093\7k\2\2\u0093\32"+
		"\3\2\2\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2\2\u0096\u0097\7r\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7v\2\2\u0099\u009a\7k\2\2\u009a\u009b\7t\2\2"+
		"\u009b\34\3\2\2\2\u009c\u009d\7f\2\2\u009d\u009e\7g\2\2\u009e\u009f\7"+
		"u\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\36\3\2\2\2\u00a2\u00a3"+
		"\7j\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa\7c\2\2\u00aa"+
		"\u00ab\7u\2\2\u00ab\u00ac\7q\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7o\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2\2"+
		"\u00b2\u00b3\7o\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7t\2\2\u00b5$\3\2\2"+
		"\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\7,\2\2\u00bd\u00c1"+
		"\3\2\2\2\u00be\u00c0\13\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\b\24\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7\61\2"+
		"\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\n\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\b\25\2\2\u00d3*\3\2\2\2\u00d4\u00d5\7k\2\2"+
		"\u00d5\u00d6\7p\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7q\2\2\u00da,\3\2\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd"+
		"\7k\2\2\u00dd\u00de\7p\2\2\u00de.\3\2\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1"+
		"\7t\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7i\2\2\u00e3\u00e4\7t\2\2\u00e4"+
		"\u00e5\7c\2\2\u00e5\u00e6\7o\2\2\u00e6\u00e7\7c\2\2\u00e7\60\3\2\2\2\u00e8"+
		"\u00e9\7*\2\2\u00e9\62\3\2\2\2\u00ea\u00eb\7+\2\2\u00eb\64\3\2\2\2\u00ec"+
		"\u00ed\7]\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\7_\2\2\u00ef8\3\2\2\2\u00f0"+
		"\u00f1\7}\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7\177\2\2\u00f3<\3\2\2\2\u00f4"+
		"\u00f8\t\3\2\2\u00f5\u00f7\t\4\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9>\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00fd\t\5\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b "+
		"\2\2\u0101@\3\2\2\2\u0102\u0104\t\6\2\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106B\3\2\2\2\u0107"+
		"\u0109\t\6\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u0113\3\2\2\2\u010c\u0114\3\2\2\2\u010d"+
		"\u010f\t\7\2\2\u010e\u0110\t\6\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u010c\3\2\2\2\u0113\u010d\3\2\2\2\u0114D\3\2\2\2\u0115\u0116\7V\2\2\u0116"+
		"\u0117\7T\2\2\u0117\u0118\7W\2\2\u0118\u0123\7G\2\2\u0119\u011a\7H\2\2"+
		"\u011a\u011b\7C\2\2\u011b\u011c\7N\2\2\u011c\u011d\7U\2\2\u011d\u0123"+
		"\7G\2\2\u011e\u011f\7U\2\2\u011f\u0123\7K\2\2\u0120\u0121\7P\2\2\u0121"+
		"\u0123\7Q\2\2\u0122\u0115\3\2\2\2\u0122\u0119\3\2\2\2\u0122\u011e\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123F\3\2\2\2\u0124\u0128\7$\2\2\u0125\u0127"+
		"\t\b\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7$"+
		"\2\2\u012cH\3\2\2\2\u012d\u012e\7=\2\2\u012eJ\3\2\2\2\u012f\u0130\7.\2"+
		"\2\u0130L\3\2\2\2\u0131\u0132\t\t\2\2\u0132N\3\2\2\2\r\2\u00c1\u00cf\u00f8"+
		"\u00fe\u0105\u010a\u0111\u0113\u0122\u0128\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}