/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
/**
 *
 * @author Asus
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/hotel";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, username, password);
            } catch (SQLException t) {
                JOptionPane.showMessageDialog(null, "Error koneksi: " + t.getMessage());
            }
        }
        return koneksi;
          
    }
    static Object getConnection(){
            throw new UnsupportedOperationException ("Not yet implemented");
        }

    // Remove this line, as it seems to be a placeholder and is causing a syntax error
    // static Object getConnection () { throw new UnsupportedOperationException ("Not yet implemented"); }
}
