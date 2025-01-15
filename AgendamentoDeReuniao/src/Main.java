import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final DateTimeFormatter FORMATTER_ANO_MES =
            DateTimeFormatter.ofPattern("MMMM 'de' yyyy",new Locale("pt","BR"));
    private static final DateTimeFormatter FORMATTER_DATE_ONLY =
            DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
                    .withLocale(new Locale("pt","BR"));

    public static void main(String[] args) {
        System.out.print("Ano: ");
        Year year = Year.of(SCANNER.nextInt());

        System.out.print("Mês Inicial: ");
        Month monthInicial = Month.of(SCANNER.nextInt());

        YearMonth yearMonth = year.atMonth(monthInicial);

        System.out.printf("Gerando agenda anual de reunões desde %s...%n",
                yearMonth.format(FORMATTER_ANO_MES));

        for (int month = yearMonth.getMonthValue();month <= Month.DECEMBER.getValue(); month++) {
            LocalDate date_Reunion = yearMonth.withMonth(month).atDay(1)
                    .with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
            System.out.println(date_Reunion.format(FORMATTER_DATE_ONLY));
        }
    }
}
//Em resumo, o código percorre todos os meses do ano,
// definindo a data de reunião para o primeiro dia útil (segunda-feira) de cada mês e, em seguida, imprime essa data.