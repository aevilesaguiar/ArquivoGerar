package br.com.capflix.pj.leituraEescritaDeArquivosEmByte.output;

import java.io.FileOutputStream;

public class OutPutStreamTeste {
    public static void main(String[] args) {
/*
          File file= new File("teste2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/
        //Escrevendo no arquivo gfg.txt
        try(FileOutputStream fileOutputStream=new FileOutputStream("gfg.txt")) {
            String s = "Mundo mundo mundo!";
            String s1 = "Olá Olá Olá";

            //convertendo String para Byte array
            byte[] b=s.getBytes();
            fileOutputStream.write(b);
            System.out.println("Arquivo Atualizado com sucesso!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
