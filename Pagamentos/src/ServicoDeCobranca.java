import java.util.Objects;

public class ServicoDeCobranca {
    void pagar(Fatura fatura,String emailsCobrenca, String... emailsAdicionais){
        Objects.requireNonNull(fatura,"Informe a fatura");
        Objects.requireNonNull(emailsCobrenca,"Informe o email cobrenca")

        System.out.printf("Fatura %d,no valor total de R$%.2f, foi paga!%n",
                fatura.numero,fatura.valorTotal);

        enviarNotificacao(fatura,emailsCobrenca);

        for (String email : emailsCobrenca){
            enviarNotificacao(fatura,email);
        }


    }
    private void enviarNotificacao(Fatura fatura, String email){
        System.out.printf("Fatura %d enviada para %s%n",fatura.numero,email);

    }
}
