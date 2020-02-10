
package trabajoenclase;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class persona {
    int edad;
    String nombre;
    int cedula;
    String apellidos;
    String genero;

    public persona(int edad, String nombre, int cedula, String apellidos, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.genero = genero;

    }

    public persona() {
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public String toString(){
        return "Edad: \n"+edad+" Nombre: \n"+nombre+" Cedula: \n"+cedula+" Apellido :\n"+apellidos+" Genero: \n"+genero;
    }
}
