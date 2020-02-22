

package archivos;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class ClaseFormatter {
    public static void main(String[] args) {
        Formatter fmtCon = new Formatter(System.out);
        fmtCon.format("Este es un numero negativo: %(.3f\n", -123.34);
        fmtCon.format("%8s %8s\n", "Value", "Square");
        for( int i=1;i<5 ;i++){
            fmtCon.format("%8s %8s\n", i, i*i);
        }
        Formatter fmtFile = null;
        try {
            fmtFile = new Formatter("C:\\Users\\HP\\Desktop\\Programacion\\Formatter.txt");
            fmtFile.format("Este es un numero negativo: %(.2f\n\n", -123.34);
            fmtFile.format("%8s %8s\n", "Value", "Square");
            for(int i =1; i<20; i++){
                fmtFile.format("%8s %8s\n", i, i*i);
            }
            System.out.println("\nDatos guardados correctamente");
        } catch (FileNotFoundException ex) {
            System.out.println("No se puede abrir el archivo "+ex.getMessage());
        } finally {
            fmtFile.close();
        }
    }
}
