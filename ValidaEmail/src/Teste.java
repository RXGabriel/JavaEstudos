import java.util.regex.Pattern;

public class Teste {
    public static void principal(String[] args){
        String email = "a@algaworks.com";

        boolean valido = Pattern.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}",email);
        System.out.println(valido);
    }
}
