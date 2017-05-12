/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicion2;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class Condicion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        // peticion de variables
        int empleado,a=0,h,sueldo;
        String nom;
       // ingreso de datos
        System.out.println("ingrese el numero de empleados");
        empleado=op.nextInt();
        while(a<empleado){
            //ingreso de datos
            System.out.println("ingrese nombre");
             nom=op.next();
            System.out.println("ingrese las horas");
            h=op.nextInt();
                if (h>=1){
                    sueldo=h*15;
                    //salida de datos
                    System.out.println("su sueldo es "+sueldo);
                }
                
                 a++;
                }
           
        }
    
    
}
