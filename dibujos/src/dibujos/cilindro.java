/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

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
        
    }
}
