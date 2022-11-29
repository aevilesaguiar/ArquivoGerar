package br.com.capflix.pj.leituraEescritaDeArquivosEmByte.input;

import java.io.FileInputStream;

public class InputStreamTeste {
    public static void main(String[] args) {
/*
          File file= new File("teste2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/
        //Lendo do arquivo de origem
        try( FileInputStream fileInputStream=new FileInputStream("teste2.txt");) {
            int i=0;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
