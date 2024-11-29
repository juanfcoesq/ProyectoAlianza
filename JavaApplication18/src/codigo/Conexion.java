/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java 
 * Programación Orientada a Objetos
 */

package codigo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ana Sofía Rodríguez Castillo, 178815@upslp.edu.mx
 * @author Ana Sofía Rodriguez Castillo
 * @author 178815@upslp.edu.mx
 * @version 1.0
 */
public class Conexion {
    Connection con;
    
    public Connection Conexion(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alianza", "root", "");
            System.out.println("Se conectó (: ");
        }catch(ClassNotFoundException | SQLException e){ //No encuentra el driver //Hay un error en el sql
            System.out.println("Error" + e);
        }
        return con;
    }
    

}
