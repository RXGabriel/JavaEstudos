public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero= 123;
        fatura.valorTotal=1_293.55;

        ServicoDeCobranca servicoCobranca = new ServicoDeCobranca();

//        String[] emailsCobranca= {"João@alga.com","maria@alga.com"};
//        servicoCobranca.pagar(fatura,emailsCobranca);

//        servicoCobranca.pagar(fatura,
//                new String[]{"João@alga.com","maria@alga.com"});

//        servicoCobranca.pagar(fatura,new String[0]);
//        servicoCobranca.pagar(fatura,new String[]{});

        servicoCobranca.pagar(fatura,"joao@algas.com","hfih@gmail.com");


    }
}