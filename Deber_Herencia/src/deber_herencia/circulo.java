
package deber_herencia;

public class circulo extends dimensiones{
    float totalCirculo;
    float radio=getBase();
    int altura=getAltura();
    int lado=getLados();
    public float diametroCirculo(){
        totalCirculo= (radio*2);
        return totalCirculo;
    }
    public float volumenCirculo(){
        totalCirculo=(float)(4/3*3.1416*(radio*radio*radio));
        return totalCirculo;
    }   
    public float circunferenciaCirculo(){
        totalCirculo=(float) 3.1416*(radio*2);
        return totalCirculo;
    }
}
