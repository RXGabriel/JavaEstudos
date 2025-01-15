import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        System.out.println(dateTime.format(formatter));


        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(
                FormatStyle.FULL,FormatStyle.SHORT).withLocale(new Locale("pt","BR"));
        System.out.println(dateTime.format(formatter1));



        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyy 'ás' HH:mm:ss");
        System.out.println(dateTime.format(formatter2));


    }
}