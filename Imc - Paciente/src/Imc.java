public class Imc {
    double reultado;
    double peso;
    double altura;

    boolean estaComObesidade(){
        return reultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal(){
        return reultado < 18;
    }

}
