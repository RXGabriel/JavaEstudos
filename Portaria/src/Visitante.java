public class Visitante {
    static final int IDADE_MINIMA_ACESSO_IRRESTRITO =18; //Variavel que nao pode ser alterada e compartilhada com todos os objetos.
    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade(){
        return  idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }



}
