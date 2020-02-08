
package trabajoenclase;

public class docente extends persona{
    String area;
    String cargo;

    public docente() {
        
    }

    public docente(String area, String cargo, int edad, String nombre, int cedula, String apellidos, String genero, float sueldo) {
        super(edad, nombre, cedula, apellidos, genero, sueldo);
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
}
