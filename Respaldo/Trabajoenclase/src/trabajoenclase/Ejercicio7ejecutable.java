
package trabajoenclase;

import java.util.Scanner;

public class Ejercicio7ejecutable {
    public static void main(String[] args) {
        double rand;
        Scanner sc=new Scanner(System.in);

        double [][]numeros=new double[3][3];
        
        
        //incersion de datos
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                rand=Math.random()*100;
                System.out.println("El numero en la posicion "+i+" , "+j+" es; "+rand);
            }
        } 
    }
}
