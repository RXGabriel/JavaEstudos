
import java.util.regex.Pattern;

public class ValidadorEmail {
    public static boolean validar(String email) {
        //TODO Email Valido:
        //Nome_do_usuario@dominio.sufixodoDominio
        //- O nome de usuário pode conter letras, dígitos, ponto e hífen.
        //- O domínio pode conter letras minúsculas, dígitos, ponto e hífen.
        //- O sufixo do domínio deve consistir em 2 ou 3 letras minúsculas.
     return Pattern.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}",email);
    }
}
