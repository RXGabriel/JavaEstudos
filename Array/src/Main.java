public class Main {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";

        Aluno aluno1= new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 3;


        Aluno aluno2 = new Aluno();
        aluno2.nome = "Laura";
        aluno2.idade = 4;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Miguel";
        aluno3.idade = 3;

        turmaB.adiionarAluno(aluno1);
        turmaB.adiionarAluno(aluno2);
        turmaB.adiionarAluno(aluno3);

        turmaB.removerAluno(1);

        turmaB.imprimirListaDeAlunos();

    }
}
