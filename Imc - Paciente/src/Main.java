public class Main {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();

        Paciente Joao= new Paciente();

        Joao.altura=1.73;
        Joao.peso=60.5;

        Imc imc = calculadoraImc.calcular(Joao);

        if(imc.estaComObesidade()){
            System.out.printf("Paciente com altura de %.2f e peso de %.2f" +
            " esta com obesidade. %n", imc.altura, imc.peso);
        } else  {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f" +
                    " esta raquitico. %n", imc.altura, imc.peso);
        }
        System.out.printf("IMC: %.2f%n",imc.reultado);
    }
}