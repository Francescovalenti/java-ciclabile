package org.ciclabile.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] numeri = { 1, 2, 3, 4, 5 };
        Ciclabile numeriInteri = new Ciclabile(numeri, 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println(numeriInteri.hasAncoraElementi());

        // metodo per aggiungere numeri
       while (numeriInteri.hasAncoraElementi()) {
            System.out.println("Premi INVIO per stampare il prossimo numero...");
            scanner.nextLine();
            System.out.println(numeriInteri.getElementoSuccessivo());
        }

 // metodo bonus
        Ciclabile interiNumeri = new Ciclabile();
        interiNumeri.addElemento(6);
        interiNumeri.addElemento(7);
        interiNumeri.addElemento(8);
        interiNumeri.addElemento(9);
        interiNumeri.addElemento(10);
       
        System.out.println(interiNumeri);
          while (interiNumeri.hasAncoraElementi()) {
             System.out.println("Premi INVIO per stampare il prossimo numero...");
            
        
            scanner.nextLine();
            System.out.println(interiNumeri.getElementoSuccessivo());
        }

        scanner.close();
    }



}
