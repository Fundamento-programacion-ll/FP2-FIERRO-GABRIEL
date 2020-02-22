
package pruebafinal;

import java.util.Scanner;

public class Pruebafinal {
    public static void main(String[] args) {
        int f;
        int c;
        double acum=0;
        int cont=0;
        double promedio=0;
        int suma;
        Scanner sc=new Scanner(System.in);
        Pruebaclase2 prf=new Pruebaclase2();
        
        System.out.println("Ingrese el numero de filas");
        f=sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        c=sc.nextInt();
        
        int [][]numero=new int[f][c];
        //incersion de datos
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.println("Ingrese el numero: ");
                numero[i][j]=sc.nextInt();
                acum=acum+numero[i][j];
                prf.suma(numero, i, j,f,c);
                cont++;            
            }
        } 
        //promedio
        System.out.println("PROMEDIO");
        promedio=acum/cont;
        System.out.println("La suma de las notas es: "+acum);
        System.out.println("La cantidad de notas ingresadas son: "+cont);
        System.out.println("El promedio de las notas es de: "+promedio);
        
        //suma
        System.out.println("SUMA");
        System.out.println("La suma es:"+prf.resultado());
        System.out.println("La multiplicacion es: "+prf.resultadomultiolicacion());
    }
}
