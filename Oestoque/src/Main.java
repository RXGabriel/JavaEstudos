import com.RouxG.estoque.Carro;
import com.RouxG.estoque.GerenciadorEstoque;
import com.RouxG.estoque.Roupa;

public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque<Roupa> estoqueRoupas = new GerenciadorEstoque<>();

        estoqueRoupas.adicionar(new Roupa("Camiseta preta",20));
        estoqueRoupas.adicionar(new Roupa("Camiseta branca",10));
        imprimirEstoque(estoqueRoupas);

        GerenciadorEstoque<Carro> estoqueCarros = new GerenciadorEstoque<>();
        estoqueCarros.adicionar(new Carro("BMW X1",4));
        estoqueCarros.adicionar(new Carro("BMW X5",8));
        imprimirEstoque(estoqueCarros);
    }

    private static void imprimirEstoque(GerenciadorEstoque<?> gerenciadorEstoque){
        System.out.println("Estoque: " + gerenciadorEstoque.getQuantidadeTotal());
    }
}