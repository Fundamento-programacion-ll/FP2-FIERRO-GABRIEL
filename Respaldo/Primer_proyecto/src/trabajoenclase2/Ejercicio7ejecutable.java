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
public class Ejercicio7ejecutable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Ejercicio7 ej7=new Ejercicio7();
        double celdef;
        double celprod;
        
        System.out.println("Ingrese la cantidad de celulares defectuosos");
        celdef=sc.nextDouble();
       
        System.out.println("Ingrese la cantidad de celulares producidos");
        celprod=sc.nextDouble();
        
        ej7.ejercicio7(celdef, celprod);
                
                
        
    }
}
