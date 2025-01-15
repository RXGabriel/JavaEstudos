import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        DayOfWeek dayOfWeekNow = LocalDate.now().getDayOfWeek();
        DayOfWeek dayOfWeekPlus15Days = dayOfWeekNow.plus(15);//Nova instancia com +15 dias

        System.out.println(dayOfWeekPlus15Days);
    }

}
