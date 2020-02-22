
package estructura_for;


public class Ejenclase4puntosxD {  
    private double acum;
    private double promedio;
    private int cont;
    private double mayor;
    private double menor=9999999;
    
    
    public void sumacalif(double calif){
        acum=acum+calif; 
        cont=cont+1;
    }
    
    public double promedio(){
        promedio=acum/cont;
        return promedio;
    }
    
    public void califmaymen(double calif){
        if(calif>mayor){
            mayor=calif;
        }else if(calif<menor){
            menor=calif;
        }
    }
    
    public String resultado(){
         return "La calificación mayor es: "+mayor+"\n"+"La calificación menor es: "+menor;
    }
}


