
package trabajonumero1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        
        double num1;
        double num2;
        double num3;
        double r;
        System.out.println("Perimetro de un Triangulo");
        System.out.println("Ingrese el lado 1:");
        num1=sc.nextDouble();
        System.out.println("Ingrese el lado 2:");
        num2=sc.nextDouble();
        System.out.println("Ingrese el lado 3:");
        num3=sc.nextDouble();
        
        r=num1+num2+num3;
        System.out.println("El perimetro es:"+r);
    }
    
}
