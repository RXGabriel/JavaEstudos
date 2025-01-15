package com.github.RouxG.impostos;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa){
        double valorImpostosCalculados = pessoa.calcularImpostos();

        System.out.printf("Impostos Devidos de %s: %.2f%n",
                pessoa.getNome(),valorImpostosCalculados);

        valorTotalImpostos += valorImpostosCalculados;
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
