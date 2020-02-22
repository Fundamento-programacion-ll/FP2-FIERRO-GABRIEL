
package estructurawhile;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Clasewhile {
    public static void main(String[] args) {
        
        String usuario="";
        String clave="";
        
        Scanner sc=new Scanner(System.in);
        
        while (!usuario.equals("gabriel") && !clave.equals("abc1234")){
            System.out.println("Ingrese el usuario");
            usuario=sc.next();
            System.out.println("Ingrese  la clave");
            clave=sc.next();
        }
        System.out.println("BIENVENIDO");
    }
}
