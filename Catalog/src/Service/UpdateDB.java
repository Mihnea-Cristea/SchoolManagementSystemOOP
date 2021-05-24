package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDB {
    String numeBD = "eap";
    String url = "jdbc:mysql://localhost:3306/" + numeBD;
    String username = "user";
    String parola = "1234";

    public void updateProfesor(int id, int severitate) {
        try {
            Connection conn = DriverManager.getConnection(url, username, parola);
            String query = "update Profesori set severitate="+ severitate+ "where id="+id+";";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void updateDiriginte(int id, int clasa, char literaClasa) {
        try {
            Connection conn = DriverManager.getConnection(url, username, parola);
            String query = "update Diriginti set clasa=" + clasa +", literaclasa="+literaClasa+"where id="+id+";";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
