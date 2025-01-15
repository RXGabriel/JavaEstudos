import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitEx {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();

//        LocalDate dataProximaParcela = agora.plus(30, ChronoUnit.DAYS);
        LocalDate dataProximaParcela = ChronoUnit.DAYS.addTo(agora,30);
        LocalDate decadaPassada = agora.minus(1,ChronoUnit.DECADES);

        System.out.println(agora);
        System.out.println(dataProximaParcela);
    }

}
