package com.github.RouxG.contaspagar.modelo;

import com.github.RouxG.pagamento.Beneficiario;
import com.github.RouxG.pagamento.DocumentoPagavel;

public class Holerite implements DocumentoPagavel {
    private Beneficiario funcionario;
    private double valorHora;
    private int quantidadedeHoras;

    public Holerite(Beneficiario funcionario, double valorHora, int quantidadedeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadedeHoras = quantidadedeHoras;
    }

    public Beneficiario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Beneficiario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadedeHoras() {
        return quantidadedeHoras;
    }

    public void setQuantidadedeHoras(int quantidadedeHoras) {
        this.quantidadedeHoras = quantidadedeHoras;
    }


    @Override
    public double getValorTotal() {
        return getValorHora() * getQuantidadedeHoras();
    }

    @Override
    public Beneficiario getBeneficiario() {
        return  getFuncionario();
    }
}
