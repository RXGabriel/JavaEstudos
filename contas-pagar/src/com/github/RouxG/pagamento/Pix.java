package com.github.RouxG.pagamento;

public class Pix implements  MetodoPagamento{

    @Override
    public void pagar(DocumentoPagavel documentoPagavel) {
        Beneficiario beneficiario = documentoPagavel.getBeneficiario();

        if (beneficiario.naoPossuiChavePix()){
            throw new RuntimeException("Beneficiario não possui chave Pix");
        }
        System.out.printf("DEBUG: Efetuando PIX para %s no valor de %.2f com a chave %s%n",
                beneficiario.getNome(),documentoPagavel.getValorTotal(),beneficiario.getChavePix());
    }
}
