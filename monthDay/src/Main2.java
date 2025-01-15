import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Main2 {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(Month.FEBRUARY,29);
        Year ano = Year.of(2024);

        System.out.println(ano.isValidMonthDay(monthDay));
    }
}