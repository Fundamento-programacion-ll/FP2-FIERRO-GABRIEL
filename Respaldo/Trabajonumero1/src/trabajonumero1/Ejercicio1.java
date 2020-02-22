
package trabajonumero1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double r;
        double a;
        double n;
        double n1;
        double t;
        double v;
        System.err.println("Area y volumen de un cilindro");               
        System.out.println("Ingrese el radio del cilindro:");
        r=sc.nextDouble();
        System.out.println("Ingrese el altura del cilindro");
        a=sc.nextDouble();
        
        n=2*(Math.PI)*r*a;
        n1=(Math.PI)*(Math.pow(r,(2)));
        t=(2*(n1))+n;
        
        v=n1*(a);
        System.out.println("El area es:"+t);
        System.out.println("El volumen es:"+v);
        
    }
    
}
