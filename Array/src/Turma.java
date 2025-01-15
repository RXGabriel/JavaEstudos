import java.util.ArrayList;


public class Turma {
    String identificacao;
    String nomeProfessora;
    ArrayList<Aluno> alunos= new ArrayList<>();

    void adiionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    void removerAluno(int indice){
        alunos.remove(indice);
    }

    void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            } else {
                System.out.println("vago");
            }
        }
    }
}
