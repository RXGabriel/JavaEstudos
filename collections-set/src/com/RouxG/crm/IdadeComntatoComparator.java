package com.RouxG.crm;

import java.util.Comparator;

public class IdadeComntatoComparator implements Comparator<Contato> {

    @Override
    public int compare(Contato o1, Contato o2) {
        return Integer.compare(o1.getIdade(),o2.getIdade());
    }
}
