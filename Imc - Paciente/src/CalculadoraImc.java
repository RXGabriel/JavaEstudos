public class CalculadoraImc {


    Imc calcular(Paciente paciente){
        Imc Indicedemassacorporal= new Imc();
        Indicedemassacorporal.reultado=paciente.peso / (paciente.altura * paciente.altura);
        Indicedemassacorporal.peso= paciente.peso;
        Indicedemassacorporal.altura= paciente.altura;

        return Indicedemassacorporal;
    }

}
