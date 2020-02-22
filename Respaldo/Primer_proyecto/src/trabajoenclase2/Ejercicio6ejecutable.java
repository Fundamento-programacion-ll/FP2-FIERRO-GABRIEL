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
public class Ejercicio6ejecutable {
    public static void main(String[] args) {
        double  num;
        Scanner sc=new Scanner(System.in);
        Ejercicio6 ej6=new Ejercicio6();
        System.out.println("Ingrese la cantidad de bolsas de cemento que va a comprar");
        num=sc.nextDouble();
        
        
        ej6.ejercicio6(num);
                
                
        
    }
}
