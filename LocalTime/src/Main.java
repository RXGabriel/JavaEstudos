
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {//Quer apenas as horas

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(23,54,10);

        System.out.println(localTime);
        System.out.println(localTime1);
    }
}