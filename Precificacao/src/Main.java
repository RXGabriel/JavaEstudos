public class Main {
    public static void main(String[] args) {
        Produto.custoEmbalagem=10;
        Produto novoProduto = new Produto();

//        novoProduto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(80);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preco de venda: %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preco de venda: %.2f%n", novoProduto.precoVenda);
    }
}
