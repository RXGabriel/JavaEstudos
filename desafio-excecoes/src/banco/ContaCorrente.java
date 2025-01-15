package banco;

import java.util.Objects;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior de 0");
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficieneException("Saldo insuficiente para saque");
        }

        if (isInativa()) {
            throw new ContaInativaException("Não pode sacar em uma conta inativa");
        }

        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de deposito deve ser maior de 0");
        }

        if (isInativa()) {
          throw new ContaInativaException("Não pode depositar em uma conta inativa");
        }

        this.saldo += valor;
        return true;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        Objects.requireNonNull(contaDestino);

        if (contaDestino.isInativa()) {
            throw new ContaInativaException("Conta de destino está inativa");
        }

        sacar(valor);
       contaDestino.depositar(valor);

    }
}
