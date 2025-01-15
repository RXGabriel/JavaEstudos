import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final DateTimeFormatter FORMATTER_Date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final  DateTimeFormatter FORMATTER_Time = DateTimeFormatter.ofPattern("HH:mm");
    private static final  DateTimeFormatter FORMATTER_Completo = DateTimeFormatter
            .ofPattern("dd 'de' MMMM 'de' yyyy 'ás' HH:mm (zzzz)")
            .withLocale(new Locale("pt","BR"));


    public static void main(String[] args) {

        LocalDate localDate = requisitarData("Data local da festa: ");
        LocalTime localTime = requisitarHorario("Horário local da festa: ");

        ZonedDateTime dateFestaDefault = localDate.atTime(localTime)
                .atZone(ZoneId.systemDefault());

        ZonedDateTime datefestaSaoPaulo = dateFestaDefault
                .withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));


        ZonedDateTime dateTimeLosAngeles = dateFestaDefault
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        ZonedDateTime dateTimeJapan = dateFestaDefault
                .withZoneSameInstant(ZoneId.of("Japan"));



        System.out.println(datefestaSaoPaulo.format(FORMATTER_Completo));
        System.out.println(dateTimeLosAngeles.format(FORMATTER_Completo));
        System.out.println(dateTimeJapan.format(FORMATTER_Completo));
    }

    private static LocalDate requisitarData(String descricao){
        while (true){
            try {
                System.out.print(descricao);
                String dataText = SCANNER.nextLine();

                return LocalDate.parse(dataText,FORMATTER_Date);
            }catch (DateTimeParseException e){
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }

    private static LocalTime requisitarHorario(String descricao){
        while (true){
            try {
                System.out.print(descricao);
                String horarioText =SCANNER.nextLine();

                return LocalTime.parse(horarioText,FORMATTER_Time);
            }catch (DateTimeParseException e){
                System.out.println("Horário inválodo. Tente novamente");
            }
        }
    }
}