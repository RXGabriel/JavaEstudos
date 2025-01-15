package com.github.RouxG.pagamento;

public interface DocumentoPagavel {
    public abstract double getValorTotal();

    Beneficiario getBeneficiario();
}
