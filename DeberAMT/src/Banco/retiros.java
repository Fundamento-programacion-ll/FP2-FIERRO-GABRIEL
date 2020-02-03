
package Banco;

public class retiros extends transaccion{
    private double montoRetirado;

    public retiros() {
    }

    public retiros(double monto, int numCuenta) {
        super(numCuenta);
        this.montoRetirado = monto;
    }

    public retiros(double monto) {
        this.montoRetirado = monto;
    }

    public double getMonto() {
        return montoRetirado;
    }

    public void setMonto(double monto) {
        this.montoRetirado = monto;
    }

    @Override
    public String toString() {
        return "Retiro Total "+getMonto() +"$"+" En la cuenta Numero: "+getNumCuenta();
    } 

    @Override
    public String ejecutar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
