
package trabajoenclase;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        String nombres[];
        int n;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del vector");
        n=sc.nextInt();
        
        nombres=new String[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Ingrese nombre "+(i+1));
            nombres[i]=sc.next();
            
        }
        for(int i=0; i<n; i++){
            System.out.println("Los nombres ingresados son: "+nombres[i]);
        }
        }
        
    }
