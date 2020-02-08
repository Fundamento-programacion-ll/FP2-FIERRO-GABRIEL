/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS
 */
public class cuadrado extends figura{
    private int lado;

    public cuadrado() {
        super();
        this.lado =Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los valores del cuadrado separados por coma"));
    }

    public cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    } 
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(80, 80,this.lado, this.lado);
    }   
}
