import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionarios>();
        funcionarios.add(new Funcionarios("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionarios("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionarios("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionarios("Sebastião", new BigDecimal("12000"), false));

        // TODO remover funcionários inativos
        funcionarios.removeIf(Funcionarios::isInativo);

        // TODO ordenar funcionários pelo valor do salário
        funcionarios.sort(Comparator.comparing(Funcionarios::getSalario));

        // TODO iterar e imprimir funcionários usando o método estático imprimir
        funcionarios.forEach(Main::imprimir);
    }

    private static void imprimir(Funcionarios funcionario) {
        // TODO implementar a impressão do nome, salário e impostos (20%)
        System.out.printf("Nome: %s - Salário: %s - Impostos: %s%n",
                funcionario.getNome(),funcionario.getSalario(),
                funcionario.getSalario().multiply(new BigDecimal("0.20")));
    }

}