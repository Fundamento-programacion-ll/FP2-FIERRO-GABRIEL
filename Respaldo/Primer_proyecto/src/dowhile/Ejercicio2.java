/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int num;
        int suma;
        String op="";
        int cont;
        double acum;
        acum=0;
        cont=0;
        
        Scanner sc=new Scanner(System.in);
       
        do{
            System.out.println("Ingrese un valor");
            num=sc.nextInt(); 
            acum=acum+num;
            System.out.println("Desea ingresar otro numero");
            op=sc.next();   
        }while(!op.equalsIgnoreCase("no"));
        System.out.println("La suma de los numeros es: "+acum);
    }
}
