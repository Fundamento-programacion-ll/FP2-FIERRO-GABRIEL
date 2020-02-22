
package Switch;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Switch {
    public static void main(String[] args) {
        
        int op;
        
        Scanner sc=new Scanner(System.in);
        
       menu();
        op=sc.nextInt();
        
        switch(op){
            case 1:System.out.println("Hola");
            break;
            case 2:System.out.println("Adios");
            break;
            case 3:System.out.println("Que fue");
            break;
            default:System.out.println("Esa opcion no existe");
            break;
        }
    }
    
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1.Saludo");
        System.out.println("2.Despedida");
        System.out.println("3.Comunicacion");
        System.out.println("Escoja la opcion que desee");
    }
}
