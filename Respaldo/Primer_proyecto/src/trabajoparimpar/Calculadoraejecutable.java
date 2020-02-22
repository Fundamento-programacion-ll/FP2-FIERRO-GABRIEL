
package trabajoparimpar;

import java.util.Scanner;


public class Calculadoraejecutable {
    public static void main(String[] args) {
        double num1;
        double num2;
        int op=0;
        
        Scanner sc=new Scanner(System.in);
        Calculadora c=new Calculadora();
       
        while(op!=5){
        
        menu ();
        op=sc.nextInt();
        
        System.out.println("Ingrese el primer numero");
        num1=sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2=sc.nextDouble();
        if (op<5 && op>0){
            switch(op){
            case 1:System.out.println("La suma es: "+c.suma(num1, num2));
            break;
            case 2:System.out.println("La resta es: "+c.resta(num1, num2));
            break;
            case 3:System.out.println("La multiplicacion es: "+c.multiplicacion(num1, num2));
            break;
            case 4:System.out.println(c.division(num1, num2));
            break;
            case 5:System.out.println("GRACIAS");
            break;
            default:System.out.println("No esxiste");  
        } 
        }   
        
    }
}
     public static void menu(){
        System.out.println("Menu");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Salir");
        
    }    
}


