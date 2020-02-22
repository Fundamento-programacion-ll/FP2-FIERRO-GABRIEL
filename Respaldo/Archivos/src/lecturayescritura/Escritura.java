
package lecturayescritura;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escritura {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\Programacion\\Buffer.txt");
            dos=new DataOutputStream(fos);
            String [] productos ={"Resma de papel", "Lapices", "Boligrafos", "Carteras", "Mesas" };
            int [] unidades = {5,7,8,12,30};
            Double [] precio ={30.0,40.5,8.77,2.01,3.99};
            
            for (int i = 0; i < productos.length ; i++) {
                dos.writeChars(productos[i]);
                dos.writeChar('\n');
                dos.writeInt(unidades[i]);
                dos.writeChar('\t');
                dos.writeDouble(precio[i]);   
            }
            System.out.println("Escritura de datos realizada");    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Escritura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Escritura.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dos.close();
                fos.close();
            } catch (IOException ex) {
            }
        }
    }
}
