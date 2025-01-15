package exemplo1;

public class Main {
    public static void main(String[] args) {
        ServicoEmail servicoEmail = new ServicoEmail();

        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem
                ("joao@google.com","maria@google.com", "Olá, tudo bem?");

        servicoEmail.enviar(mensagem);
    }
}