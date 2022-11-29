package br.com.capflix.pj.introducao;

import java.io.File;

public class ProgramaImprimirArquivoEAlgumasConf {
    public static void main(String[] args) {

        File file = new File("C:\\JAVA\\ArquivoGerar\\diretorio\\teste3.txt");


        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());



    }
}