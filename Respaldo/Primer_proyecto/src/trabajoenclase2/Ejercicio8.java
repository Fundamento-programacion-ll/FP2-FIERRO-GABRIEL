/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoenclase2;

/**
 *
 * @author HP
 */
public class Ejercicio8 {
    double desc;
    double resultado;
    public void ejercicio8(double kilos){
       if (kilos<=2){
           resultado=kilos*20;
           System.out.println("El valor a pagar es: $"+resultado);
       }else if(kilos>2 && kilos<=6){
           desc=(kilos*20)*0.10;
           resultado=(kilos*20)-desc;
           System.out.println("El valor a pagar es: $"+resultado);
       }else if(kilos>6.01 && kilos<=12){
           desc=(kilos*20)*0.15;
           resultado=(kilos*20)-desc;
           System.out.println("El valor a pagar es: $"+resultado);
       }else if(kilos>12.01){
           desc=(kilos*20)*0.20;
           resultado=(kilos*20)-desc;
           System.out.println("El valor a pagar es: $"+resultado);
       } 
    }
}
