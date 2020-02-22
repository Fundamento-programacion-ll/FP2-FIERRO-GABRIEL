
package trabajoenclase;

public class Ejercicio8 {
    String notafinal;

    public void calificacionesxD(int calificacion[],int i,int n){
        for(i=0;i<n; i++){
        if(calificacion[i]>=19 && calificacion[i]<=20){
            notafinal="Sobresaliente";
        }else if(calificacion[i]>=17 && calificacion[i]<=18){
            notafinal="Notable";
        }else if (calificacion[i]>=15 && calificacion[i]<=16){
            notafinal="Buena";
        }else if (calificacion[i]>0 && calificacion[i]<=14){
            notafinal="Suspenso";
        }    
        }
    }
    public String resultado(){
        return notafinal;

    }
}
