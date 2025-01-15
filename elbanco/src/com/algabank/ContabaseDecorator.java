package com.algabank;

import com.javabank.Conta;

import java.util.Objects;

public abstract class ContabaseDecorator implements Conta{

    private Conta contaOriginal;

    public ContabaseDecorator(Conta contaOriginal){
        Objects.requireNonNull(contaOriginal);
        this.contaOriginal = contaOriginal;
    }

    public Conta getContaOriginal() {
        return contaOriginal;
    }

    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
    }

    public void aplicarEmInvestimento(double valor){
        contaOriginal.aplicarEmInvestimento(valor);
    }

    @Override
    public void imprimirSaldo() {
        contaOriginal.imprimirSaldo();
    }
}
