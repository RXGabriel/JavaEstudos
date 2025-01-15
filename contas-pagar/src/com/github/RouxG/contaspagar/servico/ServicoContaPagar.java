package com.github.RouxG.contaspagar.servico;

import com.github.RouxG.pagamento.*;

public class ServicoContaPagar {
    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento){

        metodoPagamento.pagar(documento);
    }
}
