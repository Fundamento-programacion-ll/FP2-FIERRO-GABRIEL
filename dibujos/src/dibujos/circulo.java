/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author SISTEMAS CORP
 */
public class circulo extends punto{
    
    private int radio;

    public circulo() {
        
    }

    public circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }
    
    public void dibujo(Graphics g){
        g.setColor(Color.yellow);
        g.drawOval(super.getX(), super.getY(), this.radio, this.radio);
        
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
}
