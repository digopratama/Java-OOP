/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.latihan1;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class Mahasiswa {
    String Nama = "Digo Pratama";
    String Alamat = "Z.A. Pagar Alama";
    String Email = "go_pratama@yahoo.com";
    String Telepon = "082180170347";
    byte Umur = 20;
    
    void dataMahasiswa(/*String Nama, String Alamat, String 
        Email, String Telepon, byte Umur*/){
                
        System.out.println(""+this.Nama);
        System.out.println(""+this.Alamat);
        System.out.println(""+this.Email);
        System.out.println(""+this.Telepon);
        System.out.println(""+this.Umur);
        
    }
}
