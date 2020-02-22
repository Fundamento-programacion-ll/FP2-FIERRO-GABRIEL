/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_paquete;

/**
 *
 * @author HP
 */
public class Clase_string {
    public static void main(String[] args) {
        String apellido="Fierro";
        int longitud;
        char letra;
        //longitud de una cadena
        longitud=apellido.length();
        System.out.println("la longitud de la cadena es; "+longitud);
        
        //traer un caracter de una pisicion especifica
        letra=apellido.charAt(0);
        System.out.println("el primer caracter de mi apellido es; "+letra);
        
    }
}
