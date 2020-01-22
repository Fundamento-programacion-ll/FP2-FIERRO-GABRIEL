
import java.util.Scanner;


public class serie {

    public static void main(String[] args) {
        Scanner obtenerNumero = new Scanner(System.in);
        int numero;
 
        System.out.print("indica el numero a calcular: ");
        numero = obtenerNumero.nextInt();
        
        calculo cal=new calculo(numero);
        cal.setN(numero);
        
        System.out.println("Respuesta :"+cal.calculodeserie(numero));

    }
}
