// Generated from compiladorAcrobat.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladorAcrobatParser}.
 */
public interface compiladorAcrobatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(compiladorAcrobatParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(compiladorAcrobatParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(compiladorAcrobatParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(compiladorAcrobatParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(compiladorAcrobatParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(compiladorAcrobatParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(compiladorAcrobatParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(compiladorAcrobatParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#funcaoChamada}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoChamada(compiladorAcrobatParser.FuncaoChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#funcaoChamada}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoChamada(compiladorAcrobatParser.FuncaoChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(compiladorAcrobatParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(compiladorAcrobatParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void enterParametrosChamada(compiladorAcrobatParser.ParametrosChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void exitParametrosChamada(compiladorAcrobatParser.ParametrosChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#valorRestrito}.
	 * @param ctx the parse tree
	 */
	void enterValorRestrito(compiladorAcrobatParser.ValorRestritoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#valorRestrito}.
	 * @param ctx the parse tree
	 */
	void exitValorRestrito(compiladorAcrobatParser.ValorRestritoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(compiladorAcrobatParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(compiladorAcrobatParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#corpoFunc}.
	 * @param ctx the parse tree
	 */
	void enterCorpoFunc(compiladorAcrobatParser.CorpoFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#corpoFunc}.
	 * @param ctx the parse tree
	 */
	void exitCorpoFunc(compiladorAcrobatParser.CorpoFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(compiladorAcrobatParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(compiladorAcrobatParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(compiladorAcrobatParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(compiladorAcrobatParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(compiladorAcrobatParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(compiladorAcrobatParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(compiladorAcrobatParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(compiladorAcrobatParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#compIF}.
	 * @param ctx the parse tree
	 */
	void enterCompIF(compiladorAcrobatParser.CompIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#compIF}.
	 * @param ctx the parse tree
	 */
	void exitCompIF(compiladorAcrobatParser.CompIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#compELIF}.
	 * @param ctx the parse tree
	 */
	void enterCompELIF(compiladorAcrobatParser.CompELIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#compELIF}.
	 * @param ctx the parse tree
	 */
	void exitCompELIF(compiladorAcrobatParser.CompELIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#compELSE}.
	 * @param ctx the parse tree
	 */
	void enterCompELSE(compiladorAcrobatParser.CompELSEContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#compELSE}.
	 * @param ctx the parse tree
	 */
	void exitCompELSE(compiladorAcrobatParser.CompELSEContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(compiladorAcrobatParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(compiladorAcrobatParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(compiladorAcrobatParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(compiladorAcrobatParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(compiladorAcrobatParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(compiladorAcrobatParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(compiladorAcrobatParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(compiladorAcrobatParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(compiladorAcrobatParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(compiladorAcrobatParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_cauda(compiladorAcrobatParser.Operacao_caudaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_cauda(compiladorAcrobatParser.Operacao_caudaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(compiladorAcrobatParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(compiladorAcrobatParser.PrincipalContext ctx);
}