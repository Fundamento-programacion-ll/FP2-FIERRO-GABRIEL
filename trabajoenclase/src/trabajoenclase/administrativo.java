
package trabajoenclase;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class administrativo extends persona{
    String area;

    public administrativo() {
        
    }
    
    public administrativo(String area, int edad, String nombre, int cedula, String apellidos, String genero, float sueldo) {
        super(edad, nombre, cedula, apellidos, genero, sueldo);
        this.area = area;
    }

    public administrativo(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
