import com.github.RouxG.contaspagar.modelo.Holerite;
import com.github.RouxG.contaspagar.modelo.OrdemServico;
import com.github.RouxG.contaspagar.servico.ServicoContaPagar;
import com.github.RouxG.pagamento.Beneficiario;
import com.github.RouxG.pagamento.MetodoPagamento;
import com.github.RouxG.pagamento.Pix;
import com.github.RouxG.pagamento.Transferencia;


public class Main {
    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = new Pix();
//        MetodoPagamento metodoPagamento = new Transferencia();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("João da Silva","34999998","23567");
        Holerite holerite = new Holerite(funcionario,100,168);


        Beneficiario fornecedor = new Beneficiario("Consultoria XWQ","12456677441223","246899");
        OrdemServico ordemServico = new OrdemServico(fornecedor,65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(ordemServico);
    }
}