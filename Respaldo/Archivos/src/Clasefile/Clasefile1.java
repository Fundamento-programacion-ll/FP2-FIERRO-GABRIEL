
package Clasefile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clasefile1 {
    
    public static void main(String[] args) {
        Clasefile1 f =new Clasefile1();
        
        String archivo = "C:\\Users\\HP\\Desktop\\Programacion\\Clasefile4.txt";
        f.impresionDatosArchivo(archivo);
    }
 
       private void impresionDatosArchivo (String archivo){
         Calendar hoy = Calendar.getInstance();
         SimpleDateFormat sdf =new SimpleDateFormat ("EEEEE,dd-MMMMM-yyyy HH:mm:ss:SSS");
         File file=new File(archivo);
         if (file != null && file.exists()){
             System.out.println("\nEl archivo("+file.getName()+ ") existe..");
             System.out.println("Directorio:"+file.getParent());
             hoy.setTimeInMillis(file.lastModified());
             
             System.out.println("Modificado : "+ sdf.format(hoy.getTime()));
             System.out.println("Tamaño : " + ((double)file.length()) / 1024 + "Kb");
             
             if (file.canRead()){   
                 System.out.println("(" +file.getName()+ ") tiene permiso de lectura");
             }else{
                 System.out.println("(" +file.getName()+ ") no tiene permiso de lectura");
             }
             
             
          if (file.canWrite()){
              System.out.println("(" +file.getName()+ ") tiene permisos de escritura");      
         }else{
              System.out.println("(" +file.getName()+ ") no tiene permisos de escritura");
          }
          
             if (file.canExecute()){
              System.out.println("(" +file.getName()+ ") tiene permisos de ejecucion");      
         }else{
              System.out.println("(" +file.getName()+ ") no tiene permisos de ejecucion");
          }         
         }else {
          try {
              System.out.println("\nArchivos ("+file.getName() + ") no existe procediendo a crearlo..." );
              file.createNewFile();
              String nuevoArchivo = file.getPath();
              impresionDatosArchivo(nuevoArchivo);
          } catch (IOException ex){
              System.out.println("no se pudo crear el archivo"+ ex.getMessage());
          }   
             
         }   
       }
}