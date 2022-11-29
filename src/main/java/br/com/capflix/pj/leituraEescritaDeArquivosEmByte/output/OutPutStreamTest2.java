package br.com.capflix.pj.leituraEescritaDeArquivosEmByte.output;

import java.io.*;

public class OutPutStreamTest2 {
    public static void main(String[] args) {

        //OutputStream é a classe mãe e FileOutputStream é a classe que Escreve num objeto do tipo arquivo
        //FileOutputStream destina-se a gravar fluxos de bytes brutos, como dados de imagem
        //Para escrever valores primitivos em um arquivo, usamos a classe FileOutputStream.
        try (OutputStream outputStream=new FileOutputStream("testando.txt");){

            String string="meu texto 1";
            //converter em byte
            byte[] byteEscrita=string.getBytes();
            outputStream.write(byteEscrita);


            string="\nmeu texto 2";
            byteEscrita=string.getBytes();
            outputStream.write(byteEscrita);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
