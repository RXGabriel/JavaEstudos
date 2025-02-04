import java.io.*;

public class Main {
    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/contrato.txt");


        try(InputStream inputStream =  new FileInputStream(arquivoOrigem)) {
            int conteudo;

            while ((conteudo = inputStream.read()) != -1){
                System.out.print((char) conteudo);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arqivo não encontrado",e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O",e);
        }
    }
}