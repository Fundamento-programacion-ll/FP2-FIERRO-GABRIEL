
package ejercicios;


public class Ejercicio1 {
    double acump;
    double acumi;

     public void num_parimpar(double num){
         if (num%2==0){
            acump=acump+num;
        }else if(num%1==0) {
            acumi=acumi+num;
    } 
  }
    public void sumapares(){
        System.out.println("La suma de los pares es "+acump);
    }
    public void sumaimpares(){
        System.out.println("la suma de los impares es: "+acumi);
    }
}
