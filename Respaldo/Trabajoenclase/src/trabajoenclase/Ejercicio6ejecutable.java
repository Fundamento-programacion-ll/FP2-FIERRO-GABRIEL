
package trabajoenclase;

import java.util.Scanner;

public class Ejercicio6ejecutable {
    public static void main(String[] args) {
         int numeros[];
         int numeros2[];
        int n;
        int acum=0;
        
        Scanner sc=new Scanner(System.in);
        Ejercicio6 eje6=new Ejercicio6();

        numeros=new int[3];
        numeros2=new int[3];
        
        System.out.println("PRIMER VECTOR");
        for(int i=0; i<3; i++){
            System.out.println("Ingrese el numero "+(i+1));
            numeros[i]=sc.nextInt();
            eje6.suma(numeros, numeros2,i);
        }
        System.out.println("SEGUNDO VECTOR");
         for(int i=0; i<3; i++){
            System.out.println("Ingrese el numero "+(i+1));
            numeros2[i]=sc.nextInt();
            eje6.suma(numeros, numeros2,i);
        }
 
        System.out.println("SUMA");
        for(int i=0; i<1; i++){
            System.out.println(numeros[0]+"+"+numeros2[0]+"="+eje6.resultado());
            System.out.println(numeros[1]+"+"+numeros2[1]+"="+eje6.resultado2());
            System.out.println(numeros[2]+"+"+numeros2[2]+"="+eje6.resultado3());
        }
        }
    }
