public class Main {
    public static void main(String[] args) {
       long tempoInicio = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder(210_000);

        for (int i = 0; i < 200_00 ; i++) {

            stringBuilder.append("#");
        }
        System.out.println(stringBuilder.toString());

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duração: %.2fs%n",duracao);
    }
}