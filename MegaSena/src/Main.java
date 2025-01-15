import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Sorteador sorteador = new Sorteador();

        for (Integer integer : sorteador) {
            System.out.println(integer);
        }
    }
}