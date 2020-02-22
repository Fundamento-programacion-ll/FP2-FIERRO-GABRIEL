
package vectores;
import java.util.Scanner;

public class Vector1 {
    public static void main(String[] args) {
        int n;
        String nombres[];
        int edad[];
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del vector");
        n=sc.nextInt();
        
        nombres=new String[n];
        edad=new int[n];
        
        Vector1clase2 vec1=new Vector1clase2();
        
        for(int i=0; i<n; i++){
            System.out.println("Ingrese nombre");
            nombres[i]=sc.next();
            System.out.println("Ingrese la edad");
            edad[i]=sc.nextInt();
        vec1.edadmayor(edad, nombres, n);
    }
    System.out.println(vec1.resultado());
    }   
}  
