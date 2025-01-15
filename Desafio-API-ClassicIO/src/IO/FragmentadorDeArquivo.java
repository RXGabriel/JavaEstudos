package IO;
import java.io.*;
import java.util.Objects;

public class FragmentadorDeArquivo {
    private final File arquivo;
    private final int tamanhoFragmento;

    public FragmentadorDeArquivo(File arquivo, int tamanhoFragmento) {
        Objects.requireNonNull(arquivo);

        if (tamanhoFragmento < 1){
            throw new IllegalArgumentException("Tamanho do fragmento deve ser maior que 1 byte");
        }

        this.arquivo = arquivo;
        this.tamanhoFragmento = tamanhoFragmento;
    }


    public void fragmentar() throws IOException {
        try (InputStream inputStream = new FileInputStream(arquivo)) {
            int numeroFragmentado = 1;

            byte[] conteudoFragmentado = new byte[tamanhoFragmento];
            int qantidadeBytesLidos;

            while ((qantidadeBytesLidos = lerFragmento(inputStream,conteudoFragmentado)) > 0){

                File arquivoFragmento = criarArquivoFragento(numeroFragmentado ++);
                escreverFragmento(arquivoFragmento,conteudoFragmentado,qantidadeBytesLidos);
            }
        }
    }


    private int lerFragmento(InputStream inputStream, byte[] conteudo) throws IOException{
        return inputStream.read(conteudo);
    }

    private File criarArquivoFragento(int numeroFragmentado){
        return new File(arquivo.getAbsolutePath() + "." + numeroFragmentado);
    }

    private void escreverFragmento(File arquivo, byte[] conteudo, int quantidadeBytes) throws IOException{
        try (OutputStream outputStream = new FileOutputStream(arquivo)) {
            outputStream.write(conteudo,0,quantidadeBytes);
        }
    }
}







//import java.io.*;
//
//public class FragmentadorDeArquivo {
//    private final File arquivo;
//    private final int tamanhoFragmento;
//
//    public FragmentadorDeArquivo(File arquivo, int tamanhoFragmento) {
//        Objects.requireNonNull(arquivo, "Arquivo não pode ser nulo.");
//        if (tamanhoFragmento < 1) {
//            throw new IllegalArgumentException("O tamanho do fragmento deve ser maior que 1 byte.");
//        }
//        this.arquivo = arquivo;
//        this.tamanhoFragmento = tamanhoFragmento;
//    }
//
//    public void fragmentar() {
//        try (InputStream inputStream = new FileInputStream(arquivo)) {
//            byte[] conteudoFragmentado = new byte[tamanhoFragmento];
//            int quantidadeBytesLidos;
//            int numeroFragmentado = 1;
//
//            while ((quantidadeBytesLidos = inputStream.read(conteudoFragmentado)) != -1) {
//                File arquivoFragmento = criarArquivoFragmento(numeroFragmentado++);
//                escreverFragmento(arquivoFragmento, conteudoFragmentado, quantidadeBytesLidos);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException("Erro ao fragmentar o arquivo.", e);
//        }
//    }
//
//    private File criarArquivoFragmento(int numeroFragmentado) {
//        String nomeArquivoFragmento = String.format("%s.%d", arquivo.getName(), numeroFragmentado);
//        return new File(arquivo.getParent(), nomeArquivoFragmento);
//    }
//
//    private void escreverFragmento(File arquivo, byte[] conteudo, int quantidadeBytes) {
//        try (OutputStream outputStream = new FileOutputStream(arquivo)) {
//            outputStream.write(conteudo, 0, quantidadeBytes);
//        } catch (IOException e) {
//            throw new RuntimeException("Erro ao escrever fragmento do arquivo.", e);
//        }
//    }
//}
