
package modulo2;

import java.util.Scanner;

public class Modulo2switch {
    public static void main(String[] args) {
       int num;
       int op;
       int op2;
     
       System.out.println("BIENVENIDOS");
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la edad");
        num=sc.nextInt();
             
       
             if(num>=1 && num<=14){
                 System.out.println(+num+" Niño");
             }
             if (num>=15 && num<=20){
                 System.out.println(+num+" Adolecente");
             }
             if(num>=21 && num<=64){
                 System.out.println(+num+" Adulto");
             }
             if(num>=65 && num<=120){
                 System.out.println(+num+" Adulto Mayor");
             }
             if(num>121) {
                 System.out.println(+num+" La edad no es adecuada");
             }
        do{
        System.out.println("Desea repetir el programa");
        System.out.println("1.Si");
        System.out.println("2.No");
        op=sc.nextInt();
        switch(op){  
            case 1:
            do{
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
            System.out.println("Desea repetir el programa");
            System.out.println("1.Si");
            System.out.println("2.No");
            op2=sc.nextInt();
            if(op2==2){
                System.out.println("Adios");
            }
            }while (op2==1);
     break;
            case 2:
                System.out.println("Adios");
                break;     
        }
        }while(op==2);
    }   
}
