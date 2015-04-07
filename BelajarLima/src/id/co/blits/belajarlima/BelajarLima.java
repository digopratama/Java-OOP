/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.belajarlima;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class BelajarLima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prosedur prosedur = new Prosedur();
        
        /*prosedur.namaMantan();*/
        //prosedur.LuasPersegiPanjang();
        
        Fungsi fungsi = new Fungsi();
       // int hasil = fungsi.perhitungan();
       // System.out.println("Hasil :"+hasil);
        //double hasil = fungsi.hitung();
        //System.out.println("Hasil : "+hasil);
        //boolean logik = fungsi.logika();
        //System.out.println("Logika : "+logik);
        //String kata = fungsi.kata();
        //System.out.println("Kata : "+kata);
        double alas = 4, tinggi = 5;
        prosedur.luasSegiTiga(alas,tinggi);
    }
    
}
