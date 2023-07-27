// Generated from compiladorAcrobat.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladorAcrobatParser}.
 */
public interface compiladorAcrobatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link compiladorAcrobatParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterNInicio(compiladorAcrobatParser.NInicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link compiladorAcrobatParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitNInicio(compiladorAcrobatParser.NInicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link compiladorAcrobatParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracao(compiladorAcrobatParser.BlocoDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracao}
	 * labeled alternative in {@link compiladorAcrobatParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracao(compiladorAcrobatParser.BlocoDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoAlgoritmo}
	 * labeled alternative in {@link compiladorAcrobatParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterBlocoAlgoritmo(compiladorAcrobatParser.BlocoAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoAlgoritmo}
	 * labeled alternative in {@link compiladorAcrobatParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitBlocoAlgoritmo(compiladorAcrobatParser.BlocoAlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoFuncao}
	 * labeled alternative in {@link compiladorAcrobatParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterBlocoFuncao(compiladorAcrobatParser.BlocoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoFuncao}
	 * labeled alternative in {@link compiladorAcrobatParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitBlocoFuncao(compiladorAcrobatParser.BlocoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NFuncaoChamada}
	 * labeled alternative in {@link compiladorAcrobatParser#funcaoChamada}.
	 * @param ctx the parse tree
	 */
	void enterNFuncaoChamada(compiladorAcrobatParser.NFuncaoChamadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NFuncaoChamada}
	 * labeled alternative in {@link compiladorAcrobatParser#funcaoChamada}.
	 * @param ctx the parse tree
	 */
	void exitNFuncaoChamada(compiladorAcrobatParser.NFuncaoChamadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NParametros}
	 * labeled alternative in {@link compiladorAcrobatParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterNParametros(compiladorAcrobatParser.NParametrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NParametros}
	 * labeled alternative in {@link compiladorAcrobatParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitNParametros(compiladorAcrobatParser.NParametrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NParametrosChamada}
	 * labeled alternative in {@link compiladorAcrobatParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void enterNParametrosChamada(compiladorAcrobatParser.NParametrosChamadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NParametrosChamada}
	 * labeled alternative in {@link compiladorAcrobatParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void exitNParametrosChamada(compiladorAcrobatParser.NParametrosChamadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NValorRestrito}
	 * labeled alternative in {@link compiladorAcrobatParser#valorRestrito}.
	 * @param ctx the parse tree
	 */
	void enterNValorRestrito(compiladorAcrobatParser.NValorRestritoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NValorRestrito}
	 * labeled alternative in {@link compiladorAcrobatParser#valorRestrito}.
	 * @param ctx the parse tree
	 */
	void exitNValorRestrito(compiladorAcrobatParser.NValorRestritoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NValor}
	 * labeled alternative in {@link compiladorAcrobatParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterNValor(compiladorAcrobatParser.NValorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NValor}
	 * labeled alternative in {@link compiladorAcrobatParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitNValor(compiladorAcrobatParser.NValorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NCorpoFuncao}
	 * labeled alternative in {@link compiladorAcrobatParser#corpoFunc}.
	 * @param ctx the parse tree
	 */
	void enterNCorpoFuncao(compiladorAcrobatParser.NCorpoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCorpoFuncao}
	 * labeled alternative in {@link compiladorAcrobatParser#corpoFunc}.
	 * @param ctx the parse tree
	 */
	void exitNCorpoFuncao(compiladorAcrobatParser.NCorpoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NInstrucao}
	 * labeled alternative in {@link compiladorAcrobatParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterNInstrucao(compiladorAcrobatParser.NInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInstrucao}
	 * labeled alternative in {@link compiladorAcrobatParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitNInstrucao(compiladorAcrobatParser.NInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEscrita}
	 * labeled alternative in {@link compiladorAcrobatParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterNEscrita(compiladorAcrobatParser.NEscritaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEscrita}
	 * labeled alternative in {@link compiladorAcrobatParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitNEscrita(compiladorAcrobatParser.NEscritaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link compiladorAcrobatParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterNLeitura(compiladorAcrobatParser.NLeituraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link compiladorAcrobatParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitNLeitura(compiladorAcrobatParser.NLeituraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link compiladorAcrobatParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(compiladorAcrobatParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link compiladorAcrobatParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(compiladorAcrobatParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NCompIF}
	 * labeled alternative in {@link compiladorAcrobatParser#compIF}.
	 * @param ctx the parse tree
	 */
	void enterNCompIF(compiladorAcrobatParser.NCompIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCompIF}
	 * labeled alternative in {@link compiladorAcrobatParser#compIF}.
	 * @param ctx the parse tree
	 */
	void exitNCompIF(compiladorAcrobatParser.NCompIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NCompELIF}
	 * labeled alternative in {@link compiladorAcrobatParser#compELIF}.
	 * @param ctx the parse tree
	 */
	void enterNCompELIF(compiladorAcrobatParser.NCompELIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCompELIF}
	 * labeled alternative in {@link compiladorAcrobatParser#compELIF}.
	 * @param ctx the parse tree
	 */
	void exitNCompELIF(compiladorAcrobatParser.NCompELIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NCompELSE}
	 * labeled alternative in {@link compiladorAcrobatParser#compELSE}.
	 * @param ctx the parse tree
	 */
	void enterNCompELSE(compiladorAcrobatParser.NCompELSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCompELSE}
	 * labeled alternative in {@link compiladorAcrobatParser#compELSE}.
	 * @param ctx the parse tree
	 */
	void exitNCompELSE(compiladorAcrobatParser.NCompELSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link compiladorAcrobatParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterNRepeticao(compiladorAcrobatParser.NRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NRepeticao}
	 * labeled alternative in {@link compiladorAcrobatParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitNRepeticao(compiladorAcrobatParser.NRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NRetorno}
	 * labeled alternative in {@link compiladorAcrobatParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterNRetorno(compiladorAcrobatParser.NRetornoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NRetorno}
	 * labeled alternative in {@link compiladorAcrobatParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitNRetorno(compiladorAcrobatParser.NRetornoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NCondicao}
	 * labeled alternative in {@link compiladorAcrobatParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterNCondicao(compiladorAcrobatParser.NCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCondicao}
	 * labeled alternative in {@link compiladorAcrobatParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitNCondicao(compiladorAcrobatParser.NCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link compiladorAcrobatParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterNOperacao(compiladorAcrobatParser.NOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link compiladorAcrobatParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitNOperacao(compiladorAcrobatParser.NOperacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOperando}
	 * labeled alternative in {@link compiladorAcrobatParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterNOperando(compiladorAcrobatParser.NOperandoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperando}
	 * labeled alternative in {@link compiladorAcrobatParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitNOperando(compiladorAcrobatParser.NOperandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOperacao_cauda}
	 * labeled alternative in {@link compiladorAcrobatParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void enterNOperacao_cauda(compiladorAcrobatParser.NOperacao_caudaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperacao_cauda}
	 * labeled alternative in {@link compiladorAcrobatParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void exitNOperacao_cauda(compiladorAcrobatParser.NOperacao_caudaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoPrincipal}
	 * labeled alternative in {@link compiladorAcrobatParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterBlocoPrincipal(compiladorAcrobatParser.BlocoPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoPrincipal}
	 * labeled alternative in {@link compiladorAcrobatParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitBlocoPrincipal(compiladorAcrobatParser.BlocoPrincipalContext ctx);
}