
package dowhile;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double num;
        
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un numero");
            num=sc.nextDouble();
        }while(num!=0);
    }
}