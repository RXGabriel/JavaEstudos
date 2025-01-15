import java.math.BigDecimal;

public class Main2 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(new BigDecimal("1.0"));

        contaCorrente.sacar(new BigDecimal("0.10"));
        contaCorrente.sacar(new BigDecimal("0.20"));
        contaCorrente.sacar(new BigDecimal("0.30"));
        contaCorrente.sacar(new BigDecimal("0.40"));

        System.out.println(contaCorrente.getSaldo());
    }
}