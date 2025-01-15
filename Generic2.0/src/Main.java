import com.RouxG.Cliente;
import com.RouxG.Funcionario;
import com.RouxG.Pesquisador;

public class Main {
    public static void main(String[] args) {


        Funcionario[] funcionarios= {
                new Funcionario("João",40),
                new Funcionario("José",20),
                new Funcionario("Maria",30)
        };

        Cliente[] clientes = {
                new Cliente("Supermercado Pague e Leve",2_000_000),
                new Cliente("Posto de Gasolina Boa",8_000_000),
                new Cliente("Java Consultoria",200_000),
        };

        Funcionario funcionarioEncontrado = Pesquisador.obterPorNome(funcionarios,"José");
        System.out.println(funcionarioEncontrado);

        Cliente clienteEncontrado = Pesquisador.obterPorNome(clientes,"José");
        System.out.println(clienteEncontrado);
    }
}