
package ejercicios;

import java.util.Scanner;

public class Ejercicio4ejecutable {
    public static void main(String[] args) {
            int cont;
            cont=1;
            int n;
            double num;
            
            Scanner sc=new Scanner(System.in);
            Ejercicio4 eje4=new Ejercicio4();

            do{
                System.out.println("Ingrese un valor ");
                num=sc.nextDouble();
                eje4.mayor(num);
                cont++;
            }while(num!=-1);
            
            eje4.nmayor();
    }
}
