
package ejercicios;

import java.util.Scanner;

public class Ejercicio3ejecutable {
    public static void main(String[] args) {
            int cont;
            cont=1;
            int n;
            double num;
            
            Scanner sc=new Scanner(System.in);
            Ejercicio3 eje3=new Ejercicio3();
            
            System.out.println("Ingrese la cantidad de numeros");
            n=sc.nextInt();
            
            do{
                System.out.println("Ingrese un valor ");
                num=sc.nextDouble();
                eje3.multiplos3y5(num);
                cont++;
            }while(cont<=n);
            eje3.multiplos2();
            eje3.multiplos5();
    }
}
