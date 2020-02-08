
package trabajoenclase;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class administrativo extends persona{
    String area;

    public administrativo() {
        String datos = JOptionPane.showInputDialog(null, "Ingrese los valores (nombre,apellido,edad,genero,cedula,area) separados por ","");
        StringTokenizer tokens = new StringTokenizer(datos, ",");
        nombre=tokens.nextToken();
        apellidos=tokens.nextToken();
        edad=Integer.parseInt(tokens.nextToken());
        genero=tokens.nextToken();
        cedula=Integer.parseInt(tokens.nextToken());
        area=tokens.nextToken();
    }
    
//    public administrativo(String area, int edad, String nombre, int cedula, String apellidos, String genero, float sueldo) {
//        super(edad, nombre, cedula, apellidos, genero, sueldo);
//        this.area = area;
//    }

    public administrativo(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    @Override
    public String toString(){
        return "---Administrativo---\n"+"\nNombre"+this.nombre+this.apellidos+"\nEdad: "+this.edad+"\nGenero: "+this.genero+"\nCedula: "+this.cedula+"\nArea: "+this.area;
    }
}
