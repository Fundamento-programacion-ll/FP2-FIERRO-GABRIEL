
package deber_herencia;

public class triangulo extends dimensiones{
    int totaltriangulo;
    int base=getBase();
    int altura=getAltura();
    int lado=getLados();
    public int areaTriangulo(){
        totaltriangulo=(base*altura)/2;
        return totaltriangulo; 
    }
    public int volumenTriangulo(){
        totaltriangulo=((base*altura/2)*altura)/3;
        return totaltriangulo;
    }
    public int perimetroTriangulo(){
        totaltriangulo=lado*3;
        return totaltriangulo;
    }
}
