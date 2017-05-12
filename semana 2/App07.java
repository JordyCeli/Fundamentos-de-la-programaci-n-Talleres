/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app07;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class App07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //Calcular el costo de un terreno
        Scanner nom=new Scanner(System.in);
       //Creacion de variables
        int unit1,unit2,unit3;
      int ancho;
      int longitud;
      int metrocua;
      int costo=400;
      int total;
      //ingreso de datos
        System.out.println("ingrese el ancho del terreno");
        ancho=nom.nextInt();
        System.out.println("ingrese la longitud");
       longitud=nom.nextInt();
        //proceso
        metrocua=ancho*longitud;
        total=metrocua*costo;
        //resultado
        System.out.println("el total a pagar $" +total);
    }
    
}
