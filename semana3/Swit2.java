/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swit2;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class Swit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner op=new Scanner(System.in);
        // declaracion de variables
         String departamento;
        System.out.println("ingrese el deparatemento");
        departamento=op.next();
          switch(departamento)
          {
           case "lunes":
                System.out.println("desarrollo Espiritual");
               break;
           case "martes":
                System.out.println("logica matematica");
               break;
           case  "miercoles":
                System.out.println("programacion");
               break;
           case "jueves":
               System.out.println("fisica I");
               break;
           case "viernes":
               System.out.println("farra");
               break;
           default :
                  System.out.println("dia invalido"); 
                
                
          }
    
    }
    
}
