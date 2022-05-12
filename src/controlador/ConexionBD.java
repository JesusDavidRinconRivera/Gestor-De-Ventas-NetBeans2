package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yeiim
 */
public class ConexionBD {
    Connection con;
    String driver = "com.mysql.cj.jdbc.Driver";
    String dbName = "productos";
    String url = "jdbc:mysql://localhost:3306/"+dbName+"?useSSL=false&serverTimezone=UTC";
    String usuario = "root";
    String clave = "123456789";
    
    public Connection conectarBaseDatos(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion: "+ e);
        }
        return con;
    }
}
