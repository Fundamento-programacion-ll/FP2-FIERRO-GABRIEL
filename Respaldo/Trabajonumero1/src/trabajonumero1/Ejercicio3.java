
package trabajonumero1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double a;
        double t;
        System.err.println("Arista de un cubo");
        System.out.println("Ingrese la arista del cubo:");
        a=sc.nextDouble();
 
        t=Math.pow(a, (3));
        System.out.println("El volumen es:"+t);
    }
}
