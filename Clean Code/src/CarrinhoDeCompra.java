public class CarrinhoDeCompra {
    static final double TAXA_SERVICO_PADRAO = 0.10;

    int quantidadeItens;
    Main produto;

    void realizarCompra(String numeroCartao){
        double valorTotal = calcularValorTotal();

        boolean pagamentoAutorizado = GateWayPagamento
                .autorizarPagamento(numeroCartao,valorTotal);

        if (pagamentoAutorizado){
            imprimirRecibo(valorTotal);
        }
    }

     static void imprimirRecibo(double valorTotal) {
        System.out.println("Recibo de pagamento");
        System.out.printf("Valor total: R$%.2f%n", valorTotal);
    }

    double calcularValorTotal() {
        double subtotal= calcularSubtotal();
        double taxaServico = calcularTaxaServico(subtotal);
        double valorTotal =subtotal + taxaServico;
        return valorTotal;
    }

     static double calcularTaxaServico(double subtotal) {
        return subtotal * TAXA_SERVICO_PADRAO;
    }

     double calcularSubtotal() {
        return produto.precoUnitario * quantidadeItens;
    }
    
}


