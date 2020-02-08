
package mvc;

import java.util.Scanner;
import modelo.persona;
import vista.usuario;

public class mvc {
        public static void main(String[] args) { 
        usuario inicio = new usuario();
        persona gabriel=new persona("Gabriel", "Fierro", "Carcelen", true, "1752509206", 19, "0996174424", 'm');
        persona gabriel1=new persona("Gabriel1", "Fierro", "Carcelen", true, "1752509206", 19, "0996174424", 'm');
        persona gabriel2=new persona("Gabriel2", "Fierro", "Carcelen", true, "1752509206", 19, "0996174424", 'm');
        
        System.out.println(gabriel);
        inicio.menu();
        
        
        Scanner obtenerNumero = new Scanner(System.in);
        String numero;
 
        System.out.print("indica el numero a calcular: ");
        numero = obtenerNumero.next();
        
        persona cedula=new persona(numero);
        cedula.setCedula(numero);
        if(cedula.verificarCedula(numero)==true){
            System.out.println("La cedula es correcta");
        }else{
            System.out.println("La cedula es incorrecta");
        }
//        System.out.println(cedula.verificarCedula(numero));    
        
        }
}
