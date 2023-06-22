// Generated from .\compiladorAcrobat.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladorAcrobatParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DEC=4, ALG=5, MAIN=6, TYPE=7, IN=8, OUT=9, TRUE=10, 
		FALSE=11, ARROW=12, OP=13, CP=14, OB=15, CB=16, ASGN=17, VAR=18, NUM=19, 
		STR=20, DELIM=21, COMMA=22, COMMENT=23, OP_ARIT=24, OP_COMP=25, OP_LOGI=26, 
		COND=27, LOOP=28, RTN=29, FUNC=30, NFUNC=31, WS=32, ErrorChar=33;
	public static final int
		RULE_inicio = 0, RULE_declaracoes = 1, RULE_algoritmo = 2, RULE_funcao = 3, 
		RULE_funcaoChamada = 4, RULE_parametrosA = 5, RULE_parametrosB = 6, RULE_parametrosChamadaA = 7, 
		RULE_parametrosChamadaB = 8, RULE_corpoFunc = 9, RULE_instrucao = 10, 
		RULE_escrita = 11, RULE_leitura = 12, RULE_atribuicao = 13, RULE_comparacao1 = 14, 
		RULE_comparacao2 = 15, RULE_comparacao3 = 16, RULE_repeticao = 17, RULE_retornamento = 18, 
		RULE_condicaoA = 19, RULE_condicaoB = 20, RULE_operacao = 21, RULE_operando = 22, 
		RULE_operacao_cauda = 23, RULE_principal = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracoes", "algoritmo", "funcao", "funcaoChamada", "parametrosA", 
			"parametrosB", "parametrosChamadaA", "parametrosChamadaB", "corpoFunc", 
			"instrucao", "escrita", "leitura", "atribuicao", "comparacao1", "comparacao2", 
			"comparacao3", "repeticao", "retornamento", "condicaoA", "condicaoB", 
			"operacao", "operando", "operacao_cauda", "principal"
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

	@Override
	public String getGrammarFileName() { return "compiladorAcrobat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladorAcrobatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladorAcrobatParser.EOF, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			declaracoes();
			setState(51);
			algoritmo();
			setState(52);
			match(EOF);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(compiladorAcrobatParser.DEC, 0); }
		public List<TerminalNode> TYPE() { return getTokens(compiladorAcrobatParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(compiladorAcrobatParser.TYPE, i);
		}
		public List<TerminalNode> VAR() { return getTokens(compiladorAcrobatParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(compiladorAcrobatParser.VAR, i);
		}
		public List<TerminalNode> DELIM() { return getTokens(compiladorAcrobatParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(compiladorAcrobatParser.DELIM, i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(DEC);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(55);
				match(TYPE);
				setState(56);
				match(VAR);
				setState(57);
				match(DELIM);
				}
				}
				setState(62);
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

	public static class AlgoritmoContext extends ParserRuleContext {
		public TerminalNode ALG() { return getToken(compiladorAcrobatParser.ALG, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ALG);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(64);
				funcao();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			principal();
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

	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(compiladorAcrobatParser.FUNC, 0); }
		public TerminalNode TYPE() { return getToken(compiladorAcrobatParser.TYPE, 0); }
		public TerminalNode NFUNC() { return getToken(compiladorAcrobatParser.NFUNC, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public ParametrosAContext parametrosA() {
			return getRuleContext(ParametrosAContext.class,0);
		}
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public CorpoFuncContext corpoFunc() {
			return getRuleContext(CorpoFuncContext.class,0);
		}
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(FUNC);
			setState(73);
			match(TYPE);
			setState(74);
			match(NFUNC);
			setState(75);
			match(OP);
			setState(76);
			parametrosA();
			setState(77);
			match(CP);
			setState(78);
			match(OB);
			setState(79);
			corpoFunc();
			setState(80);
			match(CB);
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

	public static class FuncaoChamadaContext extends ParserRuleContext {
		public TerminalNode NFUNC() { return getToken(compiladorAcrobatParser.NFUNC, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public ParametrosChamadaAContext parametrosChamadaA() {
			return getRuleContext(ParametrosChamadaAContext.class,0);
		}
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public FuncaoChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterFuncaoChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitFuncaoChamada(this);
		}
	}

	public final FuncaoChamadaContext funcaoChamada() throws RecognitionException {
		FuncaoChamadaContext _localctx = new FuncaoChamadaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcaoChamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(NFUNC);
			setState(83);
			match(OP);
			setState(84);
			parametrosChamadaA();
			setState(85);
			match(CP);
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

	public static class ParametrosAContext extends ParserRuleContext {
		public ParametrosBContext parametrosB() {
			return getRuleContext(ParametrosBContext.class,0);
		}
		public ParametrosAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterParametrosA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitParametrosA(this);
		}
	}

	public final ParametrosAContext parametrosA() throws RecognitionException {
		ParametrosAContext _localctx = new ParametrosAContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametrosA);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(87);
				parametrosB();
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

	public static class ParametrosBContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(compiladorAcrobatParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public TerminalNode COMMA() { return getToken(compiladorAcrobatParser.COMMA, 0); }
		public ParametrosBContext parametrosB() {
			return getRuleContext(ParametrosBContext.class,0);
		}
		public ParametrosBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterParametrosB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitParametrosB(this);
		}
	}

	public final ParametrosBContext parametrosB() throws RecognitionException {
		ParametrosBContext _localctx = new ParametrosBContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametrosB);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(TYPE);
				setState(91);
				match(VAR);
				setState(92);
				match(COMMA);
				setState(93);
				parametrosB();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(TYPE);
				setState(95);
				match(VAR);
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

	public static class ParametrosChamadaAContext extends ParserRuleContext {
		public ParametrosChamadaBContext parametrosChamadaB() {
			return getRuleContext(ParametrosChamadaBContext.class,0);
		}
		public ParametrosChamadaAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosChamadaA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterParametrosChamadaA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitParametrosChamadaA(this);
		}
	}

	public final ParametrosChamadaAContext parametrosChamadaA() throws RecognitionException {
		ParametrosChamadaAContext _localctx = new ParametrosChamadaAContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametrosChamadaA);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << OP) | (1L << VAR) | (1L << NUM) | (1L << STR) | (1L << NFUNC))) != 0)) {
				{
				setState(98);
				parametrosChamadaB();
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

	public static class ParametrosChamadaBContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(compiladorAcrobatParser.COMMA, 0); }
		public ParametrosChamadaBContext parametrosChamadaB() {
			return getRuleContext(ParametrosChamadaBContext.class,0);
		}
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(compiladorAcrobatParser.NUM, 0); }
		public TerminalNode STR() { return getToken(compiladorAcrobatParser.STR, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public ParametrosChamadaBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosChamadaB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterParametrosChamadaB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitParametrosChamadaB(this);
		}
	}

	public final ParametrosChamadaBContext parametrosChamadaB() throws RecognitionException {
		ParametrosChamadaBContext _localctx = new ParametrosChamadaBContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametrosChamadaB);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(101);
					match(VAR);
					}
					break;
				case 2:
					{
					setState(102);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(103);
					match(STR);
					}
					break;
				case 4:
					{
					setState(104);
					operacao();
					}
					break;
				}
				setState(107);
				match(COMMA);
				setState(108);
				parametrosChamadaB();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(109);
					match(VAR);
					}
					break;
				case 2:
					{
					setState(110);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(111);
					match(STR);
					}
					break;
				case 4:
					{
					setState(112);
					operacao();
					}
					break;
				}
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

	public static class CorpoFuncContext extends ParserRuleContext {
		public RetornamentoContext retornamento() {
			return getRuleContext(RetornamentoContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public CorpoFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpoFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterCorpoFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitCorpoFunc(this);
		}
	}

	public final CorpoFuncContext corpoFunc() throws RecognitionException {
		CorpoFuncContext _localctx = new CorpoFuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_corpoFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IN) | (1L << OUT) | (1L << ASGN) | (1L << LOOP))) != 0)) {
				{
				{
				setState(117);
				instrucao();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			retornamento();
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

	public static class InstrucaoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public Comparacao1Context comparacao1() {
			return getRuleContext(Comparacao1Context.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instrucao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASGN:
				{
				setState(125);
				atribuicao();
				}
				break;
			case IN:
				{
				setState(126);
				leitura();
				}
				break;
			case OUT:
				{
				setState(127);
				escrita();
				}
				break;
			case T__0:
				{
				setState(128);
				comparacao1();
				}
				break;
			case LOOP:
				{
				setState(129);
				repeticao();
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

	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(compiladorAcrobatParser.OUT, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode DELIM() { return getToken(compiladorAcrobatParser.DELIM, 0); }
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(compiladorAcrobatParser.NUM, 0); }
		public TerminalNode STR() { return getToken(compiladorAcrobatParser.STR, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public FuncaoChamadaContext funcaoChamada() {
			return getRuleContext(FuncaoChamadaContext.class,0);
		}
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitEscrita(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(OUT);
			setState(133);
			match(OP);
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(134);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(135);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(136);
				match(STR);
				}
				break;
			case 4:
				{
				setState(137);
				operacao();
				}
				break;
			case 5:
				{
				setState(138);
				funcaoChamada();
				}
				break;
			}
			setState(141);
			match(CP);
			setState(142);
			match(DELIM);
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

	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(compiladorAcrobatParser.IN, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode DELIM() { return getToken(compiladorAcrobatParser.DELIM, 0); }
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(compiladorAcrobatParser.NUM, 0); }
		public TerminalNode STR() { return getToken(compiladorAcrobatParser.STR, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitLeitura(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_leitura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IN);
			setState(145);
			match(OP);
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << NUM) | (1L << STR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
			match(CP);
			setState(148);
			match(DELIM);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ASGN() { return getToken(compiladorAcrobatParser.ASGN, 0); }
		public List<TerminalNode> VAR() { return getTokens(compiladorAcrobatParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(compiladorAcrobatParser.VAR, i);
		}
		public TerminalNode ARROW() { return getToken(compiladorAcrobatParser.ARROW, 0); }
		public TerminalNode DELIM() { return getToken(compiladorAcrobatParser.DELIM, 0); }
		public TerminalNode NUM() { return getToken(compiladorAcrobatParser.NUM, 0); }
		public TerminalNode STR() { return getToken(compiladorAcrobatParser.STR, 0); }
		public TerminalNode TRUE() { return getToken(compiladorAcrobatParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(compiladorAcrobatParser.FALSE, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public FuncaoChamadaContext funcaoChamada() {
			return getRuleContext(FuncaoChamadaContext.class,0);
		}
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ASGN);
			setState(151);
			match(VAR);
			setState(152);
			match(ARROW);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(153);
				match(OP);
				}
				break;
			}
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(156);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(157);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(158);
				match(STR);
				}
				break;
			case 4:
				{
				setState(159);
				match(TRUE);
				}
				break;
			case 5:
				{
				setState(160);
				match(FALSE);
				}
				break;
			case 6:
				{
				setState(161);
				operacao();
				}
				break;
			case 7:
				{
				setState(162);
				funcaoChamada();
				}
				break;
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CP) {
				{
				setState(165);
				match(CP);
				}
			}

			setState(168);
			match(DELIM);
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

	public static class Comparacao1Context extends ParserRuleContext {
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public CondicaoAContext condicaoA() {
			return getRuleContext(CondicaoAContext.class,0);
		}
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public Comparacao2Context comparacao2() {
			return getRuleContext(Comparacao2Context.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public RetornamentoContext retornamento() {
			return getRuleContext(RetornamentoContext.class,0);
		}
		public Comparacao1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterComparacao1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitComparacao1(this);
		}
	}

	public final Comparacao1Context comparacao1() throws RecognitionException {
		Comparacao1Context _localctx = new Comparacao1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparacao1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__0);
			setState(171);
			match(OP);
			setState(172);
			condicaoA();
			setState(173);
			match(CP);
			setState(174);
			match(OB);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IN) | (1L << OUT) | (1L << ASGN) | (1L << LOOP))) != 0)) {
				{
				{
				setState(175);
				instrucao();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RTN) {
				{
				setState(181);
				retornamento();
				}
			}

			setState(184);
			match(CB);
			setState(185);
			comparacao2();
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

	public static class Comparacao2Context extends ParserRuleContext {
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public CondicaoAContext condicaoA() {
			return getRuleContext(CondicaoAContext.class,0);
		}
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public Comparacao2Context comparacao2() {
			return getRuleContext(Comparacao2Context.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public RetornamentoContext retornamento() {
			return getRuleContext(RetornamentoContext.class,0);
		}
		public Comparacao3Context comparacao3() {
			return getRuleContext(Comparacao3Context.class,0);
		}
		public Comparacao2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterComparacao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitComparacao2(this);
		}
	}

	public final Comparacao2Context comparacao2() throws RecognitionException {
		Comparacao2Context _localctx = new Comparacao2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparacao2);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__1);
				setState(188);
				match(OP);
				setState(189);
				condicaoA();
				setState(190);
				match(CP);
				setState(191);
				match(OB);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IN) | (1L << OUT) | (1L << ASGN) | (1L << LOOP))) != 0)) {
					{
					{
					setState(192);
					instrucao();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RTN) {
					{
					setState(198);
					retornamento();
					}
				}

				setState(201);
				match(CB);
				setState(202);
				comparacao2();
				}
				break;
			case T__0:
			case T__2:
			case IN:
			case OUT:
			case CB:
			case ASGN:
			case LOOP:
			case RTN:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				comparacao3();
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

	public static class Comparacao3Context extends ParserRuleContext {
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public RetornamentoContext retornamento() {
			return getRuleContext(RetornamentoContext.class,0);
		}
		public Comparacao3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterComparacao3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitComparacao3(this);
		}
	}

	public final Comparacao3Context comparacao3() throws RecognitionException {
		Comparacao3Context _localctx = new Comparacao3Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparacao3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(207);
				match(T__2);
				setState(208);
				match(OB);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IN) | (1L << OUT) | (1L << ASGN) | (1L << LOOP))) != 0)) {
					{
					{
					setState(209);
					instrucao();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RTN) {
					{
					setState(215);
					retornamento();
					}
				}

				setState(218);
				match(CB);
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

	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(compiladorAcrobatParser.LOOP, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public CondicaoAContext condicaoA() {
			return getRuleContext(CondicaoAContext.class,0);
		}
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LOOP);
			setState(222);
			match(OP);
			setState(223);
			condicaoA();
			setState(224);
			match(CP);
			setState(225);
			match(OB);
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				instrucao();
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IN) | (1L << OUT) | (1L << ASGN) | (1L << LOOP))) != 0) );
			setState(231);
			match(CB);
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

	public static class RetornamentoContext extends ParserRuleContext {
		public TerminalNode RTN() { return getToken(compiladorAcrobatParser.RTN, 0); }
		public TerminalNode DELIM() { return getToken(compiladorAcrobatParser.DELIM, 0); }
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(compiladorAcrobatParser.NUM, 0); }
		public TerminalNode STR() { return getToken(compiladorAcrobatParser.STR, 0); }
		public TerminalNode TRUE() { return getToken(compiladorAcrobatParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(compiladorAcrobatParser.FALSE, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public RetornamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornamento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterRetornamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitRetornamento(this);
		}
	}

	public final RetornamentoContext retornamento() throws RecognitionException {
		RetornamentoContext _localctx = new RetornamentoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_retornamento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(RTN);
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(234);
				match(OP);
				}
				break;
			}
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(237);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(238);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(239);
				match(STR);
				}
				break;
			case 4:
				{
				setState(240);
				match(TRUE);
				}
				break;
			case 5:
				{
				setState(241);
				match(FALSE);
				}
				break;
			case 6:
				{
				setState(242);
				operacao();
				}
				break;
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CP) {
				{
				setState(245);
				match(CP);
				}
			}

			setState(248);
			match(DELIM);
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

	public static class CondicaoAContext extends ParserRuleContext {
		public CondicaoBContext condicaoB() {
			return getRuleContext(CondicaoBContext.class,0);
		}
		public CondicaoAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicaoA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterCondicaoA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitCondicaoA(this);
		}
	}

	public final CondicaoAContext condicaoA() throws RecognitionException {
		CondicaoAContext _localctx = new CondicaoAContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicaoA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			condicaoB();
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

	public static class CondicaoBContext extends ParserRuleContext {
		public TerminalNode OP_COMP() { return getToken(compiladorAcrobatParser.OP_COMP, 0); }
		public TerminalNode OP_LOGI() { return getToken(compiladorAcrobatParser.OP_LOGI, 0); }
		public CondicaoBContext condicaoB() {
			return getRuleContext(CondicaoBContext.class,0);
		}
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public List<TerminalNode> NUM() { return getTokens(compiladorAcrobatParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(compiladorAcrobatParser.NUM, i);
		}
		public List<TerminalNode> VAR() { return getTokens(compiladorAcrobatParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(compiladorAcrobatParser.VAR, i);
		}
		public List<TerminalNode> STR() { return getTokens(compiladorAcrobatParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(compiladorAcrobatParser.STR, i);
		}
		public List<FuncaoChamadaContext> funcaoChamada() {
			return getRuleContexts(FuncaoChamadaContext.class);
		}
		public FuncaoChamadaContext funcaoChamada(int i) {
			return getRuleContext(FuncaoChamadaContext.class,i);
		}
		public TerminalNode TRUE() { return getToken(compiladorAcrobatParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(compiladorAcrobatParser.FALSE, 0); }
		public List<TerminalNode> OP() { return getTokens(compiladorAcrobatParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(compiladorAcrobatParser.OP, i);
		}
		public List<TerminalNode> CP() { return getTokens(compiladorAcrobatParser.CP); }
		public TerminalNode CP(int i) {
			return getToken(compiladorAcrobatParser.CP, i);
		}
		public CondicaoBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicaoB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterCondicaoB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitCondicaoB(this);
		}
	}

	public final CondicaoBContext condicaoB() throws RecognitionException {
		CondicaoBContext _localctx = new CondicaoBContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condicaoB);
		int _la;
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(252);
					match(OP);
					}
					break;
				}
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(255);
					operacao();
					}
					break;
				case 2:
					{
					setState(256);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(257);
					match(VAR);
					}
					break;
				case 4:
					{
					setState(258);
					match(STR);
					}
					break;
				case 5:
					{
					setState(259);
					funcaoChamada();
					}
					break;
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CP) {
					{
					setState(262);
					match(CP);
					}
				}

				setState(265);
				match(OP_COMP);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(266);
					match(OP);
					}
					break;
				}
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(269);
					operacao();
					}
					break;
				case 2:
					{
					setState(270);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(271);
					match(VAR);
					}
					break;
				case 4:
					{
					setState(272);
					match(STR);
					}
					break;
				case 5:
					{
					setState(273);
					match(TRUE);
					}
					break;
				case 6:
					{
					setState(274);
					match(FALSE);
					}
					break;
				case 7:
					{
					setState(275);
					funcaoChamada();
					}
					break;
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CP) {
					{
					setState(278);
					match(CP);
					}
				}

				setState(281);
				match(OP_LOGI);
				setState(282);
				condicaoB();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(283);
					match(OP);
					}
					break;
				}
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(286);
					operacao();
					}
					break;
				case 2:
					{
					setState(287);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(288);
					match(VAR);
					}
					break;
				case 4:
					{
					setState(289);
					match(STR);
					}
					break;
				case 5:
					{
					setState(290);
					funcaoChamada();
					}
					break;
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CP) {
					{
					setState(293);
					match(CP);
					}
				}

				setState(296);
				match(OP_COMP);
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(297);
					match(OP);
					}
					break;
				}
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(300);
					operacao();
					}
					break;
				case 2:
					{
					setState(301);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(302);
					match(VAR);
					}
					break;
				case 4:
					{
					setState(303);
					match(STR);
					}
					break;
				case 5:
					{
					setState(304);
					match(TRUE);
					}
					break;
				case 6:
					{
					setState(305);
					match(FALSE);
					}
					break;
				case 7:
					{
					setState(306);
					funcaoChamada();
					}
					break;
				}
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(309);
					match(CP);
					}
					break;
				}
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

	public static class OperacaoContext extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public Operacao_caudaContext operacao_cauda() {
			return getRuleContext(Operacao_caudaContext.class,0);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			operando();
			setState(315);
			operacao_cauda();
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

	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(compiladorAcrobatParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public FuncaoChamadaContext funcaoChamada() {
			return getRuleContext(FuncaoChamadaContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(compiladorAcrobatParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(compiladorAcrobatParser.FALSE, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitOperando(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP) {
				{
				setState(317);
				match(OP);
				}
			}

			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(320);
				match(NUM);
				}
				break;
			case VAR:
				{
				setState(321);
				match(VAR);
				}
				break;
			case NFUNC:
				{
				setState(322);
				funcaoChamada();
				}
				break;
			case TRUE:
				{
				setState(323);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(324);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(327);
				match(CP);
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

	public static class Operacao_caudaContext extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public TerminalNode OP_ARIT() { return getToken(compiladorAcrobatParser.OP_ARIT, 0); }
		public TerminalNode OP_LOGI() { return getToken(compiladorAcrobatParser.OP_LOGI, 0); }
		public List<Operacao_caudaContext> operacao_cauda() {
			return getRuleContexts(Operacao_caudaContext.class);
		}
		public Operacao_caudaContext operacao_cauda(int i) {
			return getRuleContext(Operacao_caudaContext.class,i);
		}
		public Operacao_caudaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_cauda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterOperacao_cauda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitOperacao_cauda(this);
		}
	}

	public final Operacao_caudaContext operacao_cauda() throws RecognitionException {
		Operacao_caudaContext _localctx = new Operacao_caudaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operacao_cauda);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==OP_ARIT || _la==OP_LOGI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(331);
			operando();
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					operacao_cauda();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class PrincipalContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(compiladorAcrobatParser.MAIN, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public CorpoFuncContext corpoFunc() {
			return getRuleContext(CorpoFuncContext.class,0);
		}
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitPrincipal(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(MAIN);
			setState(339);
			match(OP);
			setState(340);
			match(CP);
			setState(341);
			match(OB);
			setState(342);
			corpoFunc();
			setState(343);
			match(CB);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u015c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\4"+
		"\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n"+
		"\b\3\t\5\tf\n\t\3\n\3\n\3\n\3\n\5\nl\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nt"+
		"\n\n\5\nv\n\n\3\13\7\13y\n\13\f\13\16\13|\13\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0085\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u009d\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a6\n\17\3\17\5\17\u00a9"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00b3\n\20\f\20\16"+
		"\20\u00b6\13\20\3\20\5\20\u00b9\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00c4\n\21\f\21\16\21\u00c7\13\21\3\21\5\21\u00ca\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00d0\n\21\3\22\3\22\3\22\7\22\u00d5\n\22\f"+
		"\22\16\22\u00d8\13\22\3\22\5\22\u00db\n\22\3\22\5\22\u00de\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\6\23\u00e6\n\23\r\23\16\23\u00e7\3\23\3\23\3\24"+
		"\3\24\5\24\u00ee\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f6\n\24\3"+
		"\24\5\24\u00f9\n\24\3\24\3\24\3\25\3\25\3\26\5\26\u0100\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0107\n\26\3\26\5\26\u010a\n\26\3\26\3\26\5\26\u010e"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0117\n\26\3\26\5\26\u011a"+
		"\n\26\3\26\3\26\3\26\5\26\u011f\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0126"+
		"\n\26\3\26\5\26\u0129\n\26\3\26\3\26\5\26\u012d\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0136\n\26\3\26\5\26\u0139\n\26\5\26\u013b\n\26"+
		"\3\27\3\27\3\27\3\30\5\30\u0141\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0148"+
		"\n\30\3\30\5\30\u014b\n\30\3\31\3\31\3\31\7\31\u0150\n\31\f\31\16\31\u0153"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2\24\26\4\2\32\32\34\34\2\u0193"+
		"\2\64\3\2\2\2\48\3\2\2\2\6A\3\2\2\2\bJ\3\2\2\2\nT\3\2\2\2\fZ\3\2\2\2\16"+
		"b\3\2\2\2\20e\3\2\2\2\22u\3\2\2\2\24z\3\2\2\2\26\u0084\3\2\2\2\30\u0086"+
		"\3\2\2\2\32\u0092\3\2\2\2\34\u0098\3\2\2\2\36\u00ac\3\2\2\2 \u00cf\3\2"+
		"\2\2\"\u00dd\3\2\2\2$\u00df\3\2\2\2&\u00eb\3\2\2\2(\u00fc\3\2\2\2*\u013a"+
		"\3\2\2\2,\u013c\3\2\2\2.\u0140\3\2\2\2\60\u014c\3\2\2\2\62\u0154\3\2\2"+
		"\2\64\65\5\4\3\2\65\66\5\6\4\2\66\67\7\2\2\3\67\3\3\2\2\28>\7\6\2\29:"+
		"\7\t\2\2:;\7\24\2\2;=\7\27\2\2<9\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?\5\3\2\2\2@>\3\2\2\2AE\7\7\2\2BD\5\b\5\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2"+
		"\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\5\62\32\2I\7\3\2\2\2JK\7 \2\2KL\7\t"+
		"\2\2LM\7!\2\2MN\7\17\2\2NO\5\f\7\2OP\7\20\2\2PQ\7\21\2\2QR\5\24\13\2R"+
		"S\7\22\2\2S\t\3\2\2\2TU\7!\2\2UV\7\17\2\2VW\5\20\t\2WX\7\20\2\2X\13\3"+
		"\2\2\2Y[\5\16\b\2ZY\3\2\2\2Z[\3\2\2\2[\r\3\2\2\2\\]\7\t\2\2]^\7\24\2\2"+
		"^_\7\30\2\2_c\5\16\b\2`a\7\t\2\2ac\7\24\2\2b\\\3\2\2\2b`\3\2\2\2c\17\3"+
		"\2\2\2df\5\22\n\2ed\3\2\2\2ef\3\2\2\2f\21\3\2\2\2gl\7\24\2\2hl\7\25\2"+
		"\2il\7\26\2\2jl\5,\27\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2lm\3\2"+
		"\2\2mn\7\30\2\2nv\5\22\n\2ot\7\24\2\2pt\7\25\2\2qt\7\26\2\2rt\5,\27\2"+
		"so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2tv\3\2\2\2uk\3\2\2\2us\3\2\2\2"+
		"v\23\3\2\2\2wy\5\26\f\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2"+
		"\2\2|z\3\2\2\2}~\5&\24\2~\25\3\2\2\2\177\u0085\5\34\17\2\u0080\u0085\5"+
		"\32\16\2\u0081\u0085\5\30\r\2\u0082\u0085\5\36\20\2\u0083\u0085\5$\23"+
		"\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085\27\3\2\2\2\u0086\u0087\7\13\2\2\u0087"+
		"\u008d\7\17\2\2\u0088\u008e\7\24\2\2\u0089\u008e\7\25\2\2\u008a\u008e"+
		"\7\26\2\2\u008b\u008e\5,\27\2\u008c\u008e\5\n\6\2\u008d\u0088\3\2\2\2"+
		"\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\20\2\2\u0090\u0091\7\27\2\2"+
		"\u0091\31\3\2\2\2\u0092\u0093\7\n\2\2\u0093\u0094\7\17\2\2\u0094\u0095"+
		"\t\2\2\2\u0095\u0096\7\20\2\2\u0096\u0097\7\27\2\2\u0097\33\3\2\2\2\u0098"+
		"\u0099\7\23\2\2\u0099\u009a\7\24\2\2\u009a\u009c\7\16\2\2\u009b\u009d"+
		"\7\17\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a5\3\2\2\2"+
		"\u009e\u00a6\7\24\2\2\u009f\u00a6\7\25\2\2\u00a0\u00a6\7\26\2\2\u00a1"+
		"\u00a6\7\f\2\2\u00a2\u00a6\7\r\2\2\u00a3\u00a6\5,\27\2\u00a4\u00a6\5\n"+
		"\6\2\u00a5\u009e\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5"+
		"\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\7\20\2\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\27\2\2\u00ab\35\3\2\2"+
		"\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00af\5(\25\2\u00af"+
		"\u00b0\7\20\2\2\u00b0\u00b4\7\21\2\2\u00b1\u00b3\5\26\f\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\5&\24\2\u00b8\u00b7\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\22\2\2\u00bb"+
		"\u00bc\5 \21\2\u00bc\37\3\2\2\2\u00bd\u00be\7\4\2\2\u00be\u00bf\7\17\2"+
		"\2\u00bf\u00c0\5(\25\2\u00c0\u00c1\7\20\2\2\u00c1\u00c5\7\21\2\2\u00c2"+
		"\u00c4\5\26\f\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00ca\5&\24\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cc\7\22\2\2\u00cc\u00cd\5 \21\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00d0\5\"\22\2\u00cf\u00bd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0!\3\2\2\2"+
		"\u00d1\u00d2\7\5\2\2\u00d2\u00d6\7\21\2\2\u00d3\u00d5\5\26\f\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\5&\24\2\u00da\u00d9\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\7\22\2\2\u00dd"+
		"\u00d1\3\2\2\2\u00dd\u00de\3\2\2\2\u00de#\3\2\2\2\u00df\u00e0\7\36\2\2"+
		"\u00e0\u00e1\7\17\2\2\u00e1\u00e2\5(\25\2\u00e2\u00e3\7\20\2\2\u00e3\u00e5"+
		"\7\21\2\2\u00e4\u00e6\5\26\f\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\7\22\2\2\u00ea%\3\2\2\2\u00eb\u00ed\7\37\2\2\u00ec\u00ee\7\17\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f5\3\2\2\2\u00ef\u00f6\7\24"+
		"\2\2\u00f0\u00f6\7\25\2\2\u00f1\u00f6\7\26\2\2\u00f2\u00f6\7\f\2\2\u00f3"+
		"\u00f6\7\r\2\2\u00f4\u00f6\5,\27\2\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3\2"+
		"\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\7\20\2\2\u00f8\u00f7\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\27\2\2\u00fb"+
		"\'\3\2\2\2\u00fc\u00fd\5*\26\2\u00fd)\3\2\2\2\u00fe\u0100\7\17\2\2\u00ff"+
		"\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0106\3\2\2\2\u0101\u0107\5,"+
		"\27\2\u0102\u0107\7\25\2\2\u0103\u0107\7\24\2\2\u0104\u0107\7\26\2\2\u0105"+
		"\u0107\5\n\6\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u010a\7\20\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3"+
		"\2\2\2\u010b\u010d\7\33\2\2\u010c\u010e\7\17\2\2\u010d\u010c\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0116\3\2\2\2\u010f\u0117\5,\27\2\u0110\u0117\7\25"+
		"\2\2\u0111\u0117\7\24\2\2\u0112\u0117\7\26\2\2\u0113\u0117\7\f\2\2\u0114"+
		"\u0117\7\r\2\2\u0115\u0117\5\n\6\2\u0116\u010f\3\2\2\2\u0116\u0110\3\2"+
		"\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u011a\7\20"+
		"\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\7\34\2\2\u011c\u013b\5*\26\2\u011d\u011f\7\17\2\2\u011e\u011d\3"+
		"\2\2\2\u011e\u011f\3\2\2\2\u011f\u0125\3\2\2\2\u0120\u0126\5,\27\2\u0121"+
		"\u0126\7\25\2\2\u0122\u0126\7\24\2\2\u0123\u0126\7\26\2\2\u0124\u0126"+
		"\5\n\6\2\u0125\u0120\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129\7\20"+
		"\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\7\33\2\2\u012b\u012d\7\17\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3"+
		"\2\2\2\u012d\u0135\3\2\2\2\u012e\u0136\5,\27\2\u012f\u0136\7\25\2\2\u0130"+
		"\u0136\7\24\2\2\u0131\u0136\7\26\2\2\u0132\u0136\7\f\2\2\u0133\u0136\7"+
		"\r\2\2\u0134\u0136\5\n\6\2\u0135\u012e\3\2\2\2\u0135\u012f\3\2\2\2\u0135"+
		"\u0130\3\2\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0134\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\7\20\2\2\u0138"+
		"\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u00ff\3\2"+
		"\2\2\u013a\u011e\3\2\2\2\u013b+\3\2\2\2\u013c\u013d\5.\30\2\u013d\u013e"+
		"\5\60\31\2\u013e-\3\2\2\2\u013f\u0141\7\17\2\2\u0140\u013f\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0147\3\2\2\2\u0142\u0148\7\25\2\2\u0143\u0148\7"+
		"\24\2\2\u0144\u0148\5\n\6\2\u0145\u0148\7\f\2\2\u0146\u0148\7\r\2\2\u0147"+
		"\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0146\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\7\20\2\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b/\3\2\2\2\u014c\u014d\t\3\2\2"+
		"\u014d\u0151\5.\30\2\u014e\u0150\5\60\31\2\u014f\u014e\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\61\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0155\7\b\2\2\u0155\u0156\7\17\2\2\u0156\u0157\7"+
		"\20\2\2\u0157\u0158\7\21\2\2\u0158\u0159\5\24\13\2\u0159\u015a\7\22\2"+
		"\2\u015a\63\3\2\2\2->EZbeksuz\u0084\u008d\u009c\u00a5\u00a8\u00b4\u00b8"+
		"\u00c5\u00c9\u00cf\u00d6\u00da\u00dd\u00e7\u00ed\u00f5\u00f8\u00ff\u0106"+
		"\u0109\u010d\u0116\u0119\u011e\u0125\u0128\u012c\u0135\u0138\u013a\u0140"+
		"\u0147\u014a\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}