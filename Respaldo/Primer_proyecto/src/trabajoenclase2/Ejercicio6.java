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
public class Ejercicio6 {
   double resultado;
    public void ejercicio6(double num){
        if (num<=5){
            resultado=num*18;
            System.out.println("El valor de cada saco de cemento es de 18$");
            System.out.println("El precio total es; "+resultado);
        }else if(num>5 && num<=10){
            resultado=num*14;
            System.out.println("El valor de cada saco de cemento es de 14$");
            System.out.println("El precio total es; "+resultado);
        }else if(num>10){
            resultado=num*10;
            System.out.println("El valor de cada saco de cemento es de 10$");
            System.out.println("El precio total es; "+resultado);
        
        }
    }
}
