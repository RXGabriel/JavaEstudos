import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[]args) throws ParseException {
        String dataTexto = "30/12/2023 10:20:59";

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = dateFormat.parse(dataTexto);
        System.out.println(date);
    }
}
