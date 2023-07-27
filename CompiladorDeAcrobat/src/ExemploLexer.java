import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;

import java.awt.*;
import java.io.IOException;

public class ExemploLexer {
    private static compiladorAcrobatParser getParser(String filename){
        compiladorAcrobatParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(filename);
            compiladorAcrobatLexer lexer = new compiladorAcrobatLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new compiladorAcrobatParser(tokens);
        }catch(IOException e){
            e.printStackTrace();
        }

        return parser;
    }
    public static void main (String[] args){
        compiladorAcrobatParser parser = getParser("C:\\Users\\Vitoncio\\Desktop\\5º Período\\Compiladores\\CompiladorDeAcrobat\\CompiladorDeAcrobat\\semanticaTestes.txt");
        ParseTree ast = parser.inicio();
        System.out.println(ast.toStringTree());
        MyListener listener = new MyListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,ast);
        if ( listener.getErro() ){
            throw new RuntimeException("ERRO AO COMPILAR!");
        }
        else {
            System.out.println("Tabela: " + listener.getTabelaSimbolos().toString());
        }

        /*
        String filename = "C:\\Users\\User\\Documents\\Aulas\\PROGRAMAÇÃO\\COMPUTADOR\\COMPILADORES\\EXERCICIOS\\CompiladorDeAcrobat\\CompiladorDeAcrobat\\codigoFibo.txt";
        try{
            //SINTATICA
            CharStream input = CharStreams.fromFileName(filename);
            compiladorAcrobatLexer lexer = new compiladorAcrobatLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            compiladorAcrobatParser parser = new compiladorAcrobatParser(tokens);

            ParseTree ast = parser.inicio();

            System.out.println(ast.toStringTree());


            // LEXICA
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
        */
    }
}