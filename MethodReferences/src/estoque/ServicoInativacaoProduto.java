package estoque;

public class ServicoInativacaoProduto {

    public static void precessar(Produto produto){
        System.out.println("Inativando " + produto.getNome());
        produto.inativar();
    }
}
