package com.github.Roux_G.cartaobeneficio;

import com.github.Roux_G.cartaobeneficio.servico.DepositoPixService;
import com.github.Roux_G.cartaobeneficio.servico.ServicoDePagamentoOnline;

public class Main {
    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Bramil Supermercados");
        var cartao = new Cartao("João Souza Silva");

        var servicoDeposito = new DepositoPixService();
        Recibo reciboDeposito = DepositoPixService.efetuarDeposito(cartao,500);
        reciboDeposito.imprimir();

        var servicoPagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoPagamento.efetuarPagamento(supermercado,cartao,100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n",cartao.getTitular());
        System.out.printf("Saldo: R$%.2f%n",cartao.getSaldo());
    }
}