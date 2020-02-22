/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.producto;

/**
 *
 * @author gabri
 */
public class ASD {
    public static void main(String[] args) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        producto nuevoproducto = new producto();
        conexionJDBC Stringconexion = new conexionJDBC();
        Stringconexion.getConnection();
        
        String select =
"SELECT * FROM baseproyecto.producto";
        
        try {
            ps = Stringconexion.getConnection().prepareStatement(select);
            rs = ps.executeQuery(); // obtener resultados
            while (rs.next()) {                
                // 1 id
                // ver todo lo de id = 2
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getFloat(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ASD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
