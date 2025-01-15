package Consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String>consumer = str -> System.out.println(str);
        consumer.accept("Olá,mundo");
    }
}