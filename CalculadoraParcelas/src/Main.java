import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data da primeira parcela: ");
        String dataParcelaTexto = scanner.nextLine();

        System.out.print("Quantidade de Parcelas: ");
        int quantidadeDeParcelas = scanner.nextInt();

        LocalDate dataParcela = LocalDate.parse(dataParcelaTexto,DATE_FORMATTER);

        CalculadoraParcelas calculadoraParcelas = new CalculadoraParcelas();
        List<LocalDate> datasParceladas = calculadoraParcelas.calcular(dataParcela,quantidadeDeParcelas);

    }

        public static void imprimirParcelas(List<LocalDate> datasParceladas){
            for (int i = 0; i < datasParceladas.size() ; i++) {
                System.out.printf("Parcela #%d - %s%n", i+1, datasParceladas.get(i).format(DATE_FORMATTER));
            }
        }

    }