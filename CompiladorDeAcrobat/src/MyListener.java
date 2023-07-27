
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
public class MyListener extends compiladorAcrobatBaseListener {

    private Map<String, String> tabelaSimbolos = new HashMap<>();
    private Map<String, String> tabelaSimbolosEscopo;
    private Boolean funcaoPrincipal = false;
    private Boolean erro = false;

    public Boolean getErro (){
        return erro;
    }
    @Override
    public void exitBlocoDeclaracao(compiladorAcrobatParser.BlocoDeclaracaoContext ctx) {
        for (int i=0; i < ctx.VAR().size(); i++) {
            String id = ctx.VAR().get(i).toString();
            if ( tabelaSimbolos.containsKey(id) ) {
                System.out.println("VARIAVEL " + id + " DUPLICADA");
                erro = true;
            }
            else {
                String tipo = ctx.TYPE().get(i).toString();
                tabelaSimbolos.put(id, tipo);
            }
        }
    }

    @Override
    public void exitNAtribuicao(compiladorAcrobatParser.NAtribuicaoContext ctx) {

        String id = ctx.VAR().toString();
        if ( funcaoPrincipal ) {
            if (!tabelaSimbolos.containsKey(id)) {
                System.out.println("VARIAVEL " + id + " NAO DECLARADA");
                erro = true;
            } else {
                //Pegando o tipo da variavel:
                String tipoD = tabelaSimbolos.get(id);
                //Pegando o tipo atribuído a variável:
                String tipoA = identificarTipoString(ctx.valor().getText());
                //System.out.println("TIPO DECLARADO:" + tipoD + " | TIPO ATRIBUIDO: " + tipoA);
                if (!tipoA.equals(tipoD)) {
                    System.out.println("TIPOS INCOMPATÍVEIS (" + tipoD + " <- " + tipoA + ")");
                    erro = true;
                }
            }
        } else {
            if (!tabelaSimbolosEscopo.containsKey(id)) {
                System.out.println("VARIAVEL " + id + " NAO DECLARADA");
                erro = true;
            } else {
                //Pegando o tipo da variavel:
                String tipoD = tabelaSimbolosEscopo.get(id);
                //Pegando o tipo atribuído a variável:
                String tipoA = identificarTipoString(ctx.valor().getText());
                //System.out.println("TIPO DECLARADO:" + tipoD + " | TIPO ATRIBUIDO: " + tipoA);
                if (!tipoA.equals(tipoD)) {
                    System.out.println("TIPOS INCOMPATÍVEIS (" + tipoD + " <- " + tipoA + ")");
                    erro = true;
                }
            }
        }
    }

    @Override
    public void enterNParametros(compiladorAcrobatParser.NParametrosContext ctx) {
        tabelaSimbolosEscopo = new HashMap<>();

    }

    @Override
    public void exitNParametros(compiladorAcrobatParser.NParametrosContext ctx) {

        String id = ctx.VAR().toString();
        if (tabelaSimbolosEscopo.containsKey(id)) {
            System.out.println("VARIAVEL " + id + " DUPLICADA");
            erro = true;
        } else {
            String tipo = ctx.TYPE().toString();
            tabelaSimbolosEscopo.put(id, tipo);
        }
    }

    @Override
    public void enterBlocoPrincipal(compiladorAcrobatParser.BlocoPrincipalContext ctx) {
        funcaoPrincipal = true;
    }

    @Override
    public void exitNLeitura(compiladorAcrobatParser.NLeituraContext ctx) {
        String id = ctx.valor().getText();
        if ( funcaoPrincipal ) {
            if (!tabelaSimbolos.containsKey(id)) {
                System.out.println("VARIAVEL " + id + " NAO DECLARADA");
                erro = true;
            }
        } else {
            if (!tabelaSimbolosEscopo.containsKey(id)) {
                System.out.println("VARIAVEL " + id + " NAO DECLARADA");
                erro = true;
            }
        }
    }

    @Override
    public void exitNEscrita(compiladorAcrobatParser.NEscritaContext ctx) {
        String id = ctx.valor().getText();
        String tipo = identificarTipoString(id);
        if ( tipo.equals("VAR") ){
            if ( funcaoPrincipal ) {
                if (!tabelaSimbolos.containsKey(id)) {
                    System.out.println("VARIAVEL " + id + " NAO DECLARADA");
                    erro = true;
                }
            } else {
                if (!tabelaSimbolosEscopo.containsKey(id)) {
                    System.out.println("VARIAVEL " + id + " NAO DECLARADA");
                    erro = true;
                }
            }
        }
    }

    @Override
    public void exitNCondicao(compiladorAcrobatParser.NCondicaoContext ctx) {
        String id1 = ctx.valor(0).getText();
        String id2 = ctx.valor(1).getText();
        String tipo1 = identificarTipoString(id1);
        String tipo2 = identificarTipoString(id2);

        if ( tipo1.equals("VAR") && tipo2.equals("VAR") ){
            if ( funcaoPrincipal ) {
                if (!tabelaSimbolos.containsKey(id1)) {
                    System.out.println("VARIAVEL " + id1 + " NAO DECLARADA");
                    erro = true;
                }
                if (!tabelaSimbolos.containsKey(id2)) {
                    System.out.println("VARIAVEL " + id2 + " NAO DECLARADA");
                    erro = true;
                }
                if ( !tabelaSimbolos.get(id1).equals(tabelaSimbolos.get(id2) ) ) {
                    System.out.println("TIPOS INCOMPATÍVEIS");
                    erro = true;
                }
            } else {
                if (!tabelaSimbolosEscopo.containsKey(id1)) {
                    System.out.println("VARIAVEL " + id1 + " NAO DECLARADA");
                    erro = true;
                }
                if (!tabelaSimbolosEscopo.containsKey(id2)) {
                    System.out.println("VARIAVEL " + id2 + " NAO DECLARADA");
                    erro = true;
                }
                if ( !tabelaSimbolosEscopo.get(id1).equals(tabelaSimbolosEscopo.get(id2) ) ) {
                    System.out.println("TIPOS INCOMPATÍVEIS");
                    erro = true;
                }
            }
        } else {
            if ( funcaoPrincipal ) {
                if (!tabelaSimbolos.containsKey(id1)) {
                    System.out.println("VARIAVEL " + id1 + " NAO DECLARADA");
                    erro = true;
                }
            } else {
                if (!tabelaSimbolosEscopo.containsKey(id1)) {
                    System.out.println("VARIAVEL " + id1 + " NAO DECLARADA");
                    erro = true;
                }
            }
        }
    }

    /*
    * Funções Auxiliares:
    */
    private static String identificarTipoString(String inputString) {
        // Expressões regulares para cada tipo
        String intPattern = "^[-+]?\\d+$";
        String booleanPattern = "^(?i)(true|false)$";
        String floatPattern = "^[-+]?\\d+\\.\\d+$";
        String stringPattern = "^\"([^\"\\\\]*(?:\\\\.[^\"\\\\]*)*)\"|'([^'\\\\]*(?:\\\\.[^'\\\\]*)*)'$";
        String varPattern = "^[a-z].*$";

        if (inputString.matches(intPattern)) {
            return "INT";
        } else if (inputString.matches(booleanPattern)) {
            return "BOOL";
        } else if (inputString.matches(floatPattern)) {
            return "FLOAT";
        } else if (inputString.matches(stringPattern)) {
            return "STRING";
        } else if (inputString.matches(varPattern)) {
            return "VAR";
        } else {
            return "INDETERMINADO";
        }
    }

    public Map<String, String> getTabelaSimbolos() { return tabelaSimbolos; }
}
