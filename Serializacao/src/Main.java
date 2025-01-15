import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.*;

public class Main {
    public static void main(String[]args){
        Funcionario funcionario = new Funcionario("João",
                LocalDate.of(2005, Month.DECEMBER,2),
                new BigDecimal("25000"));

        System.out.println(funcionario);

        Path path = Path.of("objetos\\joao.ser");

        try( var outPutStream = new ObjectOutputStream(
                Files.newOutputStream(path, WRITE,CREATE))) {
            outPutStream.writeObject(funcionario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//

        try( var outPutStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            outPutStream.writeObject(funcionario);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        try(var inputstreeam = new ObjectInputStream(Files.newInputStream(path,READ))) {
            Funcionario funcionario1 = (Funcionario) inputstreeam.readObject();
            System.out.println(funcionario1);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
