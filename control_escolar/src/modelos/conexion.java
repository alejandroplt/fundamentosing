package modelos;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;

public class conexion {

    //Conexion a la base de datos.
    Connection con;
    String url = "jdbc:mysql://localhost:3306/controlescolar";
    String user = "root";
    String pass = "";

    public Connection Conectar() {
        try {
            forName("com.mysql.jdbc.Driver");
            con = getConnection(url, user, pass);
        } catch (Exception e) {

        }
        return con;

    }
}
