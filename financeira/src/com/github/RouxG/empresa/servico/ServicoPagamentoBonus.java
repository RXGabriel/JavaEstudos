package com.github.RouxG.empresa.servico;

import com.github.RouxG.empresa.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {
    public void pagar(PessoaBonificavel pessoaBonificavel, double percentualMetaAlcancada){
        double valorBonus = pessoaBonificavel.calcularBonus(percentualMetaAlcancada);

        System.out.printf("DEBUG: Bônus pago no valor de %.2f",valorBonus);
    }
}
