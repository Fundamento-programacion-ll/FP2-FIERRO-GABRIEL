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
public class Ejercicio5 {
    public void ejercicio5(double num1, double num2, double num3){
        if (num1==num2 && num1==num3){
            System.out.println("El triangulo es equilatero");
        }else if(num1==num2){
            System.out.println("El triangulo es isoceles");
        }else if (num2==3){
            System.out.println("El triangulo es isoceles");
        }else{      
            System.out.println("El triangulo es escaleno");
        }
    }
}
