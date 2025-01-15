import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraParcelas {

    public List<LocalDate> calcular(LocalDate dataPrimeiraParcela, int quantidadeParcelas){
        List<LocalDate> datasParcelas = new ArrayList<>();

        for (int numerosParcela = 1; numerosParcela <= quantidadeParcelas ; numerosParcela++) {
            LocalDate dataProximaParcela = dataPrimeiraParcela.plusMonths(numerosParcela - 1);
            datasParcelas.add(dataProximaParcela);
        }
        return datasParcelas;
    }
}
