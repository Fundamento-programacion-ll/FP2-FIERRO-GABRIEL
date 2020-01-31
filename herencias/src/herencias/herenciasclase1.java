/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author SISTEMAS
 */
public class herenciasclase1 extends animal{
    String color, duenos;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
            this.color = color;
    }

    public String getDuenos() {
        return duenos;
    }

    public void setDuenos(String duenos) {
        this.duenos = duenos;
    }

    public herenciasclase1(String color, String duenos, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.color = color;
        this.duenos = duenos;
    }

    public herenciasclase1(String color, String duenos) {
        this.color = color;
        this.duenos = duenos;
    }
    
    public void datosExtra(){
        System.out.println("Color de pelo: "+ getColor() + " Sus dueños son: "+ getDuenos());
    }
    
}
