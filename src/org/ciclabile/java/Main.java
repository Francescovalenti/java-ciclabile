package org.ciclabile.java;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        int[] numeri = { 1, 2, 3, 4, 5 };
        Ciclabile numeriInteri = new Ciclabile(numeri, 0);

            Scanner scanner = new Scanner(System.in);
 System.out.println(numeriInteri.hasAncoraElementi());
        
  // metodo per getElemento
        while (numeriInteri.getPosizione() < numeriInteri.getLunghezza()) 
        {
            System.out.println("Premi INVIO per stampare il prossimo numero.");
            scanner.nextLine();
            System.out.println(numeriInteri.getElementoSuccessivo());
        }

     
        
        scanner.close();
    }

        // for (int n : numeri){
        // numeriInteri.addElemento(n);
        // }

    


}
