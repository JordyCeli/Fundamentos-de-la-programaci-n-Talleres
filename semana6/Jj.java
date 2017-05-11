/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jj;

import java.util.Scanner;

public class Jj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner op = new Scanner(System.in);
        //Creación de avriables
        int mod, n;
        //Variables ingresadas por usuario
        System.out.print("Ingrese un número: ");
        n = op.nextInt();
        //Proceso
        mod = n % 10;
        n = n - mod + 10;
        //Presentar
        do {
            System.out.println(n);
            n = n - 10;
        } while (n >= 0);
    }
}
