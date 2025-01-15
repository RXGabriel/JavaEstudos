package Variantes;

import java.util.function.IntPredicate;


public class Main {
    public static void main(String[] args) {
        IntPredicate predicate = num -> num > 10;
        predicate.test(10);
    }
}