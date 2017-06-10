/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz1;

import java.util.Scanner;

/**
 *
 * @author Jordy
 */
public class Matriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        int[][] m;
        int i, n, fact = 1, j = 0, may = 0;
        //ingreso datos

        m = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (n = 0; n < 3; n++) {
                System.out.println("ingrese datos de la matriz");
                m[i][n] = op.nextInt();
            }

            //recorrer lista
            for (i = 0; i < 3; i++) {
                for (n = 0; n < 3; n++) {
                    System.out.println("" + m[i][n]);
                }

            }

        }
    }
}