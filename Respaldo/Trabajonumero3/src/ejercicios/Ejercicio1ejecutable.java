
package ejercicios;

import java.util.Scanner;

public class Ejercicio1ejecutable {
    public static void main(String[] args) {
            int cont;
            cont=1;
            int n;
            double num;
            
            Scanner sc=new Scanner(System.in);
            Ejercicio1 eje1=new Ejercicio1();
            
            System.out.println("Ingrese la cantidad de numeros");
            n=sc.nextInt();
            
            do{
                System.out.println("Ingrese un valor ");
                num=sc.nextDouble();
                eje1.num_parimpar(num);
                cont++;
            }while(cont<=n);
            eje1.sumapares();
            eje1.sumaimpares();
            
    }
}
