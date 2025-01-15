import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main2 {
    public static void main(String[] args) {
        ZoneId fusoLosAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId fusoJapao = ZoneId.of("Japan");
        ZoneId fusoSao_Paulo = ZoneId.of("America/Sao_Paulo");

        LocalDateTime dateTimeLosAngeles = LocalDateTime.now(fusoLosAngeles);
        LocalDateTime dateTimeJapan = LocalDateTime.now(fusoJapao);
        LocalDateTime dateTimeSaoPaulo = LocalDateTime.now(fusoSao_Paulo);

        System.out.println(dateTimeLosAngeles);
        System.out.println(dateTimeJapan);
        System.out.println(dateTimeSaoPaulo);
    }
}