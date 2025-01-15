import java.io.*;

public class Main5 {
    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/contrato.txt");

        try(BufferedReader reader = new BufferedReader(new FileReader(arquivoOrigem))) {
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/o",e);

    }
}}