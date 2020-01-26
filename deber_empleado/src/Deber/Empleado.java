
package Deber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Empleado {
    private String nombre;
    private String apellido;
    public String fecha_ingreso;
    private String fecha_nacimiento;
    private double salario;
    String [] empleados ;
    float [] sueldos ;
    String [] antiguo;
    int n;

    public String[] getAntiguo() {
        return antiguo;
    }

    public void setAntiguo(String[] antiguo) {
        this.antiguo = antiguo;
    }

    
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String[] empleados) {
        this.empleados = empleados;
    }

    public float[] getSueldos() {
        return sueldos;
    }

    public void setSueldos(float[] sueldos) {
        this.sueldos = sueldos;
    }
    

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void mayor_salario (){
        Date fecha = null;
        Date fechapr = null;
        Date fecha1 = null;
        String nombreMayor;
        float mayorSueldo;
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE EMPLEADOS");
        n =sc.nextInt();
        empleados = new String[n];
        sueldos = new float[n];
        antiguo =new String[n];
        mayorSueldo = sueldos[i];
        nombreMayor = empleados[i];
        for (i = 0; i < n; i++) {
            System.out.println("-------EMPLEADO NUMERO "+(i + 1)+" -------");
            System.out.print("Nombre del Empleado: "+"\n");
            empleados[i]=sc.next();
            System.out.println("Apellido del Empleado:");
            apellido=sc.next();
            System.out.println("Fecha de Ingreso del del Empleado:");
            antiguo[i]=sc.next();
            System.out.println("Fecha de Nacimiento del Empleado:");
            fecha_nacimiento=sc.next();
            System.out.print("Salario del Empleado:"+"\n");
            sueldos[i]=sc.nextFloat();
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = empleados[i];
            }
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String strFecha = antiguo[i];
            boolean fechamx;
            try {
                fecha = sdf.parse(strFecha);
                fecha1 = sdf.parse("0000-00-00");

                fechamx = fecha1.before(fecha);

                if (fechamx == true) {
                    fechapr = fecha;
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Nombre del empleado con mayor sueldo: " + nombreMayor);
        System.out.println("Su sueldo es: " + mayorSueldo);
        System.out.println("Fecha del empleado mas antiguo: " + fechapr.toString());
    }   
}
