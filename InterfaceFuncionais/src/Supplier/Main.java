package Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<LocalDateTime>supplier = () -> LocalDateTime.now();
        LocalDateTime dateTime = supplier.get();
        System.out.println(dateTime);
    }
}