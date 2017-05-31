/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arr1;

import java.util.Scanner;

/**
 *
 * @author Jordy
 */
public class Arr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner op = new Scanner(System.in);
//declaracion de variables
        int[] lista;
        int i, n, fact = 1, j;
//ingreso de datos
        System.out.println("ingrese valor de la lista");
        n = op.nextInt();
        lista = new int[n];

        for (i = 0; i < lista.length; i++) {
            System.out.println("ingrese la entrada " + i);
            lista[i] = op.nextInt();

        }
        for (i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                System.out.println("par");

            } else {
                System.out.println("impar");
                if (lista[i] <= 5) {
                    j = lista[i];
                    while (j != 0) {
                     
                        fact = fact * j;

                        j--;
                    }
//salida
                    System.out.println("" + fact);
                }
            fact=1;
            }

        }

    }
}
