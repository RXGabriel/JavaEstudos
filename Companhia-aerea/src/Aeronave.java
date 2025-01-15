public class Aeronave {
    boolean ativo=true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis(){
        return totalAssentos - assentosReservados;
    }

    void reservarAssentos(int numeroAssentos){
        if (ativo){
            assentosReservados += numeroAssentos; //Esta acumulando o numero de assentos no valor que esta dentro de assentosReservados
        }else { //Existe outra forma melhor
            System.out.println("Aeronave desativada. Assentos nao reservados");
        }
    }

    void desativar(){
        ativo=false; // Metodo que alteram variavel de instancia era true ,tornou-se false
    }

    void ativar(){
        ativo=true;
    }
}
