import java.time.LocalDate;
import java.time.Month;

public class Main2 {
    public static void main(String[] args) {
        Month monthnow = LocalDate.now().getMonth();

        Month mesCalculado = monthnow.plus(10);

        System.out.println(mesCalculado);
    }
}