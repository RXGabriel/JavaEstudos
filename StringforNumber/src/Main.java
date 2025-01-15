import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        String text = "1,000.43";

        DecimalFormat numberFormat = new DecimalFormat("#,##0.00");
        numberFormat.setParseBigDecimal(true);

        BigDecimal value = (BigDecimal) numberFormat.parse(text);
        BigDecimal total = value.add(new BigDecimal("1000"));

        System.out.println(total);
    }
}