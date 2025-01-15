import java.text.ParseException;
import java.util.Calendar;

public class OperacoesDeDatasComCalendar {
    public static void main(String[] args)  {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.MONTH,Calendar.DECEMBER);

        calendar.add(Calendar.MONTH,1);

        calendar.set(Calendar.DAY_OF_MONTH,20);

        int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH,ultimoDiaDoMes);


        System.out.println(calendar.getTime());
        System.out.println(ultimoDiaDoMes);
    }

}
