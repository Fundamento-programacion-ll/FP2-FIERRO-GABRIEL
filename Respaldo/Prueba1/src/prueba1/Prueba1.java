
package prueba1;

/**
 *
 * @author HP
 */
public class Prueba1 {
    double notas;

    public void prueba1(double calificaciones,String nombre,double cedula){
        if (calificaciones>=21){
            System.out.println("Ingrese una calificacion valida");
        }else if(calificaciones<=20 && calificaciones>=19){
            System.out.println("El estudiante "+nombre+" con numero de cedula "+cedula+" tiene una calificacion SOBRESALIENTE");
        }else if(calificaciones<=18 && calificaciones>=16){
            System.out.println("El estudiante "+nombre+" con numero de cedula "+cedula+" tiene una calificacion MUY BUENA");
        }else if(calificaciones<=15 && calificaciones>=14){
            System.out.println("El estudiante "+nombre+" con numero de cedula "+cedula+" tiene una calificacion BUENA");
        }else if(calificaciones<14 && calificaciones>=0){
            System.out.println("El estudiante "+nombre+" con numero de cedula "+cedula+" tiene una calificacion REGULAR");
        }else if(calificaciones<0){
            System.out.println("Ingrese una calificacion valida");
        }
        
    }
           
}
