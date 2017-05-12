/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional1;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class Condicional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
       //declaracion de bariables
        String nom,ciu;
        String ciulo="loja";
        int ed,na;
         int ac=2017;
        //ingreso de datos
        System.out.println("ingrese su ciudad");
        ciu=op.next();
        System.out.println("ingrese nombre") ;
        nom=op.next();
        System.out.println("ingrese su anio de nacimiento");
        na=op.nextInt();
        //operacion
        ed=ac-na;
        //resultado
        if((ed>=17)&&(ciu.equals(ciulo))){
            System.out.println(""+nom+" debe votar en la ciudad"+ciulo);
            
        }else{
            System.out.println(""+nom+" no puede votar");
        } 
            
        
        
        
        
        
    }
    
}
