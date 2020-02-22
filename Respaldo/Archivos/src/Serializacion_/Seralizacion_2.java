
package Serializacion_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Seralizacion_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner (System.in);
        String ar;
        String nombre;
        String color;
        int edad;
        
        try {
            Serializacion_1 ej= new Serializacion_1();
        
            System.out.println("--Ingreso de datos--");
            System.out.println("ingresar nombre del gato");
            nombre=sc.next();
            ej.setNombre(nombre);
            System.out.println("ingresar color del gato");
            color=sc.next();
            ej.setColor(color);

            System.out.println("ingresar edad del gato");
            edad=sc.nextInt();
            ej.setEdad(edad);
            
            FileOutputStream fos= null;
            ObjectOutputStream oos=null;
            
            fos = new FileOutputStream ("C:\\Users\\HP\\Desktop\\Programacion\\Serilalizacion.txt");
            oos= new ObjectOutputStream (fos);
            
            oos.writeObject (ej);
            oos.close();
            fos.close();
        }catch (FileNotFoundException ex){
        Logger.getLogger(Serializacion_1.class.getName()).log(Level.SEVERE,null,ex);
        }catch (IOException ex){
        Logger.getLogger(Serializacion_1.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
    
    
    

    

