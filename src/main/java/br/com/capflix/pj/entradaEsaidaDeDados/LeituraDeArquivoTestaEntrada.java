package br.com.capflix.pj.entradaEsaidaDeDados;

import java.io.*;

public class LeituraDeArquivoTestaEntrada {
    public static void main(String[] args) {

        try {
            InputStream is = System.in;
            System.out.println("Digite um texto: ");

            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader br=new BufferedReader(isr);
            String digitado= br.readLine();
            while (digitado!=null){
                System.out.println("Texto Digitado ="+digitado);
                digitado= br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
