import java.util.ArrayList;
import java.util.Arrays;

public class main1 {
    public static void main(String[]args){
     ArrayList<String> alunos = new ArrayList<>(); //qual e o tipo de obj que esta lista de array comporta;
        alunos.add("João");
        alunos.add("Maria");

      //arraylist neao tem um tamanho fixo

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
