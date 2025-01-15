package com.github.RouxG.locadora;

public class Notebook {
    private String descriaco;
    private double precoPorHora;
    private double precoPorDia;

    public Notebook(String descriaco, double precoPorHora, double precoPorDia) {
        this.descriaco = descriaco;
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
    }

    public String getDescriaco() {
        return descriaco;
    }

    public void setDescriaco(String descriaco) {
        this.descriaco = descriaco;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }


}
