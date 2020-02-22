
package matrices;

import java.util.Scanner;

public class Matrisej1 {
    public static void main(String[] args) {
        int f;
        int c;
        double acum=0;
        int cont=0;
        double promedio=0;
        Scanner sc=new Scanner(System.in);
        Matices1clase2 mat1=new Matices1clase2();
        
        System.out.println("Ingrese el numero de filas");
        f=sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        c=sc.nextInt();
        
        double [][]notas=new double[f][c];
        //incersion de datos
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.println("Ingrese la calificacion: ");
                notas[i][j]=sc.nextDouble();
                acum=acum+notas[i][j];
                cont++;
            }
        } 
        //Impresion de datos
        System.out.println("calificaciones");
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                
            }
        }
        mat1.promedioxD(acum, cont);
    }
    
}
