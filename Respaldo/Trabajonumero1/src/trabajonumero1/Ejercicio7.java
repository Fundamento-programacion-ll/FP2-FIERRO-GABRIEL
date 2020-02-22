
package trabajonumero1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena;
        int longitud;
        char letra;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Cadena de caracteres");
        System.out.println("Ingrese su nombre");
        cadena=sc.next();
        letra=cadena.charAt(2);
        System.out.println("La letra en la posicion 3 es ;"+letra);
    }
}
