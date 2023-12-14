/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import javax.swing.*;
import controller.Koneksi;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author Asus
 */
public class Manajemen extends javax.swing.JFrame {

    Connection conn = Koneksi.getKoneksi();
    ResultSet rs = null;
    PreparedStatement pst = null;

    public ResultSet cekKamar() {
        String sql = "SELECT * FROM customer WHERE status=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "Sudah");
            return pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
