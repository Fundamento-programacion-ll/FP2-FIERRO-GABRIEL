
package trabajoenclase;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class sueldo implements Comparable <sueldo>{

    private String nombre;
    private int sueldo;
	
    sueldo (String nombre, int sueldo){
	this.nombre = nombre;
        this.sueldo = sueldo;
    }
	
    @Override   
    public String toString(){   
        return "\nSueldos Ordenados de Menor a Mayor\n"+this.getNombre()+" Sueldo: "+getSueldo();
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getSueldo(){
	return this.sueldo;
    }	
	
    @Override
    public int compareTo(sueldo p){
	return this.getNombre().compareTo(p.getNombre());
    } 
}
