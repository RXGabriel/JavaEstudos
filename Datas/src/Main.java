import javax.xml.crypto.Data;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));

        System.out.println(hoje.getTime());

        long diferencaMillis = hoje.getTime() - ontem.getTime();
        System.out.println(diferencaMillis);

        double diferencaHoras = diferencaMillis / 1000/60/60;
        System.out.printf("Diferença em Horas: %.2f%n", diferencaHoras);

        System.out.printf("Depois: %b%n",hoje.after(ontem)); //true
        System.out.printf("Depois: %b%n",hoje.before(ontem)); //false
        System.out.printf("Coparação: %d%n",hoje.compareTo(ontem)); //1


    }
}