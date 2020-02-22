
package lecturayescritura;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lectura {
    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream dis = null;  
        BufferedReader br = null;
        String producto;
        int unidad;
        double precio;
        double total = 0.0;
        
        try {
            fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Programacion\\Bufferej1.txt");
            dis = new DataInputStream(fis);
            
            while((producto = dis.readLine()) !=null){
                unidad=dis.readInt();
                dis.readChar();
                precio=dis.readDouble();
                System.out.println("has pedido: "+unidad+" "+producto+" a "+precio+" dolares");
                total +=precio*unidad;
            }
            System.out.println("Costo total del pedido: "+total+" dolares");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
                dis.close();
            } catch (IOException ex) {
                Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }   
}
