
package trabajoenclase;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class persona {
    int edad;
    String nombre;
    int cedula;
    String apellidos;
    String genero;
    float sueldo;

    public persona(int edad, String nombre, int cedula, String apellidos, String genero, float sueldo) {
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.genero = genero;
        this.sueldo = sueldo;
    }

    
    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }


    public persona() {
        String datos = JOptionPane.showInputDialog(null, "Ingrese los valores (edad,nombre,cedula,apellido,generos,sueldo) separados por ","");
        StringTokenizer tokens = new StringTokenizer(datos, ",");
        this.edad=
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
}
