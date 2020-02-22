
package ejercicios;
import java.util.Scanner;
public class Ejercicio6ejecutable {
    public static void main(String[] args) {
        int op1;
        int op2;
        double acum1;
        double acum2;
        double acum3;
        double acum4;
        double acum5;
        double acum6;
        double acum7;
        double acum8;
        double acum9;
        double acumtotal1;
        double acumtotal2;
        double acumtotal3;
        double acumfinal;
        double valorpagar;
        double cont1;
        double cont2;
        double cont3;
        double contfinal2;
        double precio1=0;
        double precio2=0;
        double precio3=0;
        double descuento;
        cont1=0;
        cont2=0;
        cont3=0;
        contfinal2=0;
        acum1=0;
        acum2=0;
        acum3=0;
        acum4=0;
        acum5=0;
        acum6=0;
        acum7=0;
        acum8=0;
        acum9=0;
        acumtotal1=0;
        acumtotal2=0;
        acumtotal3=0;
        
        Scanner sc=new Scanner(System.in);
        Ejercicio6 eje6=new Ejercicio6();
        do{
           eje6.menu();
        op1=sc.nextInt();
        switch (op1){
            case 1: do{
                    System.out.println("Escogio bebidas cual desea comprar");
                    System.out.println("1.Coca cola $0.50");
                    System.out.println("2.Jugo $1.00");
                    System.out.println("3.Te $0.80");
                    System.out.println("salir");
                    op2=sc.nextInt();
                    switch(op2){
                        case 1:
                               acum1=(acum1+0.5);
                        break;
                        case 2:
                               acum2=(acum2+1);
                        break;
                        case 3:
                               acum3=(acum3+0.8);
                        break;
                        default:
                        break;    
                    }
                    acumtotal1=(acum1+acum2+acum3);
                    }while(op2!=4);
            break;
            case 2: do{
                    System.out.println("Escogio platos cual desea comprar");
                    System.out.println("1.Salchipapa $ 2.00");
                    System.out.println("2.Seco de pollo $3.00");
                    System.out.println("3.Hamburguesa $2.50");
                    System.out.println("salir");
                    op2=sc.nextInt(); 
                    switch(op2){
                        case 1:
                              acum4=(acum4+2);
                              cont1++;
                        break;
                        case 2:
                              acum5=(acum5+3);
                              cont2++;
                        break;
                        case 3:
                              acum6=(acum6+2.5);
                              cont3++;
                        break;
                        default:
                        break;               
                    }
                   acumtotal2=(acum4+acum5+acum6);
                   contfinal2=cont1+cont2+cont3;
            }while(op2!=4);
            break;
            case 3: do{
                    System.out.println("Escogio postres cual desea comprar");
                    System.out.println("1.Tres leches $1.50");
                    System.out.println("2.Pai de manzana $2.00");
                    System.out.println("3.Flan $1.50");
                    System.out.println("salir");
                    op2=sc.nextInt(); 
                    switch(op2){
                        case 1:
                               acum7=(acum7+1.5);
                        break;
                        case 2:
                               acum8=(acum8+2);
                        break;
                        case 3:
                               acum9=(acum9+1.5);
                        break;
                        default:
                        break;  
                    }
                      acumtotal3=(acum7+acum8+acum9);
            }while(op2!=4);
            break;
            case 4:
                    acumfinal=(acumtotal1+acumtotal2+acumtotal3);
                    valorpagar=acumfinal;
                    System.out.println("El total a pagar sin descuento es:"+valorpagar);
                    if(contfinal2>=6){
                       descuento=(valorpagar*0.15);
                       valorpagar=valorpagar-descuento;
                       System.out.println("El total a pagar es: "+valorpagar+"$");
                       System.out.println("Usted obtuvo un descuento del 15%");
                    }else if(contfinal2==5){
                       descuento=(valorpagar*0.10);
                       valorpagar=valorpagar-descuento;
                       System.out.println("El total a pagar es: "+valorpagar+"$");
                       System.out.println("Usted obtuvo un descuento del 10% ");
                    }else if(contfinal2==4){
                       descuento=(valorpagar*0.05);
                       valorpagar=valorpagar-descuento;
                       System.out.println("El total a pagar es: "+valorpagar+"$");
                       System.out.println("Usted obtuvo un descuento del 5%");
                    }
                    eje6.bebida(acumtotal3);
                    System.out.println("GRACIAS POR PREFERIRNOS");
            break;       
            case 5:System.out.println("GRACIAS POR PREFERIRNOS");
            break;
    }   
        }while(op1!=4);
}
}
