
package estructura_for;

import java.util.Scanner;

public class Ejenclase4puntosxD_Ejecutable {
    public static void main(String[] args) {
        String nom;
        double calif;
        int n;
        
        Scanner sc= new Scanner(System.in);
        Ejenclase4puntosxD c=new Ejenclase4puntosxD();
        
            System.out.println("Ingrese la cantidad de estudiantes: ");
            n=sc.nextInt();
            
            for(int i=1; i<=n;i++){
                System.out.println("Ingrese el nombre del estudiante" + i+" : ");
                nom=sc.next();
                System.out.println("Ingrese la calificación del estudiante: "+i);
                calif=sc.nextDouble();
                c.sumacalif(calif);
                c.califmaymen(calif);
            }    
        System.out.println("El promedio del curso es: "+c.promedio());
        System.out.println(c.resultado());
    }     
}
