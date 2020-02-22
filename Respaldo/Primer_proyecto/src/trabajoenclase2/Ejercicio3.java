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
public class Ejercicio3 {
         public void ejercicio_3(double num){
        if (num==0){
            System.out.println("El numero es cero");
        }else if(num<=9 && num>=1){
            System.out.println("El numero esta entre 1 y 9");
        }else if(num<=19 && num>=10){
            System.out.println("El numero esta entre 10 y 19");
        }else if(num>20){
            System.out.println("El numero es mayor a 20");
        }
    }
}
