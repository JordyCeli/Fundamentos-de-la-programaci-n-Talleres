/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matri2;

import java.util.Scanner;

/**
 *
 * @author Jordy
 */
public class Matri2 {

    private int j;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        //declaracion de variable
        int[][] m;
        int i, n, fact = 1, j = 0, may = 0;
        //ingreso datos
       
        System.out.println("ingrese limite de la matriz");
        j = op.nextInt();

        m = new int[j][j];
        for (i = 0; i < j; i++) {
            for (n = 0; n < j; n++) {
                System.out.println("ingrese datos de la matriz");
                m[i][n] = op.nextInt();
            }
        }
        //recorrer lista
        for (i = 0; i < j; i++) {
            for (n = 0; n < j; n++) {
                System.out.print("" + m[i][n]);

            }
            System.out.println(" ");
        }
        //presentar la fila inferior
        System.out.println("fila inferior");
        for (n = 0; n < j; n++) {
            System.out.print("" + m[j - 1][n]);
        }
        //diagonal principal
        System.out.println(" ");
        System.out.println("diagonal principal");

        for (i = 0; i < j; i++) {
            for (n = 0; n < j; n++) {
                if (i == n) {
                    System.out.print("" + m[i][n]);
                }
            }

        }
        //diagonal secundaria
        System.out.println("");
        System.out.println("diagonal secundaria");
        for (i = n - 1; i >= 0; i--) {
            for (n = 0; n < j; n++) {
                if (j - 1 - i == n) {

                    System.out.print("" + m[i][n]);

                }

            }
        }
        //sobre la daigonal principal
        System.out.println(" ");
        System.out.println("sobre la daigonal principal");
        for (i = 0; i < j; i++) {
            for (n = 0; n < j; n++) {
                if (i < n) {
                    System.out.print("" + m[i][n]);
                }
            }

        }
        //debajo de la diagonal principal
        System.out.println("");
        System.out.println("debajo de la diagonal principal");
        for (i = 0; i < j; i++) {
            for (n = 0; n < j; n++) {
                if (i > n) {
                    System.out.print("" + m[i][n]);
                }
            }
        }
        System.out.println(" sobre la diagonal secundaria ");
        for (i = 0; i < j; i++) {
            for (n = 0; n < j; n++) {
                if ((i + n) < (j - 1)) {
                    System.out.print("" + m[i][n]);
                }
            }
        }
        //presentacion diagonal secundaria
        System.out.println("");
        System.out.println("diagonal secundaria");
        for (i = 0; i < j; i++) {
            for (n = 0; n < j; n++) {
                if ((i + n) > (j - 1)) {
                    System.out.print("" + m[i][n]);
                }
            }
            System.out.println("");
            System.out.println("sigsag");
            for (n = 0; n < j; n++) {
                for (i = 0; i < j; i++) {
                   
                    System.out.print(""+m[i][n]);
                }
            }
            System.out.println("");
        }
    }
}
