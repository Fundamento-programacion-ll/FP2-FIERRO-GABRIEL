package trabajoenclase;

import java.util.ArrayList;

public class listaempleados {
    private ArrayList<persona> lista;

    public listaempleados() {
        this.lista = new ArrayList<>();
    }
    
    public listaempleados(ArrayList<persona> lista) {
        this.lista = lista;
    }

    public ArrayList<persona> getLista() {
        return lista;
    }

    public void setLista(ArrayList<persona> lista) {
        this.lista = lista;
    }
    
    public void agregarPersona(persona per){
        this.lista.add(per);
    }
    @Override
    public String toString() {
        return "Lista provincias \n"+lista;
    } 
}
