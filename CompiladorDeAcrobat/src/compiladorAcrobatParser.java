// Generated from compiladorAcrobat.g4 by ANTLR 4.7.2
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
		RULE_funcaoChamada = 4, RULE_parametros = 5, RULE_parametrosChamada = 6, 
		RULE_valorRestrito = 7, RULE_valor = 8, RULE_corpoFunc = 9, RULE_instrucao = 10, 
		RULE_escrita = 11, RULE_leitura = 12, RULE_atribuicao = 13, RULE_compIF = 14, 
		RULE_compELIF = 15, RULE_compELSE = 16, RULE_repeticao = 17, RULE_retorno = 18, 
		RULE_condicao = 19, RULE_operacao = 20, RULE_operando = 21, RULE_operacao_cauda = 22, 
		RULE_principal = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracoes", "algoritmo", "funcao", "funcaoChamada", "parametros", 
			"parametrosChamada", "valorRestrito", "valor", "corpoFunc", "instrucao", 
			"escrita", "leitura", "atribuicao", "compIF", "compELIF", "compELSE", 
			"repeticao", "retorno", "condicao", "operacao", "operando", "operacao_cauda", 
			"principal"
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
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	 
		public InicioContext() { }
		public void copyFrom(InicioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NInicioContext extends InicioContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladorAcrobatParser.EOF, 0); }
		public NInicioContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			_localctx = new NInicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			declaracoes();
			setState(49);
			algoritmo();
			setState(50);
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
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	 
		public DeclaracoesContext() { }
		public void copyFrom(DeclaracoesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoDeclaracaoContext extends DeclaracoesContext {
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
		public BlocoDeclaracaoContext(DeclaracoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterBlocoDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitBlocoDeclaracao(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			_localctx = new BlocoDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(DEC);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(53);
				match(TYPE);
				setState(54);
				match(VAR);
				setState(55);
				match(DELIM);
				}
				}
				setState(60);
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
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
	 
		public AlgoritmoContext() { }
		public void copyFrom(AlgoritmoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoAlgoritmoContext extends AlgoritmoContext {
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
		public BlocoAlgoritmoContext(AlgoritmoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterBlocoAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitBlocoAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_algoritmo);
		int _la;
		try {
			_localctx = new BlocoAlgoritmoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ALG);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(62);
				funcao();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	 
		public FuncaoContext() { }
		public void copyFrom(FuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoFuncaoContext extends FuncaoContext {
		public TerminalNode FUNC() { return getToken(compiladorAcrobatParser.FUNC, 0); }
		public TerminalNode TYPE() { return getToken(compiladorAcrobatParser.TYPE, 0); }
		public TerminalNode NFUNC() { return getToken(compiladorAcrobatParser.NFUNC, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public CorpoFuncContext corpoFunc() {
			return getRuleContext(CorpoFuncContext.class,0);
		}
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public BlocoFuncaoContext(FuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterBlocoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitBlocoFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcao);
		try {
			_localctx = new BlocoFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(FUNC);
			setState(71);
			match(TYPE);
			setState(72);
			match(NFUNC);
			setState(73);
			match(OP);
			setState(74);
			parametros();
			setState(75);
			match(CP);
			setState(76);
			match(OB);
			setState(77);
			corpoFunc();
			setState(78);
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
		public FuncaoChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoChamada; }
	 
		public FuncaoChamadaContext() { }
		public void copyFrom(FuncaoChamadaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NFuncaoChamadaContext extends FuncaoChamadaContext {
		public TerminalNode NFUNC() { return getToken(compiladorAcrobatParser.NFUNC, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public ParametrosChamadaContext parametrosChamada() {
			return getRuleContext(ParametrosChamadaContext.class,0);
		}
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public NFuncaoChamadaContext(FuncaoChamadaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNFuncaoChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNFuncaoChamada(this);
		}
	}

	public final FuncaoChamadaContext funcaoChamada() throws RecognitionException {
		FuncaoChamadaContext _localctx = new FuncaoChamadaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcaoChamada);
		try {
			_localctx = new NFuncaoChamadaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NFUNC);
			setState(81);
			match(OP);
			setState(82);
			parametrosChamada();
			setState(83);
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

	public static class ParametrosContext extends ParserRuleContext {
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	 
		public ParametrosContext() { }
		public void copyFrom(ParametrosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NParametrosContext extends ParametrosContext {
		public TerminalNode TYPE() { return getToken(compiladorAcrobatParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public TerminalNode COMMA() { return getToken(compiladorAcrobatParser.COMMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public NParametrosContext(ParametrosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametros);
		int _la;
		try {
			_localctx = new NParametrosContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(85);
				match(TYPE);
				setState(86);
				match(VAR);
				setState(87);
				match(COMMA);
				setState(88);
				parametros();
				}
				break;
			case 2:
				{
				setState(89);
				match(TYPE);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(90);
					match(VAR);
					}
				}

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

	public static class ParametrosChamadaContext extends ParserRuleContext {
		public ParametrosChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosChamada; }
	 
		public ParametrosChamadaContext() { }
		public void copyFrom(ParametrosChamadaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NParametrosChamadaContext extends ParametrosChamadaContext {
		public TerminalNode COMMA() { return getToken(compiladorAcrobatParser.COMMA, 0); }
		public ParametrosChamadaContext parametrosChamada() {
			return getRuleContext(ParametrosChamadaContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public NParametrosChamadaContext(ParametrosChamadaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNParametrosChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNParametrosChamada(this);
		}
	}

	public final ParametrosChamadaContext parametrosChamada() throws RecognitionException {
		ParametrosChamadaContext _localctx = new ParametrosChamadaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametrosChamada);
		try {
			_localctx = new NParametrosChamadaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(95);
				valor();
				}
				setState(96);
				match(COMMA);
				setState(97);
				parametrosChamada();
				}
				break;
			case 2:
				{
				{
				setState(99);
				valor();
				}
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

	public static class ValorRestritoContext extends ParserRuleContext {
		public ValorRestritoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorRestrito; }
	 
		public ValorRestritoContext() { }
		public void copyFrom(ValorRestritoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NValorRestritoContext extends ValorRestritoContext {
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(compiladorAcrobatParser.NUM, 0); }
		public TerminalNode STR() { return getToken(compiladorAcrobatParser.STR, 0); }
		public TerminalNode TRUE() { return getToken(compiladorAcrobatParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(compiladorAcrobatParser.FALSE, 0); }
		public NValorRestritoContext(ValorRestritoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNValorRestrito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNValorRestrito(this);
		}
	}

	public final ValorRestritoContext valorRestrito() throws RecognitionException {
		ValorRestritoContext _localctx = new ValorRestritoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valorRestrito);
		int _la;
		try {
			_localctx = new NValorRestritoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << VAR) | (1L << NUM) | (1L << STR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ValorContext extends ParserRuleContext {
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	 
		public ValorContext() { }
		public void copyFrom(ValorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NValorContext extends ValorContext {
		public ValorRestritoContext valorRestrito() {
			return getRuleContext(ValorRestritoContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public FuncaoChamadaContext funcaoChamada() {
			return getRuleContext(FuncaoChamadaContext.class,0);
		}
		public NValorContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valor);
		try {
			_localctx = new NValorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(104);
				valorRestrito();
				}
				break;
			case 2:
				{
				setState(105);
				operacao();
				}
				break;
			case 3:
				{
				setState(106);
				funcaoChamada();
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

	public static class CorpoFuncContext extends ParserRuleContext {
		public CorpoFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpoFunc; }
	 
		public CorpoFuncContext() { }
		public void copyFrom(CorpoFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NCorpoFuncaoContext extends CorpoFuncContext {
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public NCorpoFuncaoContext(CorpoFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNCorpoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNCorpoFuncao(this);
		}
	}

	public final CorpoFuncContext corpoFunc() throws RecognitionException {
		CorpoFuncContext _localctx = new CorpoFuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_corpoFunc);
		int _la;
		try {
			_localctx = new NCorpoFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IN) | (1L << OUT) | (1L << ASGN) | (1L << LOOP))) != 0)) {
				{
				{
				setState(109);
				instrucao();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			retorno();
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
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
	 
		public InstrucaoContext() { }
		public void copyFrom(InstrucaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NInstrucaoContext extends InstrucaoContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public CompIFContext compIF() {
			return getRuleContext(CompIFContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public NInstrucaoContext(InstrucaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instrucao);
		try {
			_localctx = new NInstrucaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASGN:
				{
				setState(117);
				atribuicao();
				}
				break;
			case IN:
				{
				setState(118);
				leitura();
				}
				break;
			case OUT:
				{
				setState(119);
				escrita();
				}
				break;
			case T__0:
				{
				setState(120);
				compIF();
				}
				break;
			case LOOP:
				{
				setState(121);
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
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
	 
		public EscritaContext() { }
		public void copyFrom(EscritaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NEscritaContext extends EscritaContext {
		public TerminalNode OUT() { return getToken(compiladorAcrobatParser.OUT, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode DELIM() { return getToken(compiladorAcrobatParser.DELIM, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public NEscritaContext(EscritaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNEscrita(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_escrita);
		try {
			_localctx = new NEscritaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(OUT);
			setState(125);
			match(OP);
			{
			setState(126);
			valor();
			}
			setState(127);
			match(CP);
			setState(128);
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
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
	 
		public LeituraContext() { }
		public void copyFrom(LeituraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NLeituraContext extends LeituraContext {
		public TerminalNode IN() { return getToken(compiladorAcrobatParser.IN, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode DELIM() { return getToken(compiladorAcrobatParser.DELIM, 0); }
		public NLeituraContext(LeituraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNLeitura(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_leitura);
		try {
			_localctx = new NLeituraContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IN);
			setState(131);
			match(OP);
			setState(132);
			match(VAR);
			setState(133);
			match(CP);
			setState(134);
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
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NAtribuicaoContext extends AtribuicaoContext {
		public TerminalNode ASGN() { return getToken(compiladorAcrobatParser.ASGN, 0); }
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public TerminalNode ARROW() { return getToken(compiladorAcrobatParser.ARROW, 0); }
		public TerminalNode DELIM() { return getToken(compiladorAcrobatParser.DELIM, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public NAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atribuicao);
		int _la;
		try {
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ASGN);
			setState(137);
			match(VAR);
			setState(138);
			match(ARROW);
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(139);
				match(OP);
				}
				break;
			}
			{
			setState(142);
			valor();
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CP) {
				{
				setState(143);
				match(CP);
				}
			}

			setState(146);
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

	public static class CompIFContext extends ParserRuleContext {
		public CompIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compIF; }
	 
		public CompIFContext() { }
		public void copyFrom(CompIFContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NCompIFContext extends CompIFContext {
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public CompELIFContext compELIF() {
			return getRuleContext(CompELIFContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public NCompIFContext(CompIFContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNCompIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNCompIF(this);
		}
	}

	public final CompIFContext compIF() throws RecognitionException {
		CompIFContext _localctx = new CompIFContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compIF);
		int _la;
		try {
			_localctx = new NCompIFContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__0);
			setState(149);
			match(OP);
			setState(150);
			condicao();
			setState(151);
			match(CP);
			setState(152);
			match(OB);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IN) | (1L << OUT) | (1L << ASGN) | (1L << LOOP))) != 0)) {
				{
				{
				setState(153);
				instrucao();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RTN) {
				{
				setState(159);
				retorno();
				}
			}

			setState(162);
			match(CB);
			setState(163);
			compELIF();
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

	public static class CompELIFContext extends ParserRuleContext {
		public CompELIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compELIF; }
	 
		public CompELIFContext() { }
		public void copyFrom(CompELIFContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NCompELIFContext extends CompELIFContext {
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public CompELIFContext compELIF() {
			return getRuleContext(CompELIFContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public CompELSEContext compELSE() {
			return getRuleContext(CompELSEContext.class,0);
		}
		public NCompELIFContext(CompELIFContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNCompELIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNCompELIF(this);
		}
	}

	public final CompELIFContext compELIF() throws RecognitionException {
		CompELIFContext _localctx = new CompELIFContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compELIF);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new NCompELIFContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__1);
				setState(166);
				match(OP);
				setState(167);
				condicao();
				setState(168);
				match(CP);
				setState(169);
				match(OB);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IN) | (1L << OUT) | (1L << ASGN) | (1L << LOOP))) != 0)) {
					{
					{
					setState(170);
					instrucao();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RTN) {
					{
					setState(176);
					retorno();
					}
				}

				setState(179);
				match(CB);
				setState(180);
				compELIF();
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
				_localctx = new NCompELIFContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				compELSE();
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

	public static class CompELSEContext extends ParserRuleContext {
		public CompELSEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compELSE; }
	 
		public CompELSEContext() { }
		public void copyFrom(CompELSEContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NCompELSEContext extends CompELSEContext {
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public NCompELSEContext(CompELSEContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNCompELSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNCompELSE(this);
		}
	}

	public final CompELSEContext compELSE() throws RecognitionException {
		CompELSEContext _localctx = new CompELSEContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compELSE);
		int _la;
		try {
			_localctx = new NCompELSEContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(185);
				match(T__2);
				setState(186);
				match(OB);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IN) | (1L << OUT) | (1L << ASGN) | (1L << LOOP))) != 0)) {
					{
					{
					setState(187);
					instrucao();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RTN) {
					{
					setState(193);
					retorno();
					}
				}

				setState(196);
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
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
	 
		public RepeticaoContext() { }
		public void copyFrom(RepeticaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NRepeticaoContext extends RepeticaoContext {
		public TerminalNode LOOP() { return getToken(compiladorAcrobatParser.LOOP, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
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
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public NRepeticaoContext(RepeticaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_repeticao);
		int _la;
		try {
			_localctx = new NRepeticaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(LOOP);
			setState(200);
			match(OP);
			setState(201);
			condicao();
			setState(202);
			match(CP);
			setState(203);
			match(OB);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				instrucao();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IN) | (1L << OUT) | (1L << ASGN) | (1L << LOOP))) != 0) );
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RTN) {
				{
				setState(209);
				retorno();
				}
			}

			setState(212);
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

	public static class RetornoContext extends ParserRuleContext {
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	 
		public RetornoContext() { }
		public void copyFrom(RetornoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NRetornoContext extends RetornoContext {
		public TerminalNode RTN() { return getToken(compiladorAcrobatParser.RTN, 0); }
		public TerminalNode DELIM() { return getToken(compiladorAcrobatParser.DELIM, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public NRetornoContext(RetornoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_retorno);
		int _la;
		try {
			_localctx = new NRetornoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(RTN);
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(215);
				match(OP);
				}
				break;
			}
			{
			setState(218);
			valor();
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CP) {
				{
				setState(219);
				match(CP);
				}
			}

			setState(222);
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

	public static class CondicaoContext extends ParserRuleContext {
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	 
		public CondicaoContext() { }
		public void copyFrom(CondicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NCondicaoContext extends CondicaoContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode OP_COMP() { return getToken(compiladorAcrobatParser.OP_COMP, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode OP_LOGI() { return getToken(compiladorAcrobatParser.OP_LOGI, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public NCondicaoContext(CondicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicao);
		int _la;
		try {
			_localctx = new NCondicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(224);
				match(OP);
				}
				break;
			}
			{
			setState(227);
			valor();
			setState(228);
			match(OP_COMP);
			setState(229);
			valor();
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(230);
				match(CP);
				}
				break;
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_LOGI) {
				{
				setState(233);
				match(OP_LOGI);
				setState(234);
				condicao();
				}
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

	public static class OperacaoContext extends ParserRuleContext {
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
	 
		public OperacaoContext() { }
		public void copyFrom(OperacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOperacaoContext extends OperacaoContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public Operacao_caudaContext operacao_cauda() {
			return getRuleContext(Operacao_caudaContext.class,0);
		}
		public NOperacaoContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operacao);
		try {
			_localctx = new NOperacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			operando();
			setState(238);
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
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
	 
		public OperandoContext() { }
		public void copyFrom(OperandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOperandoContext extends OperandoContext {
		public TerminalNode NUM() { return getToken(compiladorAcrobatParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(compiladorAcrobatParser.VAR, 0); }
		public FuncaoChamadaContext funcaoChamada() {
			return getRuleContext(FuncaoChamadaContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(compiladorAcrobatParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(compiladorAcrobatParser.FALSE, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public NOperandoContext(OperandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNOperando(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operando);
		int _la;
		try {
			_localctx = new NOperandoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP) {
				{
				setState(240);
				match(OP);
				}
			}

			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(243);
				match(NUM);
				}
				break;
			case VAR:
				{
				setState(244);
				match(VAR);
				}
				break;
			case NFUNC:
				{
				setState(245);
				funcaoChamada();
				}
				break;
			case TRUE:
				{
				setState(246);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(247);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(250);
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
		public Operacao_caudaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_cauda; }
	 
		public Operacao_caudaContext() { }
		public void copyFrom(Operacao_caudaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOperacao_caudaContext extends Operacao_caudaContext {
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
		public NOperacao_caudaContext(Operacao_caudaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterNOperacao_cauda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitNOperacao_cauda(this);
		}
	}

	public final Operacao_caudaContext operacao_cauda() throws RecognitionException {
		Operacao_caudaContext _localctx = new Operacao_caudaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operacao_cauda);
		int _la;
		try {
			int _alt;
			_localctx = new NOperacao_caudaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==OP_ARIT || _la==OP_LOGI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(254);
			operando();
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					operacao_cauda();
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoPrincipalContext extends PrincipalContext {
		public TerminalNode MAIN() { return getToken(compiladorAcrobatParser.MAIN, 0); }
		public TerminalNode OP() { return getToken(compiladorAcrobatParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladorAcrobatParser.CP, 0); }
		public TerminalNode OB() { return getToken(compiladorAcrobatParser.OB, 0); }
		public CorpoFuncContext corpoFunc() {
			return getRuleContext(CorpoFuncContext.class,0);
		}
		public TerminalNode CB() { return getToken(compiladorAcrobatParser.CB, 0); }
		public BlocoPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).enterBlocoPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorAcrobatListener ) ((compiladorAcrobatListener)listener).exitBlocoPrincipal(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_principal);
		try {
			_localctx = new BlocoPrincipalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(MAIN);
			setState(262);
			match(OP);
			setState(263);
			match(CP);
			setState(264);
			match(OB);
			setState(265);
			corpoFunc();
			setState(266);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4\7\4B"+
		"\n\4\f\4\16\4E\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\5\7`\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\5\bg\n\b\3\t\3\t\3\n\3\n\3\n\5\nn\n\n\3\13\7\13q\n\13\f\13"+
		"\16\13t\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f}\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u008f\n"+
		"\17\3\17\3\17\5\17\u0093\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u009d\n\20\f\20\16\20\u00a0\13\20\3\20\5\20\u00a3\n\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ae\n\21\f\21\16\21\u00b1\13"+
		"\21\3\21\5\21\u00b4\n\21\3\21\3\21\3\21\3\21\5\21\u00ba\n\21\3\22\3\22"+
		"\3\22\7\22\u00bf\n\22\f\22\16\22\u00c2\13\22\3\22\5\22\u00c5\n\22\3\22"+
		"\5\22\u00c8\n\22\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u00d0\n\23\r\23\16"+
		"\23\u00d1\3\23\5\23\u00d5\n\23\3\23\3\23\3\24\3\24\5\24\u00db\n\24\3\24"+
		"\3\24\5\24\u00df\n\24\3\24\3\24\3\25\5\25\u00e4\n\25\3\25\3\25\3\25\3"+
		"\25\5\25\u00ea\n\25\3\25\3\25\5\25\u00ee\n\25\3\26\3\26\3\26\3\27\5\27"+
		"\u00f4\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u00fb\n\27\3\27\5\27\u00fe\n"+
		"\27\3\30\3\30\3\30\7\30\u0103\n\30\f\30\16\30\u0106\13\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\4\4\2\f\r\24\26\4\2\32\32\34\34\2\u011c\2\62\3\2\2\2"+
		"\4\66\3\2\2\2\6?\3\2\2\2\bH\3\2\2\2\nR\3\2\2\2\f_\3\2\2\2\16f\3\2\2\2"+
		"\20h\3\2\2\2\22m\3\2\2\2\24r\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u0084"+
		"\3\2\2\2\34\u008a\3\2\2\2\36\u0096\3\2\2\2 \u00b9\3\2\2\2\"\u00c7\3\2"+
		"\2\2$\u00c9\3\2\2\2&\u00d8\3\2\2\2(\u00e3\3\2\2\2*\u00ef\3\2\2\2,\u00f3"+
		"\3\2\2\2.\u00ff\3\2\2\2\60\u0107\3\2\2\2\62\63\5\4\3\2\63\64\5\6\4\2\64"+
		"\65\7\2\2\3\65\3\3\2\2\2\66<\7\6\2\2\678\7\t\2\289\7\24\2\29;\7\27\2\2"+
		":\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\5\3\2\2\2><\3\2\2\2?C\7\7"+
		"\2\2@B\5\b\5\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2"+
		"\2\2FG\5\60\31\2G\7\3\2\2\2HI\7 \2\2IJ\7\t\2\2JK\7!\2\2KL\7\17\2\2LM\5"+
		"\f\7\2MN\7\20\2\2NO\7\21\2\2OP\5\24\13\2PQ\7\22\2\2Q\t\3\2\2\2RS\7!\2"+
		"\2ST\7\17\2\2TU\5\16\b\2UV\7\20\2\2V\13\3\2\2\2WX\7\t\2\2XY\7\24\2\2Y"+
		"Z\7\30\2\2Z`\5\f\7\2[]\7\t\2\2\\^\7\24\2\2]\\\3\2\2\2]^\3\2\2\2^`\3\2"+
		"\2\2_W\3\2\2\2_[\3\2\2\2_`\3\2\2\2`\r\3\2\2\2ab\5\22\n\2bc\7\30\2\2cd"+
		"\5\16\b\2dg\3\2\2\2eg\5\22\n\2fa\3\2\2\2fe\3\2\2\2fg\3\2\2\2g\17\3\2\2"+
		"\2hi\t\2\2\2i\21\3\2\2\2jn\5\20\t\2kn\5*\26\2ln\5\n\6\2mj\3\2\2\2mk\3"+
		"\2\2\2ml\3\2\2\2n\23\3\2\2\2oq\5\26\f\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\5&\24\2v\25\3\2\2\2w}\5\34\17\2x}\5\32"+
		"\16\2y}\5\30\r\2z}\5\36\20\2{}\5$\23\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|"+
		"z\3\2\2\2|{\3\2\2\2}\27\3\2\2\2~\177\7\13\2\2\177\u0080\7\17\2\2\u0080"+
		"\u0081\5\22\n\2\u0081\u0082\7\20\2\2\u0082\u0083\7\27\2\2\u0083\31\3\2"+
		"\2\2\u0084\u0085\7\n\2\2\u0085\u0086\7\17\2\2\u0086\u0087\7\24\2\2\u0087"+
		"\u0088\7\20\2\2\u0088\u0089\7\27\2\2\u0089\33\3\2\2\2\u008a\u008b\7\23"+
		"\2\2\u008b\u008c\7\24\2\2\u008c\u008e\7\16\2\2\u008d\u008f\7\17\2\2\u008e"+
		"\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\5\22"+
		"\n\2\u0091\u0093\7\20\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\7\27\2\2\u0095\35\3\2\2\2\u0096\u0097\7\3\2"+
		"\2\u0097\u0098\7\17\2\2\u0098\u0099\5(\25\2\u0099\u009a\7\20\2\2\u009a"+
		"\u009e\7\21\2\2\u009b\u009d\5\26\f\2\u009c\u009b\3\2\2\2\u009d\u00a0\3"+
		"\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a3\5&\24\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6\5 \21\2\u00a6"+
		"\37\3\2\2\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\5(\25"+
		"\2\u00aa\u00ab\7\20\2\2\u00ab\u00af\7\21\2\2\u00ac\u00ae\5\26\f\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\5&\24\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\22"+
		"\2\2\u00b6\u00b7\5 \21\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba\5\"\22\2\u00b9"+
		"\u00a7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba!\3\2\2\2\u00bb\u00bc\7\5\2\2"+
		"\u00bc\u00c0\7\21\2\2\u00bd\u00bf\5\26\f\2\u00be\u00bd\3\2\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c5\5&\24\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\7\22\2\2\u00c7\u00bb\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8#\3\2\2\2\u00c9\u00ca\7\36\2\2\u00ca\u00cb\7\17\2"+
		"\2\u00cb\u00cc\5(\25\2\u00cc\u00cd\7\20\2\2\u00cd\u00cf\7\21\2\2\u00ce"+
		"\u00d0\5\26\f\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\5&\24\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\22"+
		"\2\2\u00d7%\3\2\2\2\u00d8\u00da\7\37\2\2\u00d9\u00db\7\17\2\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\5\22\n\2"+
		"\u00dd\u00df\7\20\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\7\27\2\2\u00e1\'\3\2\2\2\u00e2\u00e4\7\17\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5\22"+
		"\n\2\u00e6\u00e7\7\33\2\2\u00e7\u00e9\5\22\n\2\u00e8\u00ea\7\20\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ec\7\34"+
		"\2\2\u00ec\u00ee\5(\25\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		")\3\2\2\2\u00ef\u00f0\5,\27\2\u00f0\u00f1\5.\30\2\u00f1+\3\2\2\2\u00f2"+
		"\u00f4\7\17\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fa\3"+
		"\2\2\2\u00f5\u00fb\7\25\2\2\u00f6\u00fb\7\24\2\2\u00f7\u00fb\5\n\6\2\u00f8"+
		"\u00fb\7\f\2\2\u00f9\u00fb\7\r\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2"+
		"\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fe\7\20\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe-\3\2\2\2\u00ff\u0100\t\3\2\2\u0100\u0104\5,\27\2\u0101\u0103"+
		"\5.\30\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105/\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\b\2\2"+
		"\u0108\u0109\7\17\2\2\u0109\u010a\7\20\2\2\u010a\u010b\7\21\2\2\u010b"+
		"\u010c\5\24\13\2\u010c\u010d\7\22\2\2\u010d\61\3\2\2\2\37<C]_fmr|\u008e"+
		"\u0092\u009e\u00a2\u00af\u00b3\u00b9\u00c0\u00c4\u00c7\u00d1\u00d4\u00da"+
		"\u00de\u00e3\u00e9\u00ed\u00f3\u00fa\u00fd\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}