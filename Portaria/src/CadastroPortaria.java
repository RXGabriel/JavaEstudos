public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante){
        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES); //this=chama o metodo de baixo.
    }



    void cadastrar(final Visitante visitante, final int tempoExpiracaoMeses) {
        final var tempoExpiracaoDias = tempoExpiracaoMeses * 30; //

        System.out.printf("Visitante %s cadastrado para %d dias%n",
                visitante.nome, tempoExpiracaoDias);
    }
}
