package com.github.RouxG.estoque;

import java.util.Objects;
import java.util.Scanner;

public class Produto {

    public static void main(String[]args){
        Produto produto = new Produto("Apple Watch");
        produto.ativar();
        produto.adicionarEstoque(20);

        comprar(produto);
    }

    private static void comprar(Produto produto){
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto,quantidade);
                System.out.println("Compra Realizada");

                break;
            } catch (IllegalArgumentException e){
                System.out.println("Erro na compra: "+ e.getMessage());
            }
        }while (true);

    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade){
        try {
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas de estoque. Estoque atual: %d%n",
                    quantidade,produto.getQuantidadeEstoque());
        }catch (IllegalArgumentException e){
            System.out.println("Erro ao efetuar baixa no estoque: " + e.getMessage());
        }
    }



    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto (String nome, int quantidadeEstoque, boolean ativo) {
        this.nome = nome;
    }

    public Produto(String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome,"Nome deve ser informado");
        this.nome=nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }


    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }


    public void ativar(){
        this.ativo = true;
    }

    public void desativar(){
        this.ativo = false;
    }

    public void retirarEstoque(int quantidade){
        if (quantidade < 0){
            throw new IllegalArgumentException (
                    "Quantidade não pode ser negativa para retirada no estoque");
        }
        if (!ativo){
            throw new ProdutoInativoException("Retirada no estoque não pode ser realizada");
        }

        if (this.quantidadeEstoque - quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida, pois o estoque ficaria negativo");
        }

        this.quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
    }



}
