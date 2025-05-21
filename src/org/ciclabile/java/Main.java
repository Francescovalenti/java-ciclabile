package org.ciclabile.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] numeri = { 1, 2, 3, 4, 5 };
        Ciclabile numeriInteri = new Ciclabile(numeri, 0);

            Scanner scanner = new Scanner(System.in);

        while (numeriInteri.hasAncoraElementi()) {
            System.out.println("Premi INVIO per stampare il prossimo numero.");
            scanner.nextLine();
            System.out.println(numeriInteri.getElementoSuccessivo());
        }

        System.out.println("Fine dei numeri!");
        scanner.close();
    }

        // for (int n : numeri){
        // numeriInteri.addElemento(n);
        // }

    


}
