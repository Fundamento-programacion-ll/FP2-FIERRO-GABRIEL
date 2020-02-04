
package Banco;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejecutable {

    public static void main(String[] args) {
        String [] nombreCuenta;
        int [] numCuenta;
        float [] saldoInicial;
        
        int n;
        int opcion1;
        int opcion; 
        Scanner sc=new Scanner(System.in);
        
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido \n"+ "1. Agregar Cuenta \n"+ "2. Retiro \n"+ "3. Deposito \n"+ "4. Salir \n"));
        
        do {
            switch (opcion) {
                case 1:
                    JOptionPane.showInputDialog(null, "Ingrese el numero de cuentas a ingresar");
                    n=sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        nombreCuenta = new String[n];
                        saldoInicial = new float[n];
                        numCuenta =new int[n];
                        String b= JOptionPane.showInputDialog(null, "INGRESE UN NOMBRE");
                        nombreCuenta[i]=sc.next();
                        String c= JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE CUENTA");
                        numCuenta[i]=sc.nextInt();
                        solicitudSaldo sS=new solicitudSaldo(numCuenta[i]);
                        sS.setNumCuenta(numCuenta[i]);
                        JOptionPane.showInputDialog(null, "INGRESE EL SALDO INICIAL");
                        saldoInicial[i]=sc.nextInt();
                        sS.setDinero(saldoInicial[i]);
                    }
                    break;
                case 2:
                    
                    break;
                case 3:

                    break;
                case 4:

                    break;    
                default:
                    break;
            }
        }while (opcion != 3);
            

        
//        solicitudSaldo sS=new solicitudSaldo(870, 1752509206);
//        System.out.println(sS);
//        retiros r=new retiros(95.40, 1752509206);
//        System.out.println(r);t
//        deposito d=new  deposito(55, 1752509206);
//        System.out.println(d);
    }
    
}
