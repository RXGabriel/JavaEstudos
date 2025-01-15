import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("398.22");
        BigDecimal b = new BigDecimal("2469.44");
        BigDecimal c = new BigDecimal("4142298.42");
        BigDecimal d = new BigDecimal("8404142298.0");

//        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance();
        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(
                new Locale("pt","BR"),NumberFormat.Style.SHORT);

        System.out.println(numberFormat.format(a));
        System.out.println(numberFormat.format(b));
        System.out.println(numberFormat.format(c));
        System.out.println(numberFormat.format(d));

    }
}