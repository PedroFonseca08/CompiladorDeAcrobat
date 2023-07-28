import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import java.util.Scanner;

import java.awt.*;
import java.io.IOException;

public class ExemploLexer {
    private static Scanner entrada = new Scanner(System.in);


    public static void analisadorLexico(String filename){
        try{
            CharStream input = CharStreams.fromFileName(filename);
            compiladorAcrobatLexer lexer = new compiladorAcrobatLexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                if(lexer.getVocabulary().getDisplayName(token.getType()).replace("%", "%%").equals("ErrorChar")){
                    throw new RuntimeException("ERRO AO COMPILAR! Foi registrado um erro na analise lexica.");
                }else{
                    System.out.println("Token: "+token.toString().replace("%", "%%"));
                    System.out.printf("\t\tLexema: "+ token.getText().replace("%", "%%"));
                    System.out.println("\t\tClasse: "+lexer.getVocabulary().getDisplayName(token.getType()).replace("%", "%%"));
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void analisadorSintatico(String filename){
        try{
            CharStream input = CharStreams.fromFileName(filename);
            compiladorAcrobatLexer lexer = new compiladorAcrobatLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            compiladorAcrobatParser parser = new compiladorAcrobatParser(tokens);

            ParseTree ast = parser.inicio();

            System.out.println(ast.toStringTree());
        }catch(IOException e){
            e.printStackTrace();
        }
    }




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

    public static void analisadorSemantico(String filename){
        compiladorAcrobatParser parser = getParser(filename);
        ParseTree ast = parser.inicio();
        System.out.println(ast.toStringTree());
        MyListener listener = new MyListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,ast);
        if ( listener.getErro() ){
            throw new RuntimeException("ERRO AO COMPILAR! Foi registrado um erro semantico.");
        }
        else {
            System.out.println("Tabela: " + listener.getTabelaSimbolos().toString());
        }
    }


    public static void menu(){
        System.out.println("Pressione '1' para ver saida analisador lexico");
        System.out.println("Pressione '2' para ver saida analisador sintatico");
        System.out.println("Pressione '3' para ver saida analisador semantico");
        System.out.println("Pressione '0' para sair");
    }

    public static void main (String[] args){
        menu();
        int opcao = Integer.parseInt(entrada.nextLine());
        String filename = "C:\\Users\\User\\Documents\\Aulas\\PROGRAMAÇÃO\\COMPUTADOR\\COMPILADORES\\EXERCICIOS\\CompiladorDeAcrobat\\CompiladorDeAcrobat\\codigoFibo.txt";

        while(opcao != 0){
            if(opcao == 1){
                analisadorLexico(filename);
            }else if(opcao == 2){
                analisadorSintatico(filename);
            }else if(opcao == 3){
                analisadorSemantico(filename);
            }
            menu();
            opcao = Integer.parseInt(entrada.nextLine());
        }
    }
}