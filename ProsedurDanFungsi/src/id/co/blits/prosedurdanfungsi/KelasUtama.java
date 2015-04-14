/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.prosedurdanfungsi;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class KelasUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prosedur prosedur = new Prosedur(); //instanisasi kelas Prosedur
        prosedur.LuasSegitiga(13,21);       //kelas prosedur menjadi objek 
        Fungsi fungsi = new Fungsi();       //instanisasi kelas Fungsi
        int Luas = fungsi.LuasPersegiPanjang(9,10); //kelas fungsi menjadi objek
        System.out.println("Luas Persegi = "+Luas+" cm2.");
    }
    
}
