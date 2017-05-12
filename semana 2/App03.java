/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app03;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class App03 {
static String nombre="jordy";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Calcular la edad del profesor 
        Scanner nom=new Scanner(System.in);
       //Creacion de variables
        String nombre;
        int diana,mesna,aniona;
        int diac=31,mesac=1,anioac=2017;
        int dia,mes,anio;
        //solicitud de variables
        //año de nacimiento
        System.out.println("ingrese su nombre"); 
        nombre=nom.next();
        System.out.println("ingrese dia de nacimiento");
        diana=nom.nextInt();
         System.out.println("ingrese mes de nacimiento");
       mesna=nom.nextInt();
        System.out.println("ingrese anio de nacimiento");
        aniona=nom.nextInt();
        //calculacion de datos
        dia=diac-diana;
        mes=mesac-mesna;
        anio=anioac-aniona;
        
      //resultado
        System.out.println(""+nombre+" tiene "+anio+" años con "+mes+" meses y "+dia+" dias ");
 
    
 }
}
