package ciaAerea;

public class ReservaNaoEncontradaException extends RuntimeException{

    public ReservaNaoEncontradaException(){}

    public ReservaNaoEncontradaException(String message){
        super(message);
    }
}
