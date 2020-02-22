
package estructura_for;
import java.util.Scanner;

public class Ejenclase3 {
    public static void main(String[] args) {
        int num;
        int i;
        double multiplicacion;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el número a multiplicar");
        num=sc.nextInt();
        System.out.println("TABLA DEL "+num);
        for(i=1; i<=12; i=i+1){
            multiplicacion=num*i;
            System.out.println(num+"x"+i+"="+multiplicacion);
        }
         
    }
}
