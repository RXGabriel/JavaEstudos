package com.RouxG.fiscal;

public class GestorFiscal {
    public void emitirNotasFiscais(NotaFiscal...notasFiscais){ //Método Universal
        for (NotaFiscal notaFiscal: notasFiscais){
            notaFiscal.emitirNotaFiscal();
            System.out.println("--------------");
        }
    }
}
