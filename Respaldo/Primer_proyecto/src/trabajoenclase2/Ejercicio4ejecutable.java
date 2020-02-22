/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoenclase2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio4ejecutable {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        Scanner sc=new Scanner(System.in);
        Ejercicio4 ej4=new Ejercicio4();
        System.out.println("Ingrese el primer numero ");
        num1=sc.nextDouble();
        System.out.println("Ingrese el segundo numero ");
        num2=sc.nextDouble();
        System.out.println("Ingrese el tercer numero ");
        num3=sc.nextDouble();
        
        ej4.ejercicio_4(num1, num2, num3);
    }
}
