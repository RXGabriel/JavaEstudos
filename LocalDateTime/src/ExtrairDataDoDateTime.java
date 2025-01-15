import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExtrairDataDoDateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

//        LocalDate date = localDateTime.toLocalDate();
        LocalDate date = LocalDate.from(dateTime);
//        LocalTime localTime = localDateTime.toLocalTime();
        LocalTime localTime = LocalTime.from(dateTime);

        System.out.println(date);
        System.out.println(localTime);
    }

}
