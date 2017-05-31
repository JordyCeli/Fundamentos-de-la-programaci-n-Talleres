/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrr;

import java.util.Scanner;

/**
 *
 * @author Jordy
 */
public class Arrr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner op = new Scanner(System.in);
          //declaracion de variables
        int[] lista, lista2, lista3;
        int i, n, fact = 1, j = 0, m = 0,k=0;
        System.out.println("ingrese valor de la lista");
        n = op.nextInt();
        lista = new int[n];
        lista2 = new int[(int)((n / 2) + 2)];
        lista3 = new int[(int) (n / 2) + 1];
        int suma1=0,suma2=0;
           //ingreso de datos
        for (i = 0; i < lista.length; i++) {
            System.out.println("ingrese la entrada " + i);
            lista[i] = op.nextInt();

        }
        for (i = 0; i < lista.length; i++) {
            
            if (i % 2 == 0)  {
                lista2[j] = lista[i];
                suma1 = suma1+ lista[i];
              j++;
            } else {
                
                lista3[k] = lista[i];
                suma2= suma2 + lista[i];
                k++;
            }
        }
        lista2[j] = suma1;
        lista3[k] = suma2;
//salida datos
        for (j= 0; j < lista2.length; j++) {
            System.out.println("lista 2 " + lista2[j]);
            
        }
        for (k= 0; k < lista3.length; k++) {
            System.out.println("lista 3 "+lista3[k]);
        }
    }
}
