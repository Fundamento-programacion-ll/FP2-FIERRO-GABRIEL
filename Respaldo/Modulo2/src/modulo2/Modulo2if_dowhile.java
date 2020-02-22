
package modulo2;

import java.util.Scanner;

public class Modulo2if_dowhile {

    public static void main(String[] args) {
        int num;
        String op;
     
        System.out.println("BIENVENIDOS");
    do{    
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la edad");
        num=sc.nextInt();
                 
             if(num>=1 && num<=14){
                 System.out.println(+num+" La edad corresponde a un Niño");
             }
             if (num>=15 && num<=20){
                 System.out.println(+num+" La edad corresponde a un Adolecente");
             }
             if(num>=21 && num<=64){
                 System.out.println(+num+" La edad corresponde a un Adulto");
             }
             if(num>=65 && num<=120){
                 System.out.println(+num+" La edad corresponde a un Adulto Mayor");
             }
             if(num>121) {
                 System.out.println(+num+" La edad no es adecuada");
             }else if(num<1){
                 System.out.println(+num+" La edad no es adecuada");
             }

        System.out.println("Desea repetir el programa (si/no)");
        op=sc.next();
        if("no".equals(op)){
            System.out.println("Adios");
        }
     }while ("si".equals(op));
    }
}
