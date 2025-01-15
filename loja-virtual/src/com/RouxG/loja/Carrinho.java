package com.RouxG.loja;

import com.RouxG.loja.pagamento.CartaoCredito;
import com.RouxG.loja.pagamento.MetodoPagamento;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(ItemCarrinho itemCarrinho){
        itens.add(itemCarrinho);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        for (ItemCarrinho itemCarrinho : itens){
            valorTotal += itemCarrinho.getValor();
        }
        return  valorTotal;
    }

    public void finalizar(MetodoPagamento metodoPagamento){
        double valorTotal = calcularValorTotal();
        metodoPagamento.pagar(valorTotal);

        System.out.printf("Pedido finalizado: R$%.2f%n",valorTotal);
    }

}
