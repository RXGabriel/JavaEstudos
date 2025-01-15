package banco;

public class SaldoInsuficieneException extends OperacaoBancariaException{
    public SaldoInsuficieneException(String message) {
        super(message);
    }

    public SaldoInsuficieneException(String message, Throwable cause) {
        super(message, cause);
    }
}
