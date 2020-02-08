/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS
 */
public class cilindro extends circulo{
    private int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public cilindro(int altura) {
        this.altura = altura;
    }

    public cilindro(int altura, int radio, int x, int y) {
        super(radio, x, y);
        this.altura = altura;
    }

    public cilindro() {
        super();
        this.altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la altura del cilindro"));
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawOval(this.x, this.y, this.radio, this.radio);
        g.drawOval(this.x, this.y*6, this.radio, this.radio);
    }
}
