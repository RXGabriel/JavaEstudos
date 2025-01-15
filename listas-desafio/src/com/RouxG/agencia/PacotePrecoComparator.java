package com.RouxG.agencia;

import java.util.Comparator;

public class PacotePrecoComparator implements Comparator<PacoteViagem> {
    @Override
    public int compare(PacoteViagem o1, PacoteViagem o2) {
        return Double.compare(o1.getPrecoporpessoa(),o2.getPrecoporpessoa());
    }
}
