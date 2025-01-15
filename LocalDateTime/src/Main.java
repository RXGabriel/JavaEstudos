import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(1981,9,13,20,55,10);

        System.out.println(localDateTime);
        System.out.println(localDateTime1);
    }
}