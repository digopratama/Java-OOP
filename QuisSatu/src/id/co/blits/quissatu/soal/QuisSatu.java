/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.quissatu.soal;

import java.util.Scanner;

/**
 *
 * @author Digo Pratama
 */
public class QuisSatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nama = null, Bonus;
        long Harga = 0, JumlahBeli, TotalHarga, Pajak = 0, TotalSeluruh, JumlahBayar, JumlahKembali;
        
        System.out.println("***Selamat Datang Di Restaurant Indah***");
        System.out.println("***Menu yang tersedia***");
        System.out.println("Kode \tFood \tHarga");
        System.out.println("11   \tAyam \tRp. 12500");
        System.out.println("12   \tRendang Rp. 10000");
        System.out.println("13   \tIkan \tRp. 9500");
        System.out.println("14   \tTelor \tRp. 6500");
        System.out.println("***Selamat Menikmati Makanan Kami***");
        System.out.print("Masukkan pilihan anda : ");
        Scanner papan = new Scanner(System.in);
        int pilihan = papan.nextInt();
        
        
        if(pilihan == 11) {
            Nama = "Ayam";
            Harga = 12500;
        }
        else if(pilihan == 12){
            Nama = "Rendang";
            Harga = 10000;
        }
        else if(pilihan == 13){
            Nama = "Ikan";
            Harga = 9500;
        }
        else if(pilihan == 14){
            Nama = "Telor";
            Harga = 6500;
        }
        else {
            System.out.println("Maaf Kode yang anda input salah");
            System.out.println("Apakah anda ingin memulai lagi ?");
            System.exit(1);
        }
              
        System.out.println("Anda memilih : "+Nama);
        System.out.print("Masukkan Jumlah Beli : "); JumlahBeli = papan.nextInt();
        
        TotalHarga = Harga * JumlahBeli;
        
        if(TotalHarga > 500000){
            Pajak = (long) (0.1 * TotalHarga);
        }
        else if(TotalHarga > 200000) {
            Pajak = (long) (0.05 * TotalHarga);
        }
        else {
            Pajak = (long) (0 * TotalHarga);
        }
        
        TotalSeluruh = TotalHarga + Pajak;
        
        if(JumlahBeli > 20){
            Bonus =  "Bakso 2 Bungkus";
        }
        else if( JumlahBeli > 10){
            Bonus = "Mie ayam 1 Bungkus";
        }
        else{
            Bonus = "Tidak Dapat Bonus";
        }
        
        System.out.println("=============Nota Pembayaran================");
        System.out.println("Nama \t\t: "+Nama); //Nama 
        System.out.println("Harga \t\t:Rp. "+Harga); //Harga
        System.out.println("Jumlah Beli \t: "+JumlahBeli); //jumlah
        System.out.println("Total Harga \t:Rp. "+TotalHarga); //Total Harga
        System.out.println("Pajak \t\t:Rp. "+Pajak); //Pajak
        System.out.println("Total Seluruh \t:Rp. "+TotalSeluruh); //Total Seluruh
        System.out.println("=============Nota Pembayaran================");
        
        System.out.println("Yang harus anda bayar (Jangan Melebihi SERATUS JUTA) :Rp. "+TotalSeluruh);
        System.out.print("Masukkan Jumlah Bayar : "); JumlahBayar = papan.nextInt();
        JumlahKembali = JumlahBayar - TotalSeluruh; 
        
        System.out.println("=============Nota Pembayaran================");
        System.out.println("Jumlah Bayar \t:Rp. "+JumlahBayar); //Jumlah Bayar
        System.out.println("Jumlah Kembali \t:Rp. "+JumlahKembali); //Jumlah Kembali
        System.out.println("Bonus \t\t: "+Bonus); //Bonus
        System.out.println("=============Nota Pembayaran================");
        
        papan.close();
    }
    
}
