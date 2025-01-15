import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate = LocalDate.now();
        LocalDate depoisDeAmanha = localDate1.plusDays(2);

        ThaiBuddhistDate thaiBuddhistDate = ThaiBuddhistDate.now();

        System.out.println(localDate1.isEqual(localDate1));
        System.out.println(localDate1.isEqual(localDate));
        System.out.println(localDate1.isEqual(thaiBuddhistDate));
        System.out.println(depoisDeAmanha.isAfter(localDate1));
        System.out.println(depoisDeAmanha.isAfter(localDate1));
        System.out.println(depoisDeAmanha.isBefore(localDate1));


    }
}