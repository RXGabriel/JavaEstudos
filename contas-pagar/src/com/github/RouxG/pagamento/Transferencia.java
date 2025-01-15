package com.github.RouxG.pagamento;

public class Transferencia implements MetodoPagamento {

    @Override
    public void pagar(DocumentoPagavel documentoPagavel) {
        Beneficiario beneficiario = documentoPagavel.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()){
            throw new RuntimeException("Beneficiario não possui ContaBancaria");
        }
        System.out.printf("DEBUG: Efetuando transfêrencia para %s no valor de %.2f para a conta bancária %s%n",
                beneficiario.getNome(),documentoPagavel.getValorTotal(),beneficiario.getContaBancaria());
    }
}
