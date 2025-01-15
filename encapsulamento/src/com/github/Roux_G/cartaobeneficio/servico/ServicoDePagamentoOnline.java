package com.github.Roux_G.cartaobeneficio.servico;

import com.github.Roux_G.cartaobeneficio.Cartao;
import com.github.Roux_G.cartaobeneficio.Estabelecimento;
import com.github.Roux_G.cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao,double valor){
        cartao.depositar(valor);
        return new Recibo(cartao.getTitular(),"Pagamento",valor);
    }

}
