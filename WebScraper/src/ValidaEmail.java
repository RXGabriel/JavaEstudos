
import java.util.regex.Pattern;

public class ValidaEmail {
    public static boolean validar(String email) {

        return Pattern.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}",email);
    }
}
