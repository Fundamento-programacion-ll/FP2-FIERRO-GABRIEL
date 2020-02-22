
package Serializacion_;

import java.io.Serializable;

public class Serializacion_1 implements Serializable{
        public Serializacion_1() {
        
        }
    

    public Serializacion_1(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

private String nombre; 
private String color;
private int edad;
    
}
