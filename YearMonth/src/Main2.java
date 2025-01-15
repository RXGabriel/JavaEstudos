import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class Main2 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.parse("2023-09");
        YearMonth anoMesFuturo = yearMonth.plus(Period.parse("P2Y5M"));
        YearMonth anoMesFuturro = yearMonth.plusYears(2);

        long tempoEmMeses = yearMonth.until(YearMonth.of(2025,10),ChronoUnit.MONTHS);
        long tempoEmMeses2 = yearMonth.until(LocalDate.parse("2025-10-15"),ChronoUnit.MONTHS);
    }
}