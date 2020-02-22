
package ejercicios;

public class Ejercicio4 {
   private double nummayor;
   private int cont;
   private double n;
   
    public void mayor(double num){
        if (num>cont){
            cont++;
            nummayor=num;
            
        }
    }
    public void nmayor (){
        System.out.println("El numero mas alto es: "+nummayor);
    }
}
