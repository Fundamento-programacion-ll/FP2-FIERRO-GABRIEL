
package estructura_for;

import java.util.Scanner;

public class Ejenclase {
    public static void main(String[] args) {
        int num;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el número tope");
        num=sc.nextInt();
        for(i=0; i<=num; i=i+2){
            System.out.println("el número es: "+i);
        }
    }
}
