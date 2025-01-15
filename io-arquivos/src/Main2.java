import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/Guts1.jpg");
        File arquivoDestino = new File("docs/Guts2.jpg");


        try(InputStream inputStream =  new FileInputStream(arquivoOrigem);
        OutputStream outputStream = new FileOutputStream(arquivoDestino)) {
            byte[] conteudo = new byte[1024];
            int quantodadeBytes;

            while ((quantodadeBytes = inputStream.read(conteudo)) > 0){
                outputStream.write(conteudo,0,quantodadeBytes);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arqivo não encontrado",e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O",e);
        }       
    }
}