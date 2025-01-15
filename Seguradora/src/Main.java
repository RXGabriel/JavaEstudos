import com.github.RouxG.seguradora.modelo.Caminhao;
import com.github.RouxG.seguradora.modelo.CarroParticular;
import com.github.RouxG.seguradora.modelo.ImovelResidencial;
import com.github.RouxG.seguradora.servico.ServicoPropostaSeguro;

public class Main {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carroParticular = new CarroParticular("HR-V",150_000,2022);
        Caminhao caminhao = new Caminhao("Actros", 780_000, 2021, 4);
        ImovelResidencial imovelResidencial= new ImovelResidencial(2_300_000,320);

        servicoPropostaSeguro.emitir(carroParticular);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovelResidencial);
    }
}