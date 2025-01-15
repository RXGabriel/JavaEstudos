package github.RXGabriel.rh;

public record Holerite(String nomeFuncionario, String mesAno, double valorSalario) {
    public void imprimir(){
        System.out.println();
        System.out.printf("Holerite de %s%n",nomeFuncionario);
        System.out.printf("Mês/Ano de %s%n",mesAno());
        System.out.printf("Salário á receber: %.2f%n",valorSalario());
    }

}


