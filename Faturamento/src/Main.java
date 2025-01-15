import com.RouxG.fiscal.GestorFiscal;
import com.RouxG.fiscal.NotaFiscalProduto;
import com.RouxG.fiscal.NotaFiscalServico;

public class Main {
    public static void main(String[] args) {
        var gesrFiscal = new GestorFiscal();

        var nfBolaFutebol = new NotaFiscalProduto("Bola de Futebol",300,50);
        var nfreparoMotor = new NotaFiscalServico("Reparo da Roda",900,true);

        gesrFiscal.emitirNotasFiscais(nfreparoMotor,nfBolaFutebol);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfreparoMotor.calcularImpostos());
    }
}