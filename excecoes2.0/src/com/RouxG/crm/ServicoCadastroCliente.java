package com.RouxG.crm;

public class ServicoCadastroCliente {
    public Cliente cadastrar(String nome, int idade){
        if (idade < 18){
            throw new MenorDeIdadeException("Cliente menor de idade não pode ser cadastrado");
        }
        return new Cliente(nome,idade);
    }
}
