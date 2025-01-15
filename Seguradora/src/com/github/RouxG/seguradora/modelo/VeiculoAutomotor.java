package com.github.RouxG.seguradora.modelo;

public abstract class VeiculoAutomotor implements BemSeguravel{
    private String modelo;
    private double valorMercado;
    private int anoFabricaco;

    public VeiculoAutomotor(String modelo, double valorMercado, int anoFabricaco) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricaco = anoFabricaco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAnoFabricaco() {
        return anoFabricaco;
    }

    public void setAnoFabricaco(int anoFabricaco) {
        this.anoFabricaco = anoFabricaco;
    }
}
