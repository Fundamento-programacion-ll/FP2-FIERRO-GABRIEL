
package dowhile;

import java.util.Scanner;

public class Clasedowhile {
    public static void main(String[] args) {
        String genero;
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.println("Ingrese su genero");
            genero=sc.next();
        }while(!genero.equalsIgnoreCase("femenino"));
        
    }
}
