import java.time.LocalDate;
import java.time.Period;

public class Main3 {
    public static void main(String[] args) {
        Period tempoMedioEntreda = Period.parse("P1M5D");
        LocalDate agora = LocalDate.now();

        LocalDate dataPrevistaEntrega = agora.plus(tempoMedioEntreda);
        System.out.println(dataPrevistaEntrega);
    }


    }
