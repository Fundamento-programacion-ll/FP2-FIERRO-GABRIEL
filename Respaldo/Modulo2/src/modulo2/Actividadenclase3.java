
package modulo2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Actividadenclase3 {
     public static void main(String[] args) {
        int op1;
        double num;
        double num1;
        double h;
        double respuesta = 0;
        
        System.out.println("BIENVENIDOS");
        
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.00");
        Actividadenclase3 eje3=new Actividadenclase3();
        
        do{
            menu();
        op1=sc.nextInt();
        
        switch (op1){

            case 1:
                System.out.println("Escogio octaedro");
                System.out.println("Ingrese la longuitud de la arista del octaedro");
                num=sc.nextDouble();
                System.out.println("El area del octaedro es: "+ df.format(octaedro(num)));
                break;
            case 2:
                System.out.println("Escogio Rombo");
                System.out.println("Ingrese el valor de la diagonal mayor del rombo");
                num1=sc.nextDouble();
                System.out.println("Ingrese el valor de la diagonal menor del rombo");
                num=sc.nextDouble();
                
                System.out.println("El area del rombo es: "+df.format(rombo(num1,num)));
                break;
            case 3:
                System.out.println("Escogio Trapecio");
                System.out.println("Ingrese el valor de la primera base del trapecio");
                num=sc.nextDouble();
                System.out.println("Ingrese el valor de la segunda base del trapecio");
                num1=sc.nextDouble();
                System.out.println("Ingrese el valor de la altura base del trapecio");
                h=sc.nextDouble();
                System.out.println("El area del trapecio es: "+df.format(trapecio(num1,num,h)));
                break;
            default:System.out.println("Adios");  
            }    
        }while(op1!=4);
    }
     
    public static void menu(){
        System.out.println("Escoja de que figura desea calcular el perimetro");
        System.out.println("1.Octaedro");
        System.out.println("2.Rombo");
        System.out.println("3.Trapecio");
        System.out.println("4.Salir");
    } 
    public static double octaedro(double num){ 
        double respuesta=2*Math.sqrt(3)*Math.pow(num, 2);
        return respuesta;
    }
    public static double rombo(double num1, double num){
        double respuesta=(num1*num)/2;
        return respuesta;
    }
    public static double trapecio(double num1, double num, double h){
        double respuesta=h*(num+num1/2);
        return respuesta;
    }
}
