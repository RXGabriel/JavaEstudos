package com.github.RouxG.seguradora.modelo;

public class ImovelResidencial implements BemSeguravel {
    private double valoMercado;
    private int areaConstruida;

    public ImovelResidencial(double valoMercado, int areaConstruida) {
        this.valoMercado = valoMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValoMercado() {
        return valoMercado;
    }

    public void setValoMercado(double valoMercado) {
        this.valoMercado = valoMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValoMercado() * 0.001;
        valorPremio += getAreaConstruida() * 0.3;

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial com %dm2 de área contruída, avaliado em R$%.2f",
                getAreaConstruida(),getValoMercado());
    }
}
