import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Locale.setDefault(new Locale("pt","BR"));


        double a = 4_142_298.4238;
        float b = 0.3f;
        int c = -1;
        BigDecimal d = new BigDecimal("45.362");

//        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt","BR"));
//        NumberFormat numberFormat = new DecimalFormat("¤ #,##0.00;(¤ #,##0.00)",symbols);

        NumberFormat numberFormat= NumberFormat.getCurrencyInstance(new Locale("pt","BR"));

        System.out.println(numberFormat.format(a));
        System.out.println(numberFormat.format(b));
        System.out.println(numberFormat.format(c));
        System.out.println(numberFormat.format(d));
    }
}