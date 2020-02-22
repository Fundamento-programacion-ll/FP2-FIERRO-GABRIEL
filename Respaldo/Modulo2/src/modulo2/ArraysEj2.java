package modulo2;

import java.util.Scanner;

public class ArraysEj2 {
    public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);
        int tam;
        String elemento;
        String nombres[];
        
        String op="";
        do{
            System.out.println("Ingrese el tamaño del arreglo");
            tam=ingreso.nextInt();
            nombres=new String[tam];
            
            for (int i=0;i<tam;i++){
                System.out.println("Ingrese el nombre "+(i+1)+": ");
                elemento=ingreso.next();
                nombres[i]=elemento;
            }
            
            System.out.println("Los Nombres ingresados son: ");
            for (int i=0;i<nombres.length;i++){
                System.out.println("Posicion ("+ (i+1) +") - nombre: "+nombres[i]);
            }
            System.out.println("Desea continuar (s/n)");
            op= ingreso.next();
            
            
        }while(op.equals("S") || op.equals("s"));
        System.out.println("Adios");
    }
}
