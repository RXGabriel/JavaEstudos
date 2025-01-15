package com.RouxG.vendas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Pedido {

    private final Cliente cliente;
    private StatusPedido statusPedido = StatusPedido.RASCUNHO;
    BigDecimal valorTotal = BigDecimal.ZERO;
    private final List<ItemPedido>itens = new ArrayList<>();

    public Pedido(Cliente cliente) {
        Objects.requireNonNull(cliente);

        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public List<ItemPedido> getItens() {
        return Collections.unmodifiableList(itens);
    }


    public ItemPedido adicionarItem(String descricao,int quantidade, BigDecimal valorUnitario){
        ItemPedido itemPedido = new ItemPedido(descricao,quantidade,valorUnitario,this);
        itens.add(itemPedido);
        return itemPedido;
    }

    public void emitir(){
        checarPedidoParaModificacao();
        statusPedido = StatusPedido.EMITIDO;
    }

    public void  cancelar(){
        checarPedidoParaModificacao();
        statusPedido = StatusPedido.CANCELADO;
    }

    void checarPedidoParaModificacao(){
        if (!StatusPedido.RASCUNHO.equals(statusPedido)){
            throw new IllegalArgumentException("Pedido não pode ser modificado");
        }
    }


}
