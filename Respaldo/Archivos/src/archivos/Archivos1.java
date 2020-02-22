package archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Archivos1 flujo=new Archivos1();
        
        String archivoOrigen = null;
        String archivoDestino = null;
        
        flujo.copiaBytetoByte(archivoOrigen, archivoDestino);
    }
    private void copiaBytetoByte (String archivoOrigen , String archivoDestino){
        Scanner sc=new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        System.out.println("Ingrese el archivo de origen");
        archivoOrigen=sc.next();
        
        System.out.println("Ingrese el destino del archivo");
        archivoDestino=sc.next();
        try {
            in=new FileInputStream(archivoOrigen);
            out=new FileOutputStream(archivoDestino);
            
            int b=0;
            while((b=in.read())!=-1){
                out.write(b);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
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
