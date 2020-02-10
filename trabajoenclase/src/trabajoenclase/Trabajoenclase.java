
package trabajoenclase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Trabajoenclase {

    public static void main(String[] args) {
        String opcion;
        double sueldoa,sueldod,sueldol;
        for (int i = 0; i < 4; i++) {
            opcion=JOptionPane.showInputDialog(null, "Menu\n"+"\n1- Empleado Administrativo."+"\n2- Empleado Docentes."+"\n3- Empleado de  Limpieza."+"\n4- Sueldos");             
            if(opcion.equalsIgnoreCase("1")){
                administrativo admin=new administrativo();
                System.out.println(admin);
            }else if(opcion.equalsIgnoreCase("2")){
                docente doc=new docente();
                System.out.println(doc);
            }else if(opcion.equalsIgnoreCase("2")){
                limpieza limp=new limpieza();
                System.out.println(limp);
            }else if(opcion.equalsIgnoreCase("4")){
                String datos = JOptionPane.showInputDialog(null, "Ingrese los sueldos (administrativo,docentes,limpieza) separados por ","");
                StringTokenizer tokens = new StringTokenizer(datos, ",");
                sueldoa=Double.parseDouble(tokens.nextToken());
                sueldod=Double.parseDouble(tokens.nextToken());
                sueldol=Double.parseDouble(tokens.nextToken());
                sueldo su1 = new sueldo("Administrativo", (int) sueldoa);
                sueldo su2 = new sueldo("Docentes", (int) sueldod);
                sueldo su3 = new sueldo("Limpieza", (int) sueldol);
                ArrayList <sueldo> lista = new ArrayList();
                lista.add(su1);
                lista.add(su2);
                lista.add(su3);
                Collections.sort(lista, new comparacion());
                System.out.println(lista);
            }else{
                JOptionPane.showMessageDialog(null, "Esta opcion no existe");
            }  
        } 
    }
}
