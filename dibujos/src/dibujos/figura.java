/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author SISTEMAS CORP
 */
public abstract class figura extends JPanel{
    public abstract void dibujo(Graphics g);
}
