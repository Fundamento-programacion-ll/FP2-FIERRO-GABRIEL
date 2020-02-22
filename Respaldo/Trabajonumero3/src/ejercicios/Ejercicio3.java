
package ejercicios;

public class Ejercicio3 {
    int cont2;
    double acump;
    int cont5;
    double acumi;

         public void multiplos3y5(double num){
         if (num%2==0){
            cont2++;
        }else if(num%5==0) {
            cont5++;
    } 
  }
         public void multiplos2(){
             System.out.println("Los numeros multiplos de 2 son; "+cont2);
         }
         public void multiplos5(){
             System.out.println("Los numeros multiplos de 5 son; "+cont5);
         }
}
