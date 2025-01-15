import com.github.RouxG.impostos.GestorDeImpostos;
import com.github.RouxG.impostos.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        var gestorimostos = new GestorDeImpostos();

        var joao = new PessoaFisica("João da Silva",45_500);
        var maria = new PessoaFisica("Maria da Silva",180_000);

        gestorimostos.adicionar(joao);
        gestorimostos.adicionar(maria);

        System.out.printf("Total de impostos: %.2f",gestorimostos.getValorTotalImpostos());
    }
}