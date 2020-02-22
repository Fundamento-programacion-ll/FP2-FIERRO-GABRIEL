
package modulo2;

import java.util.Scanner;
import java.text.DecimalFormat;
       
public class Deber1 {
    public static void main(String[] args) {
        int op1;
        double num;
        double num1;
        double respuesta;
        
        System.out.println("BIENVENIDOS");
        
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.00");
        
        do{
            
        System.out.println("Escoja de que figura desea calcular el perimetro");
        System.out.println("1.Cuadrado");
        System.out.println("2.Circulo");
        System.out.println("3.Triangulo");
        System.out.println("4.Rectangulo");
        System.out.println("5.Salir");
        op1=sc.nextInt();
        switch (op1){

            case 1:
                System.out.println("Escogio Cuadrado");
                System.out.println("Ingrese la loguitud de uno de sus lados");
                num=sc.nextDouble();
                respuesta=(num+num+num+num);
                System.out.println("El perimetro del cuadrado es: "+df.format(respuesta));
                break;
            case 2:
                System.out.println("Escogio Circulo");
                System.out.println("Ingrese el radio del circulo");
                num1=sc.nextDouble();
                respuesta=(2*3.1416*num1);
                System.out.println("El perimetro del circulo es: "+df.format(respuesta));
                break;
            case 3:
                System.out.println("Escogio Triangulo");
                System.out.println("Ingrese el valor de alguno de los lados del triangulo");
                num=sc.nextDouble();
                respuesta=(num+num+num);
                System.out.println("El perimetro del triangulo es: "+df.format(respuesta));
                break;
            case 4:
                System.out.println("Escogio Rectangulo");
                System.out.println("Ingrese el valor de la base del rectangulo");
                num=sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del rectangulo");
                num1=sc.nextDouble();
                respuesta=((2*num)+(2*num1));
                System.out.println("El perimetro del rectangulo es: "+df.format(respuesta));
            break;   
            default:System.out.println("Adios");  
            }    
        }while(op1!=5);
    }
}
