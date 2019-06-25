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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, SINO=24, COMMENT=25, 
		LINE_COMMENT=26, INICIO=27, FIN=28, PROGRAMA=29, PIZQ=30, PDER=31, BIZQ=32, 
		BDER=33, LIZQ=34, LDER=35, NUM=36, DOUBLE=37, BOOL=38, CADENA=39, VECTOR=40, 
		ID=41, ESP=42, SMCOLON=43, COMA=44, OPERADOR=45, ROP=46;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "SINO", "COMMENT", 
			"LINE_COMMENT", "INICIO", "FIN", "PROGRAMA", "PIZQ", "PDER", "BIZQ", 
			"BDER", "LIZQ", "LDER", "NUM", "DOUBLE", "BOOL", "CADENA", "VECTOR", 
			"ID", "ESP", "SMCOLON", "COMA", "OPERADOR", "ROP"
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
			null, null, null, null, null, null, "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SINO", "COMMENT", "LINE_COMMENT", "INICIO", "FIN", "PROGRAMA", "PIZQ", 
			"PDER", "BIZQ", "BDER", "LIZQ", "LDER", "NUM", "DOUBLE", "BOOL", "CADENA", 
			"VECTOR", "ID", "ESP", "SMCOLON", "COMA", "OPERADOR", "ROP"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00ef\n\32\f\32"+
		"\16\32\u00f2\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00fd"+
		"\n\33\f\33\16\33\u0100\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\5%\u0125\n%\3%\6%\u0128\n"+
		"%\r%\16%\u0129\3&\5&\u012d\n&\3&\6&\u0130\n&\r&\16&\u0131\3&\3&\3&\6&"+
		"\u0137\n&\r&\16&\u0138\5&\u013b\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u014a\n\'\3(\3(\7(\u014e\n(\f(\16(\u0151\13(\3(\3"+
		"(\3(\3(\3(\3(\7(\u0159\n(\f(\16(\u015c\13(\3(\3(\3(\3(\3(\7(\u0163\n("+
		"\f(\16(\u0166\13(\3(\5(\u0169\n(\3)\3)\7)\u016d\n)\f)\16)\u0170\13)\3"+
		")\7)\u0173\n)\f)\16)\u0176\13)\3)\3)\3)\3)\3*\3*\7*\u017e\n*\f*\16*\u0181"+
		"\13*\3+\6+\u0184\n+\r+\16+\u0185\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\5.\u0198\n.\3/\3/\3/\3/\3/\5/\u019f\n/\6\u00f0\u014f\u015a"+
		"\u0164\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\t\4\2\f\f\17\17"+
		"\3\2\62;\3\2\60\60\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\b\2\'\'"+
		",-//\61\61>@``\2\u01b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\3_\3\2\2\2\5e\3\2\2\2\7k\3\2\2\2\to\3\2\2\2\13q\3\2\2\2\rs\3\2"+
		"\2\2\17z\3\2\2\2\21\u0081\3\2\2\2\23\u008a\3\2\2\2\25\u0093\3\2\2\2\27"+
		"\u009a\3\2\2\2\31\u00a1\3\2\2\2\33\u00a4\3\2\2\2\35\u00ad\3\2\2\2\37\u00b5"+
		"\3\2\2\2!\u00bb\3\2\2\2#\u00c1\3\2\2\2%\u00c6\3\2\2\2\'\u00cf\3\2\2\2"+
		")\u00d4\3\2\2\2+\u00d9\3\2\2\2-\u00de\3\2\2\2/\u00e2\3\2\2\2\61\u00e5"+
		"\3\2\2\2\63\u00ea\3\2\2\2\65\u00f8\3\2\2\2\67\u0103\3\2\2\29\u010a\3\2"+
		"\2\2;\u010e\3\2\2\2=\u0117\3\2\2\2?\u0119\3\2\2\2A\u011b\3\2\2\2C\u011d"+
		"\3\2\2\2E\u011f\3\2\2\2G\u0121\3\2\2\2I\u0124\3\2\2\2K\u012c\3\2\2\2M"+
		"\u0149\3\2\2\2O\u0168\3\2\2\2Q\u016a\3\2\2\2S\u017b\3\2\2\2U\u0183\3\2"+
		"\2\2W\u0189\3\2\2\2Y\u018b\3\2\2\2[\u0197\3\2\2\2]\u019e\3\2\2\2_`\7e"+
		"\2\2`a\7q\2\2ab\7p\2\2bc\7u\2\2cd\7v\2\2d\4\3\2\2\2ef\7v\2\2fg\7k\2\2"+
		"gh\7r\2\2hi\7q\2\2ij\7u\2\2j\6\3\2\2\2kl\7x\2\2lm\7c\2\2mn\7t\2\2n\b\3"+
		"\2\2\2op\7?\2\2p\n\3\2\2\2qr\7<\2\2r\f\3\2\2\2st\7x\2\2tu\7g\2\2uv\7e"+
		"\2\2vw\7v\2\2wx\7q\2\2xy\7t\2\2y\16\3\2\2\2z{\7o\2\2{|\7c\2\2|}\7v\2\2"+
		"}~\7t\2\2~\177\7k\2\2\177\u0080\7|\2\2\u0080\20\3\2\2\2\u0081\u0082\7"+
		"t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7i\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7u\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7q\2\2\u0089"+
		"\22\3\2\2\2\u008a\u008b\7p\2\2\u008b\u008c\7w\2\2\u008c\u008d\7o\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7t\2\2\u008f\u0090\7k\2\2\u0090\u0091\7e\2\2"+
		"\u0091\u0092\7q\2\2\u0092\24\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095\7"+
		"c\2\2\u0095\u0096\7f\2\2\u0096\u0097\7g\2\2\u0097\u0098\7p\2\2\u0098\u0099"+
		"\7c\2\2\u0099\26\3\2\2\2\u009a\u009b\7n\2\2\u009b\u009c\7q\2\2\u009c\u009d"+
		"\7i\2\2\u009d\u009e\7k\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\30\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7k\2\2\u00a3\32\3\2\2\2\u00a4"+
		"\u00a5\7o\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2"+
		"\u00a8\u00a9\7v\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac"+
		"\7u\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7r\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7t\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7u\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7c\2\2\u00ba \3\2\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7f\2\2"+
		"\u00bf\u00c0\7g\2\2\u00c0\"\3\2\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7c"+
		"\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7q\2\2\u00c5$\3\2\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7t\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7t\2\2"+
		"\u00ce&\3\2\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7g\2"+
		"\2\u00d2\u00d3\7t\2\2\u00d3(\3\2\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7"+
		"x\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7n\2\2\u00d8*\3\2\2\2\u00d9\u00da"+
		"\7e\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7q\2\2\u00dd"+
		",\3\2\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7f\2\2\u00e1"+
		".\3\2\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7t\2\2\u00e4\60\3\2\2\2\u00e5"+
		"\u00e6\7u\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7q\2\2"+
		"\u00e9\62\3\2\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\7,\2\2\u00ec\u00f0"+
		"\3\2\2\2\u00ed\u00ef\13\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\b\32\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\7\61"+
		"\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fd\n\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\b\33\2\2\u0102\66\3\2\2\2\u0103\u0104"+
		"\7k\2\2\u0104\u0105\7p\2\2\u0105\u0106\7k\2\2\u0106\u0107\7e\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u0109\7q\2\2\u01098\3\2\2\2\u010a\u010b\7h\2\2\u010b"+
		"\u010c\7k\2\2\u010c\u010d\7p\2\2\u010d:\3\2\2\2\u010e\u010f\7r\2\2\u010f"+
		"\u0110\7t\2\2\u0110\u0111\7q\2\2\u0111\u0112\7i\2\2\u0112\u0113\7t\2\2"+
		"\u0113\u0114\7c\2\2\u0114\u0115\7o\2\2\u0115\u0116\7c\2\2\u0116<\3\2\2"+
		"\2\u0117\u0118\7*\2\2\u0118>\3\2\2\2\u0119\u011a\7+\2\2\u011a@\3\2\2\2"+
		"\u011b\u011c\7]\2\2\u011cB\3\2\2\2\u011d\u011e\7_\2\2\u011eD\3\2\2\2\u011f"+
		"\u0120\7}\2\2\u0120F\3\2\2\2\u0121\u0122\7\177\2\2\u0122H\3\2\2\2\u0123"+
		"\u0125\7/\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2"+
		"\2\2\u0126\u0128\t\3\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aJ\3\2\2\2\u012b\u012d\7/\2\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0130\t\3"+
		"\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u013a\3\2\2\2\u0133\u013b\3\2\2\2\u0134\u0136\t\4"+
		"\2\2\u0135\u0137\t\3\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0133\3\2"+
		"\2\2\u013a\u0134\3\2\2\2\u013bL\3\2\2\2\u013c\u013d\7V\2\2\u013d\u013e"+
		"\7T\2\2\u013e\u013f\7W\2\2\u013f\u014a\7G\2\2\u0140\u0141\7H\2\2\u0141"+
		"\u0142\7C\2\2\u0142\u0143\7N\2\2\u0143\u0144\7U\2\2\u0144\u014a\7G\2\2"+
		"\u0145\u0146\7U\2\2\u0146\u014a\7K\2\2\u0147\u0148\7P\2\2\u0148\u014a"+
		"\7Q\2\2\u0149\u013c\3\2\2\2\u0149\u0140\3\2\2\2\u0149\u0145\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014aN\3\2\2\2\u014b\u014f\7$\2\2\u014c\u014e\13\2\2\2"+
		"\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0169\7$\2\2\u0153"+
		"\u0154\7\u00e4\2\2\u0154\u0155\7\u20ae\2\2\u0155\u0156\7\u0155\2\2\u0156"+
		"\u015a\3\2\2\2\u0157\u0159\13\2\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015d\u015e\7\u00e4\2\2\u015e\u015f\7\u20ae\2\2\u015f\u0169"+
		"\7\uffff\2\2\u0160\u0164\7)\2\2\u0161\u0163\13\2\2\2\u0162\u0161\3\2\2"+
		"\2\u0163\u0166\3\2\2\2\u0164\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\7)\2\2\u0168\u014b\3\2\2\2\u0168"+
		"\u0153\3\2\2\2\u0168\u0160\3\2\2\2\u0169P\3\2\2\2\u016a\u016e\t\5\2\2"+
		"\u016b\u016d\t\6\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0174\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0173\7\"\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\7]\2\2\u0178\u0179\t\6\2\2\u0179\u017a\7_\2\2\u017aR\3\2\2\2\u017b"+
		"\u017f\t\5\2\2\u017c\u017e\t\6\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180T\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0182\u0184\t\7\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\b+"+
		"\2\2\u0188V\3\2\2\2\u0189\u018a\7=\2\2\u018aX\3\2\2\2\u018b\u018c\7.\2"+
		"\2\u018cZ\3\2\2\2\u018d\u0198\t\b\2\2\u018e\u018f\7>\2\2\u018f\u0198\7"+
		"?\2\2\u0190\u0191\7@\2\2\u0191\u0198\7?\2\2\u0192\u0193\7c\2\2\u0193\u0194"+
		"\7p\2\2\u0194\u0198\7f\2\2\u0195\u0196\7q\2\2\u0196\u0198\7t\2\2\u0197"+
		"\u018d\3\2\2\2\u0197\u018e\3\2\2\2\u0197\u0190\3\2\2\2\u0197\u0192\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\\\3\2\2\2\u0199\u019a\7c\2\2\u019a\u019b"+
		"\7p\2\2\u019b\u019f\7f\2\2\u019c\u019d\7q\2\2\u019d\u019f\7t\2\2\u019e"+
		"\u0199\3\2\2\2\u019e\u019c\3\2\2\2\u019f^\3\2\2\2\26\2\u00f0\u00fe\u0124"+
		"\u0129\u012c\u0131\u0138\u013a\u0149\u014f\u015a\u0164\u0168\u016e\u0174"+
		"\u017f\u0185\u0197\u019e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}