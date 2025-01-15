import com.RouxG.crm.CadastroCliente;
import com.RouxG.crm.Cliente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João",30));
        cadastroCliente.adicionar(new Cliente("Maria",90));
        cadastroCliente.adicionar(new Cliente("Sebastião",50));
        cadastroCliente.adicionar(new Cliente("Joaquina",45));
        cadastroCliente.adicionar(new Cliente("Josefina",25));

        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);
//        List<Cliente> clientes = cadastroCliente.getClientes();
//        clientes.sort((cliente1,cliente2) -> Integer.compare(cliente1.getIdade(),cliente2.getIdade()));



        for (Cliente cliente : clientes){
            System.out.printf("%s - %d%n", cliente.getNome(),cliente.getIdade());
        }
    }
}