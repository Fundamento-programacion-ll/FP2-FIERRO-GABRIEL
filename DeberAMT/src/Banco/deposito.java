
package Banco;

public class deposito extends transaccion{
    private double montoDeposito;
    
    public deposito(double montoDeposito, int numCuenta) {
        super(numCuenta);
        this.montoDeposito = montoDeposito;
    }

    public deposito(double montoDeposito) {
        this.montoDeposito = montoDeposito;
    }
    
    public double getMontoDeposito() {
        return montoDeposito;
    }

    public void setMontoDeposito(double montoDeposito) {
        this.montoDeposito = montoDeposito;
    }

    @Override
    public String toString() {
        return "Deposito Total "+getMontoDeposito()+"$"+" En la cuenta Numero: "+getNumCuenta();
    }

    @Override
    public String ejecutar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
