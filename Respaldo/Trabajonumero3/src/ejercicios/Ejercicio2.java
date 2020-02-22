
package ejercicios;
public class Ejercicio2 {
    double acum;
    int contp;
    double acump;
    int contn;
    double acumn;
    
    public void posneg(double num){
        if(num>0){
            contp++;
        }else if (num<0){
            contn++;
        }
    }
    public void positivos(){
        System.out.println("Los numeros positivos son: "+contp);
    }
    public void negativos(){
        System.out.println("Los numeros negativos son: "+contn);
    }
}
