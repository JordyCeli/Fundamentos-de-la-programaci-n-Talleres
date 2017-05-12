/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app08;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class App08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Calcular el costo de un terreno
        Scanner nom=new Scanner(System.in);
      int hora;
      int min=60;
      int seg=60;
      int dia=24;
      double totm;
      double tots,totd;
      //ingreso de datos
        System.out.println("ingrese la hora :");
        hora=nom.nextInt();
        //proceso
     totm=hora*min;
     tots=totm*seg;
     totd=hora/dia;        
        //resultado
        System.out.println(""+hora+" hora tiene "+totm+ " minutos tiene " +tots +" segundos y "+totd+" en dias " );
    }
    
}
