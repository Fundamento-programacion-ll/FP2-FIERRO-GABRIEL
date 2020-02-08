
package trabajoenclase;

public class limpieza extends persona{
    String turno;

    public limpieza() {
        
    }

    public limpieza(String turno, int edad, String nombre, int cedula, String apellidos, String genero, float sueldo) {
        super(edad, nombre, cedula, apellidos, genero, sueldo);
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
}
