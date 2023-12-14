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
            } else {
                JOptionPane.showMessageDialog(null, "Gagal melakukan Check Out",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
         } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat melakukan Check Out.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void ubahStatusCostumer() throws SQLException {
        String sql = "update customer set status=? where no_kamar=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, "Sudah"); // Parameter pertama: status
        pst.setString(2, Cari.getText()); // Parameter kedua: nomor kamar
        int rowsAffected = pst.executeUpdate(); // Menggunakan executeUpdate, bukan executeQuery
        System.out.println(rowsAffected + " baris berhasil diubah.");

    }
    /**
     * Creates new form CheckIn
     */
    public CheckOut() {
        initComponents();
//      tanggal.setIndex(cbTipeKamar.getSelectedIndex());
    }
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tKosong = new javax.swing.JTable();
        bCheckOut = new javax.swing.JButton();
        Cari = new javax.swing.JTextField();
        bCari = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1025, 550));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
            addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 550));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home (2).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Catamaran Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECK OUT");
