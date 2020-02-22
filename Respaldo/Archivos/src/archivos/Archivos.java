
package archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {

    public static void main(String[] args) {
        
        Archivos flujo=new Archivos();
        
        String archivoOrigen = "C:\\Users\\HP\\Desktop\\Programacion\\Ejercicio1archivos.txt";
        String archivoDestino = "C:\\Users\\HP\\Desktop\\Programacion\\Respalo_Ejercicio1archivos.txt";
        
        flujo.copiaBytetoByte(archivoOrigen, archivoDestino);
        
        
    }
    private void copiaBytetoByte (String archivoOrigen , String archivoDestino){
        FileInputStream in= null;
        FileOutputStream out= null;
        
        try {
            in=new FileInputStream(archivoOrigen);
            out=new FileOutputStream(archivoDestino);
            
            int b=0;
            while((b=in.read())!=-1){
                out.write(b);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado "+ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de lectura de bytes "+ex.getMessage());
        }finally{
            try {
                in.close();
                out.close();
            } catch (IOException ex) {
                System.out.println("No se pudo cerrar los flujos I/O "+ ex.getMessage());
            }
        }
    }  
}
