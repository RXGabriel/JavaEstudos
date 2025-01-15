import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/contrato.txt");
        StringBuilder text = new StringBuilder();

        try( Reader reader = new FileReader(arquivoOrigem)) {
            char[] chars = new char[1000];
            int quantidadeChars;

            while ((quantidadeChars = reader.read(chars)) > 0){
                text.append(chars,0,quantidadeChars);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O",e);
        }

        System.out.println(text);
    }
}