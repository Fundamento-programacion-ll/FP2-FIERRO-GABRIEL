package conexionBDD;

import BDD.confBDD;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.articulo;


public class conector {
    public static void main(String[] args) {
        PreparedStatement ps=null;
        confBDD stringConexion = new confBDD();
        stringConexion.getconexion();
        articulo nuevoArticulo=new articulo();
        nuevoArticulo.setNombre("nintendo");
        nuevoArticulo.setDescripcion("Consola de juegos");
        nuevoArticulo.setPrecio(400);
        
        //insertar datos
        String insert= "insert into articulos(nombre,descripcion,precio) values(?,?,?) ";
        
        try {
            ps=(PreparedStatement) stringConexion.getconexion().prepareStatement(insert);
            ps.setString(1, nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescripcion());
            ps.setInt(3, nuevoArticulo.getPrecio());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
