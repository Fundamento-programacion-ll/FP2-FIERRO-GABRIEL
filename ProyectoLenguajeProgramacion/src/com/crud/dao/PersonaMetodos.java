
package com.crud.dao;

import com.crud.modelo.Perfil;
import com.crud.modelo.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaMetodos implements IPersona{
    
    private Connection conn;
    
    public PersonaMetodos() {
        if (conn == null) {
            conn = ConexionJDBC.getConnection();
        }
    }

    private void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(" Error al cerrar la conexion " + ex.getMessage());
        }
    }

    @Override
    public List<Persona> ListarPersona() {
        List<Persona> listaClientes = new ArrayList<Persona>();
        Persona persona = null;
        String sqlPersona = "SELECT * FROM pacientes p";
        Statement stPersona = null;
        ResultSet rsPersona = null;
        try {
            stPersona = conn.createStatement();
            rsPersona = stPersona.executeQuery(sqlPersona);

            while (rsPersona.next()) {             
                
                int id = rsPersona.getInt("cedula");
                String nom = rsPersona.getString("nombre");
                String ape = rsPersona.getString("apellido");
                Date fecha = rsPersona.getDate("fecha_nac");
                String trat = rsPersona.getString("tratamiento");
                Boolean edad = rsPersona.getBoolean("edad");
                persona = new Persona(id, nom, ape, fecha, trat, edad);
                listaClientes.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rsPersona.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return listaClientes;
    
    }
    

    @Override
    public Persona BuscarPersonaID(int Id) {
        Persona persona = null;
        String sqlPersona =  "SELECT * FROM pacientes p WHERE p.cedula = ?";
        PreparedStatement psPersona = null;
        ResultSet rsPersona = null;

        try {
            psPersona = conn.prepareStatement(sqlPersona);
            psPersona.setInt(1, Id);
            rsPersona = psPersona.executeQuery();

            while (rsPersona.next()) {
                String nom = rsPersona.getString("nombre");
                String ape = rsPersona.getString("apellido");
                Date fecha = rsPersona.getDate("fecha_nac");
                String trat = rsPersona.getString("tratamiento");
                Boolean edad = rsPersona.getBoolean("edad");
                persona = new Persona(Id, nom, ape, fecha, trat, edad);
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsPersona.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return persona;
    }
    
    @Override
    public void InsertarPersona(Persona cli) {
        long fecha = cli.getFecha_nac().getTime();
        java.sql.Date fechaNac = new java.sql.Date(fecha);

        String sqlPersona = "{call incertarPaciente(?,?,?,?,?)}";
        PreparedStatement psPersona = null;
        try {
            psPersona = conn.prepareStatement(sqlPersona);
            psPersona.setString(1, cli.getNombre());
            psPersona.setString(2, cli.getApellido());
            psPersona.setDate(3, fechaNac);
            psPersona.setString(4, cli.getTratamiento());
            psPersona.setBoolean(5, cli.getEdad());
            psPersona.executeUpdate();
            
            

        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psPersona.close();
                closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void ActualizarPersona(Persona persona) {
        long fecha = persona.getFecha_nac().getTime();
        java.sql.Date fechaNac = new java.sql.Date(fecha);

        String sqlPersona = "{call sp_autenticar(?,?,?)}";
        PreparedStatement psPersona = null;

        try {
            psPersona = conn.prepareStatement(sqlPersona);
            psPersona.setString(1, persona.getNombre());
            psPersona.setString(2, persona.getApellido());
            psPersona.setDate(3, fechaNac);
            psPersona.setString(4, persona.getTratamiento());
            psPersona.setBoolean(5, persona.getEdad());
            psPersona.setInt(6, persona.getId_persona());
            psPersona.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psPersona.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
    }

    @Override
    public void EliminarPersona(String Idp) {
        String sqlPersona = "DELETE FROM pacientes WHERE cedula=?";
        PreparedStatement psPersona = null;

        try {
            psPersona = conn.prepareStatement(sqlPersona);
            psPersona.setString(1, Idp);
            psPersona.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psPersona.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
    }

    @Override
    public Perfil autenticarUsuario(String usuario, String clave) {
        Perfil perfil = null;
        String sqlPerfil = "{call sp_autenticar(?,?,?)}";
        try {
            CallableStatement csPerfil = conn.prepareCall(sqlPerfil);
            csPerfil.registerOutParameter(1, java.sql.Types.BOOLEAN);
            csPerfil.setString(2, usuario);
            csPerfil.setString(3, clave);
            if (csPerfil.execute()) {
                if (csPerfil.getBoolean(1)) { //si la autenticacion es exitosa, sacamos el resultSet
                    ResultSet rsPerfil = csPerfil.getResultSet();
                    if (rsPerfil.next()) {
                        String usu = rsPerfil.getString("USUARIO");
                        String nom = rsPerfil.getString("NOMBRE");
                        char per = rsPerfil.getString("PERMISO").charAt(0);
                        perfil = new Perfil(usu, nom, per);
                    }
                }
            }
            csPerfil.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo autenticar usuario: " + ex.getMessage());
        } finally {
            closeConnection();
        }
        return perfil;
    }


  
}
