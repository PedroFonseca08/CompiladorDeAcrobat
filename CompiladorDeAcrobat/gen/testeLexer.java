// Generated from C:/Users/pedro/IdeaProjects/CompiladorDeAcrobat/src\teste.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class testeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEC=1, ALG=2, TIPO=3, ATR=4, A=5, AP=6, FP=7, ESC=8, ID=9, NUM=10, OP_ARIT=11, 
		WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEC", "ALG", "TIPO", "ATR", "A", "AP", "FP", "ESC", "ID", "NUM", "OP_ARIT", 
			"LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARACOES'", "'ALGORITMO'", null, "'atribuir'", "'a'", "'('", 
			"')'", "'ESCREVA'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEC", "ALG", "TIPO", "ATR", "A", "AP", "FP", "ESC", "ID", "NUM", 
			"OP_ARIT", "WS"
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
		"\u0004\u0000\fv\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\bW\b\b\n\b\f\bZ\t\b\u0001\t\u0004\t]\b\t\u000b\t\f\t^\u0001\t\u0001\t"+
		"\u0004\tc\b\t\u000b\t\f\td\u0003\tg\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0005\rp\b\r\n\r\f\rs\t\r\u0001\r\u0001"+
		"\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\u0000"+
		"\u0019\u0000\u001b\f\u0001\u0000\u0004\u0003\u0000*+--//\u0002\u0000A"+
		"Zaz\u0001\u000009\u0003\u0000\t\n\r\r  z\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003"+
		")\u0001\u0000\u0000\u0000\u0005:\u0001\u0000\u0000\u0000\u0007<\u0001"+
		"\u0000\u0000\u0000\tE\u0001\u0000\u0000\u0000\u000bG\u0001\u0000\u0000"+
		"\u0000\rI\u0001\u0000\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011"+
		"S\u0001\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000\u0000\u0015h\u0001"+
		"\u0000\u0000\u0000\u0017j\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000"+
		"\u0000\u001bq\u0001\u0000\u0000\u0000\u001d\u001e\u0005D\u0000\u0000\u001e"+
		"\u001f\u0005E\u0000\u0000\u001f \u0005C\u0000\u0000 !\u0005L\u0000\u0000"+
		"!\"\u0005A\u0000\u0000\"#\u0005R\u0000\u0000#$\u0005A\u0000\u0000$%\u0005"+
		"C\u0000\u0000%&\u0005O\u0000\u0000&\'\u0005E\u0000\u0000\'(\u0005S\u0000"+
		"\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005A\u0000\u0000*+\u0005L\u0000"+
		"\u0000+,\u0005G\u0000\u0000,-\u0005O\u0000\u0000-.\u0005R\u0000\u0000"+
		"./\u0005I\u0000\u0000/0\u0005T\u0000\u000001\u0005M\u0000\u000012\u0005"+
		"O\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005i\u0000\u000045\u0005"+
		"n\u0000\u00005;\u0005t\u0000\u000067\u0005r\u0000\u000078\u0005e\u0000"+
		"\u000089\u0005a\u0000\u00009;\u0005l\u0000\u0000:3\u0001\u0000\u0000\u0000"+
		":6\u0001\u0000\u0000\u0000;\u0006\u0001\u0000\u0000\u0000<=\u0005a\u0000"+
		"\u0000=>\u0005t\u0000\u0000>?\u0005r\u0000\u0000?@\u0005i\u0000\u0000"+
		"@A\u0005b\u0000\u0000AB\u0005u\u0000\u0000BC\u0005i\u0000\u0000CD\u0005"+
		"r\u0000\u0000D\b\u0001\u0000\u0000\u0000EF\u0005a\u0000\u0000F\n\u0001"+
		"\u0000\u0000\u0000GH\u0005(\u0000\u0000H\f\u0001\u0000\u0000\u0000IJ\u0005"+
		")\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KL\u0005E\u0000\u0000LM\u0005"+
		"S\u0000\u0000MN\u0005C\u0000\u0000NO\u0005R\u0000\u0000OP\u0005E\u0000"+
		"\u0000PQ\u0005V\u0000\u0000QR\u0005A\u0000\u0000R\u0010\u0001\u0000\u0000"+
		"\u0000SX\u0003\u0017\u000b\u0000TW\u0003\u0019\f\u0000UW\u0003\u0017\u000b"+
		"\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0012"+
		"\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0003\u0019\f\u0000"+
		"\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_f\u0001\u0000\u0000\u0000`b\u0005.\u0000"+
		"\u0000ac\u0003\u0019\f\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000"+
		"\u0000\u0000f`\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0014"+
		"\u0001\u0000\u0000\u0000hi\u0007\u0000\u0000\u0000i\u0016\u0001\u0000"+
		"\u0000\u0000jk\u0007\u0001\u0000\u0000k\u0018\u0001\u0000\u0000\u0000"+
		"lm\u0007\u0002\u0000\u0000m\u001a\u0001\u0000\u0000\u0000np\u0007\u0003"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tu\u0006\r\u0000\u0000u\u001c\u0001\u0000\u0000"+
		"\u0000\b\u0000:VX^dfq\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}