
package BDD;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class confBDD {
    Connection conexion;
    String url="jdbc:mysql://localhost:32777/prueba?useSSL=false";
    String usuario="admin";
    String password="12345678";
   
    
    public confBDD(){
        try {
            conexion=(Connection) DriverManager.getConnection(url, usuario, password);
            if(conexion != null){
                System.out.println("Se conecto");
            }else{
                System.out.println("No se conecto");
            }
        } catch (SQLException ex) {
            System.err.println("Error de conexion");
            ex.printStackTrace();
        }
    }
    
    public Connection getconexion(){
        return conexion;
    }
    public void Desconectarse(){
        conexion = null;
    }
}

