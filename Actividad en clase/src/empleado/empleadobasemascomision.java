package empleado;

public class empleadobasemascomision extends empleadoporcomision{
    double salarioBase;

    public empleadobasemascomision(double salarioBase, double ventasBrutas, double tarifaComision, String nombre, String apellido, int cedula) {
        super(ventasBrutas, tarifaComision, nombre, apellido, cedula);
        this.salarioBase = salarioBase;
    }

    public empleadobasemascomision(double salarioBase, double ventasBrutas, double tarifaComision) {
        super(ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
     @Override
    public Double calcularIngresos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public double Ingresos(){
        return salarioBase * super.calcularIngresos();
    }  
    
    @Override
    public String toString(){
        return "nombre: "+getNombre()+ getApellido()+" salariobase"+getSalarioBase()+" total ingresos: "+(getSalarioBase()*(getVentasBrutas()*getTarifaComision()));
    }
}
