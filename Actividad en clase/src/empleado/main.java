
package empleado;

public class main {
    public static void main(String[] args) {
        empleadosalariado es=new empleadosalariado(40, "Gabriel", "Fierro", 1752509206);
        empleadoporcomision ec=new empleadoporcomision(12, -3, "Gabriel", "Fierro", 1752509206);
        empleadoporhoras eh=new empleadoporhoras(8, 4, "Gabriel", "Fierro", 1752509206);
        empleadoporcomision epc=new empleadobasemascomision(5, 12, 3, "Gabriel", "Fierro", 1752509206);
        System.out.println(es);
        System.out.println(ec);
        System.out.println(eh);
        System.out.println(epc);
    }
}
