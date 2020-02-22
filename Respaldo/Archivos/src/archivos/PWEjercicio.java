
package archivos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PWEjercicio {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int xD;
        int tam;
        int i=0;
        try {
            PrintWriter pr=new PrintWriter("C:\\Users\\HP\\Desktop\\Programacion\\pr1.txt"); 
            System.out.println("Escriba lo que desea imprimir en el archivo");
            xD=sc.nextInt();
            pr.print(xD);
            pr.print("\t");
            pr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No existe el archivo..."+ex.getMessage());
        }
    }
}
