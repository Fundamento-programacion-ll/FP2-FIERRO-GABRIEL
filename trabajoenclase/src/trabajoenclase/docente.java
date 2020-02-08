
package trabajoenclase;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class docente extends persona{
    String area;
    String cargo;

    public docente() {
        String datos = JOptionPane.showInputDialog(null, "Ingrese los valores (nombre,apellido,edad,genero,cedula,area,cargo) separados por ","");
        StringTokenizer tokens = new StringTokenizer(datos, ",");
        nombre=tokens.nextToken();
        apellidos=tokens.nextToken();
        edad=Integer.parseInt(tokens.nextToken());
        genero=tokens.nextToken();
        cedula=Integer.parseInt(tokens.nextToken());

        area=tokens.nextToken();
        cargo=tokens.nextToken();
    }

    public docente(String area, String cargo, int edad, String nombre, int cedula, String apellidos, String genero) {
        super(edad, nombre, cedula, apellidos, genero);
        this.area = area;
        this.cargo = cargo;
    }

    public docente(String area, String cargo) {
        this.area = area;
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String toString(){
        return "\n---Docente---\n"+"\nNombre"+this.nombre+this.apellidos+"\nEdad: "+this.edad+"\nGenero: "+this.genero+"\nCedula: "+this.cedula+"\nArea: "+this.area+"\nCargo: "+this.cargo;
    }
}
