import com.github.RouxG.estoque.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);

        produto.retirarEstoque(-5);
        System.out.printf("Estoque: %d%n",produto.getQuantidadeEstoque());
    }
}