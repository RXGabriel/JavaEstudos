import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numeros= new HashSet<>();
        numeros.add(100);
        numeros.add(4);
        numeros.add(100);
        numeros.add(null);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}