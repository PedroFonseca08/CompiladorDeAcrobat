import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class ExemploLexer {

    public static void main (String[] args){
        String filename = "C:\\Users\\User\\Documents\\Aulas\\PROGRAMAÇÃO\\COMPUTADOR\\COMPILADORES\\EXERCICIOS\\CompiladorDeAcrobat\\CompiladorDeAcrobat\\codigoERRO2.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            compiladorAcrobatLexer lexer = new compiladorAcrobatLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            compiladorAcrobatParser parser = new compiladorAcrobatParser(tokens);

            ParseTree ast = parser.inicio();

            System.out.println(ast.toStringTree());

            /*Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: "+token.toString().replace("%", "%%"));
                System.out.printf("\t\tLexema: "+ token.getText().replace("%", "%%"));
                System.out.println("\t\tClasse: "+lexer.getVocabulary().getDisplayName(token.getType()).replace("%", "%%"));

            }*/
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
