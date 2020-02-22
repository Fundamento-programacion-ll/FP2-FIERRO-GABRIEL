
package trabajoenclase;

public class Ejercicio5 {
    private double mayor;
    private double menor=9999999;
    private String pos;

    public void numeromayor(double numeros[][],int i,int j){
        if(numeros[i][j]>mayor){
            mayor=numeros[i][j];
            pos=i+"-"+j;
        }
    }
    public String resultado(){
        return "La calificación mayor es: "+mayor+" su posicion es: "+pos;
        
    }
}
