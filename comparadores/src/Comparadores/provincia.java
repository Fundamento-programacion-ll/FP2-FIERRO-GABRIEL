
package Comparadores;

public class provincia {
    private String nombreProvincia;
    private int numHabitantes;

    public provincia() {
    }

    public provincia(String nombreProvincia, int numHabitantes) {
        this.nombreProvincia = nombreProvincia;
        this.numHabitantes = numHabitantes;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }
    @Override
    public String toString(){
        return "Privincias"+"nombre: \n"+nombreProvincia+" habitantes: \n"+numHabitantes;
        
    }
}
