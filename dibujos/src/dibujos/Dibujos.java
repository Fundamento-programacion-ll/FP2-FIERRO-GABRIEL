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
        
        opcion=JOptionPane.showInputDialog(null, "Menu\n"+"1. Punto\n"+"2. Circulo\n"+"2. Cuadrado\n");
        if(opcion.equalsIgnoreCase("punto")){
            punto pto=new punto();
            System.out.println(pto);
            JFrame ventana = new JFrame();
            ventana.add(pto);
            ventana.setSize(700,400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else if(opcion.equalsIgnoreCase("circulo")){
            circulo cir=new circulo();
            JFrame ventana = new JFrame();
            ventana.add(cir);
            ventana.setSize(700,400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else if(opcion.equalsIgnoreCase("cuadrado")){
            cuadrado c=new cuadrado();
            System.out.println(c);
            JFrame ventana = new JFrame();
            ventana.add(c);
            ventana.setSize(700,400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else if(opcion.equalsIgnoreCase("rectangulo")){
            rectangulo rec=new rectangulo();
            JFrame ventana = new JFrame();
            ventana.add(rec);
            ventana.setSize(700,400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else if(opcion.equalsIgnoreCase("s")){
            cilindro cili=new cilindro();
            JFrame ventana = new JFrame();
            ventana.add(cili);
            ventana.setSize(700,400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else if(opcion.equalsIgnoreCase("rectangulo")){
            
        } 
    }
}
