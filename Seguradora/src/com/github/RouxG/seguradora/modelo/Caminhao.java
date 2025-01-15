package com.github.RouxG.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor{
    private int quantidadeDeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricaco, int quantidadeDeEixos) {
        super(modelo, valorMercado, anoFabricaco);
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    public void setQuantidadeDeEixos(int quantidadeDeEixos) {
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.02;
        valorPremio += getQuantidadeDeEixos() * 50;
        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Caminhão %s ano %d, %d eixos, avaliado em R$%.2f",
                getModelo(), getAnoFabricaco(), getQuantidadeDeEixos(), getValorMercado());
    }
}
