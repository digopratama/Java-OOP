/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.belajardatabase.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lintanhg
 */
public class Koneksi {
    Statement state;
    Connection connect;
    String namaDatabase = "jdbc:mysql://localhost/dkkb_pbo";
    String username = "root";
    String password = "";
    
     public void koneksiDatabase(){
        try {
            
        connect = DriverManager.getConnection(namaDatabase,
                username,password);//nama database, username database, password database
        state = connect.createStatement();
        System.out.println("Koneksi Berhasil");
        } catch (SQLException ex) {
        System.err.println("SQLException:"+ex.getMessage());
        }
            
        
    }
    
}
