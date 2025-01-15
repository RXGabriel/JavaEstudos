import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
//        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
//        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
//        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
//        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
//        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        DayOfWeek dayOfWeek1 = DayOfWeek.of(1);
        DayOfWeek dayOfWeek2 = DayOfWeek.from(LocalDate.now());
        DayOfWeek dayOfWeek3 = LocalDate.now().getDayOfWeek();


        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
        System.out.println(dayOfWeek3);
        System.out.println(dayOfWeek3.getDisplayName(TextStyle.FULL,new Locale("pt","BR")));
        System.out.println(dayOfWeek3.getDisplayName(TextStyle.NARROW,new Locale("pt","BR"))); //Letra
        System.out.println(DateTimeFormatter.ofPattern("E")
                .withLocale(new Locale("pt","BR"))
                .format(dayOfWeek3)
        );
    }
}