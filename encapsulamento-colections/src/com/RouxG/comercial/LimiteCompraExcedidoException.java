package com.RouxG.comercial;

public class LimiteCompraExcedidoException extends RuntimeException{
    public LimiteCompraExcedidoException(String message) {
        super(message);
    }
}
