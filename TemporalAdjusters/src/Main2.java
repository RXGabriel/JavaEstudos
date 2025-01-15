import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        LocalDate datenow = LocalDate.now();
        System.out.println(datenow);

        LocalDate dataNatal = datenow.withMonth(12).withDayOfMonth(25);
        System.out.println(dataNatal);


        LocalDate dataNaatal = datenow.with(new NatalTemporalAdjuster());
        System.out.println(dataNaatal);
    }
}