import java.io.File;

public class Main2 {
    public static void main(String[] args) {
      File arquivo1 = new File("C:\\Java\\IOClassic\\src");
      System.out.println(arquivo1);

      File arquivo2 = new File("docs\\contrato.txt");
        System.out.println(arquivo2);
        System.out.println(arquivo2.getAbsoluteFile());

        File arquivo3 = new File("../docs/contrato.txt");
        System.out.println(arquivo3);
//        System.out.println(arquivo3.getCanonicalFile());
    }
}