
package estructura_selectiva;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio_ejecutable {
    public static void main(String[] args) {
        double num;
        
        Scanner sc=new Scanner(System.in);
        //instanciar clase
        Ejercicio_if ej=new Ejercicio_if();
        
        System.out.println("Ingrese un valor");
        num=sc.nextDouble();
        
        ej.num_pos_neg(num);
        
    }
}
