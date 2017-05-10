
package ejercicio;

import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        // Decalaracion de variables
        Scanner op = new Scanner(System.in);
        int val1, val2, val3, val4, val5, val6, val7, val8, val9, val10;
        int res1, res2, res3, res4, res5, res6, res7, res8, res9;
        int tot, decena, unidad, suma, modo;
        //datos de entrada
        System.out.println("ingrese el primer numero de su cedula");
        val1 = op.nextInt();
        val2 = op.nextInt();
        val3 = op.nextInt();
        val4 = op.nextInt();
        val5 = op.nextInt();
        val6 = op.nextInt();
        val7 = op.nextInt();
        val8 = op.nextInt();
        val9 = op.nextInt();
        val10 = op.nextInt();
        res1 = val1 * 2;
        res2 = val2 * 1;
        res3 = val3 * 2;
        res4 = val4 * 1;
        res5 = val5 * 2;
        res6 = val6 * 1;
        res7 = val7 * 2;
        res8 = val8 * 1;
        res9 = val9 * 2;

        if (res1 >= 10) {
            decena = res1 % 10;
            unidad = res1 / 10;
            res1 = decena + unidad;
        }
        if (res3 >= 10) {
            decena = res3 % 10;
            unidad = res3 / 10;
            res3 = decena + unidad;
        }
        if (res5 >= 10) {
            decena = res5 % 10;
            unidad = res5 / 10;
            res5 = decena + unidad;
        }
        if (res7 >= 10) {
            decena = res7 % 10;
            unidad = res7 / 10;
            res7 = decena + unidad;
        }
        if (res9 >= 10) {
            decena = res9 % 10;
            unidad = res9 / 10;
            res9 = decena + unidad;
        }
        suma = res1 + res2 + res3 + res4 + res5 + res6 + res7 + res8 + res9;
        modo = suma % 10;
        tot = suma + 10 - modo;
        do {
            tot = tot - suma;
            System.out.println("el numero de cedula es correcto: " +tot+" = "+val10);

        } while (tot > val10);
    }
}
