package org.ciclabile.java;


public class Ciclabile {
    private int[] numeri;
    private int posizione;

    public Ciclabile(int[] numeri, int posizione) {
        this.numeri = numeri;
        this.posizione = 0;

    }

    public Ciclabile() {
        this.numeri = new int[0];
        this.posizione = 0;

    }

    public int getElementoSuccessivo() {
        if (posizione < numeri.length){
            return numeri[posizione++];
        }
        else {
            System.out.println("Non ci sono più numeri");
            return 0;
        }
    }

    public boolean hasAncoraElementi() {
        return posizione < numeri.length;
    }
}
