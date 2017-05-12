/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swi1;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class Swi1 {

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
           case "A":
                System.out.println("desarrollo");
               break;
           case "B":
                System.out.println("recursos humanos");
               break;
           case  "C":
                System.out.println("finanzas");
               break;
           default :
                  System.out.println("departamento invalido"); 
                
                
          }
    
}
}