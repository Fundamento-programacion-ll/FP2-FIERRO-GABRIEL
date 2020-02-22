
package Deber;

import java.util.Scanner;

public class Ejercicio3ejecutable {
    public static void main(String[] args) {
        
        int i;
        int n;
        String letra;
              
        Scanner sc=new Scanner (System.in);
        Ejercicio3 ej=new Ejercicio3();
        
        do{
            
        System.out.println("ingresar la cantidad de nombres a ingresar:");
        n=sc.nextInt();
        
        String nombres[]=new String[n];  
        
        for(i=0;i<n;i++){
        System.out.println("Ingresar el nombre"+(i+1));
        nombres[i]=sc.next();
        }
        for (i=0;i<n;i++){
            ej.nombres(nombres,i);  
        }
            sc.nextLine();
            System.out.println("Desea hacerlo nuevamente");
            System.out.println("s/n");
            letra=sc.nextLine().toLowerCase();
    }while (!letra.equalsIgnoreCase("n"));
    }
}