
package com.crud.dao;

import com.crud.modelo.Medicina;
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

public class MedicinaMetodos implements IMedicina {
    private Connection con;
    
    public MedicinaMetodos() {
        if (con == null) {
            con = ConexionJDBC.getConnection();
        }
    }

    private void closeConnection() {
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(" Error al cerrar la conexion " + ex.getMessage());
        }
    }

    @Override
    public List<Medicina> ListarMedicina() {
        List<Medicina> listaMedicinas = new ArrayList<Medicina>();
        Medicina medicina = null;
        String sqlPersona = "SELECT * FROM medicinas m";
        Statement stMedicina = null;
        ResultSet rsMedicina = null;
        try {
            stMedicina = con.createStatement();
            rsMedicina = stMedicina.executeQuery(sqlPersona);

            while (rsMedicina.next()) {             
                
                String cod = rsMedicina.getString("id_medicina");
                String nom = rsMedicina.getString("nombre_medicina");
                String dos = rsMedicina.getString("dosis_medicina");
                Date fecha = rsMedicina.getDate("fecha_vencimiento");
                String trat = rsMedicina.getString("nombre_medico");
                medicina = new Medicina(cod, nom, dos, fecha, trat);
                listaMedicinas.add(medicina);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicinaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rsMedicina.close();
            } catch (SQLException ex) {
                Logger.getLogger(MedicinaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return listaMedicinas;
    }

    @Override
    public Medicina BuscarMedicinaCod(String cod) {
            Medicina medicina = null;
            String sqlPersona =  "{call consultaMedicinas2(?,?,?,?,?)}";
            PreparedStatement psMedicina = null;
            ResultSet rsMedicina = null;
            try {
            psMedicina = con.prepareStatement(sqlPersona);
            psMedicina.setString(1, cod);
            rsMedicina = psMedicina.executeQuery(); 
            while (rsMedicina.next()) {
                
                String nom = rsMedicina.getString("nombre_medicina");
                String dos = rsMedicina.getString("dosis_medicina");
                Date fecha = rsMedicina.getDate("fecha_vencimiento");
                String trat = rsMedicina.getString("nombre_medico");
                
                
                medicina = new Medicina(cod, nom, dos, fecha, trat);
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsMedicina.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return medicina;    
    }
}
