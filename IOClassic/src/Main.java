import java.io.File;

public class Main {
    public static void main(String[] args) {
        File pasta1  = new File("C:\\Java\\IOClassic\\src");
        System.out.printf("Pasta 1 criada: %n%n",pasta1.mkdir());

        File pasta2  = new File("C:\\Java\\IOClassic\\src\\fotos\\viagem");
        System.out.printf("Pasta 2 criada: %n%n",pasta2.mkdirs());

        File arquivo1 = new File("C:\\Java\\IOClassic\\src\\fotos\\viagem");
        File arquivo2 = new File(pasta1,"docs\\contrato.txt");


//        arquivo2.createNewFil();

    }
}