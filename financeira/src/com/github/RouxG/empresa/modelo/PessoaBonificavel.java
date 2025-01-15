package com.github.RouxG.empresa.modelo;

public interface PessoaBonificavel extends ClienteFinanciavel { //extends ClienteFinanciavel
    double calcularBonus(double percentualMetaAlcancada);
}
