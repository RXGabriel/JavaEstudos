package com.github.RouxG.empresa.modelo;

public class LojaVarejista extends EmpresaFinanciavel {
    public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.2;
    public static final double PERCENTUAL_VALOR_ESTOQUE_LIMITE_CREDITO = 0.5;

    private double valorTotalEStoque;

    public LojaVarejista(String razaoSocial, double totalFaturamento, double valorTotalEStoque) {
        super(razaoSocial, totalFaturamento);
        this.valorTotalEStoque = valorTotalEStoque;
    }

    public double getValorTotalEStoque() {
        return valorTotalEStoque;
    }

    public void setValorTotalEStoque(double valorTotalEStoque) {
        this.valorTotalEStoque = valorTotalEStoque;
    }

    @Override
    public double calcularLimiteAprovado() {
        return (getValorTotalEStoque() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO)
                * (getValorTotalEStoque() * PERCENTUAL_VALOR_ESTOQUE_LIMITE_CREDITO);
    }
}
