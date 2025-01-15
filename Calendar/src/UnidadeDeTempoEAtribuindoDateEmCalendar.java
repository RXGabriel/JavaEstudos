import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UnidadeDeTempoEAtribuindoDateEmCalendar {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Data de nascimento: ");
        String dataAniversarioTexto = scanner.nextLine();

        Date dataAniversario= dateFormat.parse(dataAniversarioTexto);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataAniversario);

        System.out.println(calendar.getTime());

        if (calendar.get(Calendar.MONTH)== Calendar.DECEMBER
        && calendar.get(Calendar.DAY_OF_MONTH) == 25){
            System.out.println("Você nasceu no Natal!!");
        }

    }
}
