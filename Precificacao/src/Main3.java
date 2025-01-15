public class Main3 {
    public static void main(String[] args){
        Produto.AlterarCustoEmbalagem(10);

        Produto produto =new Produto();
        produto.alterarPrecoCusto(100);
        System.out.printf("Total de custos: %.2f%n",
                Produto.calcularCustoTotais(produto));
    }
}
