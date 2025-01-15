public class Produto {

    static double custoEmbalagem;
    double precoCusto;
    double precoVenda;

    static double calcularCustoTotais(Produto produto) {
        return produto.precoCusto + produto.custoEmbalagem;
    }


    void alterarPrecoCusto(double precoCusto){
        this.precoCusto= precoCusto;
    }

    static void AlterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem =custoEmbalagem; //Coloca o nome da classe que e a dona da variavel
    }

    static void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem: %.2f%n",custoEmbalagem);
    }

}
