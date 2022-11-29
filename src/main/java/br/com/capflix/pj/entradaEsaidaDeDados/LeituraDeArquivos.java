package br.com.capflix.pj.entradaEsaidaDeDados;

import java.io.*;

public class LeituraDeArquivos {
    public static void main(String[] args) {

        /*
        * Quando existe um dispositivo de entrada de dados ativo, para obter dados deste
        * dispositivo é usada uma ação conhecida como read(). E para enviar um dado para um
        * dispositivo de saída é utilizado o método write().
        * s entradas e saídas de dados são manipuladas como sequência de bytes,
        * através das classes InputStream e OutputStream e as classes dependentes.*/


        //O OutputStream é usado para enviar dados do cliente ao servidor,
        try {
            InputStream is = new FileInputStream("arquivo.txt");
            int valor= is.read();
            System.out.println(valor);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
