package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDB {
    String numeBD = "eap";
    String url = "jdbc:mysql://localhost:3306/" + numeBD;
    String username = "user";
    String parola = "1234";

    public void deleteElev(int id) {
        try {
            Connection conn = DriverManager.getConnection(url, username, parola);
            String query = "delete from Elevi where id=" + id + ";";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteProfesor(int id) {
        try {
            Connection conn = DriverManager.getConnection(url, username, parola);
            String query = "delete from Profesori where id=" + id + ";";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void deleteDiriginte(int id) {
        try {
            Connection conn = DriverManager.getConnection(url, username, parola);
            String query = "delete from Diriginti where id=" + id + ";";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
