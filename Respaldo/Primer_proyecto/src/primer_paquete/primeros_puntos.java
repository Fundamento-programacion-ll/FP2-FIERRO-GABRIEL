/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_paquete;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class primeros_puntos {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double num1;
        double num2;
        double num3;
        double prom;
        Scanner pr=new Scanner(System.in);
        System.out.println("escriba el nombre de el estudiante: ");
        nombre=pr.next();
        System.out.println("escriba la edad del estudiante: ");
        edad=pr.nextInt();
        System.out.println("Ingrese el primer numero: ");
        num1=pr.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2=pr.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        num3=pr.nextDouble();
        prom=(num1+num2+num3)/3;
        System.out.println("El estudiante; "+nombre);
        System.out.println("tiene promedio de; "+prom);
    }
    
}
