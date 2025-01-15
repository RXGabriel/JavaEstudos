package Function;

import java.time.LocalDate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, LocalDate>function = str -> LocalDate.parse(str);
        LocalDate date = function.apply("2023-09-13");
        System.out.println(date);
    }
}