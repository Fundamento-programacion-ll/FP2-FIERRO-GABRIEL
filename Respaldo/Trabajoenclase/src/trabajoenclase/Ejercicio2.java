
package trabajoenclase;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombres[];
        int num[];
        
        Scanner sc=new Scanner(System.in);
               
        nombres=new String[2];
        num=new int[2];
        
        for(int i=0; i<2; i++){
            System.out.println("Ingrese nombre "+(i+1));
            nombres[i]=sc.next();
            System.out.println("Ingrese numero "+(i+1));
            num[i]=sc.nextInt();
        }
        for(int i=0; i<2; i++){
            System.out.println("Los nombres ingresados son: "+nombres[i]);
            System.out.println("Los numeros ingresados son: "+num[i]);
        }
    }
}
