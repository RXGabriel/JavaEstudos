package com.Roux.locacao;

public class Veiculo {
    private String place;
    private boolean disponivel;
    private  GrupoVeiculo grupo;

    public Veiculo(){}

    public  Veiculo(String place, GrupoVeiculo grupo){
        this.place= place;
        this.grupo=grupo;
    }


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public GrupoVeiculo getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoVeiculo grupo) {
        this.grupo = grupo;
    }

    public double getValorDiaria() {
        return  grupo.getValorDiaria();
    }
}
