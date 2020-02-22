







package trabajonumero1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        String cad1;
        String cad2;
        String sub1;
        String sub2;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Union de dos frases");
        System.out.println("Ingrese la primera frase");
        cad1=sc.nextLine();
        System.out.println("Ingrese la segunda frase");
        cad2=sc.nextLine();
        
        sub1=cad1.substring(0, 10);
        sub2=cad2.substring(0, 10);
        System.out.println("L union de los 10 caracteres de cada frase es: "+sub1+sub2);
                
    }
}
