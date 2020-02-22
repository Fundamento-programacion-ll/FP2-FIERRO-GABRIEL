
package Poo;

import java.util.Scanner;

/**
 *
 * @author HP
 */

public class CocheEjecutable {
    public static void main(String[] args) {
       String color_coche;
       int num_puertas;
        
        Coche chevrolet=new Coche();//Instanciar la clase
        Scanner sc=new Scanner(System.in);
         
        //System.out.println("El numero de ruedas del carro son: "+chevrolet.ruedas+" ruedas");
        System.out.println("El automovil tiene : "+chevrolet.infor_ruedas()+" ruedas");
        
        System.out.println("Ingrese el color de su coche");
        color_coche=sc.nextLine();
               
        chevrolet.definir_color(color_coche);
        System.out.println("El auto es de color :"+chevrolet.infor_color());
        
        System.out.println("Ingrese el numero de puertas");
        num_puertas=sc.nextInt();
        chevrolet.definir_puertas(num_puertas);
        System.out.println("El automovil tiene "+chevrolet.infor_puertas()+" puertas");
    }
    
}
