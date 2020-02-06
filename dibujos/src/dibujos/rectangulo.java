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
public class rectangulo extends figura{
    private int base;
    private int altura;

    public rectangulo() {
        super();
        String datos = JOptionPane.showInputDialog(null, "Ingrese los valores del punto separados por coma");
        StringTokenizer tokens = new StringTokenizer(datos, ",");               
        this.base = Integer.parseInt(tokens.nextToken());
        this.altura = Integer.parseInt(tokens.nextToken()); 
    }

    public rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
    
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(80, 80, this.base, this.altura);
    }  
}
