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
 * @author SISTEMAS CORP
 */
public class circulo extends punto{
    static final double PI=3.1416;
    int radio;

    public circulo() {
        super();
        this.radio=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los datos")); 
    }

    public double area(){
        return PI * getRadio() * getRadio();
    }
    
    
    public circulo(int radio, int x, int y) {
        super(x, y);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawOval(super.getX(), super.getY(), this.radio, this.radio);
        
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    @Override
    public String toString(){
        return "circulo:" + super.toString() + " radio="+this.radio+"area: "+area();
    }
}
