
package trabajoenclase;

import java.util.Scanner;

public class Ejercicio9ejecutable {
    public static void main(String[] args) {
        int n;
        int notas[];
        int cont=0;
        int acum=0;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de notas");
        n=sc.nextInt();
      
        notas=new int[n];
        
        Ejercicio9 eje9=new Ejercicio9();
        
        for(int i=0; i<n; i++){
            System.out.println("Ingrese la calificacion "+(i+1));
            notas[i]=sc.nextInt();
            acum=acum+notas[i];
            cont++;
            eje9.media(notas, i, n, cont, acum);
            eje9.mayormedia(notas, i, n, cont, acum);
        }
        System.out.println("La media es: "+eje9.Resultado());
        System.out.println("La nota mayor a la media es: "+eje9.Mayor());
    }
}
