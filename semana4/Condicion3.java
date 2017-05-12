/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicion3;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class Condicion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        // peticion de variables
        int a,b=0,c,d=0;
        System.out.println("ingrese numero");
        a=op.nextInt();
        while(b<=a){
            //proceso
            a--;
            if (a%2==0){
                System.out.println(""+a);
                d++;
              if (d==4){
                c=a*36;
                System.out.println(""+c);
            
               }
            }
    
        }
    }
}