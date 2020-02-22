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
public class Ejercicio5ejecutable {
    public static void main(String[] args) {
          double num1;
        double num2;
        double num3;
        Scanner sc=new Scanner(System.in);
        Ejercicio5 ej5=new Ejercicio5();
        System.out.println("Ingrese el primer lado ");
        num1=sc.nextDouble();
        System.out.println("Ingrese el segundo lado ");
        num2=sc.nextDouble();
        System.out.println("Ingrese el tercer lado ");
        num3=sc.nextDouble();
        
        ej5.ejercicio5(num1, num2, num3);
        
    }
}
