package Comparadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SISTEMAS
 */
public class main {
    public static void main(String[] args) {
        String nombre;
        int num;
        
        String datos = JOptionPane.showInputDialog(null, "Ingrese los valores del punto separados por punto y coma");
        StringTokenizer tokens = new StringTokenizer(datos, ";");
        provincia p=new provincia();
        pais pa=new pais();
        nombre=tokens.nextToken();
        num=Integer.parseInt(tokens.nextToken());
        p.setNombreProvincia(nombre);
        p.setNumHabitantes(num);
        pa.agregarProvincia(p);
        System.out.println(p);
        
    }
}
