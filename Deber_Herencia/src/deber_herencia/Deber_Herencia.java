
package deber_herencia;

public class Deber_Herencia {

    public static void main(String[] args) {
        triangulo tr=new triangulo();
        cuadrado cu=new cuadrado();
        circulo ci=new circulo();
        System.out.println("---Cuadrado---");
        System.out.println("El area del cuadrado es: "+cu.areaCuadrado());
        System.out.println("El volumen del cuadrado es: "+cu.volumenCuadrado());
        System.out.println("El perimetro del cuadrado es: "+cu.perimetroCuadrado());
        System.out.println("---Triangulo---");
        System.out.println("El area del triangulo es: "+tr.areaTriangulo());
        System.out.println("El volumen del triangulo es: "+tr.volumenTriangulo());
        System.out.println("El perimetro del triangulo es: "+tr.perimetroTriangulo());
        System.out.println("---Triangulo---");
        System.out.println("El diametro del circulo es: "+ci.diametroCirculo());  
        System.out.println("El volumen del circulo es: "+ci.volumenCirculo());
        System.out.println("La circunferencia del circulo es: "+ci.circunferenciaCirculo());
    }
}
