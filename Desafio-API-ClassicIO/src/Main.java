import IO.FragmentadorDeArquivo;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            var fragmentador = new FragmentadorDeArquivo(
                    new File("arquivos/fotos/Guts.jpg"), 1024 * 50);
            fragmentador.fragmentar();
        }catch (IOException e){
            System.out.println("Erro no fragmentar do arquivo");
            e.printStackTrace();
        }
    }
}