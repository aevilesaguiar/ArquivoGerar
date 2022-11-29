package br.com.capflix.pj.leituraEescritaDeArquivosEmByte.input;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTeste2 {
    public static void main(String[] args) {
        //leitura de dados, se o arquivo que eu incluir não existir ele dá um erro
        //Lendo do arquivo de origem
        //Classe mâe de leitura de bytes InputStream, e eu tenho a filha FileInputStream() que lê os bytes de um arquivo
        try(InputStream inputStream=new FileInputStream("testando.txt");) {
            /**available()
             * Retorna uma estimativa do número de bytes que podem ser lidos (ou ignorados) deste fluxo de entrada
             * sem bloqueio, que pode ser 0 ou 0 quando o fim do fluxo é detectado.
             * */
            byte[] bytesLeitura= new byte[inputStream.available()]; //criando um array de bytes o tamanho ele vai me dâ

            /** read()
             * Lê um certo número de bytes do fluxo de entrada e os armazena na matriz de buffer b. O número de bytes
             * realmente lidos é retornado como um inteiro. Esse método é bloqueado até que os dados de entrada estejam
             * disponíveis, o fim do arquivo seja detectado ou uma exceção seja lançada.
             * Se o comprimento de b for zero, nenhum byte será lido e 0 será retornado; caso contrário, há uma tentativa
             * de ler pelo menos um byte. Se nenhum byte estiver disponível porque o stream está no final do arquivo,
             * o valor -1 é retornado; caso contrário, pelo menos um byte é lido e armazenado em b.*/

            inputStream.read(bytesLeitura); //eu jogo o array e ele preenche

            System.out.println(new String(bytesLeitura));//leitura

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
