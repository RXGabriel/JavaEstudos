import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorTotal = new BigDecimal("2.05");
        BigDecimal valorPago = new BigDecimal("1.05");

        BigDecimal valorDevido = valorTotal.subtract(valorPago);
    }
}