
package estructura_for;

import java.util.Scanner;

public class Ejenclase2 {
    public static void main(String[] args) {
        double num;
        int i;
        int tope;
        double promedio;
        double acum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        tope=sc.nextInt();
        for(i=0; i<tope; i++){
            System.out.println("ingrese un numero");
            num=sc.nextDouble();
            acum=acum+num;
        }
        promedio=acum/tope;
        System.out.println("El total de los numeros es: "+acum);
        System.out.println("El promedio de los numeros es: "+promedio);
    }
}
