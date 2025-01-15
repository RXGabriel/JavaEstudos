import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.now();
        OffsetDateTime dateTime2 = OffsetDateTime.now(ZoneId.of("America/LosAngeles"));
        OffsetDateTime dateTime3 = OffsetDateTime.now(ZoneOffset.ofHours(5));
        OffsetDateTime dateTime4 = OffsetDateTime.parse("2023-09-13T20:00:00-03:00");


        System.out.println(dateTime);
        System.out.println(dateTime.getOffset());
        System.out.println(dateTime2);
        System.out.println(dateTime3);
        System.out.println(dateTime4);


    }
}