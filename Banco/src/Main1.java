import github.RXGabriel.banco.*;

public class Main1 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("Carlos da Silva","12312312300"),
            1234,99999,90);
        conta1.setTarifaMensal(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("Carlos da Silva","12312312300"),
                1234,99999);
        conta2.depositar(100);
        conta2.creditarRendimentos(10);

        caixaEletronico.imprimirDemonstratio(conta2);
    }
}