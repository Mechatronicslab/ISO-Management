/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author juli_soep
 */
public class MyConnection {
    
    Connection connectionDb = null;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connectionDb =  DriverManager.getConnection("jdbc:mysql://localhost/skripsi_desktop_spk_ratih","root","");
            return connectionDb;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
