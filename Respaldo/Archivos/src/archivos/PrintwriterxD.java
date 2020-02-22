
package archivos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintwriterxD {
    public static void main(String[] args) {
        try {
            PrintWriter pr=new PrintWriter("C:\\Users\\HP\\Desktop\\Programacion\\pr.txt");
            pr.print("Hola mundo");
            pr.print('\t');
            pr.print(29.89F);
            pr.print('\t');
            pr.print(true);
            pr.print('\t');
            pr.print(135);
            pr.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("No existe el archivo "+ex.getMessage());
        }
    } 
}
