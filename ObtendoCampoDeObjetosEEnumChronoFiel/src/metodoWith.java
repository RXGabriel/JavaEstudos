import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class metodoWith {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime novaDataHora = nowDateTime.with(ChronoField.DAY_OF_MONTH,9);
        LocalDateTime novvaDataHra = nowDateTime.withDayOfMonth(9).withMonth(2);

        System.out.println(nowDateTime);
        System.out.println(novaDataHora);
        System.out.println(novvaDataHra);
    }

}
