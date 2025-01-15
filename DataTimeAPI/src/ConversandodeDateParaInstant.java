import java.time.Instant;
import java.util.Date;

public class ConversandodeDateParaInstant {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        Date date = Date.from(instant);
        System.out.println(date);//Conversando de Date para Instant
    }
}