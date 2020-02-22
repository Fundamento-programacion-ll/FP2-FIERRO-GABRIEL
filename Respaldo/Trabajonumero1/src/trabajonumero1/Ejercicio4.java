
package trabajonumero1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        double v;
        double t;
        double d;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Calcular la distania recorrida");
        System.out.println("Ingrese la velocidad del movil(m/s)");
        v=sc.nextDouble();
        System.out.println("Ingrese el tiempo del trayecto(s)");
        t=sc.nextDouble();
        
        d=v*t;
        System.out.println("La distancia que recorrio el movil es de; "+d+" metros");
                
    }
    
}

