import java.time.LocalDateTime;

public class Main3 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime dataDaProximaParcela = today.plusDays(23);

        System.out.println(today);
        System.out.println(dataDaProximaParcela);
    }
}