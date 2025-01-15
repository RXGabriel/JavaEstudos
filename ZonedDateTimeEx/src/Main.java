import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime dateTimeDusoDefault = ZonedDateTime.now();
        ZonedDateTime dateTimeLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));


        System.out.println(dateTimeDusoDefault);
        System.out.println(dateTimeLosAngeles);
        System.out.println(dateTimeDusoDefault.getOffset());
        System.out.println(dateTimeDusoDefault.getZone());
    }
}