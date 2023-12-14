/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;
import java.sql.*;
import javax.swing.*;
import controller.Koneksi;

/**
 *
 * @author Asus
 */
public class Login extends javax.swing.JFrame {
    int xx, xy;
    Connection conn = Koneksi.getKoneksi();
    ResultSet rs = null;
    PreparedStatement pst = null;
