import java.io.*;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String line = null;
        while (!(line = scanner.nextLine()).equals("sair")) {
            System.out.println("Você digitou: " + line);
        }

        //

        InputStream inputStream = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        String line1 = null;
        while (!(line1 = reader.readLine()).equals("sair")) {
            System.out.println("Você digitou: " + line1);
        }

        //

        Scanner scanner1 = new Scanner(new FileInputStream("docs/lista.txt"));
        while (scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());
        }
    }
}
