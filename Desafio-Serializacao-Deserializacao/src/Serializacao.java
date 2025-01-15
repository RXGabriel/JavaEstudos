import crm.Cliente;
import crm.Endereco;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.*;

public class Serializacao {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));

        System.out.println(cliente);

        Path path = Path.of("objetos\\joao.ser");

        try (var outPutStream = new ObjectOutputStream(
                Files.newOutputStream(path, CREATE,WRITE))){
            outPutStream.writeObject(cliente);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}