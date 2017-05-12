/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicion4;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class Condicion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        // declaracion de variables

        int fac;
        System.out.println("ingrese el numero");
        fac=op.nextInt();
        int i = fac - 1;
        while (1 <= i) {
            fac = fac * i;

            System.out.println("" + fac);
            i--;
        }

    }

}
