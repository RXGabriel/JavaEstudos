package com.RouxG.fiscal;
public abstract class NotaFiscal {
    private String descircao;
    private  double valorTotal;

    public NotaFiscal(String descircao,double valorTotal){
        this.descircao= descircao;
        this.valorTotal=valorTotal;
    }

    public String getDescircao() {
        return descircao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public abstract double calcularImpostos();

    public void emitirNotaFiscal(){
        System.out.printf("Emitindo Nota Fiscal para: %s%n",getDescircao());
        System.out.printf("Valor Total: %.2f%n",getValorTotal());
        System.out.printf("Impostos: %.2f%n",calcularImpostos());
    }
}
