import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate semanaPassada = today.minusWeeks(1);



        System.out.println(today);
        System.out.println(semanaPassada);
    }
}