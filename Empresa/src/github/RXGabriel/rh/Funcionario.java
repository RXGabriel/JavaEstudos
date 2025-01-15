package github.RXGabriel.rh;

import java.util.Objects;

public class Funcionario {

    private String name;
    private double valorHora;


    public Funcionario(String name,double valorHora){
        setName(name);
        setValorHora(valorHora);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name);//
        this.name = name;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora < 0){
            throw new IllegalArgumentException("Valor da hora deve ser maior que 0");//
        }
        this.valorHora = valorHora;
    }


    protected double calcularSalario(int horasTrabalhadas){
       return horasTrabalhadas * getValorHora();
    }

    public Holerite gerarHolerite(int horastrabalhas, String mesAno){
        double valorSalario=calcularSalario(horastrabalhas);
        return new Holerite(getName(),mesAno,valorSalario);

    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", valorHora=" + valorHora +
                '}';
    }
}
