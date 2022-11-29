package br.com.capflix.pj.gerarProgramaJar;

import java.io.File;
import java.io.IOException;

public class ProgramaCriarJarDePrograma {
    public static void main(String[] args) {

        /*Configurar arquivo Jar Intellijei
        1) File -> Project Structure -> Project Settings -> Artifacts -> Clique no "+" -> Jar -> From modules with dependencies… > selecione qual é a classe Main > OK
        2) Configurado o artefato vá em Build > Build Artifact > Build*/

        //para verificar o jar , é necessário apenas ir no local de criação do jar e rodar pelo cmd
        //java -jar "java -jar "C:\JAVA\ArquivoGerar\out\artifacts\ArquivoGerar_jar2\ArquivoGerar.jar"
        File file=new File("ola.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Arquivo criado");
    }
}
