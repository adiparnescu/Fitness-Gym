package Clase_obiecte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class JDBC {

    Connection connection = null;

    public JDBC() throws ClassNotFoundException {


        try {
            connection = DriverManager.getConnection("https://www.db4free.net/phpMyAdmin/db_structure.php?server=1&db=saladefitness", "tamarel", "tamarel1457");
        } catch(SQLException ex)
        {
            System.out.println("Eroare la conectarea la BD: " + ex);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
