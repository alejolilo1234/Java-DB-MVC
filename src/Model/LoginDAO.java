package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class LoginDAO {
    java.sql.Connection con = null;
    Model.Connection cone = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Model.Login login(String _name, String _id) {
        Model.Login mlog = new Model.Login();
        String sql = "SELECT * FROM usuariosTwo WHERE name = ? AND id = ?;";
        try {
            cone = new Model.Connection();
            con = cone.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, _name);
            ps.setString(2, _id);
            rs = ps.executeQuery();
            if (rs.next()) {
                mlog.setName(rs.getString("name"));
                mlog.setId(rs.getString("id"));
                System.out.println(mlog.toString());
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
