/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RamazanAcikgoz
 */
import javax.swing.*;
import java.sql.*;

public class JavaConnection {
    Connection conn;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:C:\\Users\\RamazanAcikgoz\\Documents\\GitHub\\Library_Management_System_v1\\LibraryManagement.sqlite");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
