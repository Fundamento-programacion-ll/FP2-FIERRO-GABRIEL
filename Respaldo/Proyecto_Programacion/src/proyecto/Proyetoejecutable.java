
package proyecto;

import java.util.Scanner;

public class Proyetoejecutable {

    public static void main(String[] args) {
          int op;
          double total;
          double totaliva;
          int acumpasteles=0;
          int acumcubierta=0;
          int acumextras=0;
          String nombre;
          String direccion;
          int cedula;
          int telefono;
          String email;
        
        Scanner sc=new Scanner(System.in);
        Proyectoclase1 pr=new Proyectoclase1();
        
        pr.menu();
        op=sc.nextInt();
        
        switch(op){
            case 1:System.out.println("Escogio Consumidor Final");
                   System.out.println("Cedula Cliente : 9999999999");
                   System.out.println("Nombre Cliente : Consumidor Final");
                   System.out.println("E-mail Cliente : No definido");
                   System.out.println("Direccion : No definido");
                   System.out.println("Telefono : No definido");
                   System.out.println("");
                   total=acumpasteles+acumcubierta+acumextras;
                   totaliva=(total*0.12)+total;
                   System.out.println("Total a Pagar sin IVA es de: "+total);
                   System.out.println("El total a pagar con IVA es de: "+totaliva);
                   
            break;
            case 2:System.out.println("Escogio Factura con datos");
                   System.out.println("Ingrese su nombre");
                   nombre=sc.next();
                   System.out.println("Ingrese su numero de cedula");
                   cedula=sc.nextInt();
                   System.out.println("Ingrese su direccion");
                   direccion=sc.next();
                   System.out.println("Ingrese su telefono");
                   telefono=sc.nextInt();
                   System.out.println("Ingrese su email de contacto");
                   email=sc.next();
                   System.out.println("FACTURA CON DATOS");
                   System.out.println("Cedula Cliente : "+cedula);
                   System.out.println("Nombre Cliente : "+nombre);
                   System.out.println("E-mail Cliente : "+email);
                   System.out.println("Direccion : "+direccion);
                   System.out.println("Telefono : "+0+telefono);
                   total=acumpasteles+acumcubierta+acumextras;
                   totaliva=(total*0.12)+total;
                   System.out.println("Total a Pagar sin IVA es de: "+total);
                   System.out.println("El total a pagar con IVA es de: "+totaliva);
                   
            break;
            default:System.out.println("Esa opcion no existe");
            break;
        }
    }
} 

