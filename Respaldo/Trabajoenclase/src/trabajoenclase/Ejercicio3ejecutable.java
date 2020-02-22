
package trabajoenclase;

import java.util.Scanner;

public class Ejercicio3ejecutable {
    public static void main(String[] args) {
        int numeros[];
        int n;
        int acum=0;
        
        Scanner sc=new Scanner(System.in);
        Ejercicio3 eje3=new Ejercicio3();
        
        System.out.println("Ingrese la dimension del vector");
        n=sc.nextInt();
        
        numeros=new int[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Ingrese el numero "+(i+1));
            numeros[i]=sc.nextInt();
            acum=acum+numeros[i];
            eje3.suma(numeros, acum,n);
        }
        for(int i=0; i<n; i++){
            System.out.println("Los numeros ingresados son: "+numeros[i]);

        }
        System.out.println("La suma de los numeros ingresados es: "+eje3.resultado());
        }
    }
