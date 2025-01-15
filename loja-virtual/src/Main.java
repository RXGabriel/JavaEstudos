import com.RouxG.loja.Carrinho;
import com.RouxG.loja.ItemCarrinho;
import com.RouxG.loja.pagamento.MetodoPagamento;
import com.RouxG.loja.pagamento.Transferencia;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho("AirPods",2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch",5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Mouse",600));

        MetodoPagamento metodopagamento = new Transferencia("234234","233");
        
        carrinho.finalizar(metodopagamento);
    }
}