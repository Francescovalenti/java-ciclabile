package org.ciclabile.java;

import java.util.Arrays;

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
 // metodo per aggiungere singolarmente il numero
    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            return numeri[posizione++];
        } else {
            System.out.println("Non ci sono più numeri");
            return 0;
        }
    }
// metodo per vedere se è true o false
    public boolean hasAncoraElementi() {
        return posizione < numeri.length;
    }


    // bonus
    // Metodo per aggiungere un elemento (bonus)
    public void addElemento(int numeri) {
        int[] nuovoElenco = new int[this.numeri.length + 1];

        for (int i = 0; i < this.numeri.length; i++) {
            nuovoElenco[i] = this.numeri[i];
        }
        nuovoElenco[this.numeri.length] = numeri;

        this.numeri = nuovoElenco;
    }

    @Override
    public String toString() {
        return Arrays.toString(numeri);
    }
}