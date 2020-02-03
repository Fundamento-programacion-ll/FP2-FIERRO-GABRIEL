
package Banco;

public class solicitudSaldo extends transaccion {
    private double dinero;

    public solicitudSaldo() {
    }
    
    public solicitudSaldo(double dinero, int numCuenta) {
        super(numCuenta);
        this.dinero = dinero;
    }

    public solicitudSaldo(double dinero) {
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    @Override
    public String ejecutar() {
        return "Numero de cuenta: "+getNumCuenta()+"\nSaldo Disponibe : "+dinero;
    }

    @Override
    public String toString() {
        return ejecutar();
    }
}
