import java.io.*;

public class Main6 {
    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/lista.txt");
        File arquivoDestino = new File("docs/saida.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoOrigem));
             BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoDestino))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                writer.write(linha);
                writer.newLine(); // Adiciona uma nova linha após cada linha lida
            }
            System.out.println("Dados foram copiados para o arquivo de destino com sucesso!");
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
