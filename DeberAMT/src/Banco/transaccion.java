
package Banco;

public abstract class transaccion {
    private int numCuenta;

    public transaccion(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public transaccion() {
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    public abstract String ejecutar();
    
    public String obtenerCuenta(){
        return ejecutar();
    }
}
