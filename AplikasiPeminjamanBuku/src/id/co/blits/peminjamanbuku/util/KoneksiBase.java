/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.peminjamanbuku.util;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class KoneksiBase {

    private static Connection koneksi;
 
    public static Connection getConnection() throws SQLException {
        if (koneksi == null) {
            // panggil Driver MySQL
            new Driver();
            // buat koneksi
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pbo", "root", "digo");
        }
        return koneksi;
    }
    
    public static void koneksiDatabase(){
        try{
            getConnection();
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex){
            System.err.println("Koneksi Gagal");
        }
        
        /*try {
            
        connect = DriverManager.getConnection(namaDatabase,
                username,password);//nama database, username database, password database
        state = connect.createStatement();
        System.out.println("Koneksi Berhasil");
        } catch (SQLException ex) {
        System.err.println("SQLException:"+ex.getMessage());
        }*/
            
        
    }
}
