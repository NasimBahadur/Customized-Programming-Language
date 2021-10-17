// Generated from /home/user/code/Project_CSE375/project375/rules.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		DIGIT=53, LETTER=54, CAPITAL_LETTER=55, SIGN=56, WHITE_SPACE=57, SPACE=58;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "DIGIT", "LETTER", "CAPITAL_LETTER", "SIGN", 
			"WHITE_SPACE", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'include'", "'define'", "'def'", "'('", "','", "')'", "'main'", 
			"'function'", "'{'", "'}'", "';'", "'print'", "'\"'", "'continue'", "'break'", 
			"'constant'", "'='", "'return'", "'if'", "'else'", "'input'", "'while'", 
			"'for'", "'++'", "'--'", "'&&'", "'||'", "'!'", "'AND'", "'OR'", "'NOT'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'+='", "'-='", "'*='", "'/='", "'%='", "'int'", "'float'", "'double'", 
			"'bool'", "'string'", null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "DIGIT", "LETTER", "CAPITAL_LETTER", "SIGN", 
			"WHITE_SPACE", "SPACE"
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


	public rulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0154\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,"+
		"\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3:\3:\3;\3;\3;\3;\2\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\7\3\2\62;\5\2C\\a"+
		"ac|\3\2C\\\7\2##&\'.\60<<AB\3\2\13\f\2\u0153\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5\177\3\2\2\2\7\u0086\3\2\2\2\t\u008a"+
		"\3\2\2\2\13\u008c\3\2\2\2\r\u008e\3\2\2\2\17\u0090\3\2\2\2\21\u0095\3"+
		"\2\2\2\23\u009e\3\2\2\2\25\u00a0\3\2\2\2\27\u00a2\3\2\2\2\31\u00a4\3\2"+
		"\2\2\33\u00aa\3\2\2\2\35\u00ac\3\2\2\2\37\u00b5\3\2\2\2!\u00bb\3\2\2\2"+
		"#\u00c4\3\2\2\2%\u00c6\3\2\2\2\'\u00cd\3\2\2\2)\u00d0\3\2\2\2+\u00d5\3"+
		"\2\2\2-\u00db\3\2\2\2/\u00e1\3\2\2\2\61\u00e5\3\2\2\2\63\u00e8\3\2\2\2"+
		"\65\u00eb\3\2\2\2\67\u00ee\3\2\2\29\u00f1\3\2\2\2;\u00f3\3\2\2\2=\u00f7"+
		"\3\2\2\2?\u00fa\3\2\2\2A\u00fe\3\2\2\2C\u0101\3\2\2\2E\u0104\3\2\2\2G"+
		"\u0106\3\2\2\2I\u0108\3\2\2\2K\u010b\3\2\2\2M\u010e\3\2\2\2O\u0110\3\2"+
		"\2\2Q\u0112\3\2\2\2S\u0114\3\2\2\2U\u0116\3\2\2\2W\u0118\3\2\2\2Y\u011b"+
		"\3\2\2\2[\u011e\3\2\2\2]\u0121\3\2\2\2_\u0124\3\2\2\2a\u0127\3\2\2\2c"+
		"\u012b\3\2\2\2e\u0131\3\2\2\2g\u0138\3\2\2\2i\u013d\3\2\2\2k\u0144\3\2"+
		"\2\2m\u0146\3\2\2\2o\u0148\3\2\2\2q\u014a\3\2\2\2s\u014c\3\2\2\2u\u0150"+
		"\3\2\2\2wx\7k\2\2xy\7p\2\2yz\7e\2\2z{\7n\2\2{|\7w\2\2|}\7f\2\2}~\7g\2"+
		"\2~\4\3\2\2\2\177\u0080\7f\2\2\u0080\u0081\7g\2\2\u0081\u0082\7h\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\u0085\7g\2\2\u0085\6\3\2\2\2\u0086"+
		"\u0087\7f\2\2\u0087\u0088\7g\2\2\u0088\u0089\7h\2\2\u0089\b\3\2\2\2\u008a"+
		"\u008b\7*\2\2\u008b\n\3\2\2\2\u008c\u008d\7.\2\2\u008d\f\3\2\2\2\u008e"+
		"\u008f\7+\2\2\u008f\16\3\2\2\2\u0090\u0091\7o\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\20\3\2\2\2\u0095\u0096\7h\2\2\u0096"+
		"\u0097\7w\2\2\u0097\u0098\7p\2\2\u0098\u0099\7e\2\2\u0099\u009a\7v\2\2"+
		"\u009a\u009b\7k\2\2\u009b\u009c\7q\2\2\u009c\u009d\7p\2\2\u009d\22\3\2"+
		"\2\2\u009e\u009f\7}\2\2\u009f\24\3\2\2\2\u00a0\u00a1\7\177\2\2\u00a1\26"+
		"\3\2\2\2\u00a2\u00a3\7=\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7r\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2"+
		"\u00a9\32\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7e\2"+
		"\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1"+
		"\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\36\3\2\2\2\u00b5\u00b6\7d\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7c\2\2\u00b9\u00ba\7m\2\2\u00ba \3\2\2\2\u00bb\u00bc\7e\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7v\2\2"+
		"\u00c0\u00c1\7c\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\"\3\2"+
		"\2\2\u00c4\u00c5\7?\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7t\2\2\u00cb"+
		"\u00cc\7p\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cf"+
		"(\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4*\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7p\2\2\u00d7"+
		"\u00d8\7r\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7v\2\2\u00da,\3\2\2\2\u00db"+
		"\u00dc\7y\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7n\2\2"+
		"\u00df\u00e0\7g\2\2\u00e0.\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7q\2"+
		"\2\u00e3\u00e4\7t\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7-\2\2\u00e6\u00e7"+
		"\7-\2\2\u00e7\62\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\7/\2\2\u00ea\64"+
		"\3\2\2\2\u00eb\u00ec\7(\2\2\u00ec\u00ed\7(\2\2\u00ed\66\3\2\2\2\u00ee"+
		"\u00ef\7~\2\2\u00ef\u00f0\7~\2\2\u00f08\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2"+
		":\3\2\2\2\u00f3\u00f4\7C\2\2\u00f4\u00f5\7P\2\2\u00f5\u00f6\7F\2\2\u00f6"+
		"<\3\2\2\2\u00f7\u00f8\7Q\2\2\u00f8\u00f9\7T\2\2\u00f9>\3\2\2\2\u00fa\u00fb"+
		"\7P\2\2\u00fb\u00fc\7Q\2\2\u00fc\u00fd\7V\2\2\u00fd@\3\2\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ff\u0100\7?\2\2\u0100B\3\2\2\2\u0101\u0102\7#\2\2\u0102\u0103"+
		"\7?\2\2\u0103D\3\2\2\2\u0104\u0105\7>\2\2\u0105F\3\2\2\2\u0106\u0107\7"+
		"@\2\2\u0107H\3\2\2\2\u0108\u0109\7>\2\2\u0109\u010a\7?\2\2\u010aJ\3\2"+
		"\2\2\u010b\u010c\7@\2\2\u010c\u010d\7?\2\2\u010dL\3\2\2\2\u010e\u010f"+
		"\7-\2\2\u010fN\3\2\2\2\u0110\u0111\7/\2\2\u0111P\3\2\2\2\u0112\u0113\7"+
		",\2\2\u0113R\3\2\2\2\u0114\u0115\7\61\2\2\u0115T\3\2\2\2\u0116\u0117\7"+
		"\'\2\2\u0117V\3\2\2\2\u0118\u0119\7-\2\2\u0119\u011a\7?\2\2\u011aX\3\2"+
		"\2\2\u011b\u011c\7/\2\2\u011c\u011d\7?\2\2\u011dZ\3\2\2\2\u011e\u011f"+
		"\7,\2\2\u011f\u0120\7?\2\2\u0120\\\3\2\2\2\u0121\u0122\7\61\2\2\u0122"+
		"\u0123\7?\2\2\u0123^\3\2\2\2\u0124\u0125\7\'\2\2\u0125\u0126\7?\2\2\u0126"+
		"`\3\2\2\2\u0127\u0128\7k\2\2\u0128\u0129\7p\2\2\u0129\u012a\7v\2\2\u012a"+
		"b\3\2\2\2\u012b\u012c\7h\2\2\u012c\u012d\7n\2\2\u012d\u012e\7q\2\2\u012e"+
		"\u012f\7c\2\2\u012f\u0130\7v\2\2\u0130d\3\2\2\2\u0131\u0132\7f\2\2\u0132"+
		"\u0133\7q\2\2\u0133\u0134\7w\2\2\u0134\u0135\7d\2\2\u0135\u0136\7n\2\2"+
		"\u0136\u0137\7g\2\2\u0137f\3\2\2\2\u0138\u0139\7d\2\2\u0139\u013a\7q\2"+
		"\2\u013a\u013b\7q\2\2\u013b\u013c\7n\2\2\u013ch\3\2\2\2\u013d\u013e\7"+
		"u\2\2\u013e\u013f\7v\2\2\u013f\u0140\7t\2\2\u0140\u0141\7k\2\2\u0141\u0142"+
		"\7p\2\2\u0142\u0143\7i\2\2\u0143j\3\2\2\2\u0144\u0145\t\2\2\2\u0145l\3"+
		"\2\2\2\u0146\u0147\t\3\2\2\u0147n\3\2\2\2\u0148\u0149\t\4\2\2\u0149p\3"+
		"\2\2\2\u014a\u014b\t\5\2\2\u014br\3\2\2\2\u014c\u014d\t\6\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014f\b:\2\2\u014ft\3\2\2\2\u0150\u0151\7\"\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0153\b;\2\2\u0153v\3\2\2\2\3\2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}