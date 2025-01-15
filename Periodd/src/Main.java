import java.time.Period;

public class Main {
    public static void main(String[] args) {

        Period period = Period.ofDays(45);
        Period period2 = Period.ofMonths(45);
        Period period3 = Period.of(45,2,18);
        Period period1 = Period.parse("P2Y5M10D");
        Period period4 = period1.plus(Period.ofYears(10));
        Period period5 = period.multipliedBy(2);
        Period periodoCalculado = period1.multipliedBy(3).normalized();
        String periodoFormatado = String.format("%d anos, %d meses e %d dias",
                periodoCalculado.getYears(),periodoCalculado.getDays());

        System.out.println(period);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period1);
        System.out.println(period4);
        System.out.println(period5);
        System.out.println(periodoCalculado);
        System.out.println(periodoFormatado);

    }
}