import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Main2 {
    public static void main(String[] args) {
        Year year = Year.parse("2024");
        Year yearFuture = year.plus(Period.parse("P10Y"));
        Year yearFuture2 = year.plus(10, ChronoUnit.CENTURIES);
        Year year1 = year.plusYears(10);
    }

}
