import java.io.*;

public class Main4 {
    public static void main(String[] args) {
        String[] nomes= {"João","Maria","Sebastião","José"};
        File arquivoOrigem = new File("docs/lista.txt");

        try(Writer writer = new FileWriter(arquivoOrigem) ){
            for (String nome : nomes) {
                writer.write(nome + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O",e);
        }

    }
}