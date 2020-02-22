
package modulo2;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);
        int tam, elemento;
        int edades[];
        
        String op="";
        do{
            System.out.println("Ingrese el tamaño del arreglo");
            tam=ingreso.nextInt();
            edades=new int[tam];
            
            for (int i=0;i<tam;i++){
                System.out.println("Elemento "+(i+1)+": ");
                elemento=ingreso.nextInt();
                edades[i]=elemento;
            }
            
            System.out.println("\n\n**** elementos del arrgelo ****/n");
            for (int i=0;i<edades.length;i++){
                System.out.println("Posicion ("+ i +") - elemento: "+edades[i]);
            }
            System.out.println("\n\n desea continuar (s/n)?? :");
            op= ingreso.next();
            
            
        }while(op.equals("S") || op.equals("s"));
        System.out.println("\n\n Programa finalizado ¡¡");
    }
}
