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
public class Ingresodedatos {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int resultado;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3=sc.nextInt();
        
        resultado=num1+num2+num3;
        System.out.println("la suma es: "+resultado);
        
    }
}
