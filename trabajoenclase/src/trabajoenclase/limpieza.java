
package trabajoenclase;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class limpieza extends persona{
    String turno;

    public limpieza() {
        String datos = JOptionPane.showInputDialog(null, "Ingrese los valores (nombre,apellido,edad,genero,cedula,turno) separados por ","");
        StringTokenizer tokens = new StringTokenizer(datos, ",");
        nombre=tokens.nextToken();
        apellidos=tokens.nextToken();
        edad=Integer.parseInt(tokens.nextToken());
        genero=tokens.nextToken();
        cedula=Integer.parseInt(tokens.nextToken());
        turno=tokens.nextToken();
    }

    public limpieza(String turno, int edad, String nombre, int cedula, String apellidos, String genero) {
        super(edad, nombre, cedula, apellidos, genero);
        this.turno = turno;
    }

    public limpieza(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    @Override
    public String toString(){
        return "\n---Limpieza---\n"+"\nNombre"+this.nombre+this.apellidos+"\nEdad: "+this.edad+"\nGenero: "+this.genero+"\nCedula: "+this.cedula+"\nTurno: "+this.turno;
    }
}
