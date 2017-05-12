/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paraa;

import java.util.Scanner;

/**
 *
 * @author Jordy
 */
public class Paraa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        // declaracion de variables
        int i, j, m, o = 0;
        double e, pro, sum = 0, k, l, prot, sumt;
        int n = 1;
         // ciclo para
        for (i = 1; i >= n; i++) {
            //ingreso de datos
            System.out.println("escribir 1 si quiere ingresar nota de alumno y 0 si no desea");
            m = op.nextInt();

            if (m == 1) {
                //ingreso de datos
                System.out.println("escribir nota 1");
                e = op.nextInt();
                System.out.println("escribir nota2");
                k = op.nextInt();
                l = e + k;
                sumt = l;
                prot = l / 2;
                System.out.println("PROMEDIO INDIVIDUAL" + prot);
                o = o + 2;

            } else {
                break;

            }
            //operaciones
            l = e + k;
            sum = sum + l;
            pro = sum / o;
            //resultado
            System.out.println("el promedio TOTAL es " + pro);

        }

    }
}
