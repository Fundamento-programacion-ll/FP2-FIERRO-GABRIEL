package conexionBDD;

import BDD.confBDD;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.articulo;


public class conector {
    public static void main(String[] args) {
        PreparedStatement ps=null;
        confBDD conexion = new confBDD();
        conexion.getconexion();
        ResultSet rs=null;
        articulo nuevoArticulo=new articulo();
        nuevoArticulo.setNombre("nintendo");
        nuevoArticulo.setDescripcion("Consola de juegos");
        nuevoArticulo.setPrecio(400);
        
//        //insertar datos
//        String insert= "insert into articulos(nombre,descripcion,precio) values(?,?,?) ";
//        
//        try {
//            ps=(PreparedStatement) stringConexion.getconexion().prepareStatement(insert);
//            ps.setString(1, nuevoArticulo.getNombre());
//            ps.setString(2, nuevoArticulo.getDescripcion());
//            ps.setFloat(3, nuevoArticulo.getPrecio());
//            ps.executeUpdate();
//        } catch (SQLException ex) {
String select="select nombre from articulos where idarticulo = ?";
        try {
            ps=(PreparedStatement) conexion.getconexion().prepareStatement(select);
            ps.setInt(1, 2);
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
            Logger.getLogger(conector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
