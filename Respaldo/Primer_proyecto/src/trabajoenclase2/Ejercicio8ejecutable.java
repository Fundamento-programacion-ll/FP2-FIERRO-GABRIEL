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
public class Ejercicio8ejecutable {
    public static void main(String[] args) {
        double kilos;
        Scanner s=new Scanner(System.in);
        Ejercicio8 ej8=new Ejercicio8();
        System.out.println("Ingrese la cantidad de kilos que va a comprar ");
        kilos=s.nextDouble();
        
        ej8.ejercicio8(kilos);
    }
}
