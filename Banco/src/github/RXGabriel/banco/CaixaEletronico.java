package github.RXGabriel.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

    public void transferir(Conta contaOrigem,Conta contaDestino,double valorTranferencia){
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d%d%n",
               valorTranferencia,contaOrigem.getAgencia(),contaOrigem.getNumero(),
                contaDestino.getAgencia(),contaDestino.getNumero() );

        contaOrigem.sacar(valorTranferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTranferencia);
    }

    public void imprimirDemonstratio(Conta conta){
        if (conta.possuiGaratuidadeDeImpressao()){
            System.out.println("Impressão do  demonstrativo gratuito");
        }else {
            debitarTarifaImpressaoDemonstrativo(conta);
        }
        conta.imprimirDemonstrativo();
    }

    private static void debitarTarifaImpressaoDemonstrativo(Conta conta) {
        System.out.printf("Custo da impressão: R$%.2f%n",TARIFA_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}
