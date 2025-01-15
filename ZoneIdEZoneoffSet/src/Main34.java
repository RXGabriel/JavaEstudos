import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main34 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZoneId fusoSaoPaulo = ZoneId.of("America/SaoPaulo");
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant,fusoSaoPaulo);
        System.out.println(dateTime);
    }

}
