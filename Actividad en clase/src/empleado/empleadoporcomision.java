
package empleado;

public class empleadoporcomision extends EMPLEADO{
    double ventasBrutas;
    double tarifaComision;

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public empleadoporcomision(double ventasBrutas, double tarifaComision, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public empleadoporcomision(double ventasBrutas, double tarifaComision) {
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }
   

    @Override
    public String toString(){
        if(tarifaComision>=0 && tarifaComision<1){
            tarifaComision=tarifaComision;
            
        }else{
            tarifaComision=0;
        }
        return "ventas: "+getVentasBrutas()+" comision"+getTarifaComision()+ "total: "+(getVentasBrutas()*getTarifaComision());
    }
    
    @Override
    public Double calcularIngresos() {
        return ventasBrutas*tarifaComision;
    }
}
