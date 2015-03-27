/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gocorp.penjumlahan;

/**
 *
 * @author digo
 */
import java.util.Scanner;
public class Penjumlahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka1, angka2, hasil;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        angka1 = keyboard.nextInt();
        System.out.println("Masukkan angka kedua: ");
        angka2 = keyboard.nextInt();
        
        hasil = angka1 + angka2;
        
        System.out.print("Hasil akhir = ");
        System.out.print(hasil);
        System.out.println(".");
        
        
    }
    
}
