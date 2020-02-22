
package ejercicios;

import java.util.Scanner;

public class Ejercicio2ejecutable {
    public static void main(String[] args) {
            int n;
            double num;
            
            Scanner sc=new Scanner(System.in);
            Ejercicio2 eje2=new Ejercicio2();
            
            do{
                System.out.println("Ingrese un valor ");
                num=sc.nextDouble();
                eje2.posneg(num);
            }while(num!=0);
            eje2.positivos();
            eje2.negativos();
    }
}
