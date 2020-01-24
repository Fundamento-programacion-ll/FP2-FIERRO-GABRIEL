
import javax.swing.JOptionPane;


public class tokens {

    public static void main(String[] args) {
         
        int dimension=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la direccion"));
        vector vec=new vector(dimension);
        vec.totalprimos();
        System.out.println(vec);
        System.out.println(""+ vec.totalprimos());
    } 
}
