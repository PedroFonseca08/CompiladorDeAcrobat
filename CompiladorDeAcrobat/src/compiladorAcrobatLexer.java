// Generated from compiladorAcrobat.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladorAcrobatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DEC=4, ALG=5, MAIN=6, TYPE=7, IN=8, OUT=9, TRUE=10, 
		FALSE=11, ARROW=12, OP=13, CP=14, OB=15, CB=16, ASGN=17, VAR=18, NUM=19, 
		STR=20, DELIM=21, COMMA=22, COMMENT=23, OP_ARIT=24, OP_COMP=25, OP_LOGI=26, 
		COND=27, LOOP=28, RTN=29, FUNC=30, NFUNC=31, WS=32, ErrorChar=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "DEC", "ALG", "MAIN", "TYPE", "IN", "OUT", "TRUE", 
			"FALSE", "ARROW", "OP", "CP", "OB", "CB", "ASGN", "VAR", "NUM", "STR", 
			"DELIM", "COMMA", "COMMENT", "OP_ARIT", "OP_COMP", "OP_LOGI", "COND", 
			"LOOP", "RTN", "FUNC", "NFUNC", "LETTER", "DIGIT", "WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IF'", "'ELSE IF'", "'ELSE'", "'DECLARATIONS'", "'ALGORITHM'", 
			"'MAIN'", null, "'JACKIN'", "'JACKOUT'", "'TRUE'", "'FALSE'", "'<-'", 
			"'('", "')'", "'{'", "'}'", "'ASSIGN'", null, null, null, "';'", "','", 
			null, null, null, null, null, "'WHILE'", "'RETURN'", "'FUNCTION'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "DEC", "ALG", "MAIN", "TYPE", "IN", "OUT", "TRUE", 
			"FALSE", "ARROW", "OP", "CP", "OB", "CB", "ASGN", "VAR", "NUM", "STR", 
			"DELIM", "COMMA", "COMMENT", "OP_ARIT", "OP_COMP", "OP_LOGI", "COND", 
			"LOOP", "RTN", "FUNC", "NFUNC", "WS", "ErrorChar"
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


	public compiladorAcrobatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladorAcrobat.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0130\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0088"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\7\23\u00b9\n\23\f\23\16\23\u00bc\13\23\3\24\6\24\u00bf\n\24\r\24"+
		"\16\24\u00c0\3\24\3\24\6\24\u00c5\n\24\r\24\16\24\u00c6\5\24\u00c9\n\24"+
		"\3\25\3\25\3\25\3\25\7\25\u00cf\n\25\f\25\16\25\u00d2\13\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00de\n\30\f\30\16\30\u00e1"+
		"\13\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00ef\n\32\3\33\3\33\3\33\3\33\5\33\u00f5\n\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0104\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \6 \u011f\n \r \16 \u0120\3!\3"+
		"!\3\"\3\"\3#\7#\u0128\n#\f#\16#\u012b\13#\3#\3#\3$\3$\2\2%\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\2E\""+
		"G#\3\2\t\3\2c|\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2,-//\61\61\4\2C\\c|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\2\u0142\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\3I\3\2\2\2\5L\3\2\2\2\7T\3\2\2\2\tY\3\2\2\2\13f\3\2\2\2"+
		"\rp\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u0090\3\2\2\2\25\u0098"+
		"\3\2\2\2\27\u009d\3\2\2\2\31\u00a3\3\2\2\2\33\u00a6\3\2\2\2\35\u00a8\3"+
		"\2\2\2\37\u00aa\3\2\2\2!\u00ac\3\2\2\2#\u00ae\3\2\2\2%\u00b5\3\2\2\2\'"+
		"\u00be\3\2\2\2)\u00ca\3\2\2\2+\u00d5\3\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2"+
		"\2\2\61\u00e4\3\2\2\2\63\u00ee\3\2\2\2\65\u00f4\3\2\2\2\67\u0103\3\2\2"+
		"\29\u0105\3\2\2\2;\u010b\3\2\2\2=\u0112\3\2\2\2?\u011b\3\2\2\2A\u0122"+
		"\3\2\2\2C\u0124\3\2\2\2E\u0129\3\2\2\2G\u012e\3\2\2\2IJ\7K\2\2JK\7H\2"+
		"\2K\4\3\2\2\2LM\7G\2\2MN\7N\2\2NO\7U\2\2OP\7G\2\2PQ\7\"\2\2QR\7K\2\2R"+
		"S\7H\2\2S\6\3\2\2\2TU\7G\2\2UV\7N\2\2VW\7U\2\2WX\7G\2\2X\b\3\2\2\2YZ\7"+
		"F\2\2Z[\7G\2\2[\\\7E\2\2\\]\7N\2\2]^\7C\2\2^_\7T\2\2_`\7C\2\2`a\7V\2\2"+
		"ab\7K\2\2bc\7Q\2\2cd\7P\2\2de\7U\2\2e\n\3\2\2\2fg\7C\2\2gh\7N\2\2hi\7"+
		"I\2\2ij\7Q\2\2jk\7T\2\2kl\7K\2\2lm\7V\2\2mn\7J\2\2no\7O\2\2o\f\3\2\2\2"+
		"pq\7O\2\2qr\7C\2\2rs\7K\2\2st\7P\2\2t\16\3\2\2\2uv\7K\2\2vw\7P\2\2w\u0088"+
		"\7V\2\2xy\7H\2\2yz\7N\2\2z{\7Q\2\2{|\7C\2\2|\u0088\7V\2\2}~\7U\2\2~\177"+
		"\7V\2\2\177\u0080\7T\2\2\u0080\u0081\7K\2\2\u0081\u0082\7P\2\2\u0082\u0088"+
		"\7I\2\2\u0083\u0084\7D\2\2\u0084\u0085\7Q\2\2\u0085\u0086\7Q\2\2\u0086"+
		"\u0088\7N\2\2\u0087u\3\2\2\2\u0087x\3\2\2\2\u0087}\3\2\2\2\u0087\u0083"+
		"\3\2\2\2\u0088\20\3\2\2\2\u0089\u008a\7L\2\2\u008a\u008b\7C\2\2\u008b"+
		"\u008c\7E\2\2\u008c\u008d\7M\2\2\u008d\u008e\7K\2\2\u008e\u008f\7P\2\2"+
		"\u008f\22\3\2\2\2\u0090\u0091\7L\2\2\u0091\u0092\7C\2\2\u0092\u0093\7"+
		"E\2\2\u0093\u0094\7M\2\2\u0094\u0095\7Q\2\2\u0095\u0096\7W\2\2\u0096\u0097"+
		"\7V\2\2\u0097\24\3\2\2\2\u0098\u0099\7V\2\2\u0099\u009a\7T\2\2\u009a\u009b"+
		"\7W\2\2\u009b\u009c\7G\2\2\u009c\26\3\2\2\2\u009d\u009e\7H\2\2\u009e\u009f"+
		"\7C\2\2\u009f\u00a0\7N\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7G\2\2\u00a2"+
		"\30\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7/\2\2\u00a5\32\3\2\2\2\u00a6"+
		"\u00a7\7*\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9\36\3\2\2\2\u00aa"+
		"\u00ab\7}\2\2\u00ab \3\2\2\2\u00ac\u00ad\7\177\2\2\u00ad\"\3\2\2\2\u00ae"+
		"\u00af\7C\2\2\u00af\u00b0\7U\2\2\u00b0\u00b1\7U\2\2\u00b1\u00b2\7K\2\2"+
		"\u00b2\u00b3\7I\2\2\u00b3\u00b4\7P\2\2\u00b4$\3\2\2\2\u00b5\u00ba\t\2"+
		"\2\2\u00b6\u00b9\5C\"\2\u00b7\u00b9\5A!\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"&\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\5C\"\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c8\3\2"+
		"\2\2\u00c2\u00c4\7\60\2\2\u00c3\u00c5\5C\"\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9(\3\2\2\2\u00ca\u00d0"+
		"\7$\2\2\u00cb\u00cf\n\3\2\2\u00cc\u00cd\7^\2\2\u00cd\u00cf\13\2\2\2\u00ce"+
		"\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\7$\2\2\u00d4*\3\2\2\2\u00d5\u00d6\7=\2\2\u00d6,\3\2\2\2\u00d7\u00d8"+
		"\7.\2\2\u00d8.\3\2\2\2\u00d9\u00da\7\61\2\2\u00da\u00db\7\61\2\2\u00db"+
		"\u00df\3\2\2\2\u00dc\u00de\n\4\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\b\30\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\t\5\2"+
		"\2\u00e5\62\3\2\2\2\u00e6\u00ef\4>?\2\u00e7\u00e8\7>\2\2\u00e8\u00ef\7"+
		"?\2\2\u00e9\u00ef\7@\2\2\u00ea\u00eb\7@\2\2\u00eb\u00ef\7?\2\2\u00ec\u00ed"+
		"\7#\2\2\u00ed\u00ef\7?\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee"+
		"\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\64\3\2\2"+
		"\2\u00f0\u00f1\7(\2\2\u00f1\u00f5\7(\2\2\u00f2\u00f3\7~\2\2\u00f3\u00f5"+
		"\7~\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\66\3\2\2\2\u00f6"+
		"\u00f7\7K\2\2\u00f7\u0104\7H\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa\7N\2\2"+
		"\u00fa\u00fb\7U\2\2\u00fb\u0104\7G\2\2\u00fc\u00fd\7G\2\2\u00fd\u00fe"+
		"\7N\2\2\u00fe\u00ff\7U\2\2\u00ff\u0100\7G\2\2\u0100\u0101\7\"\2\2\u0101"+
		"\u0102\7K\2\2\u0102\u0104\7H\2\2\u0103\u00f6\3\2\2\2\u0103\u00f8\3\2\2"+
		"\2\u0103\u00fc\3\2\2\2\u01048\3\2\2\2\u0105\u0106\7Y\2\2\u0106\u0107\7"+
		"J\2\2\u0107\u0108\7K\2\2\u0108\u0109\7N\2\2\u0109\u010a\7G\2\2\u010a:"+
		"\3\2\2\2\u010b\u010c\7T\2\2\u010c\u010d\7G\2\2\u010d\u010e\7V\2\2\u010e"+
		"\u010f\7W\2\2\u010f\u0110\7T\2\2\u0110\u0111\7P\2\2\u0111<\3\2\2\2\u0112"+
		"\u0113\7H\2\2\u0113\u0114\7W\2\2\u0114\u0115\7P\2\2\u0115\u0116\7E\2\2"+
		"\u0116\u0117\7V\2\2\u0117\u0118\7K\2\2\u0118\u0119\7Q\2\2\u0119\u011a"+
		"\7P\2\2\u011a>\3\2\2\2\u011b\u011e\7a\2\2\u011c\u011f\5C\"\2\u011d\u011f"+
		"\5A!\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121@\3\2\2\2\u0122\u0123\t\6\2\2"+
		"\u0123B\3\2\2\2\u0124\u0125\t\7\2\2\u0125D\3\2\2\2\u0126\u0128\t\b\2\2"+
		"\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\b#\2\2\u012d"+
		"F\3\2\2\2\u012e\u012f\13\2\2\2\u012fH\3\2\2\2\22\2\u0087\u00b8\u00ba\u00c0"+
		"\u00c6\u00c8\u00ce\u00d0\u00df\u00ee\u00f4\u0103\u011e\u0120\u0129\3\b"+
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