
package trabajoparimpar;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Parimparejecutable {
    public static void main(String[] args) {
        double num;
        Parimpar pa=new Parimpar();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num=sc.nextDouble();
        
        pa.num_parimpar(num);    
    }
}
