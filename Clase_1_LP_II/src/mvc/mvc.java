
package mvc;

import modelo.persona;
import vista.usuario;

public class mvc {
        public static void main(String[] args) { 
        usuario inicio = new usuario();
        persona gabriel=new persona("Gabriel", "Fierro", "Carcelen", true, "1752509206", 19, "0996174424", 'm');
        persona gabriel1=new persona("Gabriel1", "Fierro", "Carcelen", true, "1752509206", 19, "0996174424", 'm');
        persona gabriel2=new persona("Gabriel2", "Fierro", "Carcelen", true, "1752509206", 19, "0996174424", 'm');
        
//        System.out.println(gabriel);
        inicio.menu();
    }
}
