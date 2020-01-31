/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author SISTEMAS
 */
public class NewClass {
    
    public static void main(String[] args) {
        perro perrito=new perro(10, "perro" , "masculino", "simurdiera", 5);
        perrito.datosPerro();
        herenciasclase1 extra = new herenciasclase1("blanco", "familia rosas");
        extra.datosExtra();
        
        
    }
    
}
