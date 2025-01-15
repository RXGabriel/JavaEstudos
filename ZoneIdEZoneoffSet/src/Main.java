import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        System.out.println(zoneId.getClass());

        ZoneId zoneId1 = ZoneId.of("America/Los_Angeles");
        System.out.println(zoneId1);
        System.out.println(zoneId1.getClass());

        System.out.println("---");
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }
    }
}