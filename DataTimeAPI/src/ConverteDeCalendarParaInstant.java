import java.time.Instant;
import java.util.Calendar;

public class ConverteDeCalendarParaInstant {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Instant instant = calendar.toInstant();

        System.out.println(calendar.getTime());
        System.out.println(instant);
    }
}