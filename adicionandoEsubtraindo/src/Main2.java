
import java.time.LocalDateTime;

public class Main2 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime semanaPassada = today.minusWeeks(1).minusHours(12);

        System.out.println(today);
        System.out.println(semanaPassada);
    }
}