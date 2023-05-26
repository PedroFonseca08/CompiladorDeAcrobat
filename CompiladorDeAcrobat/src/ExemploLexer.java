import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class ExemploLexer {

    public static void main (String[] args){
        String filename = "C:\\Users\\pedro\\Área de Trabalho\\compilador\\CompiladorDeAcrobat\\CompiladorDeAcrobat\\codigoVisaoGeral.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            compiladorAcrobatLexer lexer = new compiladorAcrobatLexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: "+token.toString().replace("%", "%%"));
                System.out.printf("\t\tLexema: "+ token.getText().replace("%", "%%"));
                System.out.println("\t\tClasse: "+lexer.getVocabulary().getDisplayName(token.getType()).replace("%", "%%"));

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
