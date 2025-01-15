import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream.of("Maria",null,"João",null)
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}