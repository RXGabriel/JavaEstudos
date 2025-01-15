package com.github.Roux_G.cartaobeneficio.servico;

import com.github.Roux_G.cartaobeneficio.Cartao;
import com.github.Roux_G.cartaobeneficio.Recibo;

public class DepositoPixService {
    public static Recibo efetuarDeposito(Cartao cartao, double valorDeposito){
        //TODO faz cobrenca do valor no pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(),"Depósito",valorDeposito);
    }
}
