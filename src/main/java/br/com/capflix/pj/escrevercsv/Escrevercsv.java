package br.com.capflix.pj.escrevercsv;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Escrevercsv {
    public static void main(String[] args) {
        //Escrever csv -> tabela, consigo abrir no excel
        //no csv as linhas são separadas pulando linha
        //as colunas são separadas por (;)

        try(PrintStream printStream=new PrintStream("tabela.csv");) {

            printStream.println("nome;numero");
            printStream.println("Joao da Silva,1");
            printStream.println("Ana Maria,2");
            printStream.println("Francisco Souza,3");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
