/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional2;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class Condicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaracion de variables
        Scanner op=new Scanner(System.in);
        int asis;
        double notapri,notaseg,notf;
        double suple1;
        double suple2;
        double totsup;
        int num=0;
        //ingreso de datos
        System.out.println("ingrese nota del primer bimestre");
        notapri=op.nextDouble();
        System.out.println("ingrese nota del segundo bimestre");
        notaseg=op.nextDouble();
        System.out.println("ingrese la asistencia");
        asis=op.nextInt();
        //operacion
        notf=notapri+notaseg;
        //resultado
        if ((notf>=28)&&(asis>=49)){
            System.out.println("usted esta aprobado");
          }else{
              System.out.println("usted ha reprobado"+"\ntiene derecho a dar supletoio");
              if (notapri<notaseg){
                  System.out.println("ingrese la nota del supletorio del primer bimestre");
                  suple1=op.nextDouble();
                  notapri=suple1;
                      totsup=notapri+notaseg;
                      if(totsup>=28){
                          
                          System.out.println("Usted ha aprobado");
                          
              }else if (notaseg<notapri){
                      System.out.println("ingrese la nota del supletorio del segundo bimestre");
                  suple2=op.nextDouble();
              }else{
                  System.out.println("ingrese 1 si va a dar supletorio del primer bimestre presione 2 si va dar el supletorio del segundo bimestre");
                  num=op.nextInt();
              }if(num==1){
                  System.out.println("usted ha elegido a dar el supletorio del primer bimestre");
                   System.out.println("Ingrese nota del supletorio 1");
                   suple1=op.nextDouble();
            }   
    }
    }
}
}