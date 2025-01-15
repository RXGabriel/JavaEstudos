import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate datenow = LocalDate.now();
        LocalDate dateLosAngeles = LocalDate.now(ZoneId.of("America/Los_Angeles"));
        LocalDate dateJapao = LocalDate.now(ZoneId.of("Japan"));

        System.out.println(datenow);
        System.out.println(dateLosAngeles);
        System.out.println(dateJapao);


    }
}