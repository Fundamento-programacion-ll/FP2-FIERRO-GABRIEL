
package Serializacion_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serializacion_3 {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fis= null;
            ObjectInputStream ois=null;
            
            fis=new FileInputStream("C:\\Users\\HP\\Desktop\\Programacion\\Serilalizacion.txt");
            ois=new ObjectInputStream(fis);
            
            Serializacion_1 Gatorecuperado=(Serializacion_1)ois.readObject();
            System.out.println("Nombre del gato: "+Gatorecuperado.getNombre());
            System.out.println("Color del gato: "+Gatorecuperado.getColor());
            System.out.println("Edad del gato: "+Gatorecuperado.getEdad());
            
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex){
            
        } catch (ClassNotFoundException ex){
            
        }finally{
            
        }
    }
}
