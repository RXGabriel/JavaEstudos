public class Horario {
    private int hora ;
    private int minuto;

    public Horario(int hora, int minuto){
        setHora(hora);
        setMinuto(minuto);
        this.hora= hora;
        this.minuto= minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora >23) {
            throw new IllegalArgumentException("Minuto inválido:" + hora);
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Minuto inválido:" + minuto);
        }
        this.minuto = minuto;
    }

    public String formantar(){
        return String.format("%dh%dm",getHora(),getMinuto());

    }
}
