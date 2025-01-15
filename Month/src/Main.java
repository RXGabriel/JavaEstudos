import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1981,Month.SEPTEMBER,13);

        Month month = Month.SEPTEMBER;
        Month month1 = Month.of(9);

        LocalDate dataNascimento = LocalDate.parse("1981-09-03");
        Month month2 = Month.from(dataNascimento);

        Month month3 = dataNascimento.getMonth();

        System.out.println(month2.getDisplayName(TextStyle.FULL,new Locale("pt","BR")));
        System.out.println(DateTimeFormatter.ofPattern("MM")
                .withLocale(new Locale("pt","BR"))
                .format(month));

    }
}