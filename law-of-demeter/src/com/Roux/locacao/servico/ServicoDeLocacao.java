package com.Roux.locacao.servico;

import com.Roux.locacao.Locacao;

public class ServicoDeLocacao {
    public void confirmarLocacao(Locacao locacao){

        double totalDiariaas=locacao.calcularValorDiarias();

        locacao.reservarLocacao();
    }
}
