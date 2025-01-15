package com.github.RouxG.impostos;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome){
        getNome();
    }

    public String getNome() {
        return this.nome;
    }

    public abstract double calcularImpostos();

    }

