
package Poo;

/**
 *
 * @author HP
 */
public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private String motor;
    private double peso_plataforma;
    //
    private String color;
    private String modelo;
    private int puertas;
    
    //CONSTRUCTOS 
    //LLEVVA EL MISMO NOMBRE DE LA CLASE
    //inicializa las variables de la clase coche
    public Coche (){
       ruedas=4;
       largo=4;
       ancho=2;
       motor="2.0";
       peso_plataforma=1000;      

    }
    //metodo get
    public int infor_ruedas(){
        return ruedas;
    }
    //metodo set
    public void definir_color(String color_coche){
        color=color_coche;
    }
    //metodo get de color
    public String infor_color(){
        return color;
    } 
    //puertas
    public void definir_puertas(int num_puertas){
         puertas=num_puertas;
    }
    public int infor_puertas(){
        return puertas;
    }
            
}


