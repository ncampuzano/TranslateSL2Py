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
		LINE_COMMENT=18, INICIO=19, FIN=20, PROGRAMA=21, PIZQ=22, PDER=23, ID=24, 
		ESP=25, NUM=26, DOUBLE=27, BOOL=28, CADENA=29, SMCOLON=30;
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
			"LINE_COMMENT", "INICIO", "FIN", "PROGRAMA", "PIZQ", "PDER", "ID", "ESP", 
			"NUM", "DOUBLE", "BOOL", "CADENA", "SMCOLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'tipos'", "'var'", "','", "'='", "':'", "'numerico'", 
			"'cadena'", "'logico'", "'vector'", "'matriz'", "'registro'", "'si'", 
			"'repetir'", "'mientras'", "'imprimir'", null, null, "'inicio'", "'fin'", 
			"'programa'", "'('", "')'", null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "COMMENT", "LINE_COMMENT", "INICIO", "FIN", 
			"PROGRAMA", "PIZQ", "PDER", "ID", "ESP", "NUM", "DOUBLE", "BOOL", "CADENA", 
			"SMCOLON"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0117\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\7\22\u00a5\n\22\f\22\16\22\u00a8\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00b3\n\23\f\23\16\23\u00b6\13\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\7\31\u00d4\n\31\f\31\16\31\u00d7\13\31\3\32\6\32\u00da\n\32\r\32\16\32"+
		"\u00db\3\32\3\32\3\33\6\33\u00e1\n\33\r\33\16\33\u00e2\3\34\6\34\u00e6"+
		"\n\34\r\34\16\34\u00e7\3\34\3\34\3\34\6\34\u00ed\n\34\r\34\16\34\u00ee"+
		"\5\34\u00f1\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0100\n\35\3\36\3\36\3\36\7\36\u0105\n\36\f\36\16\36\u0108"+
		"\13\36\3\36\3\36\3\36\3\36\7\36\u010e\n\36\f\36\16\36\u0111\13\36\3\36"+
		"\5\36\u0114\n\36\3\37\3\37\3\u00a6\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\t\4\2\f\f\17\17\4\2C\\c|\6"+
		"\2\62;C\\aac|\5\2\13\f\17\17\"\"\3\2\62;\3\2\60\60\f\2#(*+\61;??AAC\\"+
		"^^c|\u00c1\u00c1\u00c4\u00c4\2\u0124\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5E\3\2"+
		"\2\2\7K\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21^\3\2"+
		"\2\2\23e\3\2\2\2\25l\3\2\2\2\27s\3\2\2\2\31z\3\2\2\2\33\u0083\3\2\2\2"+
		"\35\u0086\3\2\2\2\37\u008e\3\2\2\2!\u0097\3\2\2\2#\u00a0\3\2\2\2%\u00ae"+
		"\3\2\2\2\'\u00b9\3\2\2\2)\u00c0\3\2\2\2+\u00c4\3\2\2\2-\u00cd\3\2\2\2"+
		"/\u00cf\3\2\2\2\61\u00d1\3\2\2\2\63\u00d9\3\2\2\2\65\u00e0\3\2\2\2\67"+
		"\u00e5\3\2\2\29\u00ff\3\2\2\2;\u0113\3\2\2\2=\u0115\3\2\2\2?@\7e\2\2@"+
		"A\7q\2\2AB\7p\2\2BC\7u\2\2CD\7v\2\2D\4\3\2\2\2EF\7v\2\2FG\7k\2\2GH\7r"+
		"\2\2HI\7q\2\2IJ\7u\2\2J\6\3\2\2\2KL\7x\2\2LM\7c\2\2MN\7t\2\2N\b\3\2\2"+
		"\2OP\7.\2\2P\n\3\2\2\2QR\7?\2\2R\f\3\2\2\2ST\7<\2\2T\16\3\2\2\2UV\7p\2"+
		"\2VW\7w\2\2WX\7o\2\2XY\7g\2\2YZ\7t\2\2Z[\7k\2\2[\\\7e\2\2\\]\7q\2\2]\20"+
		"\3\2\2\2^_\7e\2\2_`\7c\2\2`a\7f\2\2ab\7g\2\2bc\7p\2\2cd\7c\2\2d\22\3\2"+
		"\2\2ef\7n\2\2fg\7q\2\2gh\7i\2\2hi\7k\2\2ij\7e\2\2jk\7q\2\2k\24\3\2\2\2"+
		"lm\7x\2\2mn\7g\2\2no\7e\2\2op\7v\2\2pq\7q\2\2qr\7t\2\2r\26\3\2\2\2st\7"+
		"o\2\2tu\7c\2\2uv\7v\2\2vw\7t\2\2wx\7k\2\2xy\7|\2\2y\30\3\2\2\2z{\7t\2"+
		"\2{|\7g\2\2|}\7i\2\2}~\7k\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081"+
		"\7t\2\2\u0081\u0082\7q\2\2\u0082\32\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085"+
		"\7k\2\2\u0085\34\3\2\2\2\u0086\u0087\7t\2\2\u0087\u0088\7g\2\2\u0088\u0089"+
		"\7r\2\2\u0089\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7t\2\2\u008d\36\3\2\2\2\u008e\u008f\7o\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7p\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2"+
		"\u0094\u0095\7c\2\2\u0095\u0096\7u\2\2\u0096 \3\2\2\2\u0097\u0098\7k\2"+
		"\2\u0098\u0099\7o\2\2\u0099\u009a\7r\2\2\u009a\u009b\7t\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7o\2\2\u009d\u009e\7k\2\2\u009e\u009f\7t\2\2\u009f"+
		"\"\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a6\3\2\2\2"+
		"\u00a3\u00a5\13\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7,\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\22"+
		"\2\2\u00ad$\3\2\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b4"+
		"\3\2\2\2\u00b1\u00b3\n\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\b\23\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7p\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7q\2\2\u00c7\u00c8\7i\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7c\2\2"+
		"\u00ca\u00cb\7o\2\2\u00cb\u00cc\7c\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7*\2"+
		"\2\u00ce.\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0\60\3\2\2\2\u00d1\u00d5\t\3"+
		"\2\2\u00d2\u00d4\t\4\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\62\3\2\2\2\u00d7\u00d5\3\2\2"+
		"\2\u00d8\u00da\t\5\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\32\2\2"+
		"\u00de\64\3\2\2\2\u00df\u00e1\t\6\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\66\3\2\2\2\u00e4"+
		"\u00e6\t\6\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f0\3\2\2\2\u00e9\u00f1\3\2\2\2\u00ea"+
		"\u00ec\t\7\2\2\u00eb\u00ed\t\6\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00e9\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f18\3\2\2\2\u00f2\u00f3\7V\2\2\u00f3"+
		"\u00f4\7T\2\2\u00f4\u00f5\7W\2\2\u00f5\u0100\7G\2\2\u00f6\u00f7\7H\2\2"+
		"\u00f7\u00f8\7C\2\2\u00f8\u00f9\7N\2\2\u00f9\u00fa\7U\2\2\u00fa\u0100"+
		"\7G\2\2\u00fb\u00fc\7U\2\2\u00fc\u0100\7K\2\2\u00fd\u00fe\7P\2\2\u00fe"+
		"\u0100\7Q\2\2\u00ff\u00f2\3\2\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00fb\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100:\3\2\2\2\u0101\u0102\7)\2\2\u0102\u0106"+
		"\t\3\2\2\u0103\u0105\t\b\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\u0114\7)\2\2\u010a\u010b\7$\2\2\u010b\u010f\t\3\2\2\u010c\u010e"+
		"\t\b\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\7$"+
		"\2\2\u0113\u0101\3\2\2\2\u0113\u010a\3\2\2\2\u0114<\3\2\2\2\u0115\u0116"+
		"\7=\2\2\u0116>\3\2\2\2\17\2\u00a6\u00b4\u00d5\u00db\u00e2\u00e7\u00ee"+
		"\u00f0\u00ff\u0106\u010f\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}