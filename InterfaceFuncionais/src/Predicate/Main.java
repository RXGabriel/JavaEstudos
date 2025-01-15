package Predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.startsWith("T");
        boolean comecacomT = predicate.test("Thiago");
        System.out.println(comecacomT);
    }
}