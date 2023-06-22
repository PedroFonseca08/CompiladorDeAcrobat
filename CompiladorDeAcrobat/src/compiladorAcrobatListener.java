// Generated from .\compiladorAcrobat.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#parametrosA}.
	 * @param ctx the parse tree
	 */
	void enterParametrosA(compiladorAcrobatParser.ParametrosAContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#parametrosA}.
	 * @param ctx the parse tree
	 */
	void exitParametrosA(compiladorAcrobatParser.ParametrosAContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#parametrosB}.
	 * @param ctx the parse tree
	 */
	void enterParametrosB(compiladorAcrobatParser.ParametrosBContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#parametrosB}.
	 * @param ctx the parse tree
	 */
	void exitParametrosB(compiladorAcrobatParser.ParametrosBContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#parametrosChamadaA}.
	 * @param ctx the parse tree
	 */
	void enterParametrosChamadaA(compiladorAcrobatParser.ParametrosChamadaAContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#parametrosChamadaA}.
	 * @param ctx the parse tree
	 */
	void exitParametrosChamadaA(compiladorAcrobatParser.ParametrosChamadaAContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#parametrosChamadaB}.
	 * @param ctx the parse tree
	 */
	void enterParametrosChamadaB(compiladorAcrobatParser.ParametrosChamadaBContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#parametrosChamadaB}.
	 * @param ctx the parse tree
	 */
	void exitParametrosChamadaB(compiladorAcrobatParser.ParametrosChamadaBContext ctx);
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
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#comparacao1}.
	 * @param ctx the parse tree
	 */
	void enterComparacao1(compiladorAcrobatParser.Comparacao1Context ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#comparacao1}.
	 * @param ctx the parse tree
	 */
	void exitComparacao1(compiladorAcrobatParser.Comparacao1Context ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#comparacao2}.
	 * @param ctx the parse tree
	 */
	void enterComparacao2(compiladorAcrobatParser.Comparacao2Context ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#comparacao2}.
	 * @param ctx the parse tree
	 */
	void exitComparacao2(compiladorAcrobatParser.Comparacao2Context ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#comparacao3}.
	 * @param ctx the parse tree
	 */
	void enterComparacao3(compiladorAcrobatParser.Comparacao3Context ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#comparacao3}.
	 * @param ctx the parse tree
	 */
	void exitComparacao3(compiladorAcrobatParser.Comparacao3Context ctx);
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
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#retornamento}.
	 * @param ctx the parse tree
	 */
	void enterRetornamento(compiladorAcrobatParser.RetornamentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#retornamento}.
	 * @param ctx the parse tree
	 */
	void exitRetornamento(compiladorAcrobatParser.RetornamentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#condicaoA}.
	 * @param ctx the parse tree
	 */
	void enterCondicaoA(compiladorAcrobatParser.CondicaoAContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#condicaoA}.
	 * @param ctx the parse tree
	 */
	void exitCondicaoA(compiladorAcrobatParser.CondicaoAContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorAcrobatParser#condicaoB}.
	 * @param ctx the parse tree
	 */
	void enterCondicaoB(compiladorAcrobatParser.CondicaoBContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorAcrobatParser#condicaoB}.
	 * @param ctx the parse tree
	 */
	void exitCondicaoB(compiladorAcrobatParser.CondicaoBContext ctx);
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