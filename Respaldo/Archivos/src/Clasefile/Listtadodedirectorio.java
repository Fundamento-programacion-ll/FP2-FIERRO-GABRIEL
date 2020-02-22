
package Clasefile;

import java.io.File;
import java.io.IOException;

public class Listtadodedirectorio {
    private static final String dir_inicial = "C:\\Users\\HP\\Desktop\\Programacion";
    public static void main(String[] args) {
        Listtadodedirectorio d = new Listtadodedirectorio();
        d.imprimirContenido(dir_inicial);
    }
    
    private void imprimirContenido(String dir_inicial){
        File directorio = new File(dir_inicial);
        if(directorio != null && directorio.exists() && directorio.isDirectory()){
            File[] archivos = directorio.listFiles();
            if (archivos != null && archivos.length > 0 ){
                System.out.println("\nDirectorio : "+directorio.getAbsolutePath());
                for (File tmpArchivo : archivos){
                    if(tmpArchivo != null && tmpArchivo.isDirectory()){
                        imprimirContenido(tmpArchivo.getPath());
                    } else {
                        if (tmpArchivo != null && tmpArchivo.isFile()){
                            System.out.println("Archivo : "+tmpArchivo.getName() + "; Tamaño " + ((double) tmpArchivo.length()) / 1024 + " kb" );
                        }
                    } 
                }
            } else {
                try {
                    System.out.println("\nDirectorio .- " + directorio.getCanonicalPath() + " \nNO tiene archivos");
                } catch (IOException ex ) {
                    System.out.println(ex.getMessage());
                } 
            }
        } else {
            System.out.println("\n "+" El directorio " +directorio.getName()+ " no existe " );
        } 
    }
}
