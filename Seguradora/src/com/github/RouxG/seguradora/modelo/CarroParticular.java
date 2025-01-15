package com.github.RouxG.seguradora.modelo;

public class CarroParticular extends VeiculoAutomotor{
    public CarroParticular(String modelo, double valorMercado, int anoFabricaco) {
        super(modelo, valorMercado, anoFabricaco);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.04;

        if (getAnoFabricaco() < 2000){
            valorPremio *= 1.05;
        }
        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Carro Particular %s ano %d,avaliado em R$%.2f",
                getModelo(),getAnoFabricaco(),getValorMercado());
    }
}
