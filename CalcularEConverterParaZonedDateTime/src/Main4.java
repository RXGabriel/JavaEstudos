import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main4 {
    public static void main(String[] args) {

        Duration durationVoo = Duration.parse("PT12H22M");
        ZonedDateTime dateTimeDecolagem = ZonedDateTime
                .parse("2022-11-20T20:00:00-03:00[America/Sao_Paulo]");

        ZonedDateTime dateTimePousoPrevisto = dateTimeDecolagem
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"))
                        .plus(durationVoo);


        System.out.println(dateTimeDecolagem);
        System.out.println(dateTimePousoPrevisto);
    }
}