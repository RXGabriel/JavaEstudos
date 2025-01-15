import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do produto em Dólar: ");
        String precoProdutoDigitado = scanner.nextLine();

        System.out.print("Preço de 1 Dólar em Real: ");
        String precoDolarDigitado = scanner.nextLine();

        DecimalFormat formatUS = new DecimalFormat("#,##0.00",
                new DecimalFormatSymbols(Locale.US));
        formatUS.setParseBigDecimal(true);

        DecimalFormat formatBr = new DecimalFormat("#,##0.00",
                new DecimalFormatSymbols(new Locale("pt","BR")));
        formatBr.setParseBigDecimal(true);

        NumberFormat formatBrComMoeda = new DecimalFormat("¤ #,##0.00");
        new DecimalFormatSymbols(new Locale("pt","BR"));

        BigDecimal valorProduoEmDolar = (BigDecimal) formatUS.parse(precoProdutoDigitado);
        BigDecimal precoDolar = (BigDecimal) formatBr.parse(precoDolarDigitado);

        BigDecimal precoProdutosEmReais = valorProduoEmDolar.multiply(precoDolar);

        System.out.printf("Preço do produto em Reais: %s%n",
                formatBrComMoeda.format(precoProdutosEmReais));
    }


}