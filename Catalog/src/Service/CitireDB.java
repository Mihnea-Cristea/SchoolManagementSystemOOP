package Service;

import Persoane.Diriginte;
import Persoane.Elev;
import Persoane.Profesor;

import java.sql.*;

public class CitireDB {
    String numeBD = "eap";
    String url = "jdbc:mysql://localhost:3306/" + numeBD;
    String username = "user";
    String parola = "1234";

    public void selectElevi(Elev[] elevi)
    {
        try {
            Connection conn = DriverManager.getConnection(url, username, parola);
            String query = "select * from Elevi";
            Statement statement = conn.createStatement();
            ResultSet resSet = statement.executeQuery(query);
            int i = 0;
            while (resSet.next()) {
                String nume = resSet.getString("nume");
                int varsta = resSet.getInt("varsta");
                int clasa = resSet.getInt("clasa");
                String literaClasa = resSet.getString("literaclasa");
                i++;
                elevi[i] = new Elev(nume, varsta, clasa, literaClasa.charAt(0));

            }
            conn.close();
        } catch (SQLException throwables)
            {
                throwables.printStackTrace();
            }
    }
    public void selectProfesori(Profesor[] profi)
    {
        try {
            Connection conn = DriverManager.getConnection(url, username, parola);
            String query = "select * from Profesori";
            Statement statement = conn.createStatement();
            ResultSet resSet = statement.executeQuery(query);
            int i = 0;
            while (resSet.next())
            {
                String nume = resSet.getString("nume");
                int varsta = resSet.getInt("varsta");
                String materie = resSet.getString("materie");
                int severitate = resSet.getInt("severitate");
                i++;
                profi[i] = new Profesor(nume, varsta, materie, severitate);
            }
            conn.close();
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }

    public void selectDiriginti(Diriginte[] diriginti)
    {
        try {
            Connection conn = DriverManager.getConnection(url, username, parola);
            String query = "select * from Profesori";
            Statement statement = conn.createStatement();
            ResultSet resSet = statement.executeQuery(query);
            int i = 0;
            while (resSet.next())
            {
                String nume = resSet.getString("nume");
                int varsta = resSet.getInt("varsta");
                String materie = resSet.getString("materie");
                int severitate = resSet.getInt("severitate");
                int clasa = resSet.getInt("clasa");
                String literaClasa = resSet.getString("literaclasa");
                i++;
                diriginti[i] = new Diriginte(nume, varsta, materie, severitate,clasa,literaClasa.charAt(0));
            }
            conn.close();
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
}
