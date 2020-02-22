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
public class Clase_math {
    public static void main(String[] args) {
        double resultado;
        double base;
        double exp;
        double rand;
        Scanner po=new Scanner(System.in);
      /*
        System.out.println("ingrese la base del numero");
        base=po.nextDouble();
        System.out.println("ingrese el valor de la potencia");
        exp=po.nextDouble();
        resultado=Math.pow(base,exp);
        System.out.println("La potencia del "+base);
        System.out.println("elevado al "+exp);
        System.out.println("es: "+resultado);
        */
        //randomico
        rand=Math.random()*10;
        System.out.println("El numero aleatorio es "+rand);
        
        
        
        
    }
}
