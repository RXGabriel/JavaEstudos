public class Main {
    public static void main(String[] args) {
        int x = 127;
        int y = 227;

        int z = Math.min(x,y);
//        int z = Integer.min(x,y);
        int m = Math.max(x,y);
//        int z = Integer.max(x,y);


        float q = -100.5f;
        float w = 100.5f;
        System.out.println(Math.abs(q));
        System.out.println(Math.abs(w));

        double e = 100.1;
        double r = 100.9;
        System.out.println(Math.ceil(e));
        System.out.println(Math.ceil(r));
        System.out.println(Math.floor(r));

        double u = 100.4;
        double i = 100.5;
        System.out.println(Math.round(e));
        System.out.println(Math.round(r));


        double h = 16;
        double j = Math.sqrt(h);
        System.out.println(j);

        double base = 4;
        double expoente = 2;
        double resultado = Math.pow(base,expoente);
    }
}