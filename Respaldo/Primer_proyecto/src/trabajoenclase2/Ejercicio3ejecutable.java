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
public class Ejercicio3ejecutable {
    public static void main(String[] args) {
        double num;
        
        Scanner sc=new Scanner(System.in);
        //instanciar clase
        Ejercicio3 ej=new Ejercicio3();
        
        System.out.println("Ingrese un valor");
        num=sc.nextDouble();
        
        ej.ejercicio_3(num);
    }
}
