import java.math.BigDecimal;

public class Conta {
    private BigDecimal saldo;

    public Conta(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Transacoes efetuarPagamento(BigDecimal valor){
        BigDecimal taxa = valor.multiply(new BigDecimal("0.10"));
        saldo = saldo.subtract(taxa).subtract(valor);

        class Pagamento
    }
}
