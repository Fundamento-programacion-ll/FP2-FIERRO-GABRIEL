
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerxD {
    public static void main(String[] args) {
        List<Double> numeros= new ArrayList<Double>();
        File f=new File("C:\\Users\\HP\\Desktop\\Programacion\\Scanner.txt");
        try {
            Scanner sc=new Scanner(f);
            sc.useDelimiter(" ");
            while(sc.hasNextDouble()){
                Double d=new Double(sc.nextDouble());
                numeros.add(d);
            }
            for(Double numero : numeros){
                System.out.println("El numero es: "+numero.doubleValue());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No existe el archivo "+ex.getMessage());
        }
    }
}
