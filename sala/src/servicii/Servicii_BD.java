package servicii;
import Clase_obiecte.JDBC;

import java.sql.*;

public class Servicii_BD {

    private static JDBC BazaDeDate;
    private static Connection conexiune;

    public Servicii_BD() throws ClassNotFoundException {
        BazaDeDate = new JDBC();
    }

    public void addClient(String name, String email, String nrtel, int varsta, String tipMembru) throws SQLException {
        conexiune = BazaDeDate.getConnection();

        String qrySQL = "INSERT INTO Clienti (Nume,Email,Nr_telefon,Varsta,Tip_membru) VALUES('" + name + "','" + email + "','" + nrtel + "','" + varsta + "','" + tipMembru + "')";
        PreparedStatement pst = conexiune.prepareStatement(qrySQL);

        pst.execute();

    }


    public void updateClient(String tip)throws SQLException{
        conexiune = BazaDeDate.getConnection();

        String qrySQL = "Update Clienti Set (Tip_membru='"+tip+"') where Tip_membru='gold'";
        PreparedStatement pst = conexiune.prepareStatement(qrySQL);

        pst.execute();


    }
    public void showClienti() throws SQLException {

        conexiune = BazaDeDate.getConnection();
        Statement statement = conexiune.createStatement();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String query = "SELECT * from Clienti";
        pst = conexiune.prepareStatement(query);
        rs = pst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("Nume") + " " + rs.getString("Email") + " " +
                    rs.getString("Nr_telefon") + " " + rs.getInt("Varsta") + " " +
                    rs.getString("Tip_membru"));
        }

    }

    public void addAbonament(String tip, int tarif, String datainceput, String dataexpirare, int client) throws SQLException {
        conexiune = BazaDeDate.getConnection();

        String qrySQL = "INSERT INTO Abonamente (Tip,Tarif,DataInceput,DataExpirare,ClientDetinator) VALUES('" + tip + "','" + tarif + "','" + datainceput + "','" + dataexpirare + "','" + client + "')";
        PreparedStatement pst = conexiune.prepareStatement(qrySQL);

        pst.execute();

    }

    public void showAbonamente() throws SQLException {

        conexiune = BazaDeDate.getConnection();
        Statement statement = conexiune.createStatement();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String query = "SELECT * from Abonamente";
        pst = conexiune.prepareStatement(query);
        rs = pst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("Tip") + " " + rs.getInt("Tarif") + " " +
                    rs.getString("DataInceput") + " " + rs.getString("DataExpirare") + " " +
                    rs.getInt("ClientDetinator"));
        }

    }


}
