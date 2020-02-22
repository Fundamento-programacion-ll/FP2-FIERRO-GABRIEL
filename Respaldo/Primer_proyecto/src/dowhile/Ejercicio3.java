
package dowhile;

public class Ejercicio3 {
    double promediopos;
    double promedioneg;
    double acum;
    int contp;
    double acump;
    int contn;
    double acumn;
    public void posneg(double num){
        if(num>0){
            contp++;
            acump=acump+num;
        }else{
            contn++;
            acumn=acumn+num;
        }
    }
    public void promediopositivos(){
        promediopos=acump/contp;
        System.out.println("El promedio de los positivos: "+promediopos);
    }
    public void promedionegativos(){
        promedioneg=acumn/contn;
        System.out.println("El promedio de los negativos es: "+promedioneg);
    }
}
