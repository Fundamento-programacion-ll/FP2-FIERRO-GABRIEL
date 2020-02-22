
package ejercicios;

import java.util.Scanner;

public class Ejercicio5ejecutable {
    public static void main(String[] args) {
        double contraseña;
        Scanner sc=new Scanner(System.in);
        
        
        do{
            System.out.println("Ingrese su contraseña");
            contraseña=sc.nextDouble();
        }while(contraseña!=123 && contraseña!=124 && contraseña!=125);
    }
}
