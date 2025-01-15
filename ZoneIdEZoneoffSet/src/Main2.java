import java.time.ZoneId;
import java.time.ZoneOffset;

public class Main2 {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("-03:00");
        System.out.println(zoneId);
        System.out.println(zoneId.getClass());

        ZoneId zoneId1 = ZoneOffset.UTC;
        System.out.println(zoneId1);

        ZoneId zoneId2 = ZoneOffset.of("-03:00");
        System.out.println(zoneId2);

        ZoneId zoneId3 = ZoneOffset.ofHours(-3);
        System.out.println(zoneId3);
    }

}
