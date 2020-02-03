
package empleado;

public class empleadosalariado extends EMPLEADO{
    double salarioSemanal;

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public empleadosalariado(double salarioSemanal, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.salarioSemanal = salarioSemanal;
    }

    public empleadosalariado(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override
    public String toString(){
        return "nombre: "+ getNombre()+ getApellido()+" cedula: "+getCedula()+" salario: "+getSalarioSemanal();
    }

    @Override
    public Double calcularIngresos() {
        return salarioSemanal;
    }
}
