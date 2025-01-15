import com.github.RouxG.Cliente;
import com.github.RouxG.Sorteador;


public class Main {
    public static void main(String[] args) {
        String[] nomes = {"João","José","Mária"};
        String nomeSorteado = Sorteador.<String>sortear(nomes);
        System.out.println(nomeSorteado);


        Cliente[] clientes = {
                new Cliente("Supermercado Pague e Leve",700_000),
                new Cliente("Posto de Gasolina do Zé",800_000),
                new Cliente("Consultoria Java",400_000)
        };

        Cliente clientesorteado = Sorteador.<Cliente>sortear(clientes);
        System.out.println(clientesorteado.getRazaoSocial());

    }
}