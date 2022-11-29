package br.com.capflix.pj.introducao;

import java.io.File;
import java.io.IOException;

public class CriarDiretorio {
    public static void main(String[] args) {
        //manipular arquivo
        File file = new File("dir");

        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
