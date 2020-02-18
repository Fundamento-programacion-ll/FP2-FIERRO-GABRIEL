
package com.crud.dao;

import com.crud.modelo.Perfil;
import com.crud.modelo.Persona;
import java.util.List;

public interface IPersona {
    
    public List<Persona> ListarPersona();

    public Persona BuscarPersonaID(int Id);

    public void InsertarPersona(Persona cli);

    public void ActualizarPersona(Persona persona);

    public void EliminarPersona(String Idp);

    public Perfil autenticarUsuario(String usuario, String clave);
    
}
