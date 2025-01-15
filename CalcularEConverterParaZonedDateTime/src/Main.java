import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        LocalDateTime dateHoraSemFuso = dataHoraFusoPadrao.toLocalDateTime();

        System.out.println(dataHoraFusoPadrao);
        System.out.println(dateHoraSemFuso);
    }
}