import com.github.RouxG.impostos.EmpresaLucroReal;
import com.github.RouxG.impostos.EmpresaSimples;
import com.github.RouxG.impostos.GestorDeImpostos;
import com.github.RouxG.impostos.PessoaFisica;


public class main2 {
    var gestorImpostos = new GestorDeImpostos();

    var joao = new PessoaFisica("João da Silva", 45_000);
    var maria = new PessoaFisica("Maria Souza", 180_000);

    var barDoZe = new EmpresaSimples("Bar do Zé", 250_000, 160_000);
    var codeConsultoria = new EmpresaLucroReal("Code Consultoria", 8_000_000, 6_000_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(codeConsultoria);

        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());

}
