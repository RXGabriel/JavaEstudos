import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Year year = Year.now();
        Year year1 = Year.of(2023);
        Year anoo = Year.from(LocalDate.now());
        Year year2 = Year.parse("2022");

        System.out.println(anoo.isLeap());

        LocalDate diaDoProgramador = anoo.atDay(256);
        System.out.println(diaDoProgramador);
    }
}