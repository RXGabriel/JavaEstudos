package com.RouxG.crm.app;

import com.RouxG.crm.app.negocio.ContaCorrente;
import com.RouxG.crm.app.negocio.SaldoSuficienteException;
import com.RouxG.crm.app.negocio.Titular;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[]args){
        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);

        try {
            LOGGER.debug("Manipulando conta corrente...");
            contaCorrente.depositar(new BigDecimal("200"));
            contaCorrente.sacar(new BigDecimal("50.5"));

        }catch (SaldoSuficienteException e){
            LOGGER.warn("Pedido de saque com saldo insuficiente para conta "
            + contaCorrente.getNumero() + "/" +contaCorrente.getNumero(),e);
        }catch (Exception e){
            LOGGER.error("Erro administrando conta corrente"
            + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(),e );
        }
    }
}
