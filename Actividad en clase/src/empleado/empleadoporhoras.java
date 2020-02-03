
package empleado;

public class empleadoporhoras extends EMPLEADO{
    double sueldo;
    double horas;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public empleadoporhoras(double sueldo, double horas, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public empleadoporhoras(double sueldo, double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }
    
    public void horasCond(){
        if (horas>0 && horas<=168){
            horas=horas;
        }else{
            horas=0;
        }
    }

    @Override
    public String toString(){
        if (horas>0 && horas<=168){
            horas=horas;
        }else{
            horas=0;
        }
        return "nombre: "+getNombre()+ getApellido()+ "sueldo "+getSueldo()+" horas: "+getHoras()+" total: "+(getSueldo()*getHoras());
    }
    
    @Override
    public Double calcularIngresos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

    
    
