
package prueba1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Prueba1ejecutable {
    public static void main(String[] args) {
        String nombre;
        double edad;
        String genero;
        double cedula;
        double calificaciones;
        char letra;
        
        Scanner sc=new Scanner(System.in);
        Prueba1 pr1=new Prueba1();
        System.out.println("VERIFICACION DE CALIFICACIONES");
        System.out.println("Ingrese su nombre ");
        nombre=sc.nextLine();
        letra=nombre.charAt(0);
        if (letra=='a' ){
            System.out.println("no podra verificar su nota");
        }else if(letra=='p'){
            System.out.println("no podra verificar su nota");
        }else if(letra=='r'){
            System.out.println("no podra verificar su nota");
        }else if(letra=='t'){
            System.out.println("no podra verificar su nota");
        }else{
              //
        System.out.println("Ingrese su edad");
        edad=sc.nextDouble();
        //
        System.out.println("Ingrese su genero");
        genero=sc.next();
        //
        System.out.println("Ingrese su numero de cedula");
        cedula=sc.nextDouble();
        //
        System.out.println("Ingrese su calificacion");
        calificaciones=sc.nextDouble();
        
        pr1.prueba1(calificaciones, nombre, cedula);
        }
      
    }
}
