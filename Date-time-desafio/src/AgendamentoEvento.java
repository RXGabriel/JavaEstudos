
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter Brasil_Completo_FORMATTER = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.SHORT)
            .withLocale(new Locale("pt","BR"));

    public static void main(String[] args) {
        LocalDate localDate = requisitarDate();
        LocalTime localTime = requisitarTime();

        LocalDateTime localDateTime = localDate.atTime(localTime);

        System.out.printf("Evento agendado para %s%n",localDateTime.format(Brasil_Completo_FORMATTER));
    }

    private static LocalDate requisitarDate(){
        while (true){
            try {
                System.out.print("Data do evento: ");
                String dateText = SCANNER.nextLine();

                return LocalDate.parse(dateText,DATE_FORMATTER);
            }
            catch (DateTimeParseException e){
                System.out.println("Data inválida. Tente Novamente");
            }
        }
    }

    private static LocalTime requisitarTime(){
        while (true){
            try {
                System.out.print("Horário do Evento: ");
                String dateText = SCANNER.nextLine();

                return LocalTime.parse(dateText,TIME_FORMATTER);
            }catch (DateTimeParseException e){
                System.out.println("Horário inválido. Tente novamente");
            }
        }
    }
}