import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FusaoLocalDateETime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1981,9,13);
        LocalTime localTime = LocalTime.of(23,54,10);

//        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
//        LocalDateTime localDateTime = localDate.atTime(10,45,5);
        LocalDateTime localDateTime =localTime.atDate(localDate);

        System.out.println(localDate);
    }

}
