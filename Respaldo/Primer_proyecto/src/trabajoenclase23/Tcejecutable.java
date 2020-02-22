
package trabajoenclase23;

import java.util.Scanner;

public class Tcejecutable {
    public static void main(String[] args) {
        int n;
        int num;
        int cont;
        cont=1;
        
        Scanner sc=new Scanner(System.in);
        Tc tc1=new Tc();
        
        System.out.println("Ingrese los valorea a evaluar");
        n=sc.nextInt();
        
        while(cont<=n){
            System.out.println("Ingrese un valor");
            num=sc.nextInt();
            cont++;
            tc1.multiplos(num);
        }
    }
}
