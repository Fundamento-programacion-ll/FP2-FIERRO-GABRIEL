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
public class Puntosalaprueba_2 {
    public static void main(String[] args) {
        String cadena;
        int longitud;
        char udigito;
        Scanner ca=new Scanner(System.in);
        System.out.println("ingrese una cadena de caracteres");
        cadena=ca.next();
        
        longitud=cadena.length();
        System.out.println("la longitud de la cadena es: "+longitud);
       
    }   
}
