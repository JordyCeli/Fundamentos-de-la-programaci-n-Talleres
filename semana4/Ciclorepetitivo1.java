/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclorepetitivo1;

/**
 *
 * @author Jordy
 */
public class Ciclorepetitivo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0,res=0;
        //while()condicion
        while (a<=12){
            //procesos
             res=a%2;
             if (res==0){
                 System.out.println(+a+" es par");
             }else{
                 System.out.println(a+" impar");
             }
            //contador
            a++;
        }
    }
        
    
}
