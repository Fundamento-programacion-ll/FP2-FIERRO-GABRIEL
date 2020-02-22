
package trabajoenclase;

import java.util.Scanner;



public class Ejercicio10ejecutable {
    public static void main(String[] args) {
         int f;
        int c;
        double acum=0;
        int cont=0;
        double promedio=0;
        int suma;
        Scanner sc=new Scanner(System.in);
        Ejercicio10 prf=new Ejercicio10();
        
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
                prf.suma(numero, i, j, f, c);
            }
        } 
        System.out.println("SUMA");
        System.out.println(prf.Resultado());
    }
}
