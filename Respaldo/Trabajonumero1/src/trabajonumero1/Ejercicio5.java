
package trabajonumero1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio5 {
    public static void main(String[] args) {
       
        double dolar;
        double euro;
        double franco;
        double pesos;
        double euro1;
        double franco2;
        double pesos3;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Transformar dolares en euros,pesos,francos");
        System.out.println("Digite la catidad de dolares a transformar");
        dolar=sc.nextDouble();
        
        euro=1/1.14;
        pesos=1/18.98;
        franco=1/1.01;
        euro1=dolar*euro;
        franco2=dolar*franco;
        pesos3=dolar*pesos; 
        
        
        System.out.println("Los Dolares equivalen a "+euro1+" Euros");
        System.out.println("Los Dolares equivalen a "+pesos3+" Pesos Mexicanos");
        System.out.println("Los Dolares equivalen a "+franco2+" Francos Suizos");

    }
}
