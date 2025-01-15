import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.now();
        YearMonth yearMonth1 = YearMonth.of(2022, Month.SEPTEMBER);
        YearMonth yearMonth2 = YearMonth.from(LocalDate.now());
        YearMonth yearMonth3 = YearMonth.parse("2023-09");

        LocalDate dataAniversario = yearMonth.atDay(13);
        LocalDate dataUltimoDiaDoMes = yearMonth.atEndOfMonth();
    }
}