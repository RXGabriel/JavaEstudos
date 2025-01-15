import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDate primeiraSegundaDoProximoMes = dateNow
                .plusMonths(1)
        .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        LocalDate ultimaSegundaDoProximoMes = dateNow
                .plusMonths(1)
                .with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY));

        LocalDate dataUltimoDoMes = dateNow.with(TemporalAdjusters.lastDayOfMonth());

        LocalDate dataUltimoDoMesDezembro = dateNow.plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());

        LocalDate dataProximaSexta = dateNow.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        LocalDate dataProximaSextaa = dateNow.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));



        System.out.println(primeiraSegundaDoProximoMes);
        System.out.println(ultimaSegundaDoProximoMes);
        System.out.println(dataUltimoDoMes);
        System.out.println(dataUltimoDoMesDezembro);
        System.out.println(dataProximaSexta);
        System.out.println(dataProximaSextaa);
    }
}