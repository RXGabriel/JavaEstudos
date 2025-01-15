package Exemplo2;
import java.util.Comparator;
import java.util.List;

public class ClienteEx2 {

    public enum Status{
        ATIVO,BLOQUEADO;
    }

    private final String nome;
    private final int idade;
    private Status status = Status.ATIVO;


    public ClienteEx2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClienteEx2{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void ordenarPorIdade(List<ClienteEx2> clientes){
        clientes.sort(new IdadeComparator());
    }

    private static class  IdadeComparator implements Comparator<ClienteEx2>{


        @Override
        public int compare(ClienteEx2 o1, ClienteEx2 o2) {
            return Integer.compare(o1.idade, o2.idade);
        }
    }
}
