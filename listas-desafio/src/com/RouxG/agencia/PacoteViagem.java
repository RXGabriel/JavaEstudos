package com.RouxG.agencia;

import java.util.Objects;

public class PacoteViagem implements Comparable<PacoteViagem>{

    private String descricao;
    private double precoporpessoa;

    public PacoteViagem(String descricao, double precoporpessoa) {
        Objects.requireNonNull(descricao);

        if (precoporpessoa < 0){
            throw new IllegalArgumentException("Preço por pessoa não pode ser negativo");
        }

        this.descricao = descricao;
        this.precoporpessoa = precoporpessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoporpessoa() {
        return precoporpessoa;
    }

    public void setPrecoporpessoa(double precoporpessoa) {
        this.precoporpessoa = precoporpessoa;
    }

    @Override
    public String toString() {
        return "PacoteViagem{" +
                "descricao='" + descricao + '\'' +
                ", precoporpessoa=" + precoporpessoa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacoteViagem that = (PacoteViagem) o;

   return descricao.equals(that.descricao);
    }

    @Override
    public int hashCode() {
     return descricao.hashCode();
    }


//
//    @Override
//    public int hashCode() {
//        return descricao.hashCode();
//    }


    @Override
    public int compareTo(PacoteViagem o) {
        return getDescricao().compareTo(o.getDescricao());
    }
}
