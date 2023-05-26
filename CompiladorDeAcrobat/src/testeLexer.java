// Generated from teste.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEC=1, ALG=2, TYPE=3, IN=4, OUT=5, ATR=6, OP=7, CP=8, OB=9, CB=10, VAR=11, 
		NUM=12, STR=13, DELIM=14, COMMA=15, OP_ARIT=16, OP_COMP=17, OP_LOGI=18, 
		COND=19, RTN=20, FUNC=21, NFUNC=22, WS=23, ErrorChar=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEC", "ALG", "TYPE", "IN", "OUT", "ATR", "OP", "CP", "OB", "CB", "VAR", 
			"NUM", "STR", "DELIM", "COMMA", "OP_ARIT", "OP_COMP", "OP_LOGI", "COND", 
			"RTN", "FUNC", "NFUNC", "LETTER", "DIGIT", "WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARATIONS'", "'ALGORITHM'", null, "'JACKIN'", "'JACKOUT'", 
			"'<-'", "'('", "')'", "'{'", "'}'", null, null, null, "';'", "','", null, 
			null, null, null, "'RETURN'", "'FUNCAO'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEC", "ALG", "TYPE", "IN", "OUT", "ATR", "OP", "CP", "OB", "CB", 
			"VAR", "NUM", "STR", "DELIM", "COMMA", "OP_ARIT", "OP_COMP", "OP_LOGI", 
			"COND", "RTN", "FUNC", "NFUNC", "WS", "ErrorChar"
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


	public testeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "teste.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00e2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\7\f\u0080\n\f\f\f\16\f\u0083\13"+
		"\f\3\r\6\r\u0086\n\r\r\r\16\r\u0087\3\r\3\r\6\r\u008c\n\r\r\r\16\r\u008d"+
		"\5\r\u0090\n\r\3\16\3\16\6\16\u0094\n\16\r\16\16\16\u0095\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00a8\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00af\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00be\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\6\27\u00d1\n\27\r\27\16\27\u00d2\3\30\3\30\3\31\3\31\3\32\7"+
		"\32\u00da\n\32\f\32\16\32\u00dd\13\32\3\32\3\32\3\33\3\33\2\2\34\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\31\65\32\3\2\7\3\2c|\5\2,-//"+
		"\61\61\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00f3\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67"+
		"\3\2\2\2\5D\3\2\2\2\7`\3\2\2\2\tb\3\2\2\2\13i\3\2\2\2\rq\3\2\2\2\17t\3"+
		"\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31\u0085\3\2\2"+
		"\2\33\u0091\3\2\2\2\35\u0099\3\2\2\2\37\u009b\3\2\2\2!\u009d\3\2\2\2#"+
		"\u00a7\3\2\2\2%\u00ae\3\2\2\2\'\u00bd\3\2\2\2)\u00bf\3\2\2\2+\u00c6\3"+
		"\2\2\2-\u00cd\3\2\2\2/\u00d4\3\2\2\2\61\u00d6\3\2\2\2\63\u00db\3\2\2\2"+
		"\65\u00e0\3\2\2\2\678\7F\2\289\7G\2\29:\7E\2\2:;\7N\2\2;<\7C\2\2<=\7T"+
		"\2\2=>\7C\2\2>?\7V\2\2?@\7K\2\2@A\7Q\2\2AB\7P\2\2BC\7U\2\2C\4\3\2\2\2"+
		"DE\7C\2\2EF\7N\2\2FG\7I\2\2GH\7Q\2\2HI\7T\2\2IJ\7K\2\2JK\7V\2\2KL\7J\2"+
		"\2LM\7O\2\2M\6\3\2\2\2NO\7K\2\2OP\7P\2\2Pa\7V\2\2QR\7H\2\2RS\7N\2\2ST"+
		"\7Q\2\2TU\7C\2\2Ua\7V\2\2VW\7U\2\2WX\7V\2\2XY\7T\2\2YZ\7K\2\2Z[\7P\2\2"+
		"[a\7I\2\2\\]\7D\2\2]^\7Q\2\2^_\7Q\2\2_a\7N\2\2`N\3\2\2\2`Q\3\2\2\2`V\3"+
		"\2\2\2`\\\3\2\2\2a\b\3\2\2\2bc\7L\2\2cd\7C\2\2de\7E\2\2ef\7M\2\2fg\7K"+
		"\2\2gh\7P\2\2h\n\3\2\2\2ij\7L\2\2jk\7C\2\2kl\7E\2\2lm\7M\2\2mn\7Q\2\2"+
		"no\7W\2\2op\7V\2\2p\f\3\2\2\2qr\7>\2\2rs\7/\2\2s\16\3\2\2\2tu\7*\2\2u"+
		"\20\3\2\2\2vw\7+\2\2w\22\3\2\2\2xy\7}\2\2y\24\3\2\2\2z{\7\177\2\2{\26"+
		"\3\2\2\2|\u0081\t\2\2\2}\u0080\5\61\31\2~\u0080\5/\30\2\177}\3\2\2\2\177"+
		"~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\30\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\5\61\31\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008f\3\2\2\2\u0089\u008b\7\60\2\2\u008a\u008c\5\61\31\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u0090\3\2\2\2\u0090\32\3\2\2"+
		"\2\u0091\u0093\7$\2\2\u0092\u0094\5/\30\2\u0093\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7$\2\2\u0098\34\3\2\2\2\u0099\u009a\7=\2\2\u009a\36\3\2\2\2\u009b"+
		"\u009c\7.\2\2\u009c \3\2\2\2\u009d\u009e\t\3\2\2\u009e\"\3\2\2\2\u009f"+
		"\u00a8\4>?\2\u00a0\u00a1\7>\2\2\u00a1\u00a8\7?\2\2\u00a2\u00a8\7@\2\2"+
		"\u00a3\u00a4\7@\2\2\u00a4\u00a8\7?\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a8"+
		"\7?\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7"+
		"\u00a3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7(\2\2\u00aa"+
		"\u00af\7(\2\2\u00ab\u00ac\7~\2\2\u00ac\u00af\7~\2\2\u00ad\u00af\7#\2\2"+
		"\u00ae\u00a9\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af&\3"+
		"\2\2\2\u00b0\u00b1\7K\2\2\u00b1\u00be\7H\2\2\u00b2\u00b3\7G\2\2\u00b3"+
		"\u00b4\7N\2\2\u00b4\u00b5\7U\2\2\u00b5\u00be\7G\2\2\u00b6\u00b7\7G\2\2"+
		"\u00b7\u00b8\7N\2\2\u00b8\u00b9\7U\2\2\u00b9\u00ba\7G\2\2\u00ba\u00bb"+
		"\7\"\2\2\u00bb\u00bc\7K\2\2\u00bc\u00be\7H\2\2\u00bd\u00b0\3\2\2\2\u00bd"+
		"\u00b2\3\2\2\2\u00bd\u00b6\3\2\2\2\u00be(\3\2\2\2\u00bf\u00c0\7T\2\2\u00c0"+
		"\u00c1\7G\2\2\u00c1\u00c2\7V\2\2\u00c2\u00c3\7W\2\2\u00c3\u00c4\7T\2\2"+
		"\u00c4\u00c5\7P\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7H\2\2\u00c7\u00c8\7W\2"+
		"\2\u00c8\u00c9\7P\2\2\u00c9\u00ca\7E\2\2\u00ca\u00cb\7C\2\2\u00cb\u00cc"+
		"\7Q\2\2\u00cc,\3\2\2\2\u00cd\u00d0\7a\2\2\u00ce\u00d1\5\61\31\2\u00cf"+
		"\u00d1\5/\30\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3.\3\2\2\2\u00d4\u00d5"+
		"\t\4\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\t\5\2\2\u00d7\62\3\2\2\2\u00d8\u00da"+
		"\t\6\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\b\32"+
		"\2\2\u00df\64\3\2\2\2\u00e0\u00e1\13\2\2\2\u00e1\66\3\2\2\2\20\2`\177"+
		"\u0081\u0087\u008d\u008f\u0095\u00a7\u00ae\u00bd\u00d0\u00d2\u00db\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}