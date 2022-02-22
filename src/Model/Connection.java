package Model;

import View.DBPassword;

import javax.swing.*;
import java.sql.*;

public class Connection {

    public java.sql.Connection getConnection() throws SQLException {

        java.sql.Connection con = null;
        DBPassword db = new DBPassword();

        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyectopi?serverTimezone=UTC",
                                         "postgres",
                                               db.getPassWord());
        if(con != null) {
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
            return con;
        }
        return null;
    }
}
