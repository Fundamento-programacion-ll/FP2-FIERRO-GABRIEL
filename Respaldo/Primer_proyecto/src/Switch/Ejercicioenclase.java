
package Switch;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicioenclase {
    public static void main(String[] args) {
        
        String op;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese los caracteres a evaluar");
        op=sc.next();
        //touppercase(); transforma los caracteres a mayuscula
        //toowercase(); transforma los caracteres a minuscula
        
        
        switch(op){
            case "l":System.out.println("Lunes");
            break;
            case "m":System.out.println("Martes");
            break;
            case "mi":System.out.println("Miercoles");
            break;
            case "j":System.out.println("Jueves");
            break;
            case "v":System.out.println("Viernes");
            break;
            case "s":System.out.println("Sabado");
            break;
            case "d":System.out.println("Domingo");
            break;
            default:System.out.println("No existe");
            break;
        }
        
    }
}
