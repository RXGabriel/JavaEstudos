import java.time.LocalTime;

public class StringToLocalTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.parse("21:02:19");
        System.out.println(localTime);
    }

}
