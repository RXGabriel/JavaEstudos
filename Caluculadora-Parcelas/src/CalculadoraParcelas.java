import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalculadoraParcelas {
    public static List<Date> calcular(Date dataPrimeiraParcela, int quantidadeParcelas) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataPrimeiraParcela);

        int diaVencimentoPrimeiraParcela = calendar.get(Calendar.DAY_OF_MONTH);

        List<Date> datasParcelas = new ArrayList<>();
        datasParcelas.add(calendar.getTime());

        for (int i = 2; i <= quantidadeParcelas; i++) {
            calendar.add(Calendar.MONTH, 1);

            int diaMaximo = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            int diaVencimentoParcelaAtual = diaVencimentoPrimeiraParcela;

            if (diaVencimentoParcelaAtual > diaMaximo) {
                diaVencimentoParcelaAtual = diaMaximo;
            }

            calendar.set(Calendar.DAY_OF_MONTH, diaVencimentoParcelaAtual);
            datasParcelas.add(calendar.getTime());
        }
        return datasParcelas;
    }
}
