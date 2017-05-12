/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app01;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class App01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //para pedir datos al usuario
        Scanner nom=new Scanner(System.in);
       //Creacion de variables
        String nombre;
        int valor=0;
        double valor1=380.3;
        double valor2=12;
        int res;
        double res2;
        //solicitud de variables
        System.out.println("ingrese su nombre"); 
        nombre=nom.next();
        System.out.println("ingrese su sueldo mensual");
        valor=nom.nextInt();
        
        //realizacion de operacion
        
        res2=valor2*valor1;
      
        //el */n hace un salto de linea
        //salida de datos
        System.out.println("el sueldo de "+nom +"es"+res2); 
       
    } 
}