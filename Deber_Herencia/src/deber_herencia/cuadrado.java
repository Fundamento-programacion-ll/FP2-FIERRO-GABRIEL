
package deber_herencia;

public class cuadrado extends dimensiones{
    int lados=getLados();
    int totalCuadrado;
    public int areaCuadrado(){
        totalCuadrado=lados*lados;
        return totalCuadrado;
    }  
    public int volumenCuadrado(){
        totalCuadrado=lados*lados*lados;
        return totalCuadrado;
    }
    public int perimetroCuadrado(){
        totalCuadrado=4*lados;
        return totalCuadrado;
    }
}
