import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final DateFormat DATE_FORMATTER = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data da primeira parcela (dd/MM/yyyy): ");
        String dataParcelaTexto = scanner.nextLine();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = scanner.nextInt();

        Date dataParcela = DATE_FORMATTER.parse(dataParcelaTexto);

        CalculadoraParcelas calculadoraParcelas = new CalculadoraParcelas();
        List<Date> datasParcelas = calculadoraParcelas.calcular(dataParcela, quantidadeParcelas);

        imprimirParcelas(datasParcelas);
    }

    public static void imprimirParcelas(List<Date> datasParcelas) {
        for (int i = 0; i < datasParcelas.size(); i++) {
            System.out.printf("Parcela #%d - %s%n", i + 1, DATE_FORMATTER.format(datasParcelas.get(i)));
        }
    }
}
