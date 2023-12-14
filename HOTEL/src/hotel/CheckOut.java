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

/**
 *
 * @author Asus
 */
public class CheckOut extends javax.swing.JFrame {
  
    Connection conn = Koneksi.getKoneksi();
    ResultSet rs = null;
    PreparedStatement pst = null;

    public void ubahStatus() throws SQLException {
       try {
            String sql = "update kamar set status=? where no_kamar=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, "Not Booking"); // Parameter pertama: status
            pst.setString(2, Cari.getText()); // Parameter kedua: nomor kamar
            int rowsAffected = pst.executeUpdate(); // Menggunakan executeUpdate, bukan executeQuery
            ubahStatusCostumer();
            System.out.println(rowsAffected + " baris berhasil diubah.");
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Berhasil Check Out",
                        "Sukses", JOptionPane.INFORMATION_MESSAGE);
                Home HM = new Home();
                HM.setVisible(true);
                this.dispose();
