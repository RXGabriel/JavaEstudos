import java.io.*;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) throws IOException {
        String nome = "Thiago";

        OutputStream outputStream = System.out;
        outputStream.write("Thiago".getBytes());

        PrintStream printStream = System.out;
        printStream.printf("Olá, %s%n",nome);

        PrintStream out = new PrintStream(new FileOutputStream(new File("docs/arquivo.txt")));
        out.printf("Olá,%s %n",nome);
    }
}
