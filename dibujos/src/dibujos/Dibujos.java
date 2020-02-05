/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS CORP
 */
public class Dibujos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // TODO code application logic here
        String opcion;
        
        opcion=JOptionPane.showInputDialog(null, "Menu\n"+"1. Punto\n"+"2. Circulo\n");
        if(opcion.equalsIgnoreCase("punto")){
            punto pto=new punto();
            System.out.println(pto);
//            JFrame ventana = new JFrame();
//            ventana.add(pto);
//            ventana.setSize(700,400);
//            ventana.setVisible(true);
//            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else if(opcion.equalsIgnoreCase("circulo")){
            circulo cir=new circulo();
        }else{
            JOptionPane.showMessageDialog(null, "no selecciono nada");
        }        
    } 
}
