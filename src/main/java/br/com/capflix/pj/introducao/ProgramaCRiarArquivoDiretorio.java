package br.com.capflix.pj.introducao;

import java.io.File;
import java.io.IOException;

public class ProgramaCRiarArquivoDiretorio {
    public static void main(String[] args) {
        //manipular arquivo
        //quando eu peço para ele gerar um arquivo e não passo a pasta, isso eu digo para ele gerar um arquivo onde está o programa
        //ele gera dentro do projeto, mas quando eu gerar o programa ele não vai gerar dentro do programa e sim do lado
        //então eu transforma classe num programa java
        //é importante para tranforma uma classe num programa java é necessário que eu tenha rodado compilado(rodado) o prgrama uma vez
        //e ela precisa ter um main, uma classe que não tem um main agente não consegue transformar ela num programa

        //criar diretorio
        // File fileDiretorio=new File("C:\\JAVA\\ArquivoGerar\\diretorio");
        //boolean diretorio = fileDiretorio.mkdir();
        //System.out.println(diretorio);

        //criando arquivo dentro do diretorio
        File file = new File("C:\\JAVA\\ArquivoGerar\\diretorio\\testeb.txt");


      //  File file = new File("C:\\JAVA\\ArquivoGerar\\diretorio");
        //verificar se é um diretorio
      //  System.out.println(file.isDirectory());



       // File file = new File("teste2.txt");

        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}