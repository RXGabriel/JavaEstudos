import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateTime {
    public static void main(String[] args) {
//        LocalDateTime dateTime = LocalDateTime.parse("2017-10-03T21:03:19");
        LocalDateTime dateTime = LocalDateTime.parse("03/10/2026 21:03:19",
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(dateTime);
    }

}
