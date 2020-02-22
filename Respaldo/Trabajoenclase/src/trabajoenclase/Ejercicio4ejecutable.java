
package trabajoenclase;

import java.util.Scanner;

public class Ejercicio4ejecutable {
    public static void main(String[] args) {
         int numeros[];
        int n;
        int acum=0;
        int cont=0;
        
        Scanner sc=new Scanner(System.in);
        Ejercicio4 eje4=new Ejercicio4();

        numeros=new int[10];
        
        for(int i=0; i<10; i++){
            System.out.println("Ingrese el numero "+(i+1));
            numeros[i]=sc.nextInt();
            acum=acum+numeros[i];
            cont++;
            eje4.suma(numeros, acum, cont,i);
        }
        
        for(int i=0; i<10; i++){
            System.out.println("Los numeros ingresados son: "+numeros[i]);
        }
        System.out.println("La multiplicacion de los numeros ingresados es: "+eje4.resultado());
        
        
        
        
    }
}
