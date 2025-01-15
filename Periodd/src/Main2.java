import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main2 {
    public class Main {
        LocalDate dataCompra= LocalDate.parse("2022-09-17");
        LocalDate dataEntrega = LocalDate.parse("2021-02-18");

        Period tempoEntraga = Period.between(dataCompra,dataEntrega);
        Period tempoEntraga2 = dataCompra.until(dataEntrega);
        long tempoEntraga23 = dataCompra.until(dataEntrega, ChronoUnit.WEEKS);

        long tempoEntraga24= ChronoUnit.WEEKS.between(dataCompra,dataEntrega);
    }

}
