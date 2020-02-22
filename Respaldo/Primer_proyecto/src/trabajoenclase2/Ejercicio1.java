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
public class Ejercicio1 {
    private double respuesta;
    public double suma(double num1, double num2){
        respuesta=num1+num2;
        return respuesta;
    } 
    public double resta(double num1, double num2){
        respuesta=num1-num2;
        return respuesta;
    }  
    public double multiplicacion(double num1, double num2){
        respuesta=num1*num2;
        return respuesta;
    }   
    public String division(double num1, double num2){
        if (num1==0 && num2==0){
            return "indefinido";
        } else if (num2==0){
            return "No existe division para cero";
        }else{
            respuesta=num1/num2;
            return "la division es: "+respuesta;
        }
    }
}

