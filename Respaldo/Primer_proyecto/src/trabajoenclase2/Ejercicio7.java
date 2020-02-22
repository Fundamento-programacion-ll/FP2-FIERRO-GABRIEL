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
public class Ejercicio7 {
    public void ejercicio7(double celdef, double celprod){
        if (celdef>200 && celprod<10000){
            System.out.println("Grado 5");
        }else if(celdef<200 && celprod<10000){
            System.out.println("Grado 6");
        }else if(celdef>200 && celprod>10000){
            System.out.println("Grado 7");
        }else{
            System.out.println("Grado 8");
        }
    }
    
}
