import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDAte {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.parse("2026-10-03");
        LocalDate date = LocalDate.parse("03/10/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(date);
    }

}
