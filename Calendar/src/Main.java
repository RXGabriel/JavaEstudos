import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

//        Calendar calendar = Calendar.getInstance();
        Calendar calendar = new GregorianCalendar(1981,Calendar.SEPTEMBER,1,20,35);
        Date date = calendar.getTime();

        System.out.println(dateFormat.format(date));
    }
}