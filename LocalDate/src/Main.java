import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(1981,9,13);
        LocalDate diaDoProgramador = LocalDate.ofYearDay(2022,256);

        System.out.println(localDate);
        System.out.println(dataNascimento);
        System.out.println(diaDoProgramador);
    }
}