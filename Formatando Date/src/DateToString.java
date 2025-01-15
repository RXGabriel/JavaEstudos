import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
    public static void main(String[] args) {
        Date today = new Date();

////        DateFormat dateFormat = DateFormat.getDateInstance();
////        DateFormat dateFormat = DateFormat.getDateTimeInstance();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(
//                DateFormat.FULL,DateFormat.FULL,new Locale("pt-br","BR"));

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(dateFormat.format(today));
    }
}