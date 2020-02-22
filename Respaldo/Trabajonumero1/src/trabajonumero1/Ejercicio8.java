
package trabajonumero1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String cadena;
        int longitud;
        String mitad;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Mitad de la cadena de caracteres");
        System.out.println("Ingrese su cadena de caracteres");
        cadena=sc.nextLine();
        
        longitud=cadena.length();
        mitad=cadena.substring(0, (longitud/2));
        System.out.println("La primera mitad de la cadena escrita es: "+mitad);
        
        
    }
}
