package com.github.RouxG.empresa.modelo;

public class ParceiroFinanceiro extends Empresa{
    private double valorTotalAplicado;

    public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    public double getValorTotalAplicado(){
        return valorTotalAplicado;
    }

    public void adicionarNovaAplicacao(double valorAplicado){
        valorAplicado += valorAplicado;
    }
}
