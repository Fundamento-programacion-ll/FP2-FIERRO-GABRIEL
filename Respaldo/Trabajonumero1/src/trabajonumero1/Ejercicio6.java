
package trabajonumero1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        double cat1;
        double cat2;
        double hipo;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Hipotenusa de un triangulo");
        System.out.println("Ingrese el valor del primer cateto");
        cat1=sc.nextDouble();
        System.out.println("Ingrese el valor del segundo cateto");
        cat2=sc.nextDouble();
        
        hipo=Math.hypot(cat1, cat2);
        System.out.println("La hipotenusa del triangulo es "+hipo);
                
        
    }
}
