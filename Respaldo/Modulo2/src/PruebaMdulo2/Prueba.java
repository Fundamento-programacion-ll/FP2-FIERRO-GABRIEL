
package PruebaMdulo2;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        int op1=0;
        String op2 ="";
        int tam, elemento;
        double respuesta = 0;
        int ej1 []=new int[5];
        Arrays.sort(ej1);
        
        String ej3 [];
        String ej32 [];
        Scanner sc=new Scanner (System.in);
        
        
       
        do{
            menu();
            op1=sc.nextInt();
            switch (op1){
                case 1:
                    for (int i=0;i<5;i++){
                    System.out.println("Ingrese el numero "+(i+1)+":");
                    ej1[i]=sc.nextInt();
                    }
                    System.out.println("Ordenado de menor a mayor queda:");
                    for (int i=0;i<5;i++){
                        Arrays.sort(ej1);
                        System.out.println(+ej1[i]);
                    }
                    System.out.println("Desea hacerlo nuevamente(s/n)");
                    op2=sc.next();
                    break;
                case 2:
                    System.out.println("Ingrese el numero de numeros a ingresar");
                    tam=sc.nextInt();
                    int ej2 []=new int[tam];
                    
                    for (int i=0;i<tam;i++){
                    System.out.println("Ingrese el numero "+(i+1)+": ");
                    ej2[i]=sc.nextInt();
                    }
                    for (int i=0;i<tam;i++){
                        if (ej2[i]%2==0){
                            System.out.println("Los pares son: "+ej2[i]);
                        }else if(ej2[i]!=0) {
                            respuesta=respuesta+ej2[i];
                            System.out.println("Los impares son: "+ej2[i]);
                        }    
                    }
                         System.out.println("La suma es: "+respuesta);
                    System.out.println("Desea hacerlo nuevamente(s/n)");
                    op2=sc.next();
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de libros a ingresar");
                    tam=sc.nextInt();
                    ej3=new String[tam];
                    ej32=new String[tam];
                    for (int i=0;i<tam;i++){
                        System.out.println("Ingrese el nombre del libro numero"+(i+1));
                        ej3[i]=sc.next();;
                        System.out.println("Ingrese el nombre del autor del libro numero"+(i+1));
                        ej32[i]=sc.next();
                    }
                    for (int i=0;i<tam;i++){
                        System.out.println("El libro "+ej3[i]+" es del autor "+ej32[i]);

                    }  
                    System.out.println("Desea hacerlo nuevamente(s/n)");
                    op2=sc.next();
                    break;
                    default:
                    break;      
            }    
        }while(op2.equals("S") || op2.equals("s"));
    }
    public static void menu(){
        System.out.println("Escoja la opcion que desee");
        System.out.println("1.Ingresar 5 numeros y mostrar de menor a mayor");
        System.out.println("2.Ingresar cantidad de numeros y sumar los impares");
        System.out.println("3.Ingresar una cantidad de libros con su nombre y autor");
    } 
      
}

        