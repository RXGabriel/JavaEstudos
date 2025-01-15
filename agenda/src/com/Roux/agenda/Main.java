package com.Roux.agenda;

public class Main {
    public static void main(String[] args) {
        Horario horario= new Horario(10,30);
        Agendamento agendamentoCabelo = new Agendamento(horario,"Corte de cabelo");
        Agendamento agendamentoAlizamento = new Agendamento(horario,"Alizamento");

        imprimir(agendamentoCabelo);
        imprimir(agendamentoAlizamento);
    }
    private static void imprimir(Agendamento agendamento){
        System.out.printf("%s ás %s%n",agendamento.getDescricao(),agendamento.getHorario());
    }
}