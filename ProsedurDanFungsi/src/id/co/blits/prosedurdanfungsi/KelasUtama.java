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
        Prosedur prosedur = new Prosedur();
        prosedur.LuasSegitiga(13,21);        
        Fungsi fungsi = new Fungsi();
        int Luas = fungsi.LuasPersegi(10,10);
        System.out.println("Luas Persegi = "+Luas+" cm2.");
    }
    
}
