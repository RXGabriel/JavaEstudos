public class Main {
    public static void main(String[] args) {
        var novoVisitante = new Visitante();
        novoVisitante.nome = "Joao";
        novoVisitante.idade = 12;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 2);
    }
}
