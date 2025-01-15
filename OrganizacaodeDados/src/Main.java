import com.RouxG.estruturadedados.Colecao;
import com.RouxG.estruturadedados.ColecaoVaziaException;
import com.RouxG.estruturadedados.Fila;
import com.RouxG.estruturadedados.Pilha;
import com.RouxG.loja.Produto;

public class Main {
    public static void main(String[] args) {
        Colecao<Produto> produtos = new Pilha<>();
        produtos.colocar(new Produto("Arroz"));
        produtos.colocar(new Produto("Feijão"));
        produtos.colocar(new Produto("Água de Coco"));

        retirarTodas(produtos);

        Colecao<String> nomes = new Pilha<>();
        nomes.colocar("João");
        nomes.colocar("Maria");

        retirarTodas(nomes);
    }
    private static void retirarTodas(Colecao<?> objetos){
        try {
            int i =1;
            while (true){
                Object objeto = objetos.retirar();
                System.out.printf("%d. %s%n",i,objeto);
                i++;
            }
        }catch (ColecaoVaziaException e){
            System.out.println("Coleção de objetos esgotada");
        }
    }

}