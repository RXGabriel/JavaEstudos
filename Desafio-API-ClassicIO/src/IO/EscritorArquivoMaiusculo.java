package IO;

import java.io.*;
import java.util.Objects;

public class EscritorArquivoMaiusculo {
    private final File arquivoOrigem;
    private final File arquivoDestino;

    public EscritorArquivoMaiusculo(File arquivoOrigem, File arquivoDestino) {
        Objects.requireNonNull(arquivoOrigem);
        Objects.requireNonNull(arquivoDestino);

        this.arquivoOrigem = arquivoOrigem;
        this.arquivoDestino = arquivoDestino;
    }

    public void processar() throws IOException {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivoOrigem));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoDestino))) {

                String line;

                while ((line = reader.readLine())!= null){
                    writer.write(line.toUpperCase());
                    writer.newLine();
                }
            }
    }
}
