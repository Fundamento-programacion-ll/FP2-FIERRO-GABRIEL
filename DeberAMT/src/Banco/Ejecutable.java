
package Banco;

public class Ejecutable {

    public static void main(String[] args) {
        solicitudSaldo sS=new solicitudSaldo(870, 1752509206);
        System.out.println(sS);
        retiros r=new retiros(95.40, 1752509206);
        System.out.println(r);
        deposito d=new  deposito(55, 1752509206);
        System.out.println(d);
    }
    
}
