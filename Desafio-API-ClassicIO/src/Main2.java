import IO.UnificadorDeArquivo;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try {
            var unificador = new UnificadorDeArquivo(
                    new File("arquivos/fotos"),
                    new File("arquivos/fotos/Guts-unificado.jpg"),
                    "Guts.jpg");
            unificador.unificar();
        }catch (IOException e){
            System.out.println("Erro ao unificar os arquivos");
            e.printStackTrace();
        }
    }
}