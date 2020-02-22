
package trabajoenclase;

import java.util.Scanner;

public class Ejercicio5ejecutable {
    public static void main(String[] args) {
        int f;
        int c;
        Scanner sc=new Scanner(System.in);
        Ejercicio5 eje5=new Ejercicio5();
        
        System.out.println("Ingrese el numero de filas");
        f=sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        c=sc.nextInt();
        
        double [][]numeros=new double[f][c];
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.println("Ingrese el numero: ");
                numeros[i][j]=sc.nextDouble();
                eje5.numeromayor(numeros, i, j);
            }
        } 
        System.out.println(eje5.resultado());
    }
}
