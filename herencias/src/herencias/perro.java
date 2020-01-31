
package herencias;

public class perro extends animal{
    private float estatura;

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public perro(float estatura, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estatura = estatura;
    }

    public perro(float estatura) {
        this.estatura = estatura;
    }
    
    public void datosPerro(){
        System.out.println("nombre:  "+ getNombre() + " edad:  "+ getEdad() + " estatura:  "+ getEstatura());
        System.out.println(suma(1, 2));
    }
}
