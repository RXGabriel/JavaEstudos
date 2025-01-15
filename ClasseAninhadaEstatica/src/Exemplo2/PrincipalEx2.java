package Exemplo2;

import java.util.ArrayList;
import java.util.List;

public class PrincipalEx2 {
    public static void main(String[] args) {
        List<ClienteEx2> clientes = new ArrayList<>();

        clientes.add(new ClienteEx2("João",14));
        clientes.add(new ClienteEx2("Maria",13));
        clientes.add(new ClienteEx2("Sebastião",15));

        ClienteEx2.ordenarPorIdade(clientes);

        System.out.println(clientes);


        ClienteEx2 clienteEx2 = new ClienteEx2("Julio",15);
        clienteEx2.setStatus(ClienteEx2.Status.BLOQUEADO);
}
}
