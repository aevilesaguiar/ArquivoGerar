package br.com.capflix.pj.introducao;

import java.io.File;
import java.io.IOException;

public class ProgramaListarArquivosDiretorio {
    public static void main(String[] args) {

        File file = new File("C:\\JAVA\\ArquivoGerar\\diretorio");

        //posso listar e manipular arquivos
        for (String n: file.list()
             ) {
            System.out.println(n);
        }




    }
}