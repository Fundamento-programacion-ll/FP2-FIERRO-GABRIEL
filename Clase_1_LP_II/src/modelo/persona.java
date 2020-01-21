package modelo;

public class persona {
    String nombre;
    String apellido;
    String direccion;
    boolean estadoCivil;
    String cedula;
    int edad;
    String telefono;
    char genero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public persona(String nombre, String apellido, String direccion, boolean estadoCivil, String cedula, int edad, String telefono, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.genero = genero;
    }
    
    @Override
    public String toString(){
        return "nombre: " + this.getNombre();
           
    }
            
}
