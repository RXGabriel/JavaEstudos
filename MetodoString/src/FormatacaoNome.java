public class FormatacaoNome {
    public static void main(String[] args) {
        String nome = "  Pedro da Silva da Costa de Oliveira  ";
        System.out.println(formatarNome(nome,"da","de","do"));
    }
    public static String formatarNome(String nome, String... preposicoesParaExcluir){
        String nomeFOrmaado = nome.toUpperCase().strip();

        for (String preposicao : preposicoesParaExcluir){
            nomeFOrmaado = nomeFOrmaado.replace(" " + preposicao.toUpperCase() + " "," ");
        }

        return nomeFOrmaado;
    }
}