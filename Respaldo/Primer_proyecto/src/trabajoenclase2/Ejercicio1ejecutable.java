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
public class Ejercicio1ejecutable {

    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner sc=new Scanner(System.in);
        Ejercicio1 c=new Ejercicio1();
        System.out.println("Ingrese el primer numero");
        num1=sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2=sc.nextDouble();
        
        System.out.println("La suma es: "+c.suma(num1, num2));
        System.out.println("La resta es: "+c.resta(num1, num2));
        System.out.println("La multiplicacion es: "+c.multiplicacion(num1, num2));
        System.out.println(c.division(num1, num2));
    }
}

