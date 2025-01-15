import ciaAerea.Reserva;
import ciaAerea.ServicoDePagagem;
import ciaAerea.ServicoReserva;
import ciaAerea.Voo;

public class Main {
    public static void main(String[] args) {
        var servicoDeReserva = new ServicoReserva();
        var servicoDeBagagem = new ServicoDePagagem(servicoDeReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        servicoDeBagagem.contratar("28A888", 2);

        servicoDeReserva.getReservas().forEach(System.out::println);
    }
}
