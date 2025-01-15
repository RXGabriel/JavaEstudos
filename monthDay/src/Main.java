import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.now();
        MonthDay DiaAniversario = MonthDay.of(Month.SEPTEMBER,13);
        MonthDay month = MonthDay.from(LocalDate.now());
        MonthDay month1 = MonthDay.parse("--09-13");

        LocalDate dataAniversariio = monthDay.atYear(2022);
        LocalDate dataAniversariio1 = Year.now().atMonthDay(monthDay);

        System.out.println(monthDay);
    }
}