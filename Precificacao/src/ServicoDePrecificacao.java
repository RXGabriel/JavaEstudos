public class ServicoDePrecificacao {
    void definirPrecoVenda(Produto produto,double percentualMargemLucro){

        double precoVendaCalculado = MatematicaHelper.calcularAcrecimo(produto.precoCusto,percentualMargemLucro);

         precoVendaCalculado += Produto.custoEmbalagem;

         produto.precoVenda=precoVendaCalculado;
    }
}
