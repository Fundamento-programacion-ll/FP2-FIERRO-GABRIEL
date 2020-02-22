/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoparimpar;

/**
 *
 * @author HP
 */
public class Calculadora {
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
    public void division2 (double num1, double num2){
          if (num1==0 && num2==0){
              System.out.println("Indefinido");
        } else if (num2==0){
              System.out.println("No existe divison para cero");
        }else{
            respuesta=num1/num2;
              System.out.println("La division es: "+respuesta);
        }
    }
}

