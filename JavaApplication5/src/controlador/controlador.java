/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import BDD.confBDD;
import conexionBDD.conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.articulo;

/**
 *
 * @author SISTEMAS
 */
public class controlador {
    PreparedStatement ps=null;
    confBDD conexion=new confBDD();
    ResultSet rs=null;
    public void ingresarArticulos(articulo nuevoArticulo){
//        String sqlInsert="insert into articulos(nombre,descripcion,precio) values(?,?,?) ";
        String select="select * from articulos";
        try {
            ps=conexion.getconexion().prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getFloat(4));
            }
//            ps.setString(1, nuevoArticulo.getNombre());
//            ps.setString(2, nuevoArticulo.getDescripcion());
//            ps.setFloat(3, nuevoArticulo.getPrecio());
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Datos ingresados correctaente");
            
        } catch (SQLException ex) {
            System.err.println("error: "+ ex);
            JOptionPane.showMessageDialog(null, "Error al ingresar datos");
//            Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
