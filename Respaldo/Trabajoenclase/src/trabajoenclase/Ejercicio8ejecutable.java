
package trabajoenclase;

import java.util.Scanner;

public class Ejercicio8ejecutable {
    public static void main(String[] args) {
        int n;
        String nombres[];
        int calificacion[];
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de alumnos");
        n=sc.nextInt();
        
        nombres=new String[n];
        calificacion=new int[n];
        
        Ejercicio8 eje8=new Ejercicio8();
        
        for(int i=0; i<n; i++){
            System.out.println("Ingrese nombre");
            nombres[i]=sc.next();
        }
        for(int i=0; i<n; i++){
            System.out.println("Ingrese la calificacion");
            calificacion[i]=sc.nextInt();
            eje8.calificacionesxD(calificacion,i,n);
        }
        //resultado
        for(int i=0; i<n; i++){
            System.out.println("El estudiante "+nombres[i]+" tiene una calificacion "+eje8.resultado());
        }

    }
}
