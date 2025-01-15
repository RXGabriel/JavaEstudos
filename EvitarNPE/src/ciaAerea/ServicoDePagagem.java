package ciaAerea;

import java.util.Objects;

public class ServicoDePagagem {
    private final ServicoReserva servicoReserva;

    public ServicoDePagagem(ServicoReserva servicoReserva) {
        Objects.requireNonNull(servicoReserva);

        this.servicoReserva = servicoReserva;
    }

    public void contratar(String codigoReserva,int quantidadeBagagens){
        if (quantidadeBagagens <= 0){
            throw new IllegalArgumentException("Quantidade de bagagens inválida");
        }

        servicoReserva.buscar(codigoReserva)
            .orElseThrow(() ->new ReservaNaoEncontradaException("Reservanão existe"))
                .adicionarBagagens(quantidadeBagagens);

        servicoReserva.buscar(codigoReserva)
                .orElseThrow(ReservaNaoEncontradaException::new)
                .adicionarBagagens(quantidadeBagagens);
    }
}
