
package controlador;

import java.util.ArrayList;

public class user {

    ArrayList ListaPersonas = new ArrayList<String>();
    
    public String agregarPersona(String nombre){
        ListaPersonas.add(nombre);
        return "Persona agregada correctamente " + nombre;
    }
    
    public String listaPersonas(){
        String lista="";
        for (int i = 0; i < ListaPersonas.size(); i++) {
            System.out.println(ListaPersonas.get(i));
            lista +=ListaPersonas.get(i).toString() + "\n";
        }
        return lista;
    }
}


