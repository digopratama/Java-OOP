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
public class Prosedur {
    void namaMantan(){
        System.out.println("Nana");
    }
    void LuasPersegiPanjang(){
        int panjang = 10, lebar = 8;
        int luas = panjang * lebar;
        System.out.println("Luas : "+luas);
    }
    void luasSegiTiga(double alas, double tinggi){
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga : "+luas);
    }
}
