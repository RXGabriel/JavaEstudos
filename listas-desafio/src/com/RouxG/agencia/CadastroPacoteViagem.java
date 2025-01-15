package com.RouxG.agencia;

import java.util.*;

public class CadastroPacoteViagem  {

    private final List<PacoteViagem> pacotes = new ArrayList<>();
    // TODO declarar lista de pacotes de viagem aqui

    public void adicionar(String descricao, double precoDiaria) {

            PacoteViagem pacote = new PacoteViagem(descricao,precoDiaria);

            if (pacotes.contains(pacote)){
                throw new PacoteJaExistenteException("Pacote de viagem com esta descrição já foi adicionado");
            }

        pacotes.add(pacote);


        // TODO adicionar pacote na lista, validando antes se
        //  já existe usando contains (lançar exceção)
    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;

        // TODO retornar lista de pacotes
    }

    public void ordenar() {
        Collections.sort(pacotes);

        // TODO ordenar pacotes pela ordem natural
    }

    public void ordenarPorPrecoDecrescente() {
        pacotes.sort(new PacotePrecoComparator().reversed());

        // TODO ordenar pacotes pelo preço (decrescente)
    }

    public void removerPorDescricao(String descricao) {
        boolean removido = false;
        Iterator<PacoteViagem>pacoteViagemIterator= pacotes.iterator();

        while (pacoteViagemIterator.hasNext()){
            PacoteViagem pacoteViagem = pacoteViagemIterator.next();
            if (pacoteViagem.getDescricao().equals(descricao)) {
                pacoteViagemIterator.remove();
                removido = true;
            }
        }

        if (!removido){
            throw new PacoteViagemNaoEncontradoException("Pacote de viagem não encontrado com descrição");
        }

        // TODO iterar nos pacotes com Iterator e remover aqueles com descrição informada,
        //  lançando exceção se nenhum pacote foi removido.
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)){
                return pacote;
            }
        }
        throw new PacoteViagemNaoEncontradoException("Pacote de viagem não encontrado");

        // TODO iterar pacotes com enhanced for, localizar e retornar
        //  pacote com descrição informada (ou lançar exceção se não encontrar)
    }


}
