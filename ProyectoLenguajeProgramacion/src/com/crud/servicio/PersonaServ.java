
package com.crud.servicio;

import com.crud.dao.PersonaMetodos;
import com.crud.modelo.Perfil;
import com.crud.modelo.Persona;
import java.util.List;

public class PersonaServ {
    public static List<Persona> ListarPersona(){
        return new PersonaMetodos().ListarPersona();
    }

    public static Persona BuscarPersonaID(int Id) {
        return new PersonaMetodos().BuscarPersonaID(Id);
    }

    public static void InsertarPersona(Persona cli) {
        new PersonaMetodos().InsertarPersona(cli);
    }

    public static void ActualizarPersona(Persona persona) {
        new PersonaMetodos().ActualizarPersona(persona);
    }

    public static void EliminarPersona(String Idp) {
        new PersonaMetodos().EliminarPersona(Idp);
    }
    
    public static Perfil autenticarUsuario(String usuario, String clave){
        return new PersonaMetodos().autenticarUsuario(usuario, clave);
    }
}
