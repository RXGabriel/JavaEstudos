import com.RouxG.crm.Cliente;
import com.RouxG.crm.ServicoCadastroCliente;

public class Main {
    public static void main(String[] args) {
        ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();
        Cliente cliente = servicoCadastroCliente.cadastrar("Joao",20);

        System.out.printf("Cliente cadastrado: %s%n",cliente.getNome());
    }
}