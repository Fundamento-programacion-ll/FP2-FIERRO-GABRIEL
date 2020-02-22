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
public class Practica_en_clase {
    public static void main(String[] args) {
        double raiz;
        double raizcub;
        double num;
        double red;
        Scanner rc=new Scanner(System.in);
        System.out.println("ingrese un valor");
        num=rc.nextDouble();
        //raiz
        raiz=Math.sqrt(num);
        //raiz cuadrada
        raizcub=Math.cbrt(num);
        System.out.println("La raiz es; "+raiz);
        System.out.println("La raiz cuadrada es; "+raizcub);
        
        //redondear
        red=Math.round(num);
        System.out.println("El numero redondeado es: "+red);
        
    }
    
    
}
