import estoque.Produto;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
        Function<String,Produto>function = Produto::new;
        Produto produto = function.apply("Arroz");
    }
}