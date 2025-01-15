import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class IdadePaciente {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final DateTimeFormatter Date_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        LocalDate dataNascimneto = requisitarData();
        Period periodLife = dataNascimneto.until(LocalDate.now());

        System.out.printf("Paciente tem %s de vida%n",formatarPeriodo((periodLife)));
    }

    private static String formatarPeriodo(Period tempoVida){
        return String.format("%d ano%s, %d %s e %d dia%s",
        tempoVida.getYears(),tempoVida.getYears() > 1 ? "s" : "",
        tempoVida.getMonths(),tempoVida.getMonths() > 1 ? "meses" : "mês",
        tempoVida.getDays(),tempoVida.getDays() > 1 ? "s" : "");
    }

    private static LocalDate requisitarData(){
        while (true){
            try {
                System.out.print("Data nascimento: ");
                String dataTexto = SCANNER.nextLine();

                return LocalDate.parse(dataTexto,Date_FORMATTER);
            }catch (DateTimeParseException e){
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }

}