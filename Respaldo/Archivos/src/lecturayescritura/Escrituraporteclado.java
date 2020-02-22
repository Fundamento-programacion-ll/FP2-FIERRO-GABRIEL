package lecturayescritura;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escrituraporteclado {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        int tam;
        int i = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el archivo de origen");
        String archivoOrigen = sc.next();
        
        try {
            fos=new FileOutputStream(archivoOrigen);
            dos=new DataOutputStream(fos);
            
            System.out.println("Ingrese la cantidad de productos que desa comprar");
            tam=sc.nextInt();
            String  productos [] ;
            int  unidades [] ;
            double  precio [] ;
            productos =new String[tam];
            unidades =new int[tam];
            precio  =new double[tam];
            for(i=0;i<tam;i++){
                System.out.println("Escriba los productos que desea comprar");
                productos[i]=sc.next();
                System.out.println("Ingrese las unidades en existencia");
                unidades[i]=sc.nextInt();
                System.out.println("Ingrese el precio del producto");
                precio[i]=sc.nextDouble();
            }
            for (i = 0; i < tam ; i++) {
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
