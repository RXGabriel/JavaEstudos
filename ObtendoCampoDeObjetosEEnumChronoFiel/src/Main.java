import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.parse("2023-10-04");
        System.out.println(ChronoField.DAY_OF_MONTH.getFrom(dataVencimento));
//        System.out.println(ChronoField.HOUR_OF_DAY.getFrom(dataVencimento));
//        System.out.println(dataVencimento.getLong(ChronoField.DAY_OF_MONTH));
        System.out.println(dataVencimento.getDayOfWeek());
    }
}