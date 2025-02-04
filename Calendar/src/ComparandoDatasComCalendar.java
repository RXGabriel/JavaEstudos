import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ComparandoDatasComCalendar {
    public static void main(String[] args) throws ParseException {
        Calendar minhaDataNascimento = new GregorianCalendar(1981,Calendar.SEPTEMBER,13);
        Calendar dataNascimentoJoao = new GregorianCalendar(1981,Calendar.SEPTEMBER,20);

        if (dataNascimentoJoao.after(minhaDataNascimento)){
            System.out.println("João é mais velho");
        }

        if (dataNascimentoJoao.before(minhaDataNascimento)){
            System.out.println("João é mais novo");
        }

        if (dataNascimentoJoao.compareTo(minhaDataNascimento) == 0){
            System.out.println("João nasceu no mesmo dia!");
        }
    }

}
